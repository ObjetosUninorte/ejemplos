/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author augustosalazar
 */
public class Adaptador {
    
    private MyInterface mMyInterface;

    public void setmMyInterface(MyInterface mMyInterface) {
        this.mMyInterface = mMyInterface;
    }
    
   
    // este metodo es llamado internamente
    private void method(){
        // some code
        if (mMyInterface != null){
            mMyInterface.interfaceMethod(1);
        }
        // some code
    }
    
    public interface MyInterface{
        public  void interfaceMethod(int x);
}
    
}
