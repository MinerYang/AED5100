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
public class MasterTravelSchedule {
    private ArrayList<Flight> mastertravelList;

    public MasterTravelSchedule() {
        mastertravelList=new ArrayList<>();
    }
    //

    public ArrayList<Flight> getMastertravelList() {
        return mastertravelList;
    }

    public void setMastertravelList(ArrayList<Flight> mastertravelList) {
        this.mastertravelList = mastertravelList;
    }
    
    
    
    
}
