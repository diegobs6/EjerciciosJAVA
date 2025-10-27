public class Auto extends Vehiculo {
    private int numeroPuertas;
    private boolean hibrido;

    public Auto(String patente) {
        super(patente);
    }

    public Auto(String patente, String marca, int anio, double kilometraje, 
               double valorBaseMantenimiento, int numeroPuertas, boolean hibrido) {
        super(patente, marca, anio, kilometraje, valorBaseMantenimiento);
        this.numeroPuertas = numeroPuertas;
        this.hibrido = hibrido;
    }

    @Override
    public double calcularCostoMantenimiento() {
        double baseMantenimiento = this.calcularBaseCostoMantenimiento();
        
        double recargoPorRasgos = 0;
        if(this.hibrido) {
            recargoPorRasgos += 520_000;
        }
        if(this.numeroPuertas > 0) {
            recargoPorRasgos += 33_000;
        }
        return baseMantenimiento + recargoPorRasgos;
    }

    @Override
    public String descripcionBreve() {
        
        return "Auto " + this.numeroPuertas + " puertas " + (this.hibrido ? "Híbrido" : "Convencional") + " - " + this.marca + " (" + this.anio + ")";
    }

    @Override
    public double calcularPrimaSeguro() {
        double basePrima = this.calcularBasePrimaSeguro();
        return basePrima + 350_000;
    }

    public double aplicarDescuento(double porcentaje, boolean clienteFiel) {
        double extraDescuento = 0;
        if(clienteFiel) {
            extraDescuento = 5;
        }
        return this.aplicarDescuento(porcentaje + extraDescuento);
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
