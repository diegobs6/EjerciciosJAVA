public class Moto extends Vehiculo {
    private int cilindradaCC;
    private boolean usoDeportivo;

    public Moto(String patente) {
        super(patente);
    }

    public Moto(String patente, String marca, int anio, double kilometraje, 
                double valorBaseMantenimiento, int cilindradaCC, boolean usoDeportivo) {
        super(patente, marca, anio, kilometraje, valorBaseMantenimiento);
        this.cilindradaCC = cilindradaCC;
        this.usoDeportivo = usoDeportivo;
    }

    @Override
    public double calcularCostoMantenimiento() {
    }

    @Override
    public String descripcionBreve() {
     
    }

    @Override
    public double calcularImpuesto() {
      
    }

    @Override
    public double calcularPrimaSeguro() {
     
    }

    public double aplicarDescuento(double porcentaje) {
    }

    public double aplicarDescuento(double porcentaje, boolean clubMoteros) {
        
    }

    // Getters
    public int getCilindradaCC() {
        return cilindradaCC;
    }

    public boolean isUsoDeportivo() {
        return usoDeportivo;
    }

    // Setters
    public void setCilindradaCC(int cilindradaCC) {
        this.cilindradaCC = cilindradaCC;
    }

    public void setUsoDeportivo(boolean usoDeportivo) {
        this.usoDeportivo = usoDeportivo;
    }
}
