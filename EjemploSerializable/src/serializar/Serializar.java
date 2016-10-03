/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Serializar{

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        
        ArrayList<Pokemon> pokearray = new ArrayList<>();
        pokearray.add(new Pokemon("Charmander", "01", "Fuego"));
        pokearray.add(new Pokemon("Pikachu", "02", "Electrico"));
        pokearray.add(new Pokemon("Balbauser", "03", "Tierra"));
        
        serializePokemon(pokearray,"test_1.txt");
        ArrayList<Pokemon> receivedPokemons = deserializePokemon("test_1.txt");
         
        for(int i=0; i<receivedPokemons.size(); i++)
        {
         System.out.println(receivedPokemons.get(i).toString());
        }
        
        
        // TODO code application logic here
    }
    
    public static void serializePokemon(ArrayList<Pokemon> pokemon, String file)
    {
        FileOutputStream fileOut;
        try
         {
            fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(pokemon);
            out.close();
            fileOut.close();
         }catch(Exception e)
         {
             e.printStackTrace();
             return;
         }  
        return;
    }
     
     
     public static ArrayList<Pokemon> deserializePokemon(String file)
    {
        ArrayList<Pokemon> pokemons = null;
          try
          {
             FileInputStream fileIn = new FileInputStream(file);
             ObjectInputStream in = new ObjectInputStream(fileIn);
             pokemons = (ArrayList<Pokemon>) in.readObject();
             in.close();
             fileIn.close();
         }catch(Exception e)
         {
             e.printStackTrace();   
             return null;
         }
         return pokemons;
    }
    
}
