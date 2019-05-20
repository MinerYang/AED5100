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
public class SalesPersonDirectory {
    private Map<Integer, SalesPerson> spdir;
    
    public SalesPersonDirectory(){
        spdir=new HashMap<>();
    }
    
    public Map<Integer, SalesPerson> getSalesPersonDir(){
        return spdir;
    }
    
    public void addSalesPerson(SalesPerson x){
        if (spdir.containsKey(x.getsalesPersonId())) return;
        spdir.put(x.getsalesPersonId(), x);
    }
}
