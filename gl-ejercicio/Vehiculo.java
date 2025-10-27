public abstract class Vehiculo implements ITributable{
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
    abstract public String descripcionBreve();


    protected double calcularBaseCostoMantenimiento() {
        double tramoPorKilometro = 0;
        // <20km -> 30,000
        // 20km - 80km -> 50,000
        // >80km -> 100,000

        if (this.kilometraje < 20) {
            tramoPorKilometro += 30_000;
        }else if(this.kilometraje < 80) {
            tramoPorKilometro += 50_000;
        }else {
            tramoPorKilometro += 100_000;
        }
        return valorBaseMantenimiento + tramoPorKilometro;
    }

    protected double calcularBasePrimaSeguro() {
        double ajustePorAntiguedad = 0;
        int anioActual = 2025;
        ajustePorAntiguedad = (anioActual - this.anio) * 0.2;

        double ajustePortKilometro = this.kilometraje * 30;

        return ajustePorAntiguedad + ajustePortKilometro;
    }

    @Override
    public double calcularImpuesto() {
        return this.calcularCostoMantenimiento() * 0.19;
    }

    // Sobrecarga de método
    public double aplicarDescuento(double porcentaje0a100) {
        double descuentoPesos = this.calcularCostoMantenimiento() * porcentaje0a100/100.0;
        return this.calcularCostoMantenimiento() - descuentoPesos;
    }

    @Override
    public String toString() {
        return "Vehiculo <" + this.patente + ", " + this.marca + ", " + this.anio + ">";
    }
}
