import java.time.LocalDate;
import java.util.Objects;

public class ObraArtistica {
    private final String titulo;
    private final int numeroInventario;
    private final Artista autor;
    private final LocalDate añoRealizo;

    public ObraArtistica(String titulo, int numeroInventario, Artista autor, LocalDate añoRealizo) {
        this.titulo = titulo;
        this.numeroInventario = numeroInventario;
        this.autor = autor;
        this.añoRealizo = añoRealizo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroInventario() {
        return numeroInventario;
    }

    public Artista getAutor() {
        return autor;
    }

    public LocalDate getAñoRealizo() {
        return añoRealizo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObraArtistica that = (ObraArtistica) o;
        return numeroInventario == that.numeroInventario && Objects.equals(titulo, that.titulo) && Objects.equals(autor, that.autor) && Objects.equals(añoRealizo, that.añoRealizo);
    }

    @Override
    public String toString() {
        return  "ObraArtistica{" +
                "titulo='" + titulo + '\'' +
                ", numeroInventario=" + numeroInventario +
                ", autor=" + autor +
                ", añoRealizo=" + añoRealizo +
                '}';
    }
}

