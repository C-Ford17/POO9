package Alojamientos;

public class Residencia extends AlojamientoExtraHotelero{
    private final int cantidadHabitaciones;
    private final boolean hacenDescuentos;
    private final boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente,
                      boolean privado, double metrosCuadradosOcupa, int cantidadHabitaciones,
                      boolean hacenDescuentos, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadradosOcupa);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.hacenDescuentos = hacenDescuentos;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean hacenDescuentos() {
        return hacenDescuentos;
    }

    public boolean tieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Residencia{" +
                "cantidadHabitaciones=" + cantidadHabitaciones +
                ", hacenDescuentos=" + hacenDescuentos +
                ", tieneCampoDeportivo=" + tieneCampoDeportivo +
                '}';
    }
}
