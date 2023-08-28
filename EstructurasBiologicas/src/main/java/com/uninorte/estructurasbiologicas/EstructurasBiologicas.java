package com.uninorte.estructurasbiologicas;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 * Una molécula se define por su carga proteínica y categoría (A, B o C). Una cadena de moléculas se compone de por lo menos 3 moléculas y su carga es el promedio de estas. El tipo de una cadena se define a partir de la categoría de mayor ocurrencia entre sus moléculas (asumir que el valor existe), este tipo puede ser alterado agregando nuevas moléculas. Las cadenas se agrupan de bloques, los cuales están conformados por una cadena de cada tipo, una vez una cadena forma parte de un bloque, su tipo no puede cambiar. 
    Algunas consideraciones adicionales:
    1.	Una molécula solo puede pertenecer a una cadena
    2.	Una cadena solo puede pertenecer a un bloque
    Desarrollar una plataforma que almacene bloques soporte los siguientes métodos:
    1.	La molécula con más carga proteínica
    2.	La cadena con un promedio más alto de carga proteínica
    3.	Las categorías de cada una de las cadenas de los bloques
    Del mismo modo se debe tener un método que haga lo siguiente:
    1.	Agregar 200 moléculas al sistema (carga aleatoria entre 1 y 10 y categoría aleatoria)
    2.	Agregar 60 cadenas al sistema con 3 moléculas cada una
    3.	Agregar 10 bloques 

 */
public class EstructurasBiologicas {
    private ArrayList<Bloque> bloques;
    private ArrayList<Molecula> moleculas;
    private ArrayList<Cadena> cadenas;

    EstructurasBiologicas() {
        bloques = new ArrayList<>();
        moleculas = new ArrayList<>();
        cadenas = new ArrayList<>();

    }

    public Molecula getRandomMolecula(){
        int random = (int) (Math.random() * moleculas.size());
        while(moleculas.get(random).estaEnCadena()){
            random = (int) (Math.random() * moleculas.size());
        }
        return moleculas.get(random);
    }

    public void agregarMolecula(int carge, Categoria categoria) {
         moleculas.add(new Molecula(carge, categoria));
    }

    public void agregarRandomMolecula() {
         moleculas.add(Molecula.createRandom());
    }

    public boolean createCadena(ArrayList<Molecula> listaMoleculas) {
        Cadena cadena = Cadena.createCadena(listaMoleculas);
        if (cadena == null) {
            return false;
        }
        cadenas.add(cadena);
        return true;
    }

    public void createBloque() {
        Bloque bloque = Bloque.createBloque(getRandomCadena(), getRandomCadena(), getRandomCadena());
        while(bloque == null){
            System.out.println("Bloque nulo");
            bloque = Bloque.createBloque(getRandomCadena(), getRandomCadena(), getRandomCadena());
        }
        bloques.add(bloque);
    }

    private Cadena getRandomCadena() {
        int random = (int) (Math.random() * cadenas.size());
        while(cadenas.get(random).isReadOnly()){
            random = (int) (Math.random() * cadenas.size());
        }
        return cadenas.get(random);
    }

    //print the printMoleculas and categoria of the proteina with the highest cargaProteinica
    public void printMoleculaMasGrande() {
        int max = 0;
        Molecula moleculaMasGrande = null;
        for (Molecula molecula : moleculas) {
            if (molecula.getCargaProteinica() > max) {
                max = molecula.getCargaProteinica();
                moleculaMasGrande = molecula;
            }
        }
        System.out.println("Molecula mas grande: " + moleculaMasGrande.getCargaProteinica() + " " + moleculaMasGrande.getCategoria());
    }
    //// print the categoria of the Cadena with the hihgest avarage cargaProteinica
    public void printCadenaMasGrande() {
        double max = 0;
        Cadena cadenaMasGrande = null;
        for (Cadena cadena : cadenas) {
            if (cadena.getAverageCargaProteinica() > max) {
                max = cadena.getAverageCargaProteinica();
                cadenaMasGrande = cadena;
            }
        }
        System.out.println("Cadena mas grande: " + cadenaMasGrande.getCategoria());
    }

    //print the categories of the Cadenas in the Bloque
    public void printCategoriasBloque() {
        for (Bloque bloque : bloques) {
            bloque.printCategorias();
        }
    }




    public static void main(String[] args) {
        EstructurasBiologicas eb = new EstructurasBiologicas();
        for (int i = 0; i < 200; i++) {
            eb.agregarRandomMolecula();

        }

        // create 10 Cadenas, each with 3 random Moleculas and add them to eb
        boolean c;
        for (int i = 0; i < 60; i++) {
            ArrayList<Molecula> moleculas = new ArrayList<>();
            do{
                moleculas.clear();
                for (int j = 0; j < 3; j++)
                    moleculas.add(eb.getRandomMolecula());
                c = eb.createCadena(moleculas);
            }while(c == false);
            System.out.println("Cadena creada "+i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Bloque creado "+i);
            eb.createBloque();
        }

        eb.printMoleculaMasGrande();

        eb.printCadenaMasGrande();

        eb.printCategoriasBloque();

    }


}
