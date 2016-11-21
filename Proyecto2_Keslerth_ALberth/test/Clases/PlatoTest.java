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
public class PlatoTest {
    
    public PlatoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumPlato method, of class Plato.
     */
    @Test
    public void testGetNumPlato() {
        System.out.println("getNumPlato");
        Plato instance = new Plato();
        int expResult = 0;
        int result = instance.getNumPlato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumPlato method, of class Plato.
     */
    @Test
    public void testSetNumPlato() {
        System.out.println("setNumPlato");
        int numPlato = 0;
        Plato instance = new Plato();
        instance.setNumPlato(numPlato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomPlato method, of class Plato.
     */
    @Test
    public void testGetNomPlato() {
        System.out.println("getNomPlato");
        Plato instance = new Plato();
        String expResult = "";
        String result = instance.getNomPlato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomPlato method, of class Plato.
     */
    @Test
    public void testSetNomPlato() {
        System.out.println("setNomPlato");
        String nomPlato = "";
        Plato instance = new Plato();
        instance.setNomPlato(nomPlato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIngredientes method, of class Plato.
     */
    @Test
    public void testGetIngredientes() {
        System.out.println("getIngredientes");
        Plato instance = new Plato();
        String expResult = "";
        String result = instance.getIngredientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIngredientes method, of class Plato.
     */
    @Test
    public void testSetIngredientes() {
        System.out.println("setIngredientes");
        String ingredientes = "";
        Plato instance = new Plato();
        instance.setIngredientes(ingredientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioSinImpuesto method, of class Plato.
     */
    @Test
    public void testGetPrecioSinImpuesto() {
        System.out.println("getPrecioSinImpuesto");
        Plato instance = new Plato();
        int expResult = 0;
        int result = instance.getPrecioSinImpuesto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioSinImpuesto method, of class Plato.
     */
    @Test
    public void testSetPrecioSinImpuesto() {
        System.out.println("setPrecioSinImpuesto");
        int precioSinImpuesto = 0;
        Plato instance = new Plato();
        instance.setPrecioSinImpuesto(precioSinImpuesto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadCalorias method, of class Plato.
     */
    @Test
    public void testGetCantidadCalorias() {
        System.out.println("getCantidadCalorias");
        Plato instance = new Plato();
        int expResult = 0;
        int result = instance.getCantidadCalorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadCalorias method, of class Plato.
     */
    @Test
    public void testSetCantidadCalorias() {
        System.out.println("setCantidadCalorias");
        int cantidadCalorias = 0;
        Plato instance = new Plato();
        instance.setCantidadCalorias(cantidadCalorias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Plato.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Plato instance = new Plato();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Plato.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Plato instance = new Plato();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCookNow method, of class Plato.
     */
    @Test
    public void testGetCookNow() {
        System.out.println("getCookNow");
        Plato instance = new Plato();
        Cocinero expResult = null;
        Cocinero result = instance.getCookNow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCookNow method, of class Plato.
     */
    @Test
    public void testSetCookNow() {
        System.out.println("setCookNow");
        Cocinero cookNow = null;
        Plato instance = new Plato();
        instance.setCookNow(cookNow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
