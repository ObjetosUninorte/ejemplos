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
public class Cliente {
    private int id;
    private Sucursal sucursal;
    private ArrayList<CDT> cdts = new ArrayList<>();
    private ArrayList<Cuenta> cuentas = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();
    private ArrayList<TC> tcs = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public Cliente(int id) {
        this.id = id;
    }
    
    

    public Sucursal getSucursal() {
        return sucursal;
    }

    public int getId() {
        return id;
    }
    
    void asignarSucursal(Sucursal s) {
     this.sucursal = s;   
    }

    void agregarTc(TC p) {
        tcs.add(p);
        productos.add(p);
    }
    
    void agregarCuenta(Cuenta p) {
        cuentas.add(p);
        productos.add(p);
    }
    
    void agregarPrestamo(Prestamo p) {
        prestamos.add(p);
        productos.add(p);
    }
        
    void agregarCDT(CDT p) {
        cdts.add(p);
        productos.add(p);
    }
    public int getNumeroProductos(){
        return tcs.size() +cuentas.size() + prestamos.size() +cdts.size();
    }
    
    public long getTotalProductos(){
        long total = 0;
        
        for (Producto p:productos){
            total = total + p.getValor();
        }
        
        return total;
    }

    public int  getNumeroTC() {
        return tcs.size();
    }

    public CDT getCDTMasFondo() {
       long total = 0;
       CDT id = null;
        for (CDT p:cdts){
                if (total < p.getValor()){
                    total =  p.getValor();
                    id = p;
                }
        }
        
        return id;
    }


}
