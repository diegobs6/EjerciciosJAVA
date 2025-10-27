public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("ABC123", "Yamaha", 2020, 15000, 200000, 600, true);
        Vehiculo moto11 = (Vehiculo) moto1;

        Auto auto1 = new Auto("XYZ789", "Toyota", 2018, 30000, 250000, 4, false);

        auto1.aplicarDescuento(10, true);   

        
        System.out.println(moto1.calcularPrimaSeguro());
    }
}
