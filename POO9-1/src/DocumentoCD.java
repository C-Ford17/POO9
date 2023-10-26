import java.time.LocalDate;

public class DocumentoCD extends Documento{
    private final String formatoCD;
    private final String tipoLicencia;

    public DocumentoCD(String titulo, String editorial, int añoPublicacion,
                       String formatoCD, String tipoLicencia, String... autores) {
        super(titulo, editorial, añoPublicacion, autores);
        this.formatoCD = formatoCD;
        this.tipoLicencia = tipoLicencia;
    }

    public String getFormatoCD() {
        return formatoCD;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    @Override
    public String consultar(int numeroDocumento, LocalDate fecha, String DNI) {
        return toString();
    }

    @Override
    public boolean prestar(int numeroDocumento, LocalDate fecha, String DNI) {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "DocumentoCD{" +
                "formatoCD='" + formatoCD + '\'' +
                ", tipoLicencia='" + tipoLicencia + '\'' +
                '}';
    }
}
