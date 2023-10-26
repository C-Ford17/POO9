import javax.swing.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("migue angel", "francia",
                LocalDate.of(2002,4,13),LocalDate.of(2020,11,2));
        Artista artista2 = new Artista("patricio", "italia",
                LocalDate.of(2012,7,11),LocalDate.of(2021,5,29));
        Escultura escultura1 = new Escultura("La proesa",4,artista1,
                LocalDate.of(2010,7,23),"yeso",20);
        Escultura escultura2 = new Escultura("El simio",2,artista2,
                LocalDate.of(2016,12,2),"marmol",15);
        Pintura pintura1 = new Pintura("Mona lisa",7,artista1,
                LocalDate.of(2009,1,5),4,2,"lienzo");
        Pintura pintura2 = new Pintura("Cells",9,artista2,
                LocalDate.of(2018,3,21),5,3,"madera");
        Catalogo catalogo = new Catalogo();
        catalogo.agregarObra(escultura1);
        catalogo.agregarObra(escultura2);
        catalogo.agregarObra(pintura1);
        catalogo.agregarObra(pintura2);
        int opcion = 0;
        while (opcion != -1){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que deseas hacer?\n" +
                    "1. Agregar una obra\n2. Eliminar una obra\n3. Buscar una obra\n4. Ver obras\n" +
                    "5. Suma superficies de las pintuas\n6. Escultura mas alta\n7. Salir"));
            switch (opcion){
                case 1:
                    int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de obra deseas agregar?\n" +
                            "1. Pintura\n2. Escultura"));
                    if (opcion1 == 1){
                        agregarPintura(catalogo);
                    }
                    if(opcion1 == 2){
                        agregarEscultura(catalogo);
                    }
                    break;
                case 2:
                    int nInventario = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de inventario de la obra que desea eliminar:"));
                    if (catalogo.eliminarObra(nInventario)) JOptionPane.showMessageDialog(null, "Obra eliminada");
                    else JOptionPane.showMessageDialog(null, "Obra no eliminada");
                    break;
                case 3:
                    int nInventario1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de inventario de la obra que desea buscar:"));
                    ObraArtistica obra = catalogo.buscarObra(nInventario1);
                    if (obra != null) JOptionPane.showMessageDialog(null,"La obra encontrado fue: " + obra.getTitulo());
                    else JOptionPane.showMessageDialog(null, "Obra no encontrada");
                    break;
                case 4:
                    if (catalogo.getObras().isEmpty()){
                        JOptionPane.showMessageDialog(null, "No has agregado obras");
                    }
                    else verObras(verTitulos(catalogo));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,catalogo.sumaSuperficies());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,catalogo.buscarObra(catalogo.masAlta()).getTitulo());
                    break;
                case 7:
                    opcion = -1;
                    break;
            }
        }
    }
    public static ObraArtistica agregarObra(){
        String titulo = JOptionPane.showInputDialog("Titulo:");
        int nInventario = Integer.parseInt(JOptionPane.showInputDialog("Numero de inventario:"));
        String nombreAutor = JOptionPane.showInputDialog("Nombre del autor:");
        String lugarNacimiento = JOptionPane.showInputDialog("Lugar de nacimiento:");
        JOptionPane.showMessageDialog(null,"A continuacion digite la fecha de natalicio");
        LocalDate fechaNatalicio = LocalDate.of(Integer.parseInt(JOptionPane.showInputDialog("año:")),
                Integer.parseInt(JOptionPane.showInputDialog("mes (en numero):")),Integer.parseInt(JOptionPane.showInputDialog("dia:")));
        JOptionPane.showMessageDialog(null,"A continuacion digite la fecha de fallecimiento");
        LocalDate fechaFallecimiento = LocalDate.of(Integer.parseInt(JOptionPane.showInputDialog("año:")),
                Integer.parseInt(JOptionPane.showInputDialog("mes (en numero):")),Integer.parseInt(JOptionPane.showInputDialog("dia:")));
        Artista autor = new Artista(nombreAutor, lugarNacimiento, fechaNatalicio, fechaFallecimiento);
        JOptionPane.showMessageDialog(null,"A continuacion digite la fecha que se realizo la obra");
        LocalDate fechaRealizacion = LocalDate.of(Integer.parseInt(JOptionPane.showInputDialog("año:")),
                Integer.parseInt(JOptionPane.showInputDialog("mes (en numero):")),Integer.parseInt(JOptionPane.showInputDialog("dia:")));
        return new ObraArtistica(titulo,nInventario,autor,fechaRealizacion);
    }
    public static void agregarPintura(Catalogo catalogo){
        ObraArtistica obraArtistica = agregarObra();
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura:"));
        double ancho = Double.parseDouble(JOptionPane.showInputDialog("Digite el ancho:"));
        String soporte = JOptionPane.showInputDialog("Digite el tipo de soporte que fueron realizadas:");
        boolean agregada = catalogo.agregarObra(new Pintura(obraArtistica.getTitulo(),obraArtistica.getNumeroInventario(),
                obraArtistica.getAutor(),obraArtistica.getAñoRealizo(),altura,ancho,soporte));
        if (agregada) JOptionPane.showMessageDialog(null, "Pintura agregada");
        else JOptionPane.showMessageDialog(null,"Pintura no agregada");
    }
    public static void agregarEscultura(Catalogo catalogo){
        ObraArtistica obraArtistica = agregarObra();
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura:"));
        String material = JOptionPane.showInputDialog("Digite el tipo de material con el que fue realizada:");
        boolean agregada = catalogo.agregarObra(new Escultura(obraArtistica.getTitulo(),obraArtistica.getNumeroInventario(),
                obraArtistica.getAutor(),obraArtistica.getAñoRealizo(),material,altura));
        if (agregada) JOptionPane.showMessageDialog(null, "Escultura agregada");
        else JOptionPane.showMessageDialog(null,"Escultura no agregada");
    }

    public static void verObras(List<String> titulos){
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < titulos.size(); i++) {
            mensaje.append(i + 1).append(". ").append(titulos.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null,mensaje.toString());
    }
    public static List<String> verTitulos(Catalogo catalogo){
        return catalogo.getObras().stream().map(ObraArtistica::getTitulo).collect(Collectors.toList());
    }
    public static List<ObraArtistica> listarEsculturas(Catalogo catalogo){
        return catalogo.getObras().stream().filter(obraArtistica -> obraArtistica instanceof Escultura).collect(Collectors.toList());
    }
    public static List<ObraArtistica> listarPintuas(Catalogo catalogo){
        return catalogo.getObras().stream().filter(obraArtistica -> obraArtistica instanceof Pintura).collect(Collectors.toList());
    }
}