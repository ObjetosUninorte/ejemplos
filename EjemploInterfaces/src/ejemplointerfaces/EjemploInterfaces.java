
package ejemplointerfaces;


public class EjemploInterfaces implements Service{


    public static void main(String[] args) {
        EjemploInterfaces ejemplo = new EjemploInterfaces();
        ejemplo.doServiceA();

    }

    @Override
    public int doServiceA() {
        System.out.println("The value "+interfaceAttribute);
        return 0;
    }

    @Override
    public void doServiceB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
