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
public class Customer {
    private String name;
    
    Customer(String name_){
        name=name_;
    }

    Customer() {
        
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + '}';
    }
    
    
}
