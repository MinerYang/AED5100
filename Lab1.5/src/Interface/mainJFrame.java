/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Personalrecord.*;

/**
 *
 * @author cestdrama
 */
public class mainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    private Person person;
    private Address address;
    public mainJFrame() {
        initComponents();
        //this.person=person;
        //person
        Person person=new Person();
        person.setFirstName("Joe");
        person.setLastName("Smith");
        person.setDOB(null);
        person.setStreetadd("360 HUntington Ave\n"
                +"Boston MA 012115\n"
                + "USA\n");
        displayperson(person);
        
        //work addr
        address=new Address();
        address.setSt1("360 HUntington Ave");
        address.setSt2("130 Snell Engineering");
        address.setCity("Boston");
        address.setState("MA");
        address.setZip("02115");
        address.setCountry("USA");
        person.setWorkaddress(address);
        //wst1TXT.setText(address.getSt1());
        
        //local addr
        address=new Address();
        address.setSt1("100 Main Street");
        address.setSt2(null);
        address.setCity("Natick");
        address.setState("MA");
        address.setZip("01760");
        address.setCountry("USA");
        person.setLocaladdress(address);
        //home addr
        address= new Address();
        address.setSt1("201 Best Street");
        address.setSt2(null);
        address.setCity("cool-town");
        address.setState("Shanghai");
        address.setZip(null);
        address.setCountry("China");
        person.setHomeaddress(address);
        
        //
        Address x = person.getWorkaddress(); //call person->address
        wst1TXT.setText(x.getSt1());
        wst2TXT.setText(x.getSt2());
        wcityTXT.setText(x.getCity());
        wstateTXT.setText(x.getState());
        wzipTXT.setText(x.getZip());
        wcountryTXT.setText(x.getCountry());
        
        //
        Address y = person.getLocaladdress();
        lst1TXT.setText(y.getSt1());
        lst2TXT.setText(y.getSt2());
        lcityTXT.setText(y.getCity());
        lstateTXT.setText(y.getState());
        lzipTXT.setText(y.getZip());
        lcountryTXT.setText(y.getCountry());
        
        //
        Address z = person.getHomeaddress();
        hst1TXT.setText(z.getSt1());
        hst2TXT.setText(z.getSt2());
        hcityTXT.setText(z.getCity());
        hstateTXT.setText(z.getState());
        hzipTXT.setText(z.getZip());
        hcountryTXT.setText(z.getCountry());
       

    }
    
    //
    private void displayperson(Person person){
        //nameTxtf.setText(product.getName());
        firstnameTXT.setText(person.getFirstName());
        lastnameTXT.setText(person.getLastName());
        dobTXT.setText(person.getDOB());
        straddArea.setText(person.getStreetadd());
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
        PersonPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstnameTXT = new javax.swing.JTextField();
        lastnameTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dobTXT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        straddArea = new javax.swing.JTextArea();
        workaddPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        wst1TXT = new javax.swing.JTextField();
        wst2TXT = new javax.swing.JTextField();
        wcityTXT = new javax.swing.JTextField();
        wstateTXT = new javax.swing.JTextField();
        wcountryTXT = new javax.swing.JTextField();
        wzipTXT = new javax.swing.JTextField();
        workaddPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lst1TXT = new javax.swing.JTextField();
        lst2TXT = new javax.swing.JTextField();
        lcityTXT = new javax.swing.JTextField();
        lstateTXT = new javax.swing.JTextField();
        lcountryTXT = new javax.swing.JTextField();
        lzipTXT = new javax.swing.JTextField();
        workaddPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        hst1TXT = new javax.swing.JTextField();
        hst2TXT = new javax.swing.JTextField();
        hcityTXT = new javax.swing.JTextField();
        hstateTXT = new javax.swing.JTextField();
        hcountryTXT = new javax.swing.JTextField();
        hzipTXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Person Profile");

        jLabel2.setText("First name:");

        jLabel3.setText("Last name:");

        jLabel4.setText("Street Address:");

        firstnameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTXTActionPerformed(evt);
            }
        });

        lastnameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTXTActionPerformed(evt);
            }
        });

        jLabel5.setText("DOB(MM/DD//YYYY:)");

        dobTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTXTActionPerformed(evt);
            }
        });

        straddArea.setColumns(20);
        straddArea.setRows(5);
        jScrollPane1.setViewportView(straddArea);

        javax.swing.GroupLayout PersonPanelLayout = new javax.swing.GroupLayout(PersonPanel);
        PersonPanel.setLayout(PersonPanelLayout);
        PersonPanelLayout.setHorizontalGroup(
            PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonPanelLayout.createSequentialGroup()
                        .addGroup(PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastnameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(firstnameTXT))
                        .addGap(176, 176, 176)
                        .addGroup(PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dobTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        PersonPanelLayout.setVerticalGroup(
            PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonPanelLayout.createSequentialGroup()
                .addGroup(PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(firstnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PersonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap())
        );

        workaddPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Work Address"));

        jLabel6.setText("Stress Line1:");

        jLabel7.setText("Stress Line2:");

        jLabel8.setText("City:");

        jLabel9.setText("State:");

        jLabel10.setText("Zip Code:");

        jLabel11.setText("Country:");

        wst1TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wst1TXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workaddPanelLayout = new javax.swing.GroupLayout(workaddPanel);
        workaddPanel.setLayout(workaddPanelLayout);
        workaddPanelLayout.setHorizontalGroup(
            workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workaddPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workaddPanelLayout.createSequentialGroup()
                        .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(32, 32, 32)
                        .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wcountryTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(wzipTXT)
                            .addComponent(wstateTXT)
                            .addComponent(wcityTXT)))
                    .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(workaddPanelLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(wst2TXT))
                        .addGroup(workaddPanelLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(wst1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        workaddPanelLayout.setVerticalGroup(
            workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workaddPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(wst1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(wst2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(wcityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(wstateTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(wzipTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(wcountryTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        workaddPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Local Address"));

        jLabel12.setText("Stress Line1:");

        jLabel13.setText("Stress Line2:");

        jLabel14.setText("City:");

        jLabel15.setText("State:");

        jLabel16.setText("Zip Code:");

        jLabel17.setText("Country:");

        lst1TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lst1TXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workaddPanel1Layout = new javax.swing.GroupLayout(workaddPanel1);
        workaddPanel1.setLayout(workaddPanel1Layout);
        workaddPanel1Layout.setHorizontalGroup(
            workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workaddPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workaddPanel1Layout.createSequentialGroup()
                        .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(32, 32, 32)
                        .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lcountryTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(lzipTXT)
                            .addComponent(lstateTXT)
                            .addComponent(lcityTXT)))
                    .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(workaddPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lst2TXT))
                        .addGroup(workaddPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lst1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        workaddPanel1Layout.setVerticalGroup(
            workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workaddPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lst1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lst2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lcityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lstateTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lzipTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lcountryTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        workaddPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Home Address"));

        jLabel24.setText("Stress Line1:");

        jLabel25.setText("Stress Line2:");

        jLabel26.setText("City:");

        jLabel27.setText("State:");

        jLabel28.setText("Zip Code:");

        jLabel29.setText("Country:");

        hst1TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hst1TXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workaddPanel3Layout = new javax.swing.GroupLayout(workaddPanel3);
        workaddPanel3.setLayout(workaddPanel3Layout);
        workaddPanel3Layout.setHorizontalGroup(
            workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workaddPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workaddPanel3Layout.createSequentialGroup()
                        .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(32, 32, 32)
                        .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hcountryTXT)
                            .addComponent(hzipTXT)
                            .addComponent(hstateTXT)
                            .addComponent(hcityTXT)))
                    .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(workaddPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(hst2TXT))
                        .addGroup(workaddPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(hst1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        workaddPanel3Layout.setVerticalGroup(
            workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workaddPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(hst1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(hst2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(hcityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(hstateTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(hzipTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(workaddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(hcountryTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(workaddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(workaddPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(workaddPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PersonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PersonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(workaddPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(workaddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(workaddPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTXTActionPerformed

    private void firstnameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTXTActionPerformed

    private void dobTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTXTActionPerformed

    private void wst1TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wst1TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wst1TXTActionPerformed

    private void lst1TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lst1TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lst1TXTActionPerformed

    private void hst1TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hst1TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hst1TXTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PersonPanel;
    private javax.swing.JTextField dobTXT;
    private javax.swing.JTextField firstnameTXT;
    private javax.swing.JTextField hcityTXT;
    private javax.swing.JTextField hcountryTXT;
    private javax.swing.JTextField hst1TXT;
    private javax.swing.JTextField hst2TXT;
    private javax.swing.JTextField hstateTXT;
    private javax.swing.JTextField hzipTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameTXT;
    private javax.swing.JTextField lcityTXT;
    private javax.swing.JTextField lcountryTXT;
    private javax.swing.JTextField lst1TXT;
    private javax.swing.JTextField lst2TXT;
    private javax.swing.JTextField lstateTXT;
    private javax.swing.JTextField lzipTXT;
    private javax.swing.JTextArea straddArea;
    private javax.swing.JTextField wcityTXT;
    private javax.swing.JTextField wcountryTXT;
    private javax.swing.JPanel workaddPanel;
    private javax.swing.JPanel workaddPanel1;
    private javax.swing.JPanel workaddPanel3;
    private javax.swing.JTextField wst1TXT;
    private javax.swing.JTextField wst2TXT;
    private javax.swing.JTextField wstateTXT;
    private javax.swing.JTextField wzipTXT;
    // End of variables declaration//GEN-END:variables
}
