package Clases;

import java.util.ArrayList;

public class Mesero extends Persona {

    private ArrayList idiomas;

    private ArrayList<Cliente> clientesAtender;

    private ArrayList<Orden> ordenes;

    public Mesero() {
    }

    public Mesero(ArrayList idiomas, ArrayList<Cliente> clientesAtender, ArrayList<Orden> ordenes, String nombreFull, int cedula, int telefono, String direccion, String correo) {
        super(nombreFull, cedula, telefono, direccion, correo);
        this.idiomas = idiomas;
        this.clientesAtender = clientesAtender;
        this.ordenes = ordenes;
    }

    public Orden crearOrden(ArrayList<Cliente> clientes,ArrayList<Plato> platos, ArrayList<Bebida> bebidas, Mesa mesa, Mesero mesero, Menu menu) {
        Orden orden = new Orden( 0, mesa.getNumAsientos(), platos, bebidas, this, mesa, clientes, menu);
        this.ordenes.add(orden);
        return orden;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<Cliente> getClientesAtender() {
        return clientesAtender;
    }

    public void setClientesAtender(ArrayList<Cliente> clientesAtender) {
        this.clientesAtender = clientesAtender;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }
}
