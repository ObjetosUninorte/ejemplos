/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoherenciaprofe;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author augustosalazar
 */
public class Banco {

    public static final int NUMERO_CLIENTE_POR_SUCURSAL = 100;
    public static final int NUMERO_SUCURSALES = 3;
    public static final int VALOR_VIP = 1000000;

    private ArrayList<Sucursal> sucursales = new ArrayList<>();
    private ArrayList<Cliente> clientes;
    private ArrayList<Ejecutivo> ejecutivos;
    private ArrayList<EjecutivoVip> ejecutivosVip;
    private ArrayList<Tipo1> sucursalesTipo1 = new ArrayList<>();
    private ArrayList<Tipo2> sucursalesTipo2 = new ArrayList<>();
    private ArrayList<Tipo3> sucursalesTipo3 = new ArrayList<>();
    private Tipo0 principal;

    public Banco() {
        clientes = new ArrayList<>();
        ejecutivos = new ArrayList<>();
        ejecutivosVip = new ArrayList<>();
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        Tipo0 laPrincipal;
        Tipo1 sucTipo1;
        Tipo2 sucTipo2;
        Tipo3 sucTipo3;
        Cliente c;

        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        
        int i = 1;
        laPrincipal = new Tipo0(999);
        banco.agregarSucursalTipo0(laPrincipal);

        for (int j = 1; j <= 5; j++) {
            sucTipo1 = new Tipo1(i);
            i++;
            
            banco.agregarSucursalTipo1(sucTipo1);
            for (int z = 1; z <= (10 * j); z++) {
                c = new Cliente(i ^ 100 * j ^ 10 + z);
                banco.agregarCliente(c);
                banco.agregarProductoCliente(c, new Cuenta(1, 10, 1000 * i * j * z)); // creo la cuenta con id, tasaInteres, saldo
                banco.agregarProductoCliente(c, new CDT(2 * i, cal.getTime(), 10, i * j * 20 * z)); // creo el cdt con id, fechaV, tasaInteres, saldo

                for (int w = 1; w < z; w++) {
                    banco.agregarProductoCliente(c, new TC(3 * i + w, cal.getTime(), 10, i * j * 30 * z)); // creo  con id, fechaV, tasaInteres, saldo
                }

                for (int w = 1; w < z; w++) {
                    banco.agregarProductoCliente(c, new Prestamo(4 * j + w, 10, i * j * 100 * z)); //// creo con id, tasaInteres, saldo
                }
                if (sucTipo1.asignarCliente(c) == false) {
                    laPrincipal.asignarCliente(c);
                }
            }
        }

        for (int j = 1; j <= 5; j++) {
            sucTipo2 = new Tipo2(i);
            i++;
            
            banco.agregarSucursalTipo2(sucTipo2);
            for (int z = 1; z <= (10 * j); z++) {
                c = new Cliente(i ^ 100 * j ^ 10 + z);
                banco.agregarCliente(c);
                banco.agregarProductoCliente(c, new Cuenta(1, 10, 1000 * i * j * z)); // creo la cuenta con id, tasaInteres, saldo
                banco.agregarProductoCliente(c, new CDT(2 * i, cal.getTime(), 10, i * j * 20 * z)); // creo el cdt con id, fechaV, tasaInteres, saldo

                for (int w = 1; w < z; w++) {
                    banco.agregarProductoCliente(c, new TC(3 * i + w, cal.getTime(), 10, i * j * 30 * z)); // creo  con id, fechaV, tasaInteres, saldo
                }

                for (int w = 1; w < z; w++) {
                    banco.agregarProductoCliente(c, new Prestamo(4 * j + w, 10, i * j * 100 * z)); //// creo con id, tasaInteres, saldo
                }

                if (sucTipo2.asignarCliente(c) == false) {
                    laPrincipal.asignarCliente(c);
                }
            }
        }

        for (int j = 1; j <= 3; j++) {
            sucTipo3 = new Tipo3(i);
            i++;
            
            banco.agregarSucursalTipo3(sucTipo3);
            for (int z = 1; z <= (10 * j); z++) {
                c = new Cliente(i ^ 100 * j ^ 10 + z);
                banco.agregarCliente(c);
                banco.agregarProductoCliente(c, new Cuenta(1, 10, 1000 * i * j * z)); // creo la cuenta con id, tasaInteres, saldo
                banco.agregarProductoCliente(c, new CDT(2 * i, cal.getTime(), 10, i * j * 20 * z)); // creo el cdt con id, fechaV, tasaInteres, saldo

                for (int w = 1; w < z; w++) {
                    banco.agregarProductoCliente(c, new TC(3 * i + w, cal.getTime(), 10, i * j * 30 * z)); // creo  con id, fechaV, tasaInteres, saldo
                }

                for (int w = 1; w < z; w++) {
                    banco.agregarProductoCliente(c, new Prestamo(4 * j + w, 10, i * j * 100 * z)); //// creo con id, tasaInteres, saldo
                }

                if (sucTipo3.asignarCliente(c) == false) {
                    laPrincipal.asignarCliente(c);
                }
            }
        }

        for (Sucursal s : banco.sucursales) {
            banco.ejecutivos.addAll(s.getEjecutivos());
            banco.ejecutivosVip.addAll(s.getEjecutivosVip());       
        }

        System.out.println("El Id de la sucursal con más clientes es " + banco.getSucursalMasClientes());
        System.out.println("El Id del vip con más productos " + banco.getVipMasProductos());
        System.out.println("El Id del vip con productos con más plata " + banco.getVipProductosMasPlata());
        System.out.println("El Id del cliente con más TC " + banco.getClienteMasTC());
        banco.imprimirIdCdTMasFondos();
    }

