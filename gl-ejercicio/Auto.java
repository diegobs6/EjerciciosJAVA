public class Auto extends Vehiculo {
    private int numeroPuertas;
    private boolean hibrido;

    // Constructores
    public Auto(String patente) {
        super(patente);
    }

    public Auto(String patente, String marca, int anio, double kilometraje, 
               double valorBaseMantenimiento, int numeroPuertas, boolean hibrido) {
        super(patente, marca, anio, kilometraje, valorBaseMantenimiento);
        this.numeroPuertas = numeroPuertas;
        this.hibrido = hibrido;
    }

    // Implementaciones requeridas
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

    // Sobrecarga de método
    public double aplicarDescuento(double porcentaje) {
    }

    public double aplicarDescuento(double porcentaje, boolean clienteFiel) {
    }

    // Getters y setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isHibrido() {
        return hibrido;
    }

    public void setHibrido(boolean hibrido) {
        this.hibrido = hibrido;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getValorBaseMantenimiento() {
        return valorBaseMantenimiento;
    }

    public void setValorBaseMantenimiento(double valorBaseMantenimiento) {
        this.valorBaseMantenimiento = valorBaseMantenimiento;
    }
}
