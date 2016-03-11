
package ejemploabstract;


public class Cuadrado extends Figura{

    private int lado;
    
    public Cuadrado(int lado) {
        super(0, 0, 0);
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        area = lado * lado;
        return area;
    }

    @Override
    public void dibujar() {
        //accion x
    }

    
}
