
import java.io.*;
import java.util.StringTokenizer;


public class   Archivo {

    public static void main(String[] args) throws IOException {
        //Declaracion
        File f = new File("Clase.txt");
        
//        //ESCRITURA       
//        
//        FileWriter fw = new FileWriter(f,true);
//        BufferedWriter bw = new BufferedWriter(fw);
//        PrintWriter pw = new PrintWriter(bw);
//        
////        pw.print("Hola POO");
////        bw.newLine();
////        pw.println("Archivos");
////        
////        pw.append("2016");
//        
//        
//        for (int i = 0; i < 1000; i++) {
//            pw.println("linea;Poo;Hola;"+i);
//        }
//        
//        pw.close();
//        bw.close();
//        fw.close();
        
        
        
        //LECTURA
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        String[] linea;
//        while ((linea=br.readLine())!=null) {
//            System.out.println(linea);
//        }
        
//        while (br.ready()) {
//            linea = br.readLine().split(";");
//            for (int i = 0; i < linea.length; i++) {
//                System.out.println(linea[i]);
//            }
//        }
        
        while (br.ready()) {
            StringTokenizer st = new StringTokenizer(br.readLine(),"-*;");
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
        }
        
        br.close();
        fr.close();
        
    }
}