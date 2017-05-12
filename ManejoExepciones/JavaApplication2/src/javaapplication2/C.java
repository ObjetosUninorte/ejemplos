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
public class C {
    
    V elV;
    M elM;

    public C(M elM) {
        this.elM = elM;
        elV = new V(this);
    }

    public int  sumar(int a, int b) throws MyEx {
        O elO = new O(a, b);
        return elM.sumar(elO);
    }

    void start() {
        elV.start();
    }
    
    
    
    
}
