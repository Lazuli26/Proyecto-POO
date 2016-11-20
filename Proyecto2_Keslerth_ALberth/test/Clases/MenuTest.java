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
public class MenuTest {
    private Menu menu;
    
    public MenuTest() {
    }
    
    
    @Before
    public void setUp() {
        ArrayList<Plato> platos = new ArrayList();
        ArrayList<Bebida> bebidas = new ArrayList();
        menu = new Menu(platos,bebidas);
    }
    
    @After
    public void tearDown() {
        menu = null;
    }

    /**
     * Test of agregarPlato method, of class Menu.
     */
    @Test
    public void testAgregarPlato() {
        Plato plato = new Plato();
        menu.agregarPlato(plato);
        assertEquals("agregar platillo es erronea", 1, menu.getListaPratillos().size(),0);
    }

    /**
     * Test of agregarBebida method, of class Menu.
     */
    @Test
    public void testAgregarBebida() {
        Bebida bebida = new Bebida();
        menu.agregarBebida(bebida);
        assertEquals("agregar bebida es erronea", 1, menu.getListaBebidas().size(),0);
    }

    /**
     * Test of getListaPratillos method, of class Menu.
     */
    @Test
    public void testGetListaPratillos() {
        ArrayList<Plato> expResult = new ArrayList();
        ArrayList<Plato> result = menu.getListaPratillos();
        assertEquals("Lista de platos es erronea",expResult, result);
    }

    /**
     * Test of setListaPratillos method, of class Menu.
     */
    @Test
    public void testSetListaPratillos() {
        ArrayList<Plato> listaPratillos = new ArrayList();
        Plato plato = new Plato();
        listaPratillos.add(plato);
        menu.setListaPratillos(listaPratillos);
        assertEquals("Cambio de lista de platos es erronea",1, menu.getListaPratillos().size(),0);
    }

    /**
     * Test of getListaBebidas method, of class Menu.
     */
    @Test
    public void testGetListaBebidas() {
        ArrayList<Bebida> expResult = new ArrayList();
        ArrayList<Bebida> result = menu.getListaBebidas();
        assertEquals("Lista de bebidas erronea",expResult, result);
    }

    /**
     * Test of setListaBebidas method, of class Menu.
     */
    @Test
    public void testSetListaBebidas() {
        ArrayList<Bebida> listaBebidas = new ArrayList();
        Bebida bebida = new Bebida();
        listaBebidas.add(bebida);
        menu.setListaBebidas(listaBebidas);
        assertEquals("Cambio de lista de bebidas erronea",1, menu.getListaBebidas().size(),0);
    }
    
}
