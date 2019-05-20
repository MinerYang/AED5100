/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageCustomer;

import Business.Airliners;
import Business.AirlinersDirectory;
import Business.Customer;
import Business.Flight;
import Interface.ManageFlights.AddNewFlightPanel;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cestdrama
 */
public class BooktkPanel extends javax.swing.JPanel {

    /**
     * Creates new form BooktkPanel
     */
    public boolean [][] seats;
    private JPanel CardSecePanel;
    private AirlinersDirectory airlDir;
    public BooktkPanel(JPanel CardSecePanel, AirlinersDirectory airlDir) {
        initComponents();
        this.CardSecePanel=CardSecePanel;
        this.airlDir=airlDir;
        populateTable();
        //
       airlComboBox.removeAllItems();
       airlComboBox.addItem("all"); 
       for(Airliners airliners: airlDir.getAirlinersList()) {
           airlComboBox.addItem(airliners);
       }
    }

    
    //
    public void populateTable(){
        //System.out.println("Populate");
        DefaultTableModel dtm=(DefaultTableModel)bookTBL.getModel();
        dtm.setRowCount(0);
        for(Airliners airl:airlDir.getAirlinersList()){
            Object[] row=new Object[3];
            //row[0]=airl;
            for(Flight flyt:airl.getFleetlist())
            {
               row[0]=flyt;
                       //flyt.getFlightnum();
               row[1]=flyt.getPrice();
               Date date=flyt.getDate();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
               String datestr = sdf.format(date);
               row[2]=datestr;
               
               dtm.addRow(row);
            }
            //JOptionPane.showMessageDialog(null,row[0]);       
        }
    }
    
    
    
    /*
    public void populateTable(){
        //System.out.println("Populate");
        DefaultTableModel dtm=(DefaultTableModel)bookTBL.getModel();
        dtm.setRowCount(0);
        for(Airliners airl:airlDir.getAirlinersList()){
            Object[] row=new Object[4];
            row[0]=airl;
            for(Flight flyt:airl.getFleetlist())
            {
               row[1]=flyt.getFlightnum();
               row[2]=flyt.getPrice();
               Date date=flyt.getDate();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
               String datestr = sdf.format(date);
               row[3]=datestr;
               
               dtm.addRow(row);
            }
            //JOptionPane.showMessageDialog(null,row[0]);       
        }
    }
    */
    
    /*
    public void reTableByairls(Airliners airls){ //after search condition
        DefaultTableModel dtm=(DefaultTableModel)bookTBL.getModel();
        dtm.setRowCount(0);
        Object[] row=new Object[4];
        for(Flight flyt:airls.getFleetlist())
            {  
               row[0]=airls;
               row[1]=flyt.getFlightnum();
               row[2]=flyt.getPrice();
               Date date=flyt.getDate();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
               String datestr = sdf.format(date);
               row[3]=datestr;
               
               dtm.addRow(row);
            }
        
    }
    */
    
    
    
    
    //only seearch for single airliners
    public ArrayList<Flight> SearchPreferFlight2(Airliners airls,double maxprice,Date date, String depar,String arriv){
       ArrayList<Flight> result= new ArrayList<>();
       System.out.println("in_search2\n");
       if(airls!=null){
             System.out.printf("in airlines is:"+airls.getAirlinersname()+"\n");}
       for(Airliners airliner:airlDir.getAirlinersList()){
          if(airliner.equals(airls) ){
           //System.out.printf("result of if airls eaquals is:"+airliner.equals(airls)+"\n");
           for(Flight flyt:airliner.getFleetlist()){
               if( (flyt.getPrice()<=maxprice || maxprice==-1) 
               &&(depar.equals("")||depar.equals(flyt.getFromlocaltion()))
               &&(arriv.equals("")||arriv.equals(flyt.getTolocation()))
               &&(date==null || date.equals(flyt.getDate())) )            
               {
               result.add(flyt);
                }
            } 
          }
        }
       System.out.printf("resultlist size:%d",result.size());
       return result;
        
    }
    
