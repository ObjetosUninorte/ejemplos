package modelo;


import controlador.Controlador;
import java.util.ArrayList;
import vista.Vista;

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
    

    public static void main(String[] args) {
        
        MiPc miPc = new MiPc();
        Controlador controlador = new Controlador(miPc);
        Vista vista = new Vista(controlador); 
    }

    public Bodega getBodega(int idBodega) {
        for (Bodega b : bodegas){
            if (b.getId() == idBodega){
                return b;
            }
        }
        return null;
    }
}

