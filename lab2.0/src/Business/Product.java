/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author cestdrama
 */
public class Product {
    private String Name;
    private String price;
    private String avialNum;
    private String description;
    private Supplier suplier;
    
    public Product(){
        suplier = new Supplier();
    }

    public Supplier getSuplier() {
        return suplier;
    }

    public void setSuplier(Supplier suplier) {
        this.suplier = suplier;
    }
    
    public String getName() {
        return Name;
    }

    public String getPrice() {
        return price;
    }

    public String getAvialNum() {
        return avialNum;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAvialNum(String avialNum) {
        this.avialNum = avialNum;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
