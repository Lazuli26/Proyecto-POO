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
public class ClienteTest {
    private Cliente cliente;
    
    public ClienteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        Mesero meseroAtiende = new Mesero();
        Mesa mesaCliente = new Mesa();
        Menu menu = new Menu();
        Plato plato = new Plato();
        Bebida bebida = new Bebida();
        ArrayList<Plato> platos = new ArrayList();
        platos.add(plato);
        ArrayList<Bebida> bebidas = new ArrayList();
        bebidas.add(bebida);
        ArrayList<Cliente> clientesAtendidos = new ArrayList();
        Orden orden = new Orden(1, 1, meseroAtiende, mesaCliente, menu);
        cliente = new Cliente(1, orden, 5, "Keslerth Calderón Artavia", 207610010, 86360027);
    }
    
    @After
    public void tearDown() {
        cliente = null;
    }

    /**
     * Test of pedir method, of class Cliente.
     */
    @Test
    public void testPedir_Plato() {
        Plato plato = new Plato();
        cliente.pedir(plato);
        assertEquals("El pedido de plato es erroneo", 2, cliente.getOrden().getPlatos().size(),0);
    }

    /**
     * Test of pedir method, of class Cliente.
     */
    @Test
    public void testPedir_Bebida() {
        Bebida bebida = new Bebida();
        cliente.pedir(bebida);
        assertEquals("El pedido de bebida es erroneo", 2, cliente.getOrden().getBebidas().size(),0);
    }

    /**
     * Test of getNumCliente method, of class Cliente.
     */
    @Test
    public void testGetNumCliente() {
        int expResult = 1;
        int result = cliente.getNumCliente();
        assertEquals("El numero Cliente es erroneo",expResult, result,0);
    }

    /**
     * Test of setNumCliente method, of class Cliente.
     */
    @Test
    public void testSetNumCliente() {
        int numCliente = 2;
        cliente.setNumCliente(numCliente);
        assertEquals("El numero Cliente es erroneo",numCliente, cliente.getNumCliente(),0);
    }

    /**
     * Test of getOrden method, of class Cliente.
     */
    @Test
    public void testGetOrden() {
        Orden expResult = new Orden(1, 1, null,  null, null);
        Orden result = cliente.getOrden();
        assertEquals("La orden es erronea",expResult.getNumero(), result.getNumero(),0);
    }

    /**
     * Test of setOrden method, of class Cliente.
     */
    @Test
    public void testSetOrden() {
        Orden orden = new Orden(1, 1, null,  null, null);
        cliente.setOrden(orden);
        assertEquals("El cambio de orden es erroneo",orden, cliente.getOrden());
    }

    /**
     * Test of getVecesVisitadas method, of class Cliente.
     */
    @Test
    public void testGetVecesVisitadas() {
        int expResult = 5;
        int result = cliente.getVecesVisitadas();
        assertEquals("Las visitas son erroneas",expResult, result,0);
    }

    /**
     * Test of setVecesVisitadas method, of class Cliente.
     */
    @Test
    public void testSetVecesVisitadas() {
        int vecesVisitadas = 3;
        cliente.setVecesVisitadas(vecesVisitadas);
        assertEquals("El cambio de visitas es erroneo",vecesVisitadas, cliente.getVecesVisitadas(),0);
    }
    
}
