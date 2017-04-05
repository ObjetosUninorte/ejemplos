package modelo;


import controlador.Controlador;
import java.util.ArrayList;
import vista.Vista;

public class MiPc {

    private ArrayList<Bodega> bodegas;

    private ArrayList<Portatil> portatiles;

    private ArrayList<Servidor> servidores;
    
    private ArrayList<Equipo> equipos;

    public MiPc() {
        
        bodegas = new ArrayList<>();
        portatiles = new ArrayList<>();
        servidores = new ArrayList<>();
        equipos = new ArrayList<>();
        
        bodegas.add(new Bodega(1));
        bodegas.add(new Bodega(2));
        bodegas.add(new Bodega(3));
    }
    
    

    public void agregarPortatil(Bodega b, Portatil p) {
        portatiles.add(p);
        equipos.add(p);
        b.agregarPortatil(p);
    }
    
    public Equipo encontrarSerial(String serial){
        for (Equipo e: equipos){
            if (e.getSerial().compareTo(serial) == 0){
                return e;
            }
        }
        return null;
    }
    

    public static void main(String[] args) {
        
        MiPc miPc = new MiPc();
        Controlador controlador = new Controlador(miPc);
        Vista vista = new Vista(controlador); 
        vista.startConsole();;
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

