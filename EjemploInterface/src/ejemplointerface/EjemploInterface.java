/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerface;

/**
 *
 * @author User
 */
public class EjemploInterface implements TheInterface{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemploInterface ei = new EjemploInterface();
       ElHilo secondClass = new ElHilo(1,ei);
       secondClass.setOnTickListener(ei);
       secondClass.start();
       
       
       ElHilo secondClass2 = new ElHilo(2,ei);
       secondClass2.start();
       
    }

    @Override
    public void everyClick(int threadId) {
        System.out.println("click "+threadId);
    }

    
}
