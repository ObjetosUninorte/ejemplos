
package ejemploabstract;


public abstract class Figura {
    
    private int colorFondo;
    private int x,y;
    protected float area;

    public Figura(int colorFondo) {
        this.colorFondo = colorFondo;
        x = 0;
        y = 0;
    }
    
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figura(int colorFondo, int x, int y) {
        this.colorFondo = colorFondo;
        this.x = x;
        this.y = y;
    }
    
    public abstract float calcularArea();
    
    public abstract void dibujar();
    
    public void mover(int x,int y){
        this.x = x;
        this.y = y;
        dibujar();
    }
    
}
