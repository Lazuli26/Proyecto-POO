package Clases;

public class Persona {

    private String nombreFull;

    private int cedula;

    private int telefono;

    public Persona() {
    }

    public Persona(String nombreFull, int cedula, int telefono) {
        this.nombreFull = nombreFull;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombreFull() {
        return nombreFull;
    }

    public void setNombreFull(String nombreFull) {
        this.nombreFull = nombreFull;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
