/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author cestdrama
 */
public class Account {
     private String rounum;
    private String accnum;
    private String bankname;
    private int balance;
    private Date CreateOn;
    
    //
    public Account(){  //return the whole object,thus no return in a constructor
        this.CreateOn=new Date();  //every time it is called, a date is been setted.so no need to use a setDate function 
    }
    
    //
    public String getRounum() {
        return rounum;
    }

    public void setRounum(String rounum) {
        this.rounum = rounum;
    }

    public String getAccnum() {
        return accnum;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreateOn() {
        return CreateOn;
    }
    
    @Override
    public String toString() 
    {
      return this.bankname;
    }
}
