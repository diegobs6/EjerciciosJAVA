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
        double baseMantenimiento = this.calcularBaseCostoMantenimiento();
        
        double recargoPorRasgos = 0;
        if(this.usoDeportivo) {
            recargoPorRasgos += 500_000;
        }
        if(this.cilindradaCC > 0) {
            recargoPorRasgos += 23_000;
        }
        return baseMantenimiento + recargoPorRasgos;
    }

    @Override
    public String descripcionBreve() {
        return "Moto " + this.cilindradaCC + "cc " + (this.usoDeportivo ? "Deportivo" : "Estándar") + " - " + this.marca + " (" + this.anio + ")";
    }

    @Override
    public double calcularPrimaSeguro() {
        double basePrima = this.calcularBasePrimaSeguro();
        return basePrima + 110_000;
    }


    public double aplicarDescuento(double porcentaje, boolean clubMoteros) {
        double extraDescuento = 0;
        if(clubMoteros) {
            extraDescuento = 16;
        }
        return this.aplicarDescuento(porcentaje + extraDescuento);
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
