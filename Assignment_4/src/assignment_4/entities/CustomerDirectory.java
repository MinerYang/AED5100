/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cestdrama
 */
public class CustomerDirectory {
    
    private Map<Integer, Customer> cusdir;
    
    public CustomerDirectory(){
        cusdir=new HashMap<>();
    }
    
    public Map<Integer, Customer> getCustomerDir(){
        return cusdir;
    }
    
    public void addCustomer(Customer x){
        if (cusdir.containsKey(x.getCustomerId())) return;
        cusdir.put(x.getCustomerId(), x);
    }
}
