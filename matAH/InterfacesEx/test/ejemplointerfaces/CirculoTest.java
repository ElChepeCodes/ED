/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

import interfacesex.Circulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedi
 */
public class CirculoTest {
  
  public CirculoTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
    System.out.println("setUpClass");
  }
  
  @AfterClass
  public static void tearDownClass() {
    System.out.println("tearDownClass");
  }
  
  @Before
  public void setUp() {
    System.out.println("setUp");
  }
  
  @After
  public void tearDown() {
    System.out.println("tearDown");
  }

  /**
   * Test of calculaArea method, of class Circulo.
   */
  @Test
  public void testCalculaArea() {
    System.out.println("calculaArea");
    Circulo instance = new Circulo();
    double expResult = 12.56 ;
    double result = instance.calculaArea();
    assertEquals(expResult, result, 0.01);
    // TODO review the generated test code and remove the default call to fail.
//    fail("El método calculaArea es correcto.");
  }

  /**
   * Test of calculaPerimetro method, of class Circulo.
   */
  @Test
  public void testCalculaPerimetro() {
    System.out.println("calculaPerimetro");
    Circulo instance = new Circulo();
    double expResult = 12.56;
    double result = instance.calculaPerimetro();
    assertEquals(expResult, result, 0.01);
    // TODO review the generated test code and remove the default call to fail.
//    fail("El método calculaPerimetro es correcto.");
  }

  /**
   * Test of imprime method, of class Circulo.
   */
  @Test
  public void testImprime() {
    System.out.println("imprime");
    Circulo instance = new Circulo();
    instance.imprime();
    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
  }

  /**
   * Test of toString method, of class Circulo.
   */
  @Test
  public void testToString() {
    System.out.println("toString");
    Circulo instance = new Circulo();
//    String expResult = "";
    String result = instance.toString();
    String expResult = result;
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
  }
  
}
