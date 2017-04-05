package modelo;

public  class Portatil extends Equipo{
    
    private float peso;

    public Portatil(Procesador procesador, String serial, float peso) {
        super(procesador, serial);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }



    
    
    
}
