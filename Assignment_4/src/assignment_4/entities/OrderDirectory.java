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
public class OrderDirectory {
    private Map<Integer, Order> Orderdir;
    
    public OrderDirectory(){
        Orderdir=new HashMap<>();
    }
    
    public Map<Integer, Order> getOrderDir(){
        return Orderdir;
    }
    
    public void addOrder(Order x){
        if (Orderdir.containsKey(x.orderId)) return;
        Orderdir.put(x.getOrderId(), x);
    }
}
