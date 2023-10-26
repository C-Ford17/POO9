import java.time.LocalDate;

public interface ControlFondos {
    String consultar(int numeroDocumento, LocalDate fecha, String DNI);
    boolean prestar(int numeroDocumento, LocalDate fecha, String DNI);
}
