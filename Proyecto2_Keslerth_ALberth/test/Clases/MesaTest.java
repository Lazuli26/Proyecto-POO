/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
public class MesaTest {
    private Mesa mesa;
    
    public MesaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        mesa = new Mesa(1, 7, true);
    }
    
    @After
    public void tearDown() {
        mesa = null;
    }

    /**
     * Test of getNumAsientos method, of class Mesa.
     */
    @Test
    public void testGetNumAsientos() {
        int expResult = 1;
        int result = mesa.getNumAsientos();
        assertEquals("Numero mesa es erroneo", expResult, result,0);
    }

    /**
     * Test of setNumAsientos method, of class Mesa.
     */
    @Test
    public void testSetNumAsientos() {
        int numAsientos = 2;
        mesa.setNumAsientos(numAsientos);
        assertEquals("Cambio numero mesa es erroneo", numAsientos, mesa.getNumAsientos(),0);
    }

    /**
     * Test of getCantidad method, of class Mesa.
     */
    @Test
    public void testGetCantidad() {
        int expResult = 7;
        int result = mesa.getCantidad();
        assertEquals("Cantidad asientos es erronea", expResult, result,0);
    }

    /**
     * Test of setCantidad method, of class Mesa.
     */
    @Test
    public void testSetCantidad() {
        int cantidad = 4;
        mesa.setCantidad(cantidad);
        assertEquals("Cambio cantidad asientos es erronea", cantidad, mesa.getCantidad(),0);
    }

    /**
     * Test of isDisponible method, of class Mesa.
     */
    @Test
    public void testIsDisponible() {
        boolean expResult = true;
        boolean result = mesa.isDisponible();
        assertEquals("Disponibilidad es erronea",expResult, result);
    }

    /**
     * Test of setDisponible method, of class Mesa.
     */
    @Test
    public void testSetDisponible() {
        boolean disponible = false;
        mesa.setDisponible(disponible);
        assertEquals("cambio disponibilidad es erronea",disponible, mesa.isDisponible());
    }
    
}
