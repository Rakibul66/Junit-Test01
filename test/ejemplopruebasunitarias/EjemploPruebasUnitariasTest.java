/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopruebasunitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rakibul Hasan
 */
public class EjemploPruebasUnitariasTest {
    
    public EjemploPruebasUnitariasTest() {
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
     * Test of main method, of class EjemploPruebasUnitarias.
     */
    
 
    @Test
    public void testSum() {
     
        EjemploPruebasUnitarias instance = new EjemploPruebasUnitarias();
       
        assertEquals(5,instance.sum(2, 3));
        
    }

    /**
     * Test of mult method, of class EjemploPruebasUnitarias.
     */
    @Test
    public void testMult() {
       
        EjemploPruebasUnitarias instance = new EjemploPruebasUnitarias();
       
        
        assertEquals(6,instance.mult(2,3));
      
    
    
}
}
