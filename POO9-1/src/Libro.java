import java.time.LocalDate;

public class Libro extends Documento{
    private boolean prestamo;

    public Libro(String titulo, String editorial, int añoPublicacion,boolean prestamo, String... autores) {
        super(titulo, editorial, añoPublicacion, autores);
        this.prestamo = prestamo;
    }

    @Override
    public String consultar(int numeroDocumento, LocalDate fecha, String DNI) {
        return toString();
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    @Override
    public boolean prestar(int numeroDocumento, LocalDate fecha, String DNI) {
        return prestamo;
    }
}
