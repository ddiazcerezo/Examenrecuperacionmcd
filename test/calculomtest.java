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
public class calculomtest {
    
    public calculomtest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 0;
        int num2 = 0;
        String expResult = "ERROR exception";
        Calculo instance = new Calculo(); 
        instance.setNumero1(num1);
        instance.setNumero2(num2);
        instance.obtenerMCD(num1, num2);
        String result = instance.getMensajeResultado();
        assertEquals(expResult, result);
    }
    // public void hello() {}
}
