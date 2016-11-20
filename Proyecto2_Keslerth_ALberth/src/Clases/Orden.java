package Clases;

import java.util.ArrayList;

public class Orden {

    private int numero;

    private int numMesa;

    private ArrayList<Plato> platos;

    private ArrayList<Bebida> bebidas;

    private Mesero meseroAtiende;

    private Mesa mesaCliente;

    private ArrayList<Cliente> clientesAtendidos;

    private Menu menu;

    public Orden() {
    }

    public Orden(int numero, int numMesa, Mesero meseroAtiende, Mesa mesaCliente, Menu menu) {
        this.numero = numero;
        this.numMesa = numMesa;
        this.platos = new ArrayList();
        this.bebidas = new ArrayList();
        this.meseroAtiende = meseroAtiende;
        this.mesaCliente = mesaCliente;
        this.clientesAtendidos = new ArrayList();
        this.menu = menu;
    }
    

    public void pedido(Plato plato) {
        this.platos.add(plato);
    }

    public void grupoClientes(Cliente cliente) {
        this.clientesAtendidos.add(cliente);
    }

    public void cocinarPlato(Cocinero cocinero,Plato plato) {
        for(int i =0;i<this.platos.size();i++){
            if(this.platos.get(i).equals(plato)){
                this.platos.get(i).setCookNow(cocinero);
            }
        }
    }

    public void pedido(Bebida bebida) {
        this.bebidas.add(bebida);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public Mesero getMeseroAtiende() {
        return meseroAtiende;
    }

    public void setMeseroAtiende(Mesero meseroAtiende) {
        this.meseroAtiende = meseroAtiende;
    }

    public Mesa getMesaCliente() {
        return mesaCliente;
    }

    public void setMesaCliente(Mesa mesaCliente) {
        this.mesaCliente = mesaCliente;
    }

    public ArrayList<Cliente> getClientesAtendidos() {
        return clientesAtendidos;
    }

    public void setClientesAtendidos(ArrayList<Cliente> clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
