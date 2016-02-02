package estructurasdedatos;

import java.util.ArrayList;

public class EstructurasDeDatos {

    public static void main(String[] args) {
        
        // array of int
        arrayExampleInt();
        
        arrayExample();
        
        arrayListExample();        
    }
    
    private static void arrayExampleInt() {
        System.out.println("arrayExampleInt ");
        
        int[] arrayExample = new int[10];
        arrayExample[0] = 1;
        arrayExample[1] = 2;
        arrayExample[2] = 3;
        arrayExample[3] = 4;
        arrayExample[4] = 5;
        arrayExample[5] = 6;
        
        // only loop the entries that have been used
        for (int i = 0; i< 6; i++){
            System.out.println("Entry " + arrayExample[i]);
        }
    }
    
    private static void arrayExample() {
        System.out.println("arrayExample ");

        DataClass[] arrayExample = new DataClass[10];
        arrayExample[0] = new DataClass(0);
        arrayExample[1] = new DataClass(1);
        arrayExample[2] = new DataClass(2);
        arrayExample[3] = new DataClass(3);
        arrayExample[4] = new DataClass(4);
        arrayExample[5] = new DataClass(5);
        

        // the array does not know how many positions have been used
        // so we have to check for null
        for (DataClass entry : arrayExample) {
            if (entry != null)
                System.out.println("Entry " + entry.getData());
        }
        
        // only loop the entries that have been used
        for (int i = 0;i< 6;i++){
            System.out.println("Entry " + arrayExample[i].getData());
        }
    }

    private static void arrayListExample() {
        System.out.println("arrayListExample ");
        
        ArrayList<DataClass> arrayListExample = new ArrayList<DataClass>();
        DataClass data = new DataClass(0);

        arrayListExample.add(data);
        arrayListExample.add(new DataClass(1));
        arrayListExample.add(new DataClass(2));
        arrayListExample.add(new DataClass(3));
        arrayListExample.add(new DataClass(4));
        arrayListExample.add(new DataClass(5));

        // the arrayList does know how many positions are used
        for (DataClass entry : arrayListExample) {
            System.out.println("Entry " + entry.getData());
        }

        arrayListExample.remove(2);

        System.out.println("Entries after deletes");
        for (DataClass entry : arrayListExample) {
            System.out.println("Entry " + entry.getData());
        }

    }



}
