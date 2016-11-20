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
public class CocineroTest {
    private Cocinero cocinero;
    
    public CocineroTest() {
    }
    
    @Before
    public void setUp() {
        Orden orden = new Orden();
        ArrayList<Orden> ordenesCocinar = new ArrayList();
        ordenesCocinar.add(orden);
        cocinero = new Cocinero("Alberth Salas Calero", 201230434, 87878787, "Fortuna, zona fulca", "alberthsalas@gmail.com");
    }
    
    @After
    public void tearDown() {
        cocinero = null;
    }

    /**
     * Test of agregarOrdenCocinar method, of class Cocinero.
     */
    @Test
    public void testAgregarOrdenCocinar() {
        Orden orden = new Orden();
        cocinero.agregarOrdenCocinar(orden);
        assertEquals("No agrega correctamente",2, cocinero.getOrdenesCocinar().size(),0);
    }

    /**
     * Test of getOrdenesCocinar method, of class Cocinero.
     */
    @Test
    public void testGetOrdenesCocinar() {
        ArrayList<Orden> result = cocinero.getOrdenesCocinar();
        assertEquals("La lista de ordenes es erronea",1, result.size(),0);
    }

    /**
     * Test of setOrdenesCocinar method, of class Cocinero.
     */
    @Test
    public void testSetOrdenesCocinar() {
        Orden orden = new Orden();
        ArrayList<Orden> ordenesCocinar = new ArrayList();
        ordenesCocinar.add(orden);
        ordenesCocinar.add(orden);
        cocinero.setOrdenesCocinar(ordenesCocinar);
        assertEquals("La lista de ordenes no se cambio, es erronea",2, cocinero.getOrdenesCocinar().size(),0);
    }
    
}
