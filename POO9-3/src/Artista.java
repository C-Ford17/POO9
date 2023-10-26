import java.time.LocalDate;

public record Artista(String nombre, String lugarNacimiento, LocalDate fechaNatalicio, LocalDate fechaFallecimiento) {
}
