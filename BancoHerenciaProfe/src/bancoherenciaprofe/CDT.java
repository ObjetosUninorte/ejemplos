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
public class CDT  extends Producto{
    private long valorInicial;
    private Date fechaVencimiento;
    
    public CDT(int id, Date fechaVencimiento,long tasa, long saldo) {
        super(id, tasa, saldo);
        valorInicial = saldo;
        fechaVencimiento = fechaVencimiento;
    }

    public long getValorInicial() {
        return valorInicial;
    }
    
    
}
