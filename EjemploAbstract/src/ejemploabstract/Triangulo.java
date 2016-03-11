
package ejemploabstract;


public class Triangulo extends Figura{

    private int base, altura;

    public Triangulo(int base,int altura) {
        super(0, 0, 0);
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public float calcularArea() {
        area = (base * altura)/2;
        return area;
    }

    @Override
    public void dibujar() {
        // accion x
    }
    
}
