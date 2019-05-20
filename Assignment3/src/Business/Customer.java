/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author cestdrama
 */
public class Customer {
    private String fullname;
    private int cusID;
    private ArrayList<Flight> cusflightscheList;

    public Customer() {
        cusflightscheList=new ArrayList<>();
    }
    
    //

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public ArrayList<Flight> getCusflightscheList() {
        return cusflightscheList;
    }

    public void setCusflightscheList(ArrayList<Flight> cusflightscheList) {
        this.cusflightscheList = cusflightscheList;
    }
    
    //
    public Flight bookflight(){
       Flight flyt = new Flight();
       cusflightscheList.add(flyt);
       return flyt;
   }
   
   public void cancelflight(Flight flyt){
       cusflightscheList.remove(flyt);
   }
   
   @Override
   public String toString(){
       return fullname;
   }
    
}
