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
public class MeseroTest {
    private Mesero mesero;
    
    public MeseroTest() {
    }
    
    @Before
    public void setUp() {
        ArrayList idiomas = new ArrayList();
        idiomas.add("Español");
        ArrayList<Cliente> clientesAtender = new ArrayList();
        ArrayList<Orden> ordenes = new ArrayList();
        mesero = new Mesero(idiomas, clientesAtender, ordenes, "Juancho Perez", 102340333, 89008900, "El oeste del Chiguagua", "juanchop@gmail.com");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearOrden method, of class Mesero.
     */
    @Test
    public void testCrearOrden() {
        Cliente cliente = null;
        Mesa mesa = null;
        Mesero mesero = null;
        Menu menu = null;
        Orden expResult = null;
        Orden result = mesero.crearOrden(cliente, mesa, mesero, menu);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdiomas method, of class Mesero.
     */
    @Test
    public void testGetIdiomas() {
        ArrayList expResult = new ArrayList();
        expResult.add("Español");
        ArrayList result = mesero.getIdiomas();
        assertEquals("Idioma es erroneo", expResult, result);
    }

    /**
     * Test of setIdiomas method, of class Mesero.
     */
    @Test
    public void testSetIdiomas() {
        ArrayList idiomas = new ArrayList();
        idiomas.add("Italiano");
        mesero.setIdiomas(idiomas);
        assertEquals("Idioma es erroneo", idiomas, mesero.getIdiomas());
        
    }

    /**
     * Test of getClientesAtender method, of class Mesero.
     */
    @Test
    public void testGetClientesAtender() {
        ArrayList<Cliente> expResult = new ArrayList();
        ArrayList<Cliente> result = mesero.getClientesAtender();
        assertEquals("Clientes atendidos es erroneo",expResult, result);
    }

    /**
     * Test of setClientesAtender method, of class Mesero.
     */
    @Test
    public void testSetClientesAtender() {
        ArrayList<Cliente> clientesAtender = new ArrayList();
        Cliente cliente = new Cliente();
        clientesAtender.add(cliente);
        mesero.setClientesAtender(clientesAtender);
        assertEquals("Clientes atendidos es erroneo",cliente, mesero.getClientesAtender());
    }

    /**
     * Test of getOrdenes method, of class Mesero.
     */
    @Test
    public void testGetOrdenes() {
        ArrayList<Orden> expResult = new ArrayList();
        ArrayList<Orden> result = mesero.getOrdenes();
        assertEquals("Las ordenes son erroneas",expResult, result);
    }

    /**
     * Test of setOrdenes method, of class Mesero.
     */
    @Test
    public void testSetOrdenes() {
        ArrayList<Orden> ordenes = new ArrayList();
        Orden orden = new Orden();
        ordenes.add(orden);
        mesero.setOrdenes(ordenes);
        assertEquals("Cambio de ordenes son erroneas",ordenes, mesero.getOrdenes());
    }
    
}
