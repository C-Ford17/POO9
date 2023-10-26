public class AutobusUrbano extends Autobus{
    private final String ruta;

    public AutobusUrbano(String numeroIdentificacion, Conductor conductor, double precioBase, String ruta) {
        super(numeroIdentificacion, conductor, precioBase);
        this.ruta = ruta;
    }
    @Override
    public double precioViaje() {
        if (getRuta().equals("A")) return getPrecioBase()*1.10;
        return getPrecioBase()*1.20;
    }

    public String getRuta() {
        return ruta;
    }

    @Override
    public String toString() {
        return super.toString() + "AutobusUrbano{" +
                "ruta='" + ruta + '\'' +
                '}';
    }
}
