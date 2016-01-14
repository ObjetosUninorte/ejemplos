/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.io.*;

/**
 *
 * @author pwightman
 */
public class EjemploArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String temp = "";
        String[] temp_read;
        int i = 0;

        File myFile = new File("nuevo.txt");

        // Escribir por primera vez o sobre escribir datod
        try {
            FileWriter fout = new FileWriter(myFile);
            BufferedWriter mywrite = new BufferedWriter(fout);

            for (i = 0; i < 10; i++) {
                mywrite.write("hola@mundo@" + i);
                mywrite.newLine();
            }

            mywrite.close();
            fout.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Añadir datos a un archivo
        try {
            FileWriter fout = new FileWriter(myFile, true);
            BufferedWriter mywrite = new BufferedWriter(fout);

            for (i = 0; i < 10; i++) {
                mywrite.write("hola@mundo@" + (i + 20));
                mywrite.newLine();
            }

            mywrite.close();
            fout.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Leer datos de un archivo
        try {
            FileReader fin = new FileReader(myFile);
            BufferedReader myread = new BufferedReader(fin);

            temp = myread.readLine();
            do {
                //Los datos siguen el siguiente formato: dato1a@dato1b@dato1c@dato1d...
                temp_read = temp.split("@");
                // El método split devuelve un arreglo de los strings separados por el s�mbolo especificado

                for (i = 0; i < temp_read.length; i++) {
                    System.out.print(temp_read[i]);
                }
                System.out.println();

            } while ((temp = myread.readLine()) != null);

            myread.close();
            fin.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
