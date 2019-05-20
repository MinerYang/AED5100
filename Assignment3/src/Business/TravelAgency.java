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
public class TravelAgency {
    private AirlinersDirectory airldir;
    private CustomerDirectory cusdir;
    private MasterTravelSchedule matrasche;

    public TravelAgency() {
        cusdir= new CustomerDirectory();
        airldir= new AirlinersDirectory();
        matrasche=new MasterTravelSchedule();
    }
    
    //

    public AirlinersDirectory getAirldir() {
        return airldir;
    }

    public void setAirldir(AirlinersDirectory airldir) {
        this.airldir = airldir;
    }

    public CustomerDirectory getCusdir() {
        return cusdir;
    }

    public void setCusdir(CustomerDirectory cusdir) {
        this.cusdir = cusdir;
    }

    public MasterTravelSchedule getMatrasche() {
        return matrasche;
    }

    public void setMatrasche(MasterTravelSchedule matrasche) {
        this.matrasche = matrasche;
    }
    
    
    
    
}
