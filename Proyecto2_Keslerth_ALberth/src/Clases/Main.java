/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Ventanas.*;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author keslerth
 */

public class Main {
    public static vPrincipal ventana;
    public static Restaurante restaurante;
    static ArrayList direccion;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Direccion------
        direccion = new ArrayList();
        direccion.add("Alajuela");
        direccion.add("San Carlos");
        direccion.add("Quesada");
        direccion.add("300m liceo SC");
        //Direccion-------
        //Foto---
        //Foto---
        //Mesero---
        restaurante = new Restaurante("Cheese Restaurante", 86360027, direccion, "cheeseres@gmail.com");
        ventana=new vPrincipal();
        ventana.show();
    }
}
