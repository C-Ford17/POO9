package Alojamientos;

public class Hotel5Estrellas extends Hotel4Estrellas{
    private final int cantidadSalones;
    private final int cantidadSuites;
    private final int cantidadLimosinas;

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente,
                           int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos,
                           Gimnasio gimnasio, String nombreRestaurante, int capacidadRestaurante,
                           int cantidadSalones, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, gimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public int valorAgregadoLimosinas(){
        return 15*cantidadLimosinas;
    }

    @Override
    public int valorAgregadoHotel() {
        return super.valorAgregadoHotel() + valorAgregadoLimosinas();
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel5Estrellas{" +
                "cantidadSalones=" + cantidadSalones +
                ", cantidadSuites=" + cantidadSuites +
                ", cantidadLimosinas=" + cantidadLimosinas +
                '}';
    }
}
