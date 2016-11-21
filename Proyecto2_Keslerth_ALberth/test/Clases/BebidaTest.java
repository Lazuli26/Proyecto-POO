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
public class BebidaTest {

    private Bebida bebida;

    public BebidaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        bebida = new Bebida("Pepsi", 1000, 2500);
    }

    @After
    public void tearDown() {
        bebida = null;
    }

    /**
     * Test of getTipo method, of class Bebida.
     */
    @Test
    public void testGetTipo() {
        String expResult = "Pepsi";
        String result = bebida.getTipo();
        assertEquals("El tipo es erroneo", expResult, result);
    }

    /**
     * Test of setTipo method, of class Bebida.
     */
    @Test
    public void testSetTipo() {
        String tipo = "Fanta";
        bebida.setTipo(tipo);
        assertEquals("El cambio de tipo es erroneo", tipo, bebida.getTipo());
    }

    /**
     * Test of getPrecio method, of class Bebida.
     */
    @Test
    public void testGetPrecio() {
        int expResult = 1000;
        int result = bebida.getPrecio();
        assertEquals("El precio es erroneo", expResult, result, 0);
    }

    /**
     * Test of setPrecio method, of class Bebida.
     */
    @Test
    public void testSetPrecio() {
        int precio = 3000;
        bebida.setPrecio(precio);
        assertEquals("El cambio de precio es erroneo", precio, bebida.getPrecio(), 0);
    }

    /**
     * Test of getPesoML method, of class Bebida.
     */
    @Test
    public void testGetPesoML() {
        int expResult = 2500;
        int result = bebida.getPesoML();
        assertEquals("El PesoML es erroneo",expResult, result,0);
    }

    /**
     * Test of setPesoML method, of class Bebida.
     */
    @Test
    public void testSetPesoML() {
        int pesoML = 200;
        bebida.setPesoML(pesoML);
        assertEquals("El cambio de PesoML es erroneo",pesoML, bebida.getPesoML(),0);
    }

}
