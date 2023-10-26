public abstract class Autobus {
    private final String numeroIdentificacion;
    private final Conductor conductor;
    private final double precioBase;

    public Autobus(String numeroIdentificacion, Conductor conductor, double precioBase) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.conductor = conductor;
        this.precioBase = precioBase;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public abstract double precioViaje();

    @Override
    public String toString() {
        return "Autobus{" +
                "numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", conductor=" + conductor +
                ", precioBase=" + precioBase +
                '}';
    }
}
