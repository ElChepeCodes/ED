/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa
    Andrés Navarrete
    Andrés Quevedo
    Bruno Vitte San Juan
    
 */
package proyectocalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jlgut
 */
public class ExpresionTest {
    
    public ExpresionTest() {
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
     * Test of traducePostfix method, of class Expresion.
     */
    @Test
    public void testTraducePostfix() {
        System.out.println("traducePostfix");
        String operacion = "";
        String expResult = "";
        String result = Expresion.traducePostfix(operacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinaNumero method, of class Expresion.
     */
    @Test
    public void testDeterminaNumero() {
        System.out.println("determinaNumero");
        char c = ' ';
        boolean expResult = false;
        boolean result = Expresion.determinaNumero(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinaOperador method, of class Expresion.
     */
    @Test
    public void testDeterminaOperador() {
        System.out.println("determinaOperador");
        char c = ' ';
        int expResult = 0;
        int result = Expresion.determinaOperador(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinaCaracterValido method, of class Expresion.
     */
    @Test
    public void testDeterminaCaracterValido() {
        System.out.println("determinaCaracterValido");
        char c = ' ';
        boolean expResult = false;
        boolean result = Expresion.determinaCaracterValido(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinaParentesis method, of class Expresion.
     */
    @Test
    public void testDeterminaParentesis() {
        System.out.println("determinaParentesis");
        char c = ' ';
        boolean expResult = false;
        boolean result = Expresion.determinaParentesis(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaParentesis method, of class Expresion.
     */
    @Test
    public void testVerificaParentesis() {
        System.out.println("verificaParentesis");
        String expre = "";
        boolean expResult = false;
        boolean result = Expresion.verificaParentesis(expre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaExpresion method, of class Expresion.
     */
    @Test
    public void testVerificaExpresion() {
        System.out.println("verificaExpresion");
        String expre = "";
        boolean expResult = false;
        boolean result = Expresion.verificaExpresion(expre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resuelvePostfix method, of class Expresion.
     */
    @Test
    public void testResuelvePostfix() {
        System.out.println("resuelvePostfix");
        String expre = "";
        double expResult = 0.0;
        double result = Expresion.resuelvePostfix(expre);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Expresion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Expresion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
