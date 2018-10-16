/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.verwaltungs.system;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mimo
 */
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = new Customer("Mohamed");
        String expResult = "Mohamed";
        String result = instance.getName();
       assertEquals(expResult,result);
       
       
    }

   

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer("Mohamed");
        String expResult = "Customer{name=Mohamed}";
        String result = instance.toString();
        assertEquals(expResult, result);
      
    }
    
}
