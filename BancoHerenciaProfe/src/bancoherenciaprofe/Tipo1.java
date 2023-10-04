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
public class Tipo1 extends Sucursal{
    
    public Tipo1(int id) {
        super(id);
        Ejecutivo e = new Ejecutivo((id*10)+ejecutivos.size(),this);
        agregarEjecutivo(e);
    }
  
//    public boolean asignarClienteAEjecutivo(Cliente c) {
//        if (c.getTotalProductos() <= Banco.VALOR_VIP){
//            for (Ejecutivo e:ejecutivos){
//                if (e.getNumeroClientes() < 20){
//                    e.agregarCliente(c);
//                    clientes.add(c);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    
}
