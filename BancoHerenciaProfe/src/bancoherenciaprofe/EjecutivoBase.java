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
public class EjecutivoBase {
   protected int id;
   protected ArrayList<Cliente> clientes;
   protected Sucursal sucursal;

    public EjecutivoBase(int id, Sucursal sucursal) {
        this.id = id;
        clientes = new ArrayList<>();
        this.sucursal = sucursal;
    }

    public int getId() {
        return id;
    }
    
    public int getNumeroProductos(){
        int add = 0;
        for (Cliente c:clientes){
            add = add + c.getNumeroProductos();
        }
        return add;
    }
    
    public void agregarCliente(Cliente c){
        clientes.add(c);
    }
    
    public  int getNumeroClientes(){
        return clientes.size();
    }
    
     public long getTotalPlataProductos(){
        long add = 0;
        for (Cliente c:clientes){
            add = add + c.getTotalProductos();
        }
        return add;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
    
    
     
   
}
