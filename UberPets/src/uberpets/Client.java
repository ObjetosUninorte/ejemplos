/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uberpets;

/**
 *
 * @author augustosalazar
 */
public class Client {
   private Pet[] mPets;
   private String mName;
   

    public Client(String name) {
        // vamos a asumir que tiene un maximo de 3 mascotas
        mPets = new Pet[3];
        mName = name;
    }
   
   
}
