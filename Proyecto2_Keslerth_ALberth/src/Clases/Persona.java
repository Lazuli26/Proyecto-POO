package Clases;

public class Persona {

    private String nombreFull;

    private int cedula;

    private int telefono;

    private String direccion;

    private String correo;

    public Persona() {
    }

    public Persona(String nombreFull, int cedula, int telefono, String direccion, String correo) {
        this.nombreFull = nombreFull;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
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
