/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.verwaltungs.system;

import java.util.ArrayList;
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
public class AccountManagementSystemTest {
    
    public AccountManagementSystemTest() {
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
     * Test of getAccounts method, of class AccountManagementSystem.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("getAccounts :Accountnumber :5555 ,Balance :3584.8f");
        AccountManagementSystem instance = new AccountManagementSystem();
         ArrayList<Account> accounts =new ArrayList<>();
         Account account=new Account(5555,3581.8f);
        
        ArrayList<Account> expResult = new ArrayList<>();
     
      
        ArrayList<Account> result = instance.getAccounts();
        
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setAccounts method, of class AccountManagementSystem.
     */
    @Test
    public void testSetAccounts() {
        System.out.println("setAccounts");
        ArrayList<Account> accounts =new ArrayList<>();
        Account account=new Account(5555,3581.8f);
        accounts.add(account);
        AccountManagementSystem instance = new AccountManagementSystem();
        instance.setAccounts(accounts);
      
        
    }

    /**
     * Test of getAccountID method, of class AccountManagementSystem.
     */
    @Test
    public void testGetAccountID() {
        System.out.println("getAccountID :333");
        AccountManagementSystem instance = new AccountManagementSystem();
        int expResult = 333;
        instance.setAccountID(expResult);
        int result = instance.getAccountID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAccountID method, of class AccountManagementSystem.
     */
    @Test
    public void testSetAccountID() {
        System.out.println("setAccountID :333");
        int accountID =333;
        AccountManagementSystem instance = new AccountManagementSystem();
        instance.setAccountID(accountID);
        
    }

    /**
     * Test of getCustomer method, of class AccountManagementSystem.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer :Mohamed");
        AccountManagementSystem instance = new AccountManagementSystem();
        Customer expResult = new Customer();
        instance.setCustomer(expResult);
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCustomer method, of class AccountManagementSystem.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer (Object) :Mohamed");
        Customer customer=new Customer() ;
        
        AccountManagementSystem instance = new AccountManagementSystem();
        instance.setCustomer(customer);
      
    }

  

    /**
     * Test of PayIn method, of class AccountManagementSystem.
     */
    @Test
    public void testPayIn() {
        System.out.println("PayIn");
        Account account = new Account(5555,30.5f);
        float value = 50.0F;
        AccountManagementSystem instance = new AccountManagementSystem();
        instance.PayIn(account, value);
      
    }

    /**
     * Test of PayOut method, of class AccountManagementSystem.
     */
    @Test
    public void testPayOut() {
        System.out.println("PayOut");
        Account account = new Account(5555,1000.50f);
        float value = 10.0F;
        AccountManagementSystem instance = new AccountManagementSystem();
        instance.PayOut(account, value);
        
    }

    /**
     * Test of transfer method, of class AccountManagementSystem.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer : from Account 1 : 50 euro to Account 2");
        Account inputAccount =new Account(5555,1000.50f) ;
        Account outputAccount = new Account(5555,1050.50f);
        float value = 50.0F;
        AccountManagementSystem instance = new AccountManagementSystem();
        instance.transfer(inputAccount, outputAccount, value);
       
    }

    /**
     * Test of toString method, of class AccountManagementSystem.
     */
    @Test
    public void testToString() {
        System.out.println("toString : retrive All Accounts");
        AccountManagementSystem instance = new AccountManagementSystem();
        Customer customer=new Customer("Mohamed");
        ArrayList<Account>accounts=new ArrayList<>();
        instance.createNewAccount(5555, 3000.5f);
        
        instance.setAccountID(333);
        instance.setCustomer(customer);
        String expResult = "AccountManagementSystem{" + "accounts=" + "[Account{accountnumber="+5555+", balance="+3000.5+ "}]" + ", accountID=" + 333 + ", customer=" +"Customer{name="+"Mohamed"+"}" + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
