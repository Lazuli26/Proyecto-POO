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
public class OrdenTest {
    
    public OrdenTest() {
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
     * Test of pedido method, of class Orden.
     */
    @Test
    public void testPedido_Plato() {
        System.out.println("pedido");
        Plato plato = null;
        Orden instance = new Orden();
        instance.pedido(plato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of grupoClientes method, of class Orden.
     */
    @Test
    public void testGrupoClientes() {
        System.out.println("grupoClientes");
        Cliente cliente = null;
        Orden instance = new Orden();
        instance.grupoClientes(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cocinarPlato method, of class Orden.
     */
    @Test
    public void testCocinarPlato() {
        System.out.println("cocinarPlato");
        Cocinero cocinero = null;
        Plato plato = null; 
        Orden instance = new Orden();
        instance.cocinarPlato(cocinero,plato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedido method, of class Orden.
     */
    @Test
    public void testPedido_Bebida() {
        System.out.println("pedido");
        Bebida bebida = null;
        Orden instance = new Orden();
        instance.pedido(bebida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Orden.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Orden instance = new Orden();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Orden.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Orden instance = new Orden();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumMesa method, of class Orden.
     */
    @Test
    public void testGetNumMesa() {
        System.out.println("getNumMesa");
        Orden instance = new Orden();
        int expResult = 0;
        int result = instance.getNumMesa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumMesa method, of class Orden.
     */
    @Test
    public void testSetNumMesa() {
        System.out.println("setNumMesa");
        int numMesa = 0;
        Orden instance = new Orden();
        instance.setNumMesa(numMesa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlatos method, of class Orden.
     */
    @Test
    public void testGetPlatos() {
        System.out.println("getPlatos");
        Orden instance = new Orden();
        ArrayList<Plato> expResult = null;
        ArrayList<Plato> result = instance.getPlatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlatos method, of class Orden.
     */
    @Test
    public void testSetPlatos() {
        System.out.println("setPlatos");
        ArrayList<Plato> platos = null;
        Orden instance = new Orden();
        instance.setPlatos(platos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBebidas method, of class Orden.
     */
    @Test
    public void testGetBebidas() {
        System.out.println("getBebidas");
        Orden instance = new Orden();
        ArrayList<Bebida> expResult = null;
        ArrayList<Bebida> result = instance.getBebidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBebidas method, of class Orden.
     */
    @Test
    public void testSetBebidas() {
        System.out.println("setBebidas");
        ArrayList<Bebida> bebidas = null;
        Orden instance = new Orden();
        instance.setBebidas(bebidas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeseroAtiende method, of class Orden.
     */
    @Test
    public void testGetMeseroAtiende() {
        System.out.println("getMeseroAtiende");
        Orden instance = new Orden();
        Mesero expResult = null;
        Mesero result = instance.getMeseroAtiende();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeseroAtiende method, of class Orden.
     */
    @Test
    public void testSetMeseroAtiende() {
        System.out.println("setMeseroAtiende");
        Mesero meseroAtiende = null;
        Orden instance = new Orden();
        instance.setMeseroAtiende(meseroAtiende);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMesaCliente method, of class Orden.
     */
    @Test
    public void testGetMesaCliente() {
        System.out.println("getMesaCliente");
        Orden instance = new Orden();
        Mesa expResult = null;
        Mesa result = instance.getMesaCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMesaCliente method, of class Orden.
     */
    @Test
    public void testSetMesaCliente() {
        System.out.println("setMesaCliente");
        Mesa mesaCliente = null;
        Orden instance = new Orden();
        instance.setMesaCliente(mesaCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientesAtendidos method, of class Orden.
     */
    @Test
    public void testGetClientesAtendidos() {
        System.out.println("getClientesAtendidos");
        Orden instance = new Orden();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getClientesAtendidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClientesAtendidos method, of class Orden.
     */
    @Test
    public void testSetClientesAtendidos() {
        System.out.println("setClientesAtendidos");
        ArrayList<Cliente> clientesAtendidos = null;
        Orden instance = new Orden();
        instance.setClientesAtendidos(clientesAtendidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenu method, of class Orden.
     */
    @Test
    public void testGetMenu() {
        System.out.println("getMenu");
        Orden instance = new Orden();
        Menu expResult = null;
        Menu result = instance.getMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMenu method, of class Orden.
     */
    @Test
    public void testSetMenu() {
        System.out.println("setMenu");
        Menu menu = null;
        Orden instance = new Orden();
        instance.setMenu(menu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
