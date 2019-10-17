/*
 * Estructuras de datos
 * Autor: Jose Luis Gutierrez Espinosa
 */
package proyectosudoku;

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
public class ControladorSudokuTest {
    
    public ControladorSudokuTest() {
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
     * Test of traduceMatriz method, of class ControladorSudoku.
     */
    @Test
    public void testTraduceMatriz() {
        System.out.println("traduceMatriz");
        ControladorSudoku instance = null;
        instance.traduceMatriz();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeMatriz method, of class ControladorSudoku.
     */
    @Test
    public void testImprimeMatriz() {
        System.out.println("imprimeMatriz");
        ControladorSudoku instance = null;
        String expResult = "";
        String result = instance.imprimeMatriz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ControladorSudoku.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ControladorSudoku.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
