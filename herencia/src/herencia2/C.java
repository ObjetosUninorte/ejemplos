/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia.A;
import herencia.B;

/**
 *
 * @author augustosalazar
 */
public class C {
        A a = new A(10);
        B b = new B();
        
        // error, el valor por defecto no se puede modificar directamente
        // desde afuera del paquete.
        // a.atributoDefault = 1;
}
