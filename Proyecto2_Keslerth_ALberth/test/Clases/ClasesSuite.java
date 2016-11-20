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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author keslerth
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Clases.MenuTest.class, Clases.RestauranteTest.class, Clases.ClienteTest.class, Clases.MesaTest.class, Clases.FacturaTest.class, Clases.CocineroTest.class, Clases.PersonaTest.class, Clases.MeseroTest.class, Clases.BebidaTest.class, Clases.PlatoTest.class, Clases.OrdenTest.class})
public class ClasesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