    //Search for when ailners is "all"
    public ArrayList<Flight> SearchPreferFlight1(double maxprice,Date date, String depar,String arriv){
       ArrayList<Flight> result= new ArrayList<>();
       //System.out.println("in_search1\n");
       System.out.print(maxprice + " ");
       System.out.print(date + " ");
       System.out.print(depar + " ");
       System.out.print(arriv + "\n");
       for(Airliners airliner:airlDir.getAirlinersList()){
           //System.out.printf("result of if airls eaquals is:"+airliner.equals(airls)+"\n");
           for(Flight flyt:airliner.getFleetlist()){
               System.out.print(flyt.getPrice() + " ");
               System.out.print(flyt.getDate() + " ");
               System.out.print(flyt.getFromlocaltion() + " ");
               System.out.print(flyt.getTolocation() + "\n");
               if( (flyt.getPrice()<=maxprice || maxprice==-1) 
               &&(depar.equals("")||depar.equals(flyt.getFromlocaltion()))
               &&(arriv.equals("")||arriv.equals(flyt.getTolocation()))
               &&(date==null || date.equals(flyt.getDate())) )            
               {
               result.add(flyt);
                }
            } 
          
        }
       System.out.printf("resultlist size:%d",result.size());
       return result;
        
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTBL = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        airlComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        maxPriceTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DateTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deparTXT = new javax.swing.JTextField();
        arrivTXT = new javax.swing.JTextField();
        prefferdBTN = new javax.swing.JButton();
        bookBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        srowTXT = new javax.swing.JTextField();
        scolumnTXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        prefersectionComboBox = new javax.swing.JComboBox();
        backBTN = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 24)); // NOI18N
        jLabel1.setText("Book Ticket");

        bookTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Flightnum", "price", "Date"
            }
        ));
        jScrollPane1.setViewportView(bookTBL);

        jLabel2.setText("Airliners:");

        airlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Max price:");

        maxPriceTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxPriceTXTActionPerformed(evt);
            }
        });

        jLabel4.setText("Date:");

        jLabel5.setText("Departure:");

        jLabel6.setText("Arrival:");

        deparTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deparTXTActionPerformed(evt);
            }
        });

        prefferdBTN.setText("Preffred");
        prefferdBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefferdBTNActionPerformed(evt);
            }
        });

        bookBTN.setText("book");
        bookBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBTNActionPerformed(evt);
            }
        });

        jLabel7.setText("seats row:");

        jLabel8.setText("seats column:");

        jLabel9.setText("preferred section:");

        prefersectionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        prefersectionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefersectionComboBoxActionPerformed(evt);
            }
        });

        backBTN.setText("<<Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airlComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maxPriceTXT)
                            .addComponent(DateTXT)
                            .addComponent(deparTXT)
                            .addComponent(arrivTXT))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prefferdBTN))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scolumnTXT)
                                    .addComponent(srowTXT)
                                    .addComponent(prefersectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBTN)
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bookBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(airlComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prefferdBTN)
                    .addComponent(bookBTN))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maxPriceTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(srowTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DateTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(scolumnTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deparTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(prefersectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(arrivTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deparTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deparTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deparTXTActionPerformed

    private void prefferdBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefferdBTNActionPerformed
        // TODO add your handling code here:
        String depar=deparTXT.getText();
        String arriv=arrivTXT.getText();
        //
        String maxpstr=maxPriceTXT.getText();
        double maxprice;
        if(maxpstr.equals("")){maxprice=-1;}
        else{maxprice=Double.valueOf(maxpstr);}
        //
        String strdate=DateTXT.getText();
        Date date;
        if(strdate.equals("")){date=null;}
        else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = sdf.parse(strdate);
            } catch (ParseException ex) {
                Logger.getLogger(BooktkPanel.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
        }
        
        //
        Airliners airls;
        if(airlComboBox.getSelectedItem()=="all")
        {
         airls=airlDir.getAirliners();
         
         System.out.printf("combox select airlsList size is:%d\n",airlDir.getAirlinersList().size());
         ArrayList<Flight> PreferFlytlist = SearchPreferFlight1(maxprice,date,depar,arriv);
         //populateTable();
         DefaultTableModel dtm=(DefaultTableModel)bookTBL.getModel();
         dtm.setRowCount(0);
         /*
         for(Airliners airl:airlDir.getAirlinersList()){
            Object[] row=new Object[4];
            if(airl.getAirlinersname().equals(airls.getAirlinersname()))
            {row[0]=airls.getAirlinersname(); 
             System.out.printf("row 0 airls name is:"+airls.getAirlinersname()+"\n");}
            else {continue;}
            for(Flight flyt:PreferFlytlist)
            {  
               row[1]=flyt.getFlightnum();
               row[2]=flyt.getPrice();
               Date redate=flyt.getDate();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
               String datestr = sdf.format(redate);
               row[3]=datestr;
               
               dtm.addRow(row);
            }
            //JOptionPane.showMessageDialog(null,row[0]);       
        } 
        */
        
            for(Flight flyt:PreferFlytlist)
            {  Object[] row=new Object[3];
               row[0]=flyt;
               row[1]=flyt.getPrice();
               Date redate=flyt.getDate();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
               String datestr = sdf.format(redate);
               row[2]=datestr;
               
               dtm.addRow(row);
            }
            //JOptionPane.showMessageDialog(null,row[0]);       
           
        }
        
        else 
        {
        airls=(Airliners)airlComboBox.getSelectedItem();
        System.out.printf("combox select airlsname is:"+airls.getAirlinersname()+"\n");
        //reTableByairls(airls);
        ArrayList<Flight> PreferFlytlist = SearchPreferFlight2(airls,maxprice,date,depar,arriv);
        System.out.printf("PreferFlytlist size:%d",PreferFlytlist.size());
        //
        
        DefaultTableModel dtm=(DefaultTableModel)bookTBL.getModel();
        dtm.setRowCount(0);
       // for(Airliners airl:airlDir.getAirlinersList()){
         //   Object[] row=new Object[4];
           // if(airl.getAirlinersname().equals(airls.getAirlinersname()))
            //{row[0]=airls.getAirlinersname(); 
             //System.out.printf("row 0 airls name is:"+airls.getAirlinersname()+"\n");}
            //else {continue;}
            for(Flight flyt:PreferFlytlist)
            {  
               Object[] row=new Object[3];
               row[0]=flyt;
               row[1]=flyt.getPrice();
               Date redate=flyt.getDate();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
               String datestr = sdf.format(redate);
               row[2]=datestr;
               
               dtm.addRow(row);
            }
        
        }
            //JOptionPane.showMessageDialog(null,row[0]);           
    }//GEN-LAST:event_prefferdBTNActionPerformed

    private void maxPriceTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxPriceTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxPriceTXTActionPerformed

    private void bookBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBTNActionPerformed
        // TODO add your handling code here:
        //Flight flight;
        int selerow=bookTBL.getSelectedRow();
        //seats=flight.getSeats();
        if(selerow<0){
          JOptionPane.showMessageDialog(null,"Please select a customer you want to book ticket for!","WARNING",JOptionPane.WARNING_MESSAGE);  
        }
        else{
        Flight flight=(Flight) bookTBL.getValueAt(selerow,0);
        if(srowTXT.getText().equals("") ||scolumnTXT.getText().equals(""))
        { JOptionPane.showMessageDialog(null,"Please input the seats you want to choose");}
        else{
            int srow=Integer.parseInt(srowTXT.getText());
            int scolumn=Integer.parseInt(scolumnTXT.getText());
            boolean[][] seats = flight.getSeats();
            if(seats[scolumn][srow]==true) 
            {JOptionPane.showMessageDialog(null,"The seats has been taken");}
            else {seats[scolumn][srow]=true;
                  JOptionPane.showMessageDialog(null,"successfully book");                          
                  }
            }
        }
    }//GEN-LAST:event_bookBTNActionPerformed

    private void prefersectionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefersectionComboBoxActionPerformed
        // TODO add your handling code here:
        prefersectionComboBox.removeAllItems();
        prefersectionComboBox.addItem("window");
        prefersectionComboBox.addItem("middle");
        prefersectionComboBox.addItem("airsle");
        
    }//GEN-LAST:event_prefersectionComboBoxActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        CardSecePanel.remove(this);
        CardLayout layout=(CardLayout) CardSecePanel.getLayout();
        layout.previous(CardSecePanel);
    }//GEN-LAST:event_backBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateTXT;
    private javax.swing.JComboBox airlComboBox;
    private javax.swing.JTextField arrivTXT;
    private javax.swing.JButton backBTN;
    private javax.swing.JButton bookBTN;
    private javax.swing.JTable bookTBL;
    private javax.swing.JTextField deparTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maxPriceTXT;
    private javax.swing.JComboBox prefersectionComboBox;
    private javax.swing.JButton prefferdBTN;
    private javax.swing.JTextField scolumnTXT;
    private javax.swing.JTextField srowTXT;
    // End of variables declaration//GEN-END:variables
}
