/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.Serializable;

/**
 * Implements Serializable in order to serialize objects of this type
 * @author admin
 */
public class Pokemon implements Serializable{
    
    private String Name;
    private String Id;
    private String Type;

    public Pokemon(String Name, String Id, String Type) {
        this.Name = Name;
        this.Id = Id;
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    @Override
    public String toString()
   {
    return "Pokemon ID: "+Id+"\nPokemon Name: "+Name+"\nPokemon Type: "+Type;
   }
    
}
