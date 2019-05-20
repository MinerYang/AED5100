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
public class AirlinersDirectory {
    private ArrayList<Airliners> airlinersList;
    private Airliners airliners;

    public AirlinersDirectory() {
         airlinersList = new  ArrayList<>();
         airliners = new Airliners();
    }
    
    //

    public Airliners getAirliners() {
        //System.out.println("get in");
        return airliners;
    }

    public void setAirliners(Airliners airliners) {
        this.airliners = airliners;
    }
    

    public ArrayList<Airliners> getAirlinersList() {
        return airlinersList;
    }

    public void setAirlinersList(ArrayList<Airliners> airlinersList) {
        this.airlinersList = airlinersList;
    }
    
    //
    public Airliners addairl(){
       Airliners airl = new Airliners();
       airlinersList.add(airl);
       return airl;
   }
   
   public void deleteairl(Airliners airl){
       airlinersList.remove(airl);
   }
    
   
}
