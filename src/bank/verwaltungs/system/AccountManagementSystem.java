/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.verwaltungs.system;

import java.util.ArrayList;

/**
 *
 * @author Mimo
 */
public class AccountManagementSystem {
    
    private ArrayList<Account>accounts=new ArrayList<>();
    private int accountID;
    private Customer customer;

    public AccountManagementSystem() {
    }

    public AccountManagementSystem(int accountID, Customer customer) {
        this.accountID = accountID;
        this.customer = customer;
    }

    

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Account createNewAccount(int accountNumber,float balance){
        Account account=new Account(accountNumber,balance);
       
        accounts.add(account);
        return account;
    }
    public void PayIn(Account account,float value){
        value+=account.getBalance();
        
        account.setBalance(value);
        accounts.add(account);
    }
    public void PayOut(Account account,float value){
        float AktuellAmount=0.0f;
        if(value>=account.getBalance()){
            account.setBalance(0.0f);
        }else {
        AktuellAmount=account.getBalance();
        AktuellAmount -=value;
        account.setBalance(AktuellAmount);
        accounts.add(account);
        }
    }
 public  void transfer(Account inputAccount, Account outputAccount, float value){
         PayIn(inputAccount,value);
          PayOut(outputAccount,value);  

 }
    @Override
    public String toString() {
        return "AccountManagementSystem{" + "accounts=" + accounts + ", accountID=" + accountID + ", customer=" + customer + '}';
    }
    
    
}
