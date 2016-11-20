package Clases;

import java.util.ArrayList;

public class Cocinero extends Persona {

    private String nivel;

    private ArrayList<Orden> ordenesCocinar;

    public Cocinero() {
    }

    public Cocinero(String nivel, ArrayList<Orden> ordenesCocinar, String nombreFull, int cedula, int telefono, String direccion, String correo) {
        super(nombreFull, cedula, telefono, direccion, correo);
        this.nivel = nivel;
        this.ordenesCocinar = ordenesCocinar;
    }

    public void agregarOrdenCocinar(Orden orden) {
        this.ordenesCocinar.add(orden);
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Orden> getOrdenesCocinar() {
        return ordenesCocinar;
    }

    public void setOrdenesCocinar(ArrayList<Orden> ordenesCocinar) {
        this.ordenesCocinar = ordenesCocinar;
    }
}
