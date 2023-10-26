import java.time.LocalDate;
import java.util.Arrays;

public abstract class Documento implements ControlFondos {
    private final String titulo;
    private final String editorial;
    private final int añoPublicacion;
    private final String[] autores;
    public Documento(String titulo, String editorial, int añoPublicacion, String... autores) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String[] getAutores() {
        return autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", autores=" + Arrays.toString(autores) +
                '}';
    }
}
