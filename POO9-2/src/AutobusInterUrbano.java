public class AutobusInterUrbano extends Autobus{
    private final int numeroKilometros;

    public AutobusInterUrbano(String numeroIdentificacion, Conductor conductor, double precioBase, int numeroKilometros) {
        super(numeroIdentificacion, conductor, precioBase);
        this.numeroKilometros = numeroKilometros;
    }

    public int getNumeroKilometros() {
        return numeroKilometros;
    }

    @Override
    public double precioViaje() {
        return getPrecioBase()*numeroKilometros;
    }

    @Override
    public String toString() {
        return super.toString() + "AutobusInterUrbano{" +
                "numeroKilometros=" + numeroKilometros +
                '}';
    }
}
