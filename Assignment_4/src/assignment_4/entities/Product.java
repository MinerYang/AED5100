/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author harshalneelkamal
 */
public class Product {
    int productId;
    int minPrice;
    int maxPrice;
    int tarPrice;
    
    public Product(int x1, int x2, int x3, int x4){
        productId = x1;
        minPrice = x2;
        maxPrice = x3;
        tarPrice = x4;
    }
    
    public void setProductId(int x){
        productId = x;
    }
    
    public void setMinPrice(int x){
        minPrice = x;
    }
    
    public void setMaxPrice(int x){
        maxPrice = x;
    }
    
    public void setTarPrice(int x){
        tarPrice = x;
    }
    
    public int getProductId(){
        return productId; 
    }
    
    public int getMinPrice(){
        return minPrice;
    }
    
    public int getMaxPrice(){
        return maxPrice;
    }
    
    public int getTarPrice(){
        return tarPrice;
    }
    @Override
    public String toString(){
        return "{" + "productId: " + productId + ", minPrice: " + minPrice + ", maxPrice: " + minPrice + ", tarPrice: " + tarPrice + "}";
    }
}
