/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author pwightman
 */
public class A {
    
    int atributo1;
    private int atributo2;
    protected int atributo3;
    public final int atributo7;
    static int atributo4;
    static private int atributo5;
    static public final int atributo6=1;
    
    public A(int val){
        atributo7=val;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    public int getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(int atributo3) {
        this.atributo3 = atributo3;
    }

    public static int getAtributo4() {
        return atributo4;
    }

    public static void setAtributo4(int atributo4) {
        A.atributo4 = atributo4;
    }

    public static int getAtributo5() {
        return atributo5;
    }

    public static void setAtributo5(int atributo5) {
        A.atributo5 = atributo5;
    }

    public static int getAtributo6() {
        return atributo6;
    }

    public int getAtributo7() {
        return atributo7;
    }
    
    
    
}
