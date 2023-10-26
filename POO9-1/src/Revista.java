import java.time.LocalDate;

public class Revista extends Documento{
    private final int volumen;
    private final int numero;
    private final String mes;

    public Revista(String titulo, String editorial, int añoPublicacion,
                   int volumen, int numero, String mes, String... autores) {
        super(titulo, editorial, añoPublicacion, autores);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getNumero() {
        return numero;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" +
                "volumen=" + volumen +
                ", numero=" + numero +
                ", mes='" + mes + '\'' +
                '}';
    }

    @Override
    public String consultar(int numeroDocumento, LocalDate fecha, String DNI) {
        return toString();
    }

    @Override
    public boolean prestar(int numeroDocumento, LocalDate fecha, String DNI) {
        return true;
    }
}
