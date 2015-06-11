/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mcdrecuperacion.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class calculatest {
    
    public calculatest() {
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

   
      @Test
     
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 5;
        int num2 = 3;
        Calculo instance = new Calculo();
        int expResult = 1;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
    }
    // public void hello() {}
}
