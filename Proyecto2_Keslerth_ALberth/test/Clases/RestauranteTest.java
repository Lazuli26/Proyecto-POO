/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.ImageIcon;
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
public class RestauranteTest {
    
    public RestauranteTest() {
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
     * Test of contratarMesero method, of class Restaurante.
     */
    @Test
    public void testContratarMesero() {
        System.out.println("contratarMesero");
        Mesero mesero = null;
        Restaurante instance = new Restaurante();
        instance.contratarMesero(mesero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contratarCocinero method, of class Restaurante.
     */
    @Test
    public void testContratarCocinero() {
        System.out.println("contratarCocinero");
        Cocinero cocinero = null;
        Restaurante instance = new Restaurante();
        instance.contratarCocinero(cocinero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoCliente method, of class Restaurante.
     */
    @Test
    public void testNuevoCliente() {
        System.out.println("nuevoCliente");
        Cliente nuevoCliente = null;
        Restaurante instance = new Restaurante();
        instance.nuevoCliente(nuevoCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of facturar method, of class Restaurante.
     */
    @Test
    public void testFacturar() {
        System.out.println("facturar");
        int fecha = 0;
        int hora = 0;
        String formaPago = "";
        String detalle = "";
        ArrayList<Cliente> clientes = null;
        Orden ordenCliente = null;
        Restaurante instance = new Restaurante();
        Factura expResult = null;
        Factura result = instance.facturar(fecha, hora, formaPago, detalle, clientes, ordenCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarOrdenes method, of class Restaurante.
     */
    @Test
    public void testAgregarOrdenes() {
        System.out.println("agregarOrdenes");
        Orden orden = null;
        Restaurante instance = new Restaurante();
        instance.agregarOrdenes(orden);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarMesas method, of class Restaurante.
     */
    @Test
    public void testAgregarMesas() {
        System.out.println("agregarMesas");
        Mesa mesa = null;
        Restaurante instance = new Restaurante();
        instance.agregarMesas(mesa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Pagar method, of class Restaurante.
     */
    @Test
    public void testPagar() {
        System.out.println("Pagar");
        ArrayList<Cliente> clientes = null;
        ArrayList<Plato> platos = null;
        ArrayList<Bebida> bebidas = null;
        int numOrden = 0;
        Restaurante instance = new Restaurante();
        int expResult = 0;
        int result = instance.Pagar(clientes, platos, bebidas, numOrden);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cuentaCancelada method, of class Restaurante.
     */
    @Test
    public void testCuentaCancelada() {
        System.out.println("cuentaCancelada");
        Restaurante instance = new Restaurante();
        instance.cuentaCancelada();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mejorEmpleado method, of class Restaurante.
     */
    @Test
    public void testMejorEmpleado() {
        System.out.println("mejorEmpleado");
        Restaurante instance = new Restaurante();
        instance.mejorEmpleado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mejoresPlatos method, of class Restaurante.
     */
    @Test
    public void testMejoresPlatos() {
        System.out.println("mejoresPlatos");
        Restaurante instance = new Restaurante();
        instance.mejoresPlatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of horaPico method, of class Restaurante.
     */
    @Test
    public void testHoraPico() {
        System.out.println("horaPico");
        Restaurante instance = new Restaurante();
        instance.horaPico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clienteFrecuente method, of class Restaurante.
     */
    @Test
    public void testClienteFrecuente() {
        System.out.println("clienteFrecuente");
        Restaurante instance = new Restaurante();
        instance.clienteFrecuente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reportePlato method, of class Restaurante.
     */
    @Test
    public void testReportePlato() {
        System.out.println("reportePlato");
        int mesAno = 0;
        Restaurante instance = new Restaurante();
        ArrayList expResult = null;
        ArrayList result = instance.reportePlato(mesAno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporteBebida method, of class Restaurante.
     */
    @Test
    public void testReporteBebida() {
        System.out.println("reporteBebida");
        int fecha = 0;
        Restaurante instance = new Restaurante();
        ArrayList expResult = null;
        ArrayList result = instance.reporteBebida(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporteVendido method, of class Restaurante.
     */
    @Test
    public void testReporteVendido() {
        System.out.println("reporteVendido");
        int ano = 0;
        Restaurante instance = new Restaurante();
        ArrayList expResult = null;
        ArrayList result = instance.reporteVendido(ano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporteClientes method, of class Restaurante.
     */
    @Test
    public void testReporteClientes() {
        System.out.println("reporteClientes");
        int ano = 0;
        Restaurante instance = new Restaurante();
        ArrayList expResult = null;
        ArrayList result = instance.reporteClientes(ano);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Restaurante.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Restaurante.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Restaurante instance = new Restaurante();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogo method, of class Restaurante.
     */
    @Test
    public void testGetLogo() {
        System.out.println("getLogo");
        Restaurante instance = new Restaurante();
        ImageIcon expResult = null;
        ImageIcon result = instance.getLogo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogo method, of class Restaurante.
     */
    @Test
    public void testSetLogo() {
        System.out.println("setLogo");
        ImageIcon logo = null;
        Restaurante instance = new Restaurante();
        instance.setLogo(logo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Restaurante.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Restaurante instance = new Restaurante();
        int expResult = 0;
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Restaurante.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 0;
        Restaurante instance = new Restaurante();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Restaurante.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Restaurante instance = new Restaurante();
        ArrayList expResult = null;
        ArrayList result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Restaurante.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        ArrayList direccion = null;
        Restaurante instance = new Restaurante();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Restaurante.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Restaurante.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Restaurante instance = new Restaurante();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientes method, of class Restaurante.
     */
    @Test
    public void testGetClientes() {
        System.out.println("getClientes");
        Restaurante instance = new Restaurante();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClientes method, of class Restaurante.
     */
    @Test
    public void testSetClientes() {
        System.out.println("setClientes");
        ArrayList<Cliente> clientes = null;
        Restaurante instance = new Restaurante();
        instance.setClientes(clientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeseros method, of class Restaurante.
     */
    @Test
    public void testGetMeseros() {
        System.out.println("getMeseros");
        Restaurante instance = new Restaurante();
        ArrayList<Mesero> expResult = null;
        ArrayList<Mesero> result = instance.getMeseros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeseros method, of class Restaurante.
     */
    @Test
    public void testSetMeseros() {
        System.out.println("setMeseros");
        ArrayList<Mesero> meseros = null;
        Restaurante instance = new Restaurante();
        instance.setMeseros(meseros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCocineros method, of class Restaurante.
     */
    @Test
    public void testGetCocineros() {
        System.out.println("getCocineros");
        Restaurante instance = new Restaurante();
        ArrayList<Cocinero> expResult = null;
        ArrayList<Cocinero> result = instance.getCocineros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCocineros method, of class Restaurante.
     */
    @Test
    public void testSetCocineros() {
        System.out.println("setCocineros");
        ArrayList<Cocinero> cocineros = null;
        Restaurante instance = new Restaurante();
        instance.setCocineros(cocineros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdenes method, of class Restaurante.
     */
    @Test
    public void testGetOrdenes() {
        System.out.println("getOrdenes");
        Restaurante instance = new Restaurante();
        ArrayList<Orden> expResult = null;
        ArrayList<Orden> result = instance.getOrdenes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrdenes method, of class Restaurante.
     */
    @Test
    public void testSetOrdenes() {
        System.out.println("setOrdenes");
        ArrayList<Orden> ordenes = null;
        Restaurante instance = new Restaurante();
        instance.setOrdenes(ordenes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMesas method, of class Restaurante.
     */
    @Test
    public void testGetMesas() {
        System.out.println("getMesas");
        Restaurante instance = new Restaurante();
        ArrayList<Mesa> expResult = null;
        ArrayList<Mesa> result = instance.getMesas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMesas method, of class Restaurante.
     */
    @Test
    public void testSetMesas() {
        System.out.println("setMesas");
        ArrayList<Mesa> mesas = null;
        Restaurante instance = new Restaurante();
        instance.setMesas(mesas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenus method, of class Restaurante.
     */
    @Test
    public void testGetMenus() {
        System.out.println("getMenus");
        Restaurante instance = new Restaurante();
        Menu expResult = null;
        Menu result = instance.getMenus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMenus method, of class Restaurante.
     */
    @Test
    public void testSetMenus() {
        System.out.println("setMenus");
        Menu menus = null;
        Restaurante instance = new Restaurante();
        instance.setMenus(menus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class Restaurante.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Restaurante expResult = null;
        Restaurante result = Restaurante.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
