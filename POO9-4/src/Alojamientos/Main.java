package Alojamientos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Alojamiento hotel1 = new Hotel4Estrellas("Hotel lax12","cra.12 #1","anyway",
                "Juancho",20,3,4,Gimnasio.A,
                "Comidita",30);
        Alojamiento hotel2 = new Hotel5Estrellas("Hotel ad21dz","cra.14 #3","dwdsx",
                "Juancho",15,2,2,Gimnasio.B,
                "Comidita2",25,5,3,10);
        Alojamiento camping1 = new Camping("Camping libertad","cra.11 #2","asd31",
                "Manita",true,300,6,7,
                true);
        Alojamiento camping2 = new Camping("Camping soledad","cra.23 #4","32ssxa",
                "Manita",true,240,3,5,
                false);
        Alojamiento residencia1 = new Residencia("Residencia la villa","cra.7 #6","ad21ds",
                "Pacho",false,400,12,true,
                false);
        List<Alojamiento> alojamientos = listarAlojamientos(hotel1,hotel2,camping1,camping2,residencia1);
        int opcion = 0;
        while (opcion != -1){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que deseas ver?\n1. Los alojamientos\n" +
                    "2. Hoteles de una localidad\n3. Campings de una localidad\n4. Salir"));
            switch (opcion){
                case 1:
                    proceso(verNombresAlojamientos(alojamientos));
                    break;
                case 2:
                    String localidad1 = JOptionPane.showInputDialog("Escribe la localidad: ");
                    proceso(verNombresAlojamientos(hotelesLocalidad(alojamientos,localidad1)));
                    break;
                case 3:
                    String localidad2 = JOptionPane.showInputDialog("Escribe la localidad: ");
                    proceso(verNombresAlojamientos(campingsLocalidad(alojamientos,localidad2)));
                    break;
                case 4:
                    opcion = -1;
                    break;
            }
        }

    }
    public static void proceso(List<String> nombres){
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < nombres.size(); i++) {
            mensaje.append(i + 1).append(". ").append(nombres.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null,mensaje.toString());
    }

    public static List<Alojamiento> listarAlojamientos(Alojamiento... alojamiento){
        return Arrays.asList(alojamiento);
    }

    public static List<String> verNombresAlojamientos(List<Alojamiento> alojamientos) {
        return alojamientos.stream()
                .map(Alojamiento::getNombre)
                .collect(Collectors.toList());
    }

    public static List<Alojamiento> hotelesLocalidad(List<Alojamiento> hoteles, String localidad){
        return hoteles.stream().filter(hotel -> hotel.getLocalidad().equals(localidad) &&
                hotel.getClass().getName().contains("Hotel")).collect(Collectors.toList());
    }
    public static List<Alojamiento> campingsLocalidad(List<Alojamiento> campings, String localidad){
        return campings.stream().filter(camping -> camping.getLocalidad().equals(localidad) &&
                camping.getClass().getName().contains("Camping")).collect(Collectors.toList());
    }
}