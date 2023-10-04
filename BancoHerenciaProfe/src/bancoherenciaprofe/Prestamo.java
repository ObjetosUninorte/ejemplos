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
public class Prestamo extends Producto{
    private long valorInicial;
    
    public Prestamo(int id, long tasa, long saldo) {
        super(id, tasa, saldo);
        valorInicial = saldo;
    }

    public long getValorInicial() {
        return valorInicial;
    }
    
    
    
}
