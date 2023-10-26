package Alojamientos;

public abstract class Hotel extends Alojamiento{
    private final int cantidadDeHabitaciones;
    private final int numeroDeCamas;
    private final int cantidadDePisos;

    public Hotel(String nombre, String direccion, String localidad,
                 String gerente, int cantidadDeHabitaciones,
                 int numeroDeCamas, int cantidadDePisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
    }

    public int cantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public int numeroDeCamas() {
        return numeroDeCamas;
    }

    public int cantidadDePisos() {
        return cantidadDePisos;
    }

    public int precioHabitaciones() {
        return 50+cantidadDeHabitaciones+valorAgregadoHotel();
    }

    public abstract int valorAgregadoHotel();

    @Override
    public String toString() {
        return super.toString() + "Hotel{" +
                "cantidadDeHabitaciones=" + cantidadDeHabitaciones +
                ", numeroDeCamas=" + numeroDeCamas +
                ", cantidadDePisos=" + cantidadDePisos +
                '}';
    }
}
