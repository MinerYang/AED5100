/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class SalesPerson {
    int salesPersonId;
    List<Order> orderList = new ArrayList<>();
    
    public SalesPerson(int x){
        salesPersonId = x;
    }
    
    public void setsalesPersonId(int x){
        salesPersonId = x;
    }
    
    public int getsalesPersonId(){
        return salesPersonId;
    }
    
    public void addOrder(Order x){
        orderList.add(x);
    }
    
    public List<Order> getOrderList(){
        return orderList;
    }
    @Override 
    public String toString(){
        return "{" + "salesPersonId = " + salesPersonId +  ", of Order = " + orderList.size() + "}"; 
    }
}
