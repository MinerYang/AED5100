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
public class MasterOrder {
    private static MasterOrder masterOrder;
    
    private CustomerDirectory cusdir;
    private OrderDirectory orderdir;
    private ProductCatalog prodir;
    private SalesPersonDirectory spdir;
    
    private MasterOrder(){
        cusdir = new CustomerDirectory();
        orderdir = new OrderDirectory();
        prodir = new ProductCatalog();
        spdir = new SalesPersonDirectory();
    }
    
    public static MasterOrder getInstance(){
        if(masterOrder == null) masterOrder = new MasterOrder();
        return masterOrder;
    }
    
    public static MasterOrder getMasterOrder() {
        return masterOrder;
    }

    public static void setMasterOrder(MasterOrder masterOrder) {
        MasterOrder.masterOrder = masterOrder;
    }

    public CustomerDirectory getCustomers() {
        return cusdir;
    }

    public void setCustomers(CustomerDirectory cusdir) {
        this.cusdir = cusdir;
    }

    public OrderDirectory getOrders() {
        return orderdir;
    }

    public void setOrderDirectory(OrderDirectory orderdir) {
        this.orderdir = orderdir;
    }
    
    public ProductCatalog getProduct() {
        return prodir;
    }

    public void setProduct(ProductCatalog prodir) {
        this.prodir = prodir;
    }
    
    public SalesPersonDirectory getSalesPerson() {
        return spdir;
    }

    public void setSalesPerson(SalesPersonDirectory spdir) {
        this.spdir = spdir;
    }
    
}
