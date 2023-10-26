import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Pancho",20000);
        AutobusUrbano autobusUrbano = new AutobusUrbano("1",conductor,0.4,"B");
        AutobusInterUrbano autobusInterUrbano = new AutobusInterUrbano("2",conductor,
                0.05,1000);
        Autobus[] autobuses = new Autobus[100];
        autobuses[0] = autobusUrbano;
        autobuses[1] = autobusInterUrbano;
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < autobuses.length; i++) {
            if (autobuses[i] != null) mensaje.append(autobuses[i].toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null,mensaje);
    }
}