/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Record;
import java.util.*;

/**
 *
 * @author cestdrama
 */
public class VitalSignHistory {
    private ArrayList<VitalSign>  vitalSignList;
    
    public VitalSignHistory(){
        this.vitalSignList=new ArrayList<VitalSign>();
    }
    
    public VitalSign addVitalSign(){ //add values to arraylist
        VitalSign vs=new VitalSign();
        this.vitalSignList.add(vs);
        return vs;
    }
    
    public void deleVitalSign(VitalSign vs){
        this.vitalSignList.remove(vs);
    }
    

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    } 
    
    //
    public List<VitalSign> getAbnormalList(double maxbp,double minbp){
        List<VitalSign> abnList=new ArrayList<>();
        for(VitalSign vs:vitalSignList){
            if(vs.getBloodpr()>maxbp || vs.getBloodpr()<minbp){
                abnList.add(vs);
            }
        }
        return abnList;
    }
    
    
    
}
