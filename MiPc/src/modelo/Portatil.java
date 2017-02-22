package modelo;

public class Portatil {

    private Procesador procesador;

    private String serial;

    private Bodega bodega;

    public Portatil(Procesador procesador, String serial) {
        this.procesador = procesador;
        this.serial = serial;

    }
    
    

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
    
    
}
