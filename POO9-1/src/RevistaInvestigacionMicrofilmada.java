import java.time.LocalDate;

public class RevistaInvestigacionMicrofilmada extends Revista{
    private int codigoMicroFilm;
    public RevistaInvestigacionMicrofilmada(String titulo, String editorial, int añoPublicacion,
                                            int volumen, int numero, String mes, int codigoMicroFilm,
                                            String... autores) {
        super(titulo, editorial, añoPublicacion, volumen, numero, mes, autores);
        this.codigoMicroFilm = codigoMicroFilm;
    }

    public int getCodigoMicroFilm() {
        return codigoMicroFilm;
    }

    @Override
    public boolean prestar(int numeroDocumento, LocalDate fecha, String DNI) {
        return false;
    }

    @Override
    public String consultar(int numeroDocumento, LocalDate fecha, String DNI) {
        return toString();
    }

    @Override
    public String toString() {
        return super.toString() + "RevistaInvestigacionMicrofilmada{" +
                "codigoMicroFilm=" + codigoMicroFilm +
                '}';
    }
}
