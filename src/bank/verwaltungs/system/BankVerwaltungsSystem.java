/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.verwaltungs.system;

/**
 *
 * @author Mimo
 */
public class BankVerwaltungsSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer mohamed=new Customer("Mohamed");
        Customer rainer=new Customer("Rainer");
        Account account1=new Account(274555,2000);
      
          Account account2=new Account(5555,3000);
        
        AccountManagementSystem accountmanagementsystem=new AccountManagementSystem(123,mohamed);
         AccountManagementSystem accountmanagementsystem1=new AccountManagementSystem(23,rainer);
        accountmanagementsystem.createNewAccount(274555,2000);
        accountmanagementsystem.PayIn(account2, 20);
          accountmanagementsystem1.createNewAccount(5555,3000);
        accountmanagementsystem1.PayIn(account2, 50);
        System.out.println(accountmanagementsystem.toString());
        System.out.println(accountmanagementsystem1.toString());
         accountmanagementsystem1.PayOut(account1,40);
          System.out.println(accountmanagementsystem1.toString());
          accountmanagementsystem.transfer(account1, account2,100);
         System.out.println(accountmanagementsystem1.toString());
           
          
        
    }
    
}
