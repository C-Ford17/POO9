package Alojamientos;

public class AlojamientoExtraHotelero extends Alojamiento{
    private final boolean privado;
    private final double metrosCuadradosOcupa;

    public AlojamientoExtraHotelero(String nombre, String direccion,
                                    String localidad, String gerente,
                                    boolean privado, double metrosCuadradosOcupa) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadradosOcupa = metrosCuadradosOcupa;
    }

    public boolean isPrivado() {
        return privado;
    }

    public double getMetrosCuadradosOcupa() {
        return metrosCuadradosOcupa;
    }

    @Override
    public String toString() {
        return super.toString() + "AlojamientoExtraHotelero{" +
                "privado=" + privado +
                ", metrosCuadradosOcupa=" + metrosCuadradosOcupa +
                '}';
    }
}
