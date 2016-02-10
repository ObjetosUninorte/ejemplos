/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class B extends A{
    
    // control de acceso por defecto, lo que quiere decir public dentro del paquete
    int atributoDefaultSon;
    
    public B(){
        // primero se llama al consctor del "padre" con sus respectivo
        // parametro
        super(1);
        
        // esto arroja error, no se puede tener acceso a una 
        // variable privada del "padre"
        // atributoStaticPrivate = 1;
        
        // error, no se puede cambiar el valor a 
        // una variable final que ya fue inicializada
        // atributoPublicFinal = 1;
        
        // Ok, el valor 
        atributoDefault = 1;
        
        this.setAtributoPrivate(1);
        this.atributoProtected=1;
    }
    
}
