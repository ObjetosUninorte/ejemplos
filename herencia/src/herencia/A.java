package herencia;

/**
 *
 * @author pwightman
 */


/*
Access Levels
Modifier        Class   Package Subclass    World
public            Y       Y       Y          Y
protected         Y       Y       Y          N
(Default)         Y       Y       N          N // dentro del paquete es public
private           Y       N       N          N
*/


public class A {
    
   // control de acceso por defecto, lo que quiere decir public dentro del paquete
    int atributoDefault;
    
    // control de acceso privado
    private int atributoPrivate;
    
    // control de acceso protegido
    protected int atributoProtected;
    
    // control de acceso privado
    public int atributoPublic;
    
    // este atributo solo se le puede asignar valor una sola vez
    public final int atributoPublicFinal;
    
    // este atributo no depende de una instancia
    // control de acceso por defecto
    static int atributoStatic;
    
    // este atributo no depende de una instancia
    // control de acceso privado
    static private int atributoStaticPrivate;
    
    // este atributo no depende de una instancia
    // control de acceso privado
    // este atributo no puede cambiar de valor
    static public final int atributoStaticPublic=1;
    
    // constructor
    public A(int val){
        atributoPrivate=val;
        
        // a este atributo se le tiene que asignar un valor.
        atributoPublicFinal = 2;
    }    

    public int getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(int atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
