package Clases;

import java.util.ArrayList;

public class Plato {

    private int numPlato;

    private String nomPlato;

    private ArrayList ingredientes;

    private int precioSinImpuesto;

    private int cantidadCalorias;

    private String estado;

    private Cocinero cookNow;

    public Plato() {
    }

    public Plato(int numPlato, String nomPlato, ArrayList ingredientes, int precioSinImpuesto, int cantidadCalorias, String estado, Cocinero cookNow) {
        this.numPlato = numPlato;
        this.nomPlato = nomPlato;
        this.ingredientes = ingredientes;
        this.precioSinImpuesto = precioSinImpuesto;
        this.cantidadCalorias = cantidadCalorias;
        this.estado = estado;
        this.cookNow = cookNow;
    }

    public int getNumPlato() {
        return numPlato;
    }

    public void setNumPlato(int numPlato) {
        this.numPlato = numPlato;
    }

    public String getNomPlato() {
        return nomPlato;
    }

    public void setNomPlato(String nomPlato) {
        this.nomPlato = nomPlato;
    }

    public ArrayList getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecioSinImpuesto() {
        return precioSinImpuesto;
    }

    public void setPrecioSinImpuesto(int precioSinImpuesto) {
        this.precioSinImpuesto = precioSinImpuesto;
    }

    public int getCantidadCalorias() {
        return cantidadCalorias;
    }

    public void setCantidadCalorias(int cantidadCalorias) {
        this.cantidadCalorias = cantidadCalorias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cocinero getCookNow() {
        return cookNow;
    }

    public void setCookNow(Cocinero cookNow) {
        this.cookNow = cookNow;
    }
}
