/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.*;

/**
 *
 * @author cestdrama
 */
public class Flight {
    private int flightnum;
    private String airlinerName;
    public boolean[][] seats;
    private int remainseats;
    private Date date; 
    private int timesection; //1 morning;2 noon 3 evening
    private String fromlocaltion;
    private String tolocation;
    private double price;

    public Flight() {
        seats=new boolean[25][6];
        this.date=new Date();
    }
    
    //

    public int getFlightnum() {
        return flightnum;
    }

    public void setFlightnum(int flightnum) {
        this.flightnum = flightnum;
    }

    public boolean[][] getSeats() {
        return seats;
    }

    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }

    public int getRemainseats() {
        return remainseats;
    }

    public void setRemainseats(int remainseats) {
        this.remainseats = remainseats;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTimesection() {
        return timesection;
    }

    public void setTimesection(int timesection) {
        this.timesection = timesection;
    }

    public String getFromlocaltion() {
        return fromlocaltion;
    }

    public void setFromlocaltion(String fromlocaltion) {
        this.fromlocaltion = fromlocaltion;
    }

    public String getTolocation() {
        return tolocation;
    }

    public void setTolocation(String tolocation) {
        this.tolocation = tolocation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //
    @Override
    public String toString(){
        return String.valueOf(flightnum);
    }
    
    
    
    
}
