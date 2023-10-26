package Alojamientos;

public class Camping extends AlojamientoExtraHotelero{
    private final int capacidadMaximaCarpas;
    private final int cantidadBañosDisponibles;
    private final boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad,
                   String gerente, boolean privado, double metrosCuadradosOcupa,
                   int capacidadMaximaCarpas, int cantidadBañosDisponibles, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadradosOcupa);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBañosDisponibles = cantidadBañosDisponibles;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public int getCantidadBañosDisponibles() {
        return cantidadBañosDisponibles;
    }

    public boolean tieneRestaurante() {
        return tieneRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "Camping{" +
                "capacidadMaximaCarpas=" + capacidadMaximaCarpas +
                ", cantidadBañosDisponibles=" + cantidadBañosDisponibles +
                ", tieneRestaurante=" + tieneRestaurante +
                '}';
    }
}
