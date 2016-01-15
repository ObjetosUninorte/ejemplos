/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class ManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    
    public static void escribirMensaje(String men){
       System.out.println(men);
    }
    
    public static void escribirMensaje2(String men){
       System.out.print(men);
    }

    
    public static String leerMensaje(String mensaje){
    
        String temp;
        
        BufferedReader bf = new BufferedReader(
                new InputStreamReader(System.in));
        
        escribirMensaje2(mensaje);
        
        try {
            temp=bf.readLine();
        } catch (Exception ex) {ex.printStackTrace(); temp="";}
        
        return temp;
    }

    
    public static int leerInt(String mensaje) throws NumberFormatException{
    
        String temp = leerMensaje(mensaje);
        int tempNum = 0;
             
        tempNum = Integer.parseInt(temp);
               
        return tempNum;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean sw=false, sw2=false;
        int tempNum = 0;
        int[] arreglo = new int[5];
        int i=0;
        
        do{
            sw=false;
            //String temp = leerMensaje("Ingresa un numero: ");
            tempNum = 0;

            try{
                //tempNum = Integer.parseInt(temp);
                tempNum=leerInt("Ingresa un numero: ");
            }
            catch(NumberFormatException nfe){
                nfe.printStackTrace();
                escribirMensaje("El numero es invalido. intente nuevamente");
                sw=true;}
            catch(Exception ex){
                escribirMensaje("Excepción general. intente nuevamente");
                sw=true;
            }
            finally{
                try{
               if(!sw){
                   arreglo[i]=tempNum;
                   i++;
               }    
                }catch(ArrayIndexOutOfBoundsException ex){
                   escribirMensaje("Se ha superado el tamaño. Se suspende la lectura.");
                   sw2=true;
                }
            }
            
        }while(i<10 && !sw2);
        
        escribirMensaje("El numero es: "+tempNum);
        
        
    }
}
