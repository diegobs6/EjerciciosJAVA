import java.util.ArrayList;

public class VehiculoDAO {
    
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    // es lo mismo 
    // public VehiculoDAO() {
    //     this.vehiculos = new ArrayList<>();
    // }

    public Vehiculo buscar(String patente) {
        for(Vehiculo vehiculo : this.vehiculos) {
            if (patente.equals(vehiculo.getPatente())) {
                return vehiculo;
            }
        }
        return null;
    }

    public boolean agregar(Vehiculo vehiculo) {
        Vehiculo vehiculoActual = this.buscar(vehiculo.getPatente());
        if (vehiculoActual == null){
            this.vehiculos.add(vehiculo);
            return true;
        } else {
            System.out.println("Vehiculo no encontrado");
            return false;
        }
    }

    public void printVehiculos() {
        System.out.println("-------------");
        for(Vehiculo vehiculo : this.vehiculos) {
            System.out.println(vehiculo.toString());
        }
        System.out.println("-------------");
    }
    
    public ArrayList<Vehiculo> obtenerDatos() {
        return this.vehiculos;
    }
    
    public boolean actualizar(Vehiculo vehiculoActualizado) {
        // v = "p3" (nuevo)
        // vehiculos = ["p1", "p2", "p3", "p4"]
        for (int i = 0; i < this.vehiculos.size(); i++) {
            Vehiculo vehiculoActual = this.vehiculos.get(i);

            if (vehiculoActual.getPatente().equals(vehiculoActualizado.getPatente())) {

                // vehiculos = ["p1", "p2", "p3", "p4"]
                this.vehiculos.set(i, vehiculoActualizado);
                // vehiculos = ["p1", "p2", "p3" (nuevo), "p4"]

                return true;
            }
        }
        return false;
      
    }
    
    // Delete
    public boolean eliminar(String patente) {
    }
    
    // Búsquedas adicionales
    public ArrayList<Vehiculo> buscarPorMarca(String marca) {
       
    }
    
    public ArrayList<Vehiculo> listarPorAnioDesc() {
        
    }
}
