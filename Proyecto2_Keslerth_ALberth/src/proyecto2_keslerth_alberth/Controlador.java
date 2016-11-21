/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_keslerth_alberth;

import Clases.Main;
import Clases.Orden;
import Ventanas.Factura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author keslerth
 */
public class Controlador implements ActionListener {

    public Factura ventana;

    public Controlador() {
        Main.ventana.vFactura = new Factura();
        for (Orden orden : Main.restaurante.getOrdenes()) {
            Main.ventana.vFactura.jComboBox1.addItem(orden.getNumero());
        }
        Main.ventana.vFactura.show();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int fecha = (Integer.parseInt(Main.ventana.vFactura.jComboBox4.getSelectedItem().toString()) * 10000) + (Integer.parseInt(Main.ventana.vFactura.jComboBox3.getSelectedItem().toString()) * 100) + (Integer.parseInt(Main.ventana.vFactura.jComboBox2.getSelectedItem().toString()));
        String pago = "";
        Orden orden1 = new Orden();
        if (Main.ventana.vFactura.jRadioButton1.isEnabled()) {
            pago = "Efectivo";
        } else {
            pago = "Tarjeta";
        }
        if (ae.getActionCommand().equals(Main.ventana.vFactura.jButton1.getActionCommand())) {
            for (Orden orden : Main.restaurante.getOrdenes()) {
                if (orden.getNumero() == Integer.parseInt(Main.ventana.vFactura.jComboBox1.getSelectedItem().toString())){
                    orden1 = orden;
                }
            }
            Main.restaurante.facturar(fecha, Integer.parseInt(Main.ventana.vFactura.jTextField2.getText()), Main.ventana.vFactura.jTextField1.getText(), pago, null,orden1);
        } else if (ae.getActionCommand().equals(Main.ventana.vFactura.jButton2.getActionCommand())) {
            Main.ventana.vFactura.dispose();
        } else if (ae.getActionCommand().equals(Main.ventana.vFactura.jRadioButton1.getActionCommand())) {
            Main.ventana.vFactura.jRadioButton2.setEnabled(false);
        } else if (ae.getActionCommand().equals(Main.ventana.vFactura.jRadioButton2.getActionCommand())) {
            Main.ventana.vFactura.jRadioButton1.setEnabled(false);
        }
    }
}
