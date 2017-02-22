
import java.util.ArrayList;

public class MiPc {

    private ArrayList<Bodega> bodegas;

    private ArrayList<Portatil> portatiles;

    private ArrayList<Servidor> servidores;

    public MiPc() {
        
        bodegas = new ArrayList<>();
        portatiles = new ArrayList<>();
        servidores = new ArrayList<>();
        
        bodegas.add(new Bodega(1));
        bodegas.add(new Bodega(2));
        bodegas.add(new Bodega(3));
    }
    
    

    public void agregarPortatil(Bodega b, Portatil p) {
        portatiles.add(p);
        b.agregarPortatil(p);
    }
}
