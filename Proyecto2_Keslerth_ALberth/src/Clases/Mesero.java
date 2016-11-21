package Clases;

import java.util.ArrayList;

public class Mesero extends Persona {

    private String idiomas;

    private String direccion;

    private String correo;

    private ArrayList<Cliente> clientesAtender;

    private ArrayList<Orden> ordenes;

    public Mesero() {
    }

    public Mesero(String idiomas, String nombreFull, int cedula, int telefono, String direccion, String correo) {
        super(nombreFull, cedula, telefono);
        this.idiomas = idiomas;
        this.clientesAtender =new ArrayList<Cliente>();
        this.ordenes = new ArrayList<Orden>();
        this.direccion=direccion;
        this.correo=correo;
    }

    public Orden crearOrden(int mesa, Mesero mesero, Menu menu) {
        Orden orden = new Orden( 0, Main.restaurante.getMesas().get(mesa-1).getCantidad(), this, mesa, menu);
        this.ordenes.add(orden);
        return orden;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
