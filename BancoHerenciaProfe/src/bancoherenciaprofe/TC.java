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
public class TC extends Producto{
    private Date fechaVencimiento;
    private long cupoTotal;

    public TC(int id, Date fechaVencimiento, long tasa, long saldo) {
        super(id, tasa, 0);
        this.fechaVencimiento = fechaVencimiento;
        cupoTotal = saldo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public long getCupoTotal() {
        return cupoTotal;
    }
    

    
}
