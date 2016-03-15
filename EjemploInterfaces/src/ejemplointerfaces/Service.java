
package ejemplointerfaces;


public interface Service {
    // public es el unico modificador permitido
    // se obliga a inicializar el atributo y es final
    public int interfaceAttribute = 2;
    
    public int doServiceA();
    public void doServiceB();
}
