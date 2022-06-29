/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

import Account.UIS;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Duygu-Alperen
 */
public class PlaneSit extends javax.swing.JFrame {

    /**
     * Creates new form PlaneSit
     */
    public PlaneSit() {
        initComponents();
        
        ImageIcon a=new ImageIcon("Images/planeSitBg.png");
        background.setIcon(a);
        
        ImageIcon businesssits=new ImageIcon("Images/businessSits.png");      
        businessSitBg.setIcon(businesssits);
        
        ImageIcon economysits=new ImageIcon("Images/economySits.png");
        economySitBg.setIcon(economysits);
        
       
        
       ImageIcon planesitbg=new ImageIcon("Images/planeSitBg.png");
       
       
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
        jPanel2 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        businessSitBg = new javax.swing.JLabel();
        preNumericalBox = new javax.swing.JComboBox<>();
        preAlphBox = new javax.swing.JComboBox<>();
        panel3 = new javax.swing.JPanel();
        economySitBg = new javax.swing.JLabel();
        ecoSeatNumBox = new javax.swing.JComboBox<>();
        ecoSeatAlphaBox = new javax.swing.JComboBox<>();
        economyRb = new javax.swing.JRadioButton();
        businessRb = new javax.swing.JRadioButton();
        confirmButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(new java.awt.CardLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        preNumericalBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        preAlphBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "C", "D", "F" }));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(businessSitBg, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(preNumericalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(preAlphBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(businessSitBg, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(preNumericalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(preAlphBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        panel1.add(panel2, "card2");

        panel3.setBackground(new java.awt.Color(255, 255, 255));

        ecoSeatNumBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));

        ecoSeatAlphaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(economySitBg, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ecoSeatNumBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ecoSeatAlphaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(economySitBg, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ecoSeatNumBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ecoSeatAlphaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        panel1.add(panel3, "card3");

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 740, 360));

        buttonGroup1.add(economyRb);
        economyRb.setText("Economy");
        economyRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economyRbActionPerformed(evt);
            }
        });
        jPanel2.add(economyRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, -1));

        buttonGroup1.add(businessRb);
        businessRb.setText("Business");
        businessRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessRbActionPerformed(evt);
            }
        });
        jPanel2.add(businessRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 110, -1));

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        jPanel2.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        background.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel2.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 810, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void economyRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economyRbActionPerformed
      
        
        panel3.setVisible(true);
        panel2.setVisible(false);
        
    }//GEN-LAST:event_economyRbActionPerformed

    private void businessRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessRbActionPerformed
        panel3.setVisible(false);
        panel2.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_businessRbActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        int userIndex = UIS.checkAccountIndex(Loginn.usernameTextField.getText());
        
        if(economyRb.isSelected()){
            UIS.accounts.get(userIndex).getUserTickets().get(0).addExtra(0);
        }
        else{
            UIS.accounts.get(userIndex).getUserTickets().get(0).addExtra(50);
        }
        PlaneTicketFrame subframe = new PlaneTicketFrame();
        subframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PlaneSit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaneSit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaneSit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaneSit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaneSit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    public static javax.swing.JRadioButton businessRb;
    private javax.swing.JLabel businessSitBg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmButton;
    public static javax.swing.JComboBox<String> ecoSeatAlphaBox;
    public static javax.swing.JComboBox<String> ecoSeatNumBox;
    public static javax.swing.JRadioButton economyRb;
    private javax.swing.JLabel economySitBg;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    public static javax.swing.JComboBox<String> preAlphBox;
    public static javax.swing.JComboBox<String> preNumericalBox;
    // End of variables declaration//GEN-END:variables
}