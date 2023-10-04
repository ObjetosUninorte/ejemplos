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
public abstract class Sucursal {
    protected int id;
    protected ArrayList<Cliente> clientes;
    protected ArrayList<Ejecutivo> ejecutivos;
    protected ArrayList<EjecutivoVip> ejecutivosVip;

    public Sucursal(int id) {
        //System.out.println("Creando sucursal "+id);
        this.id = id;
        clientes = new ArrayList<>();
        ejecutivos = new ArrayList<>();
        ejecutivosVip = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    
   protected void agregarEjecutivo(Ejecutivo ejecutivo) {
        ejecutivos.add(ejecutivo);
    }

    protected void agregarEjecutivoVip(EjecutivoVip ejecutivoVip) {
        ejecutivosVip.add(ejecutivoVip);
    }

    void agregarCliente(Cliente c) {
        clientes.add(c);
    }
    
    public int getNumeroClientes(){
        return clientes.size();
    }

    public CDT getCDTMasFondos() {
        long max = 0;
        CDT id = null;
        for (Cliente c:clientes){
            if (max < c.getCDTMasFondo().getValor()){
                id = c.getCDTMasFondo();
                max = c.getCDTMasFondo().getValor();
            }
        }
        return id;
    }

    public ArrayList<Ejecutivo> getEjecutivos() {
        return ejecutivos;
    }

    public ArrayList<EjecutivoVip> getEjecutivosVip() {
        return ejecutivosVip;
    }
    
        public boolean asignarCliente(Cliente c) {
        if (c.getTotalProductos() <= Banco.VALOR_VIP){
            //System.out.println("Sucursak "+getId()+ " Cliente "+c.getId() + " es normal "+c.getTotalProductos());
            for (Ejecutivo e:ejecutivos){
                if (e.getNumeroClientes() < 20){
                    e.agregarCliente(c);
                    clientes.add(c);
                    return true;
                }
            }
        } else {
         //System.out.println("Sucursak "+getId()+ " Cliente "+c.getId() + " es vip "+c.getTotalProductos());
         for (EjecutivoVip e:ejecutivosVip){
                if (e.getNumeroClientes() < 10){
                    e.agregarCliente(c);
                    clientes.add(c);
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
