package intro;

import java.util.Scanner;


public class Procedimental {
    static int parametroA;
    static int parametroB;
    
    int sumaParametroA(int valor){
        return parametroA + valor;
    }
    
    void sumarParametroA(int valor){
        this.parametroA = this.parametroA + valor;
    }
    
    int getParametroB(){
       return parametroB; 
    }
    
    void setParametroB(int valor){
        parametroB = valor;
    }
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
          // leer de la linea de comando
        try {
            // Pedirle al usuario la edad
            System.out.print("Ingrese un entero para el primer parametro: ");
            parametroA = scanner.nextInt();
            System.out.print("Ingrese un entero para el segundo parametro: ");
            parametroB = scanner.nextInt();
            
            System.out.println(String.format("La suma de los parametros es: %d ", parametroA+parametroB));
            
        } catch (Exception e) {
            System.out.println("Dato invalido");
            e.printStackTrace();
        }
    }
    
}
