/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerface;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ElHilo extends Thread {

    int id;
    private TheInterface callback;

    public ElHilo(int id, EjemploInterface ei) {
        this.id = id;
    }
    
    public void setOnTickListener(TheInterface callback){
        this.callback = callback;
    }
    
    
    @Override
    public void run() {
        
        int i = 0;
        while(true){
            //System.out.println(i + " looping "+id);
            if (callback!=null){
                callback.everyClick(id);
            }
            i++;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

                break;
            }
        }
    }
    
}
