/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author cestdrama
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList=new ArrayList<>();
    }
    //

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    //
     public Customer addcus(){
       Customer cus = new Customer();
       customerList.add(cus);
       return cus;
   }
   
   public void deletecus(Customer cus){
       customerList.remove(cus);
   }
   
   /*
   public Customer accSearch(String accountnumber){
       for(Customer account:accountList){
           if(account.getAccnum().equals(accountnumber)){
               return account;
           }
       }
       return null;  //no match return null
   }
   */
    
    
}
