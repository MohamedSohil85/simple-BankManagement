/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.verwaltungs.system;

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
public class AccountTest {
    
    public AccountTest() {
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
     * Test of getAccountnumber method, of class Account.
     */
    @Test
    public void testGetAccountnumber() {
        System.out.println("getAccountnumber :5555");
        Account instance = new Account();
        
        int expResult = 5555;
        instance.setAccountnumber(expResult);
        int result = instance.getAccountnumber();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setAccountnumber method, of class Account.
     */
    @Test
    public void testSetAccountnumber() {
        System.out.println("setAccountnumber :5555");
        int accountnumber =5555;
        Account instance=new Account() ;
        instance.setAccountnumber(accountnumber);
     
    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance :3555.8f");
        Account instance = new Account();
        float expResult = 3555.88f;
        instance.setBalance(expResult);
        float result = instance.getBalance();
        assertEquals(expResult, result, 0.0f);
      
    }

    /**
     * Test of setBalance method, of class Account.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance :3555.8f");
        float balance = 3555.08F;
        Account instance = new Account();
        instance.setBalance(balance);
      
       
    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Account instance = new Account();
        instance.setAccountnumber(5555);
        instance.setBalance(358.5f);
        String expResult;
        expResult = "Account{" + "accountnumber=" + 5555 + ", balance=" + 358.5 + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
      
    }
    
}
