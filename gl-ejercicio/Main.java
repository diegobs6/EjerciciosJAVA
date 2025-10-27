import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Moto 1 ABC123", "Yamaha", 2020, 15000, 200000, 600, true);

        Auto auto1 = new Auto("Auto 1 XYZ789", "Toyota", 2018, 30000, 250000, 4, false);
        Auto auto2 = new Auto("Auto 2 AAAAAA", "Jiundai", 2018, 30000, 250000, 4, false);


        VehiculoDAO dao1 = new VehiculoDAO();

        dao1.agregar(moto1);
        dao1.agregar(auto1);
        dao1.agregar(auto2);

        System.out.println("Vehiculos antes de actualizar:");
        dao1.printVehiculos();

        Auto auto2Actualizado = new Auto("Auto 2 AAAAAA", "Citroen", 2222, 30000, 250000, 4, true);
        dao1.actualizar(auto2Actualizado);
        System.out.println("Vehiculos después de actualizar:");
        dao1.printVehiculos();



        
        System.out.println(moto1.calcularPrimaSeguro());
    }
}
