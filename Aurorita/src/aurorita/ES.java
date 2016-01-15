/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aurorita;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

/**
 *
 * @author Administrador
 */
public class ES {
    
    int dato;
    
    public void escribir(String s){
        System.out.println(s);
    } 
    
    public String leerMensaje(String mensaje){
    
        String temp;
        
        BufferedReader bf = new BufferedReader(
                new InputStreamReader(System.in));
        
        escribir(mensaje);
        
        try {
            temp=bf.readLine();
        } catch (Exception ex) {ex.printStackTrace(); temp="";}
        
        return temp;
    }
    
    
    public int leerInt(String mensaje){
    
        String temp = leerMensaje(mensaje);
        int tempNum = 0;
        
        
        
        try{
            tempNum = Integer.parseInt(temp);
        }catch(Exception ex){ex.printStackTrace(); tempNum=0;}
        
        return tempNum;
    }
    
    public float leerFloat(String mensaje){
    
        String temp = leerMensaje(mensaje);
        float tempNum = 0.0f;
        
        
        
        try{
            tempNum = Float.parseFloat(temp);
        }catch(Exception ex){ex.printStackTrace(); tempNum=0.0f;}
        
        return tempNum;
    }
    
    
}
