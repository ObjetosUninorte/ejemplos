/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoherenciaprofe;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class Tipo0 extends Sucursal{
    
    public Tipo0(int id) {
        super(id);
        
    }
  
    @Override
    public boolean asignarCliente(Cliente c) {
        clientes.add(c);
        if (c.getTotalProductos() <= Banco.VALOR_VIP){
            //System.out.println("Sucursal "+getId()+ " Cliente "+c.getId() + " es normal "+c.getTotalProductos());
            for (Ejecutivo e:ejecutivos){
                if (e.getNumeroClientes() < 20){
                    e.agregarCliente(c);
                    return true;
                }
            }
            Ejecutivo e = new Ejecutivo((id*10)+ejecutivos.size(),this);
            e.agregarCliente(c);
            agregarEjecutivo(e);
        } else {
            //System.out.println("Sucursal "+getId()+ " Cliente "+c.getId() + " es vip "+c.getTotalProductos());
         for (EjecutivoVip e:ejecutivosVip){
                if (e.getNumeroClientes() < 10){
                    e.agregarCliente(c);
                    return true;
                }
            }
            EjecutivoVip e = new EjecutivoVip((id*10)+ejecutivosVip.size(),this);
            e.agregarCliente(c);
            agregarEjecutivoVip(e);
        }
        return true;
    }

}
