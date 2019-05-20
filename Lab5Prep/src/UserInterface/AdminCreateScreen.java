/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author harshalneelkamal
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;
    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
        buttonGroup1.add(radioCustomer);
        buttonGroup1.add(radioSupplier); //this is to prevent same name;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtPword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPwordKeyTyped(evt);
            }
        });

        txtRePword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRePwordKeyTyped(evt);
            }
        });

        jLabel1.setText("username:");

        jLabel2.setText("password:");

        jLabel3.setText("re-enter password :");

        radioCustomer.setText("Customer");
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCustomerActionPerformed(evt);
            }
        });

        radioSupplier.setText("Supplier");

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioSupplier)
                                    .addComponent(radioCustomer)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        if (radioSupplier.isSelected()) {
            String s1 = txtUser.getText();
            String s2 = txtPword.getText();
            String s3 = txtRePword.getText();
            txtUser.removeAll();
            txtPword.removeAll();
            txtRePword.removeAll();
            Supplier tmp = new Supplier(s2,s1);
            if (tmp.verify(s3) == false) {
                JOptionPane.showMessageDialog(null, "Passwords Not Same!");
                return;
            }
            boolean flag = Pattern.matches("[a-z0-9A-Z]([a-z0-9A-Z]*[._]?[a-z0-9A-Z]+)*@([a-z0-9A-Z])([a-z0-9A-Z])*([.]([a-z0-9A-Z]+)([a-z0-9A-Z])*)+", s1);
            if (flag == false) {
                JOptionPane.showMessageDialog(null, "Invalid name!");
                return;
            }
            for (User sup: admin.getSuppDir().getSupplierList()){
                if (sup.getUserName().equals(s1))
                {
                    JOptionPane.showMessageDialog(null, "Existed Supplier");
                    return;
                }
            }
            admin.getSuppDir().getSupplierList().add(tmp);
            JOptionPane.showMessageDialog(null, "Add Successfully");
        }else if (radioCustomer.isSelected()){
            String s1 = txtUser.getText();
            String s2 = txtPword.getText();
            String s3 = txtRePword.getText();
            
            txtUser.removeAll();
            txtPword.removeAll();
            txtRePword.removeAll();
            
            Customer tmp = new Customer(s2,s1);
            if (tmp.verify(s3) == false) {
                JOptionPane.showMessageDialog(null, "Passwords Not Same!");
                return;
            }
            boolean flag = Pattern.matches("[a-z0-9A-Z]([a-z0-9A-Z]*[._]?[a-z0-9A-Z]+)*@([a-z0-9A-Z])([a-z0-9A-Z])*([.]([a-z0-9A-Z]+)([a-z0-9A-Z])*)+", s1);
            if (flag == false) {
                JOptionPane.showMessageDialog(null, "Invalid name!");
                return;
            }
             for (User sup: admin.getCustDir().getCustomerList()){
                if (sup.getUserName().equals(s1))
                {
                    JOptionPane.showMessageDialog(null, "Existed Customer");
                    return;
                }
            }
            admin.getCustDir().getCustomerList().add(tmp);
            JOptionPane.showMessageDialog(null, "Add Successfully");
        }else{
            JOptionPane.showMessageDialog(null, "Please select a kind!");
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void radioCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

         CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);
        
        Component[] components =  panelRight.getComponents();
        for (Component c : components){
            if (c instanceof AdminMainScreen){
                AdminMainScreen panel = (AdminMainScreen) c;
                panel.populate();
            }
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwordKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        checkForButtonVisibility();
        
        String check = ""+evt.getKeyChar();
        String compare = txtPword.getText();
        
        if(!check.isEmpty()){
            compare += check;
        }
        if(txtPword.getText().equals(compare)){
            txtRePword.setBackground(Color.white);
            btnCreate.setEnabled(true);
        }else{
            txtRePword.setBackground(Color.red);
            btnCreate.setEnabled(false);
        }
         checkForButtonVisibility();
    }//GEN-LAST:event_txtPwordKeyTyped

    private void txtRePwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePwordKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
         //checkForButtonVisibility();
        checkForButtonVisibility();
        String check = ""+evt.getKeyChar();
        String compare = txtRePword.getText();
        
        if(!check.isEmpty()){
            compare += check;
        }
        if(txtPword.getText().equals(compare)){
            txtRePword.setBackground(Color.white);
            btnCreate.setEnabled(true);
        }else{
            txtRePword.setBackground(Color.red);
            btnCreate.setEnabled(false);
        }
         checkForButtonVisibility();
    }//GEN-LAST:event_txtRePwordKeyTyped
                                                                
    
    private void checkForButtonVisibility() {
        if(!txtUser.getText().isEmpty()&&!txtPword.getText().isEmpty()&&!txtRePword.getText().isEmpty()){
            btnCreate.setEnabled(true);
        }else{
            btnCreate.setEnabled(false);
        }
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
