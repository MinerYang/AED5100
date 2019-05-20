/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

import java.util.*;
/**
 *
 * @author harshalneelkamal
 */
public class Customer {
    int CustomerId;
    List<Order> orderList = new ArrayList<>();
    
    public Customer (int x){
        CustomerId = x;
    }
    
    public void setCustomerId(int x){
        CustomerId = x;
    }
    
    public int getCustomerId(){
        return CustomerId;
    }
    
    public void addOrder(Order x){
        orderList.add(x);
    }
    
    public List<Order> getOrderList(){
        return orderList;
    }
    @Override
    public String toString(){
        return "{" + "customerId = " + CustomerId + ", of Order = " + orderList.size() + "}"; 
    }
    
}
