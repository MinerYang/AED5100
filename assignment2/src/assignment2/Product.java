/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.*;

/**
 *
 * @author cestdrama
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    //
    private String name;
    private double price;
    private int availnum;
    private String description;
    private Supplier suplier;
    
    //

    public Product() {
        suplier=new Supplier();
    }
    
     public Supplier getSuplier(){
        return suplier;
    }

    public void setSuplier(Supplier suplier) {
        this.suplier = suplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailnum() {
        return availnum;
    }

    public void setAvailnum(int availnum) {
        this.availnum = availnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    
   //
    public static void main(String[] args) {
        // TODO code application logic here
        Product product=new Product();
        while(true)
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("**********************************************\n"
                + "Please select one operation you want to do:\n"
                + "1 create your record \n"
                + "2 view your record\n"
                + "3 update your record\n"
                + "4 quit~~\n"
                + "**********************************************");
          int i=sc.nextInt();
          switch(i){
            case 1: product.createrecord(); break;
            case 2: product.viewrecord(); break;
            case 3: product.updaterecord(); break;
            default: break;
          }
          if (i == 4) {
              break;
          }
       }
             
    }
    
    
    
    //
    public void createrecord(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input your record below:");
        System.out.print("name:"); setName(sc.nextLine());
        System.out.print("price:");setPrice(sc.nextDouble());
        System.out.print("availbility number:"); setAvailnum(sc.nextInt());
        sc.nextLine();
        System.out.print("description:"); setDescription(sc.nextLine());
        suplier = new Supplier();
        System.out.print("supplier number:"); suplier.setSupplierName(sc.nextLine());        
        System.out.print("supplier address:"); suplier.setAddress(sc.nextLine());                  
    }
    
    //
    public void viewrecord(){
        System.out.println("Here is your record:");
        System.out.println("name:"+getName());
        System.out.println("price:"+getPrice());
        System.out.println("availbility number:"+getAvailnum());
        System.out.println("description:"+getDescription());
        
        Supplier sup = getSuplier();
        System.out.println("supplier name:"+sup.getSupplierName());
        System.out.println("supplier address:"+sup.getAddress());
        
    }
    
    //
    public void updaterecord(){
       
        System.out.println("Please select the record you need to update:4\n"
                + "1.name "+"2.price "+"3.availbility number \n"
                +"4.decription "+"5.supplier name "+"6.supplier address \n"
                +"7.update all");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        sc.nextLine(); // 清空缓冲区
        switch(i){
            case 1: System.out.print("name:"); setName(sc.nextLine()); break;
            case 2: System.out.print("price:"); setPrice(sc.nextDouble()); break;
            case 3: System.out.print("availibility number:"); setAvailnum(sc.nextInt()); break;
            case 4: System.out.print("description:"); setDescription(sc.nextLine()); break;
            case 5: System.out.print("supplier name:"); Supplier sup = getSuplier();sup.setSupplierName(sc.nextLine()); break;
            case 6: System.out.print("supplier address:"); Supplier supp = getSuplier(); supp.setAddress(sc.nextLine()); break;
            case 7: createrecord(); break;
        }
        
    }
    
}


