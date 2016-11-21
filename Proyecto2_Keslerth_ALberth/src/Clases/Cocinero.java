package Clases;

import java.util.ArrayList;

public class Cocinero extends Persona {

    private String direccion;

    private String correo;

    private ArrayList<Orden> ordenesCocinar;

    public Cocinero() {
    }

    public Cocinero(String nombreFull, int cedula, int telefono, String direccion, String correo) {
        super(nombreFull, cedula, telefono);
        this.ordenesCocinar = new ArrayList<Orden>();
        this.direccion=direccion;
        this.correo=correo;
    }

    public void agregarOrdenCocinar(Orden orden) {
        this.ordenesCocinar.add(orden);
    }

    public ArrayList<Orden> getOrdenesCocinar() {
        return ordenesCocinar;
    }

    public void setOrdenesCocinar(ArrayList<Orden> ordenesCocinar) {
        this.ordenesCocinar = ordenesCocinar;
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
