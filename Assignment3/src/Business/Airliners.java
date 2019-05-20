/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author cestdrama
 */
public class Airliners {
    private String airlinersname;
    private String address;
    private int totalflyperd;
    private ArrayList<Flight> fleetlist;
    //private ArrayList<Flight> searchlist;

    public Airliners() {
        fleetlist =new ArrayList<>();
        //searchlist=new ArrayList<>();
    }
    
    //

//    public ArrayList<Flight> getSearchlist() {
//        return searchlist;
//    }
//
//    public void setSearchlist(ArrayList<Flight> searchlist) {
//        this.searchlist = searchlist;
//    }
    //

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getAirlinersname() {
        return airlinersname;
    }

    public void setAirlinersname(String airlinersname) {
        this.airlinersname = airlinersname;
    }

    public ArrayList<Flight> getFleetlist() {
        return fleetlist;
    }

    public void setFleetlist(ArrayList<Flight> fleetlist) {
        this.fleetlist = fleetlist;
    }

    public int getTotalflyperd() {
        return totalflyperd;
    }

    public void setTotalflyperd(int totalflyperd) {
        this.totalflyperd = totalflyperd;
    }
    
    
    //
    public Flight addflight(){
       Flight flyt = new Flight();
       fleetlist.add(flyt);
       return flyt;
   }
   
   public void deleteflight(Flight flyt){
       fleetlist.remove(flyt);
   }
   
   @Override
   public String toString() 
    {
      return this.airlinersname;
    }
   
   
   public ArrayList<Flight> Searchflight(int fnum,String depar,String arriv,Date date,int timesec){//String depar,String arriv,Date date,String timesec
       ArrayList<Flight> result= new ArrayList<>();
       for(Flight flyt:fleetlist){
           if(   (fnum==flyt.getFlightnum() || fnum==-1) 
               &&(depar.equals(flyt.getFromlocaltion()) || depar.equals(""))
               &&(arriv.equals(flyt.getTolocation()) || arriv.equals(""))
               &&(date==null || date.equals(flyt.getDate()))
               &&(timesec==flyt.getTimesection() || timesec==-1))
           {
               result.add(flyt);
           }
       }
       return result;
       //return null;  //no match return null
   }
    
}
