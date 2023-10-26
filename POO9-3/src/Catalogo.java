import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalogo {
    private List<ObraArtistica> obras;

    public Catalogo() {
        this.obras = new ArrayList<>();
    }

    public List<ObraArtistica> getObras() {
        return obras;
    }

    public boolean agregarObra(ObraArtistica obra){
        return obras.add(obra);
    }

    public boolean eliminarObra(int numeroInventario){
        return obras.removeIf(obraArtistica -> obraArtistica.getNumeroInventario() == numeroInventario);
    }

    public ObraArtistica buscarObra(int numeroInventario){
        return obras.stream().findFirst().filter(obraArtistica -> obraArtistica.getNumeroInventario() == numeroInventario).get();
    }

    public double sumaSuperficies(){
        return obras.stream().map(obraArtistica -> {if (obraArtistica instanceof Pintura pintura)
            return ((Pintura) obraArtistica).superficie(); else return 0.0;}).reduce(Double::sum).orElse(0.0);
    }

    public int masAlta(){
        return obras.stream().max((o1, o2) -> {if (o1 instanceof Escultura && o2 instanceof Escultura)
        return (int) (((Escultura) o1).getAltura() - ((Escultura) o2).getAltura()); else return 0;}).get().getNumeroInventario();
    }




}
