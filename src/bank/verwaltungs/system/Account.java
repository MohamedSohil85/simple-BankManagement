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
public class Account {
    private int accountnumber;
    private float balance;
    //
public Account(){
    
}
    public Account(int accountnumber, float balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountnumber=" + accountnumber + ", balance=" + balance + '}';
    }
    
}
