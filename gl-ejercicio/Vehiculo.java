public abstract class Vehiculo{
    protected String patente;
    protected String marca;
    protected int anio;
    protected double kilometraje;
    protected double valorBaseMantenimiento;


    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public Vehiculo(String patente, String marca, int anio, double kilometraje, double valorBaseMantenimiento) {
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.valorBaseMantenimiento = valorBaseMantenimiento;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    abstract public double calcularCostoMantenimiento();
    abstract public double descripcionBreve();

    @Override
    public String toString() {
        return "Vehiculo <" + this.patente + ">";
    }
}
