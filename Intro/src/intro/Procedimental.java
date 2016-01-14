package intro;

import java.util.Scanner;


public class Procedimental {
    static int parametroA;
    static int parametroB;
    static int parametroC;
    
    static void sumaParametroA(int parametroA){
        parametroA = parametroA + 3;
    }
    
    static void sumarParametroAV2(int valor){
        parametroA = parametroA + valor;
    }
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
        try {
            // Pedirle el valor de los parametros por consola
            System.out.println("Ingrese un entero para el primer parametro: ");
            parametroA = scanner.nextInt();
            System.out.println("Ingrese un entero para el segundo parametro: ");
            parametroB = scanner.nextInt();
            
            // Mostrando el usuario un valor por consola
            System.out.println(String.format("La suma de los parametros es: %d ", parametroA+parametroB));
            
            System.out.println("El valor del primer parametro es : "+parametroA);
            sumaParametroA(parametroA);
            System.out.println("El valor del primer parametro despues de la suma es : "+parametroA);
            sumarParametroAV2(parametroA);
            System.out.println("El valor del primer parametro despues de la suma v2 es : "+parametroA);
            
        } catch (Exception e) {
            System.out.println("Dato invalido");
            e.printStackTrace();
        }
    }
    
}
