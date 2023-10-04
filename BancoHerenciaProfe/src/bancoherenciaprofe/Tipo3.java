/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoherenciaprofe;

/**
 *
 * @author augustosalazar
 */
public class Tipo3 extends Sucursal{
    
    public Tipo3(int id) {
        super(id);
        Ejecutivo e = new Ejecutivo((id*10)+ejecutivos.size(),this);
        agregarEjecutivo(e);
        e = new Ejecutivo((id*10)+ejecutivos.size(),this);
        agregarEjecutivo(e);
        e = new Ejecutivo((id*10)+ejecutivos.size(),this);
        agregarEjecutivo(e);
        e = new Ejecutivo((id*10)+ejecutivos.size(),this);
        agregarEjecutivo(e);
        e = new Ejecutivo((id*10)+ejecutivos.size(),this);
        agregarEjecutivo(e);        
        EjecutivoVip ev = new EjecutivoVip((id*10)+ejecutivosVip.size(),this);
        agregarEjecutivoVip(ev);
        ev = new EjecutivoVip((id*10)+ejecutivosVip.size(),this);
        agregarEjecutivoVip(ev);        
        ev = new EjecutivoVip((id*10)+ejecutivosVip.size(),this);
        agregarEjecutivoVip(ev);                
    }
  

}
