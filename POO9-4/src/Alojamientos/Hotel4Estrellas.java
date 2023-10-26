package Alojamientos;

public class Hotel4Estrellas extends Hotel {
    private final Gimnasio gimnasio;
    private final String nombreRestaurante;
    private final int capacidadRestaurante;

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente,
                           int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos,
                           Gimnasio gimnasio, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    @Override
    public int valorAgregadoHotel() {
        return valorAgregadoRestaurante() + valorAgregadoGimnasio();
    }

    public int valorAgregadoRestaurante(){
        if (capacidadRestaurante <= 50 && capacidadRestaurante >= 30) return 30;
        if (capacidadRestaurante < 30) return 10;
        return 50;
    }
    public int valorAgregadoGimnasio(){
        if (gimnasio.equals(Gimnasio.A)) return 50;
        return 30;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel4Estrellas{" +
                "gimnasio=" + gimnasio +
                ", nombreRestaurante='" + nombreRestaurante + '\'' +
                ", capacidadRestaurante=" + capacidadRestaurante +
                '}';
    }
}
