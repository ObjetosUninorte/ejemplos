
import java.io.*;


public class Principal {
    public static void main(String[] args) throws IOException {
        //Declaracion Archivo
        File f;
        f = new File("Upp.txt");
        //Escritura
        FileWriter fr = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fr);
        PrintWriter pw = new PrintWriter(bw);
        
        pw.print("Hola Programacion Orientada a Objetos");
        bw.newLine();
        pw.println("Hola Mundo");
        
        pw.close();
        bw.close();
        fr.close();
        
        
         fr = new FileWriter(f,true);
         bw = new BufferedWriter(fr);
         pw = new PrintWriter(bw);
         
         for (int i = 0; i < 100; i++) {
            pw.println("Otra Linea "+i);
        }        
         
         pw.close();
         bw.close();
         fr.close();
        //Lectura
         
         FileReader fr1 = new FileReader(f);
         BufferedReader br = new BufferedReader(fr1);
         String linea = "";
//         while ((linea = br.readLine())!=null) {
//             System.out.println(linea);
//        }
         while (br.ready()) {
            linea = br.readLine();
             System.out.println(linea);
        }
         br.close();
         fr1.close();
         
       Vista v = new Vista();
       v.setVisible(true);
         
    }
}