/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author keslerth
 */
public class FacturaTest {
    private Factura factura;
    
    public FacturaTest() {
    }
    
    @Before
    public void setUp() {
        ArrayList<Cliente> clientes = new ArrayList();
        Orden orden = new Orden();
        factura = new Factura(101016, 202020, clientes, "Efectivo", "El queso esta rico", orden);
    }
    
    @After
    public void tearDown() {
        factura = null;
    }

    @Test
    public void agregarClienteFact() {
        Cliente cliente = new Cliente();
        factura.agregarClienteFact(cliente);
        assertEquals("agregar cliente es erronea", 1, factura.getCliente().size(),0);
    }
    
    
    /**
     * Test of getFecha method, of class Factura.
     */
    @Test
    public void testGetFecha() {
        int expResult = 101016;
        int result = factura.getFecha();
        assertEquals("La fecha es erronea",expResult, result,0);
    }

    /**
     * Test of setFecha method, of class Factura.
     */
    @Test
    public void testSetFecha() {
        int fecha = 101116;
        factura.setFecha(fecha);
        assertEquals("La fecha es erronea",fecha, factura.getFecha(),0);
    }

    /**
     * Test of getHora method, of class Factura.
     */
    @Test
    public void testGetHora() {
        int expResult = 202020;
        int result = factura.getHora();
        assertEquals("La hora es erronea",expResult, result,0);
    }

    /**
     * Test of setHora method, of class Factura.
     */
    @Test
    public void testSetHora() {
        int hora = 200000;
        factura.setHora(hora);
        assertEquals("El cambio de hora es erronea",hora, factura.getHora(),0);
    }

    /**
     * Test of getCliente method, of class Factura.
     */
    @Test
    public void testGetCliente() {
        int expResult = 0;
        int result = factura.getCliente().size();
        assertEquals("La lista de clientes es Erronea", expResult, result, 0);
    }

    /**
     * Test of setCliente method, of class Factura.
     */
    @Test
    public void testSetCliente() {
        ArrayList<Cliente> clientes = new ArrayList();
        Cliente cliente = new Cliente();
        clientes.add(cliente);
        factura.setCliente(clientes);
        assertEquals("El cambio de lista de clientes es Erronea", 1, factura.getCliente().size(), 0);
    }

    /**
     * Test of getFormaPago method, of class Factura.
     */
    @Test
    public void testGetFormaPago() {
        String expResult = "Efectivo";
        String result = factura.getFormaPago();
        assertEquals("El tipo de pago es erroneo",expResult, result);
    }

    /**
     * Test of setFormaPago method, of class Factura.
     */
    @Test
    public void testSetFormaPago() {
        String formaPago = "Tarjeta";
        factura.setFormaPago(formaPago);
        assertEquals("El tipo de pago es erroneo",formaPago, factura.getFormaPago());
    }

    /**
     * Test of getDetalle method, of class Factura.
     */
    @Test
    public void testGetDetalle() {
        String expResult = "El queso esta rico";
        String result = factura.getDetalle();
        assertEquals("El detalle es erroneo",expResult, result);
    }

    /**
     * Test of setDetalle method, of class Factura.
     */
    @Test
    public void testSetDetalle() {
        System.out.println("setDetalle");
        String detalle = "";
        Factura instance = new Factura();
        instance.setDetalle(detalle);
    }

    /**
     * Test of getOrden method, of class Factura.
     */
    @Test
    public void testGetOrden() {
        Orden expResult = new Orden();
        Orden result = factura.getOrden();
        assertEquals("La orden es erronea",expResult.getNumero(), result.getNumero(),0);
    }

    /**
     * Test of setOrden method, of class Factura.
     */
    @Test
    public void testSetOrden() {
        Orden orden = new Orden(2, 1, null,  null,null);
        factura.setOrden(orden);
        assertEquals("El cambio de orden es erronea",orden.getNumero(), factura.getOrden().getNumero(),0);
    }
    
}
