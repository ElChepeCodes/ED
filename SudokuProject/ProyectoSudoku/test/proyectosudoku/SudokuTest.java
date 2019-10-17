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
public class SudokuTest {
    
    public SudokuTest() {
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
     * Test of getStart method, of class Sudoku.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Sudoku instance = null;
        long expResult = 0L;
        long result = instance.getStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIndicadorTiempo method, of class Sudoku.
     */
    @Test
    public void testIsIndicadorTiempo() {
        System.out.println("isIndicadorTiempo");
        Sudoku instance = null;
        boolean expResult = false;
        boolean result = instance.isIndicadorTiempo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaSector method, of class Sudoku.
     */
    @Test
    public void testVerificaSector() {
        System.out.println("verificaSector");
        int s = 0;
        Sudoku instance = null;
        boolean expResult = false;
        boolean result = instance.verificaSector(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaRenglon method, of class Sudoku.
     */
    @Test
    public void testVerificaRenglon() {
        System.out.println("verificaRenglon");
        int r = 0;
        Sudoku instance = null;
        boolean expResult = false;
        boolean result = instance.verificaRenglon(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaColumna method, of class Sudoku.
     */
    @Test
    public void testVerificaColumna() {
        System.out.println("verificaColumna");
        int c = 0;
        Sudoku instance = null;
        boolean expResult = false;
        boolean result = instance.verificaColumna(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaTodo method, of class Sudoku.
     */
    @Test
    public void testVerificaTodo() {
        System.out.println("verificaTodo");
        Sudoku instance = null;
        boolean expResult = false;
        boolean result = instance.verificaTodo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaIndividual method, of class Sudoku.
     */
    @Test
    public void testVerificaIndividual() {
        System.out.println("verificaIndividual");
        int s = 0;
        int i = 0;
        int j = 0;
        Sudoku instance = null;
        boolean expResult = false;
        boolean result = instance.verificaIndividual(s, i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaResuelto method, of class Sudoku.
     */
    @Test
    public void testVerificaResuelto() {
        System.out.println("verificaResuelto");
        Sudoku instance = null;
        boolean expResult = false;
        boolean result = instance.verificaResuelto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reinsertaValores method, of class Sudoku.
     */
    @Test
    public void testReinsertaValores() {
        System.out.println("reinsertaValores");
        Sudoku instance = null;
        instance.reinsertaValores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeMatriz method, of class Sudoku.
     */
    @Test
    public void testImprimeMatriz() {
        System.out.println("imprimeMatriz");
        Sudoku instance = null;
        String expResult = "";
        String result = instance.imprimeMatriz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Sudoku.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Sudoku instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArr method, of class Sudoku.
     */
    @Test
    public void testGetArr() {
        System.out.println("getArr");
        Sudoku instance = null;
        int[][][] expResult = null;
        int[][][] result = instance.getArr();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encuentraPosConValor method, of class Sudoku.
     */
    @Test
    public void testEncuentraPosConValor() {
        System.out.println("encuentraPosConValor");
        Sudoku instance = null;
        instance.encuentraPosConValor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
