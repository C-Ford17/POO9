import java.time.LocalDate;
import java.util.Objects;

public class Pintura extends ObraArtistica{
    private final double altura;
    private final double ancho;
    private final String soporte;

    public Pintura(String titulo, int numeroInventario, Artista autor, LocalDate añoRealizo, double altura, double ancho, String soporte) {
        super(titulo, numeroInventario, autor, añoRealizo);
        this.altura = altura;
        this.ancho = ancho;
        this.soporte = soporte;
    }

    public double getAltura() {
        return altura;
    }

    public double getAncho() {
        return ancho;
    }

    public String getSoporte() {
        return soporte;
    }

    public double superficie(){
        return altura*ancho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pintura pintura = (Pintura) o;
        return Double.compare(altura, pintura.altura) == 0 && Double.compare(ancho, pintura.ancho) == 0 && Objects.equals(soporte, pintura.soporte);
    }

    @Override
    public String toString() {
        return super.toString() + "Pintura{" +
                "altura=" + altura +
                ", ancho=" + ancho +
                ", soporte='" + soporte + '\'' +
                '}';
    }
}
