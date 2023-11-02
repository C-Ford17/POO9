import javax.swing.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("diccionario de ingles","house",2015,
                false,"maria","jose");
        Libro libro2 = new Libro("manga","mad",2019,
                true,"takanaka","philp","minato");
        Revista revista1 = new Revista("parax","maies",2020,
                5,2,"Octubre","patrick");
        RevistaInvestigacionMicrofilmada revista2 = new RevistaInvestigacionMicrofilmada("time",
                "science",2004,6,1,"Diciembre",78,
                "ford","mcclaren");
        DocumentoCD cd = new DocumentoCD("mmmxx","32ss",2004,"nose",
                "tampocose","pepito");
        List<Documento> fondos = listarFondos(libro1,libro2,revista1,revista2,cd);
        int opcion = 0;
        while (opcion != -1){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Que deseas ver?\n1. Libros\n2. Revistas\n" +
                    "3. Documentos en formato  CD\n4. Revistas de investigacion microfilmadas\n5. Salir"));
            switch (opcion){
                case 1:
                    List<Documento> libros = listarLibros(fondos);
                    List<String> titulos = verTitulos(libros);
                    proceso(libros,titulos);
                    break;
                case 2:
                    List<Documento> revistas = listarRevistas(fondos);
                    List<String> titulos1 = verTitulos(revistas);
                    proceso(revistas,titulos1);
                    break;
                case 3:
                    List<Documento> CDs = listarCDs(fondos);
                    List<String> titulos2 = verTitulos(CDs);
                    proceso(CDs,titulos2);
                    break;
                case 4:
                    List<Documento> RIMs = listarRIM(fondos);
                    List<String> titulos3 = verTitulos(RIMs);
                    proceso(RIMs,titulos3);
                    break;
                case 5:
                    opcion = -1;
                    break;
            }
        }

    }
    public static void proceso(List<Documento> fondos,List<String> titulos){
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < titulos.size(); i++) {
            mensaje.append(i + 1).append(". ").append(titulos.get(i)).append("\n");
        }
        int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(mensaje.toString()));
        int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Has seleccionado " +
                titulos.get(opcion1-1) + "\n¿Que deseas hacer?\n1. Pedir prestado\n2. Consultar"));
        if (opcion2 == 1){
            int documento = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu documento: "));
            String dni = JOptionPane.showInputDialog("Escribe tu dni: ");
            boolean prestado = fondos.get(opcion1-1).prestar(documento, LocalDate.now(),dni);
            if (prestado) {
                JOptionPane.showMessageDialog(null,titulos.get(opcion1-1) + " ha sido prestado");
            } else JOptionPane.showMessageDialog(null,titulos.get(opcion1-1) + " no ha podido ser prestado");
        }else{
            int documento = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu documento: "));
            String dni = JOptionPane.showInputDialog("Escribe tu dni: ");
            JOptionPane.showMessageDialog(null,fondos.get(opcion1-1).consultar(documento,LocalDate.now(),dni));
        }
    }
    public static List<Documento> listarFondos(Documento... documentos){
        return Arrays.asList(documentos);
    }
    public static List<String> verTitulos(List<Documento> documentos){
        return documentos.stream().map(Documento::getTitulo).collect(Collectors.toList());
    }
    public static List<Documento> listarLibros(List<Documento> libros){
        return libros.stream().filter(libro -> libro.getClass().getName().equals("Libro")).collect(Collectors.toList());
    }
    public static List<Documento> listarRevistas(List<Documento> revistas){
        return revistas.stream().filter(revista -> revista.getClass().getName().equals("Revista")).collect(Collectors.toList());
    }
    public static List<Documento> listarCDs(List<Documento> cds){
        return cds.stream().filter(cd -> cd.getClass().getName().equals("DocumentoCD")).collect(Collectors.toList());
    }
    public static List<Documento> listarRIM(List<Documento> RIMs){
        return RIMs.stream().filter(rim -> rim.getClass().getName().equals("RevistaInvestigacionMicrofilmada")).collect(Collectors.toList());
    }



}