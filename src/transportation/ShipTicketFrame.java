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
public class ShipTicketFrame extends javax.swing.JFrame {

    /**
     * Creates new form ShipTicket
     */
    public ShipTicketFrame() {
        initComponents();
        
        
        ImageIcon logo=new ImageIcon("Images/logo.png");
        logoLabel.setIcon(logo);
        ImageIcon background=new ImageIcon("Images/shipTicket.png");
        shipTicketLabel.setIcon(background);
        int userIndex = UIS.checkAccountIndex(Loginn.usernameTextField.getText());
        int ticketIndex = UIS.ticketCheck(ShipTicketBooking.fromBox.getSelectedItem().toString());
        
        fromLabel.setText(UIS.accounts.get(userIndex).getUserTickets().get(ticketIndex).fromCountry);
        toLabel.setText(UIS.accounts.get(userIndex).getUserTickets().get(ticketIndex).toCountry);
        dateLabel.setText(UIS.accounts.get(userIndex).getUserTickets().get(ticketIndex).departing);
        departureLabel.setText(UIS.accounts.get(userIndex).getUserTickets().get(ticketIndex).departingTime);
        cabinLabel.setText(ShipTicketBooking.numberCabinBox.getSelectedItem().toString());
        priceLabel.setText(String.valueOf(UIS.accounts.get(userIndex).getUserTickets().get(ticketIndex).ticketPrice));
        if(ShipTicketBooking.balcoonRb.isSelected()){
           classLabel.setText("Balcoon");
       }
       
       else{
           classLabel.setText("Inside");
       }
        
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        departureLabel = new javax.swing.JLabel();
        cabinLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        shipTicketLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("CLASS:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel5.setText("CABIN:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel3.setText("DEPARTURE:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel4.setText("DATE:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel2.setText("TO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel1.setText("FROM:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));
        jPanel2.add(fromLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 92, 14));
        jPanel2.add(toLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 92, 14));
        jPanel2.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 92, 14));
        jPanel2.add(departureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 92, 14));
        jPanel2.add(cabinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 92, 14));
        jPanel2.add(classLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 92, 14));

        jLabel7.setText(".");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jLabel8.setText("PRICE:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));
        jPanel2.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 100, 100));
        jPanel2.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 110, 20));
        jPanel2.add(shipTicketLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 560, 320));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -6, 550, 320));

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
            java.util.logging.Logger.getLogger(ShipTicketFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShipTicketFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShipTicketFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShipTicketFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShipTicketFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cabinLabel;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel departureLabel;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel shipTicketLabel;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
}
