import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    // https://www.asciiart.eu/animals

    // save multiline string
static String BAT = (
"""
. _   ,_,   _
 / `'=) (='` \\
/.-.-.\\ /.-.-.\\ 
`      "      `
""".strip());




    public static String fillWithZeros(int num, int length) {
        String txt = "" + num;
        while(txt.length() < length) {
            txt = 0 + txt;
        }
        return txt;
    }

    public static void printCharacters(ArrayList<Character> characters, int lineNumber) {
        String txt = fillWithZeros(lineNumber, 4) + ": ";
        for (Character character : characters) {
            txt += character;
        }
        System.out.println(txt + "|");
    }

    public static void printLines(ArrayList<ArrayList<Character>> lines) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n");
        for(int i = 0; i < lines.size(); i++){
            Main.printCharacters(lines.get(i), i);
        }
    }


    public static void runBoard() {
        int lineSize = 100;
        int numberOfLines = 15;
        // --------------------
        // --------------------

        ArrayList< ArrayList<Character> > lines = new ArrayList<>();
        
        for(int x = 0; x < numberOfLines; x++){
            // Por cada linea:

            // 1. Creamos una nueva linea
            ArrayList<Character> line = new ArrayList<Character>();
            // 2. Iniciamos los valores
            for(int i = 0; i < lineSize; i++){
                line.add(' ');
            }

            // 3. Guardamos la linea en la lista de lineas
            lines.add(line);
        }

        Main.printLines(lines);

  
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // ask user for (line,position,char) and edit
            System.out.println("Enter the (line,position,artName) you want to update: ");

            String input = scanner.nextLine(); // 1,3,bat
            
            String[] parts = input.split(",");// "1,3,x" --> ["1", "3", "bat"]
            
            int userLineNumber = Integer.parseInt(parts[0]); // parts[0] es "1" --> 1
            int userPosition = Integer.parseInt(parts[1]); // parts[1] es "3" --> 3
            String artName = parts[2]; // parts[2] es "bat" --> "bat"

            // Update the character in the specified line and position

            if (artName.equals("bat")) {
                String[] batLines = BAT.split("\n");

                for(int batLineNumber = 0; batLineNumber < batLines.length; batLineNumber ++) {
                    String batLine = batLines[batLineNumber]; // "/.-.-.\\ /.-.-.\\ ";

                    for(int batPosition = 0; batPosition < batLine.length(); batPosition++){
                        char batChar = batLine.charAt(batPosition); // "/" -> ".", etc... siguiendo lo que tiene batLine
                        
                        int lineToWrite = userLineNumber + batLineNumber;
                        int positionToWrite = userPosition + batPosition;

                        lines.get(lineToWrite).set(positionToWrite, batChar);
                    }
                }
            }

            Main.printLines(lines);
        }
    }

    public static void main(String[] args) {

        runBoard();
        
    }
    // Experimento de diego
    // System.err.println(BAT);
    // System.err.println("-------");
    
    // //  1,1,bat
    

    // String[] batLines = BAT.split("\n");
    // // batLines[0] = "  _   ,_,   _";
    // // batLines[1] = " / `'=) (='` \\";
    // // batLines[2] = "/.-.-.\\ /.-.-.\\ ";
    // // batLines[3] = "`      \"      `";
    // char x = batLines[0].charAt(2);
}
