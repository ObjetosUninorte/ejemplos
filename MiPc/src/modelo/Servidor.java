package modelo;

public class Servidor extends Equipo{

    private int numeroProcesadores;

    public Servidor(Procesador procesador, String serial, int numeroProcesadores) {
        super(procesador, serial);
        this.numeroProcesadores = numeroProcesadores;
    }

    public int getNumeroProcesadores() {
        return numeroProcesadores;
    }
}
