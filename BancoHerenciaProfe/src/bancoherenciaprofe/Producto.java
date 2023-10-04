/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoherenciaprofe;

import java.util.Date;

/**
 *
 * @author augustosalazar
 */
public abstract class Producto {
    
    private int id;
    private Date fechaApertura;
    private long tasa;
    private long saldo;

    public Producto(int id, long tasa, long saldo) {
        this.id = id;
        fechaApertura = new Date();
        this.fechaApertura = fechaApertura;
        this.tasa = tasa;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public long getValor() {
        return saldo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public long getTasa() {
        return tasa;
    }
   
}
