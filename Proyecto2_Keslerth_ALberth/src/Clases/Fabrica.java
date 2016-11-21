/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Fabrica {
    public Cliente crearcliente(int numCliente, Orden orden, int vecesVisitadas, String nombreFull, int cedula, int telefono){
        return new Cliente(numCliente,orden,vecesVisitadas,nombreFull,cedula,telefono);
    }
    public Cocinero crearcocinero(String nombreFull, int cedula, int telefono, String direccion, String correo){
        return new Cocinero(nombreFull,cedula,telefono,direccion,correo);
    }
    public Mesero crearmesero(String idiomas, String nombreFull, int cedula, int telefono, String direccion, String correo){
        return new Mesero(idiomas, nombreFull, cedula, telefono, direccion, correo);
    }
}
