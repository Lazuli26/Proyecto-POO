package Clases;

import java.util.ArrayList;

public class Factura {

    private int fecha;

    private int hora;

    private ArrayList<Cliente> clientes;

    private String formaPago;

    private String detalle;

    private Orden orden;

    public Factura() {
    }

    public Factura(int fecha, int hora, ArrayList<Cliente> clientes, String formaPago, String detalle, Orden orden) {
        this.fecha = fecha;
        this.hora = hora;
        this.clientes = clientes;
        this.formaPago = formaPago;
        this.detalle = detalle;
        this.orden = orden;
    }

    public void agregarClienteFact(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public ArrayList<Cliente> getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
}
