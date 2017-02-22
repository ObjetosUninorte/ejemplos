package modelo;


import java.util.ArrayList;

public class Bodega {

    private ArrayList<Portatil> portatiles;

    private ArrayList<Servidor> servidores;

    private int id;

    public Bodega(int id) {
        this.id = id;
        portatiles = new ArrayList<>();
        
    }

    public int getId() {
        return id;
    }
    
    
    
    

    public void agregarPortatil(Portatil p) {
        portatiles.add(p);
        p.setBodega(this);
    }
}
