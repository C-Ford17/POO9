import java.time.LocalDate;
import java.util.Objects;

public class Escultura extends ObraArtistica{
    private String material;
    private double altura;

    public Escultura(String titulo, int numeroInventario, Artista autor, LocalDate añoRealizo, String material, double altura) {
        super(titulo, numeroInventario, autor, añoRealizo);
        this.material = material;
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Escultura escultura = (Escultura) o;
        return Double.compare(altura, escultura.altura) == 0 && Objects.equals(material, escultura.material);
    }

    @Override
    public String toString() {
        return super.toString() + "Escultura{" +
                "material='" + material + '\'' +
                ", altura=" + altura +
                '}';
    }
}
