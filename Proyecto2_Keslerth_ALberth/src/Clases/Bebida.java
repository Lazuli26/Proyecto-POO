package Clases;

public class Bebida {

    private String tipo;

    private int precio;

    private int pesoML;

    public Bebida() {
    }

    public Bebida(String tipo, int precio, int pesoML) {
        this.tipo = tipo;
        this.precio = precio;
        this.pesoML = pesoML;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPesoML() {
        return pesoML;
    }

    public void setPesoML(int pesoML) {
        this.pesoML = pesoML;
    }
}
