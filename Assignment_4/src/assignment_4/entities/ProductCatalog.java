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
public class ProductCatalog {
    private Map<Integer, Product> prodir;
    
    public ProductCatalog(){
        prodir=new HashMap<>();
    }
    
    public Map<Integer, Product> getProductDir(){
        return prodir;
    }
    
    public void addProduct(Product x){
        if (prodir.containsKey(x.getProductId())) return;
        prodir.put(x.getProductId(), x);
    }
}
