/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personalrecord;
import Personalrecord.Address;

/**
 *
 * @author cestdrama
 */

public class Person {
    private String lastName;
    private String firstName;
    private String Streetadd;
    Address workaddress;
    Address homeaddress;
    Address localaddress;
    private String DOB;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getStreetadd() {
        return Streetadd;
    }

    public void setStreetadd(String Streetadd) {
        this.Streetadd = Streetadd;
    }
    

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

    public Address getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(Address homeaddress) {
        this.homeaddress = homeaddress;
    }

    public Address getLocaladdress() {
        return localaddress;
    }

    public void setLocaladdress(Address localaddress) {
        this.localaddress = localaddress;
    }
    
    
    
    
}
