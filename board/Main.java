import java.util.ArrayList;
import java.util.Scanner;


public class Main {

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
        System.out.println(txt);
    }

    public static void printLines(ArrayList<ArrayList<Character>> lines) {
        System.out.println("\n");
        for(int i = 0; i < lines.size(); i++){
            Main.printCharacters(lines.get(i), i);
        }
    }

    public static void main(String[] args) {

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
                line.add('-');
            }

            // 3. Guardamos la linea en la lista de lineas
            lines.add(line);
        }

        Main.printLines(lines);

  
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // ask user for (line,position,char) and edit
            System.out.println("Enter the (line,position,char) you want to update: ");

            String input = scanner.nextLine(); // 1,3,x
            
            String[] parts = input.split(",");// "1,3,x" --> ["1", "3", "x"]
            
            int lineNumber = Integer.parseInt(parts[0]); // parts[0] es "1" --> 1
            int position = Integer.parseInt(parts[1]); // parts[1] es "3" --> 3
            char newChar = parts[2].charAt(0); // parts[2] es "x" --> "x"

            // Update the character in the specified line and position
            lines.get(lineNumber).set(position, newChar);
            Main.printLines(lines);
        }
    }
}
