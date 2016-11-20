package Clases;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Plato> listaPratillos;

    private ArrayList<Bebida> listaBebidas;

    public Menu() {
        this.listaPratillos = new ArrayList<Plato>();
        this.listaBebidas = new ArrayList<Bebida>();
    }
    

    public void agregarPlato(Plato plato) {
        this.listaPratillos.add(plato);
    }

    public void agregarBebida(Bebida bebida) {
        this.listaBebidas.add(bebida);
    }

    public ArrayList<Plato> getListaPratillos() {
        return listaPratillos;
    }

    public void setListaPratillos(ArrayList<Plato> listaPratillos) {
        this.listaPratillos = listaPratillos;
    }

    public ArrayList<Bebida> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(ArrayList<Bebida> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }
}
