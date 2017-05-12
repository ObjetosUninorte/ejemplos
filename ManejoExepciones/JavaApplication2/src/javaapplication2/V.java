/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author augustosalazar
 */
public class V {

    C elC;

    public V(C elC) {
        this.elC = elC;
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */

    
    public int sumar(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a y b");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            
            int x = elC.sumar(a,b);
            
            return x;
        } catch (MyEx ex) {
            System.out.println("mayor que 5");
            return 0;
        }
    }

    void start() {
        while(true){
            System.out.println("La suma es "+sumar());
                    
        }
    }

}