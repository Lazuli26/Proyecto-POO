package Clases;

public class Mesa {

    private int numAsientos;

    private int cantidad;

    private boolean disponible;

    public Mesa() {
    }

    public Mesa(int numAsientos, int cantidad, boolean disponible) {
        this.numAsientos = numAsientos;
        this.cantidad = cantidad;
        this.disponible = disponible;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
