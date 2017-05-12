/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author augustosalazar
 */
public class M {
    
    
    C elC;

    public static void main(String[] args) {
        M elM = new M();
        elM.start();
    }
    
    public M() {
        elC = new C(this);
    }

    public int sumar(O elO) throws MyEx {
        int x = elO.getA() + elO.getB();
        if (x > 5){
             throw new MyEx("No se puede");
        } 
        return x;
    }

    private void start() {
        elC.start();
    }
    
    
    
}
