/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalPanel;

/**
 *
 * @author prospace
 */

import javax.swing.*;
import Business.*;
import Business.Admin.*;
import Business.DB4OUtil.*;
import Business.Disease.*;
import Business.Doctor.*;
import Business.Enterprise.*;
import Business.Network.*;
import Business.Patient.*;
import Business.Recode.*;
import java.awt.*;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class ManageViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageViewPanel
     */
    JPanel rightPanel;
    Doctor doctor;
    File directory = new File("");
    String pex=directory.getAbsolutePath()+"/images/";
    public ManageViewPanel(JPanel rightPanel, Doctor doctor) {
        initComponents();
        this.rightPanel = rightPanel;
        this.doctor = doctor;
        
        FNText.setText(doctor.getFirstName());
        LNText.setText(doctor.getLastName());
        SexText.setText(doctor.getSex());
        HPText.setText(doctor.getHospital());
        DPText.setText(Long.toString(doctor.getId()));
        
        FNText.setEnabled(false);
        LNText.setEnabled(false);
        SexText.setEnabled(false);
        HPText.setEnabled(false);
        DPText.setEnabled(false);
        //
        ImageIcon icon=new ImageIcon(pex+"hostitle.png");
        title.setText("");
        title.setIcon(icon);
        initBTN();
    }
    public void initBTN(){
          resetButton(BackBtn,
                pex+"back1.png",
                pex+"back2.png");
    }
     
     public void resetButton(JButton btn,String path1,String path2){
       ImageIcon img1 = new ImageIcon(path1);
       ImageIcon img2 = new ImageIcon(path2);
      // ImageIcon img3 = new ImageIcon("/Users/cestdrama/Desktop/swg1207/display_pressed.jpg");        
          btn.setText("");
          btn.setSize(img2.getIconWidth(),img2.getIconHeight());
          btn.setContentAreaFilled(false);
          //BTN1.setBorderPainted(false);
          btn.setIcon(img1);
          btn.setPressedIcon(img2); 
          btn.setRolloverIcon(img2);
          //btn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FNText = new javax.swing.JTextField();
        SexText = new javax.swing.JTextField();
        HPText = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        DPText = new javax.swing.JTextField();
        LNText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText(">>>>>Create a new work person >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

        title.setText("jLabel3");

        jLabel14.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 102));
        jLabel14.setText("First name:");

        jLabel15.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 102));
        jLabel15.setText("Last name:");

        jLabel19.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 102));
        jLabel19.setText("Id number:");

        jLabel18.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 102));
        jLabel18.setText("Hospital name:");

        jLabel16.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 102));
        jLabel16.setText("Doctor gender:");

        jLabel17.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 102));
        jLabel17.setText("(M/F)");

        jLabel9.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FNText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HPText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DPText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SexText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))))
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(BackBtn)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(FNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(SexText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(HPText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(DPText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DPText;
    private javax.swing.JTextField FNText;
    private javax.swing.JTextField HPText;
    private javax.swing.JTextField LNText;
    private javax.swing.JTextField SexText;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