    private void agregarProductoCliente(Cliente c, Producto p) {
        if (p instanceof Cuenta) {
            c.agregarCuenta((Cuenta) p);
        }

        if (p instanceof CDT) {
            c.agregarCDT((CDT) p);
        }

        if (p instanceof TC) {
            c.agregarTc((TC) p);
        }

        if (p instanceof Prestamo) {
            c.agregarPrestamo((Prestamo) p);
        }
    }

    private void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    private void agregarSucursalCliente(Sucursal s, Cliente c) {
        s.agregarCliente(c);
        c.asignarSucursal(s);
    }

    private int getSucursalMasClientes() {
        int mayor = 0;
        int id = 0;
        for (Tipo1 s : sucursalesTipo1) {
            if (mayor < s.getNumeroClientes()) {
                id = s.getId();
                mayor = s.getNumeroClientes();
            }
        }

        for (Tipo2 s : sucursalesTipo2) {
            if (mayor < s.getNumeroClientes()) {
                id = s.getId();
                mayor = s.getNumeroClientes();
            }
        }

        for (Tipo3 s : sucursalesTipo3) {
            if (mayor < s.getNumeroClientes()) {
                id = s.getId();
                mayor = s.getNumeroClientes();
            }
        }

        if (mayor < principal.getNumeroClientes()) {
            id = principal.getId();
            mayor = principal.getNumeroClientes();
        }
        return id;
    }

    private int getMasProductos() {
        int id = 0;
        int max = 0;
        for (Ejecutivo e : ejecutivos) {
            if (max < e.getNumeroProductos()) {
                id = e.getId();
                max = e.getNumeroProductos();
            }
        }
        return id;
    }

    private int getVipMasProductos() {
        int id = 0;
        int max = 0;

        //System.out.println("ejecutivosVip size "+ejecutivosVip.size());
        for (EjecutivoVip e : ejecutivosVip) {
            //System.out.println("EjecutuvoVip id "+e.getId() + "  sucursal "+e.getSucursal().getId() +" " +e.getNumeroProductos());
            if (max < e.getNumeroProductos()) {
                id = e.getId();
                max = e.getNumeroProductos();
            }
        }
        return id;
    }

    private void agregarEjecutivo(Sucursal s, Ejecutivo ejecutivo) {
        ejecutivos.add(ejecutivo);
        s.agregarEjecutivo(ejecutivo);

    }

    private void agregarEjecutivoVip(Sucursal s, EjecutivoVip ejecutivoVip) {
        ejecutivosVip.add(ejecutivoVip);
        s.agregarEjecutivoVip(ejecutivoVip);
    }

    private int getVipProductosMasPlata() {
        int id = 0;
        long max = 0;
        for (EjecutivoVip e : ejecutivosVip) {

            if (max < e.getTotalPlataProductos()) {
                id = e.getId();
                max = e.getTotalPlataProductos();
            }
        }
        return id;
    }

    private int getClienteMasTC() {
        int id = 0;
        int max = 0;
        for (Cliente c : clientes) {

            if (max < c.getNumeroTC()) {
                id = c.getId();
                max = c.getNumeroTC();
            }
        }
        return id;
    }

    private void imprimirIdCdTMasFondos() {
        long mayor = 0;
        int id = 0;
        CDT temp, elMayor = null;
        
        for (Sucursal s : sucursales) {
              temp = s.getCDTMasFondos();
            if (temp != null) {
                if (mayor < temp.getValor()) {
                    mayor = temp.getValor();
                    elMayor = temp;
                }
            }      
        }

        System.out.println("El id del CDT con más fondos de todo el banco es " + elMayor.getValor());
    }

    private void agregarSucursalTipo0(Tipo0 sucursal) {
        sucursales.add(sucursal);
        principal = sucursal;
    }

    private void agregarSucursalTipo1(Tipo1 sucursal) {
        sucursales.add(sucursal);
        sucursalesTipo1.add(sucursal);
    }

    private void agregarSucursalTipo2(Tipo2 sucursal) {
        sucursales.add(sucursal);
        sucursalesTipo2.add(sucursal);
    }

    private void agregarSucursalTipo3(Tipo3 sucursal) {
        sucursales.add(sucursal);
        sucursalesTipo3.add(sucursal);
    }

}
