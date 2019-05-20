/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Record.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
/**
 *
 * @author cestdrama
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private VitalSignHistory vsh;
    public ViewJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh=vsh;
        populateTable();
    }
    
    //
     public void populateTable()
     {
         DefaultTableModel dtm = (DefaultTableModel)tbVitalSigns.getModel();
         dtm.setRowCount(0);
         for(VitalSign vs:vsh.getVitalSignList())
         {
           Object row[]= new Object[2];
           row[0]=vs;
           row[1]=vs.getBloodpr();
           dtm.addRow(row);
         }
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
        tbVitalSigns = new javax.swing.JTable();
        detailBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bpTXT = new javax.swing.JTextField();
        tempTXT = new javax.swing.JTextField();
        dateTXT = new javax.swing.JTextField();
        pulseTXT = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Vital Sign History");

        tbVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbVitalSigns);

        detailBTN.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        detailBTN.setText("details");
        detailBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBTNActionPerformed(evt);
            }
        });

        deleteBTN.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        deleteBTN.setText("delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        jLabel2.setText("Temperature:");

        jLabel3.setText("Bloodpressure:");

        jLabel4.setText("Pulse:");

        jLabel5.setText("Date:");

        bpTXT.setEnabled(false);

        tempTXT.setEnabled(false);
        tempTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTXTActionPerformed(evt);
            }
        });

        dateTXT.setEnabled(false);

        pulseTXT.setEnabled(false);
        pulseTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(detailBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bpTXT)
                            .addComponent(dateTXT)
                            .addComponent(pulseTXT)
                            .addComponent(tempTXT))
                        .addGap(86, 86, 86)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailBTN)
                    .addComponent(deleteBTN))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tempTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bpTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pulseTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        int selectrow = tbVitalSigns.getSelectedRow();
        if(selectrow>=0)
        {
          VitalSign vs= (VitalSign)tbVitalSigns.getValueAt(selectrow, 0);
          vsh.deleVitalSign(vs);
          JOptionPane.showMessageDialog(null,"The Vital Sign you selected has been deleted!");
          populateTable();
        }
        else JOptionPane.showMessageDialog(null,"Please select a row~");
        
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void tempTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTXTActionPerformed

    private void pulseTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulseTXTActionPerformed

    private void detailBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBTNActionPerformed
        // TODO add your handling code here:
        int selectrow = tbVitalSigns.getSelectedRow();
        if(selectrow>=0)
        {
          VitalSign vs= (VitalSign)tbVitalSigns.getValueAt(selectrow, 0); //
          bpTXT.setText(String.valueOf(vs.getBloodpr()));
          tempTXT.setText(String.valueOf(vs.getTemp()));
          pulseTXT.setText(String.valueOf(vs.getPulse()));
          dateTXT.setText(vs.getDate());  
        }
        else JOptionPane.showMessageDialog(null,"Please select a row~");
    }//GEN-LAST:event_detailBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bpTXT;
    private javax.swing.JTextField dateTXT;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton detailBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pulseTXT;
    private javax.swing.JTable tbVitalSigns;
    private javax.swing.JTextField tempTXT;
    // End of variables declaration//GEN-END:variables
}
