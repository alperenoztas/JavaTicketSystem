/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

import Account.UIS;
import Tickets.PlaneTicket;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Duygu-Alperen
 */
public class PlaneTicketBooking extends javax.swing.JFrame {

    /**
     * Creates new form PlaneTicket
     */
    public PlaneTicketBooking() {
        initComponents();
        
         ImageIcon imageicon=new ImageIcon("Images/flightTicket.png");
         planeBg.setIcon(imageicon);
         
         this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         
        ImageIcon backicon = new ImageIcon("Images/backicon.png");
        backiconLabel.setIcon(backicon);
        
        ImageIcon usernameicon = new ImageIcon("Images/usernameicon.png");
        userLabel.setIcon(usernameicon);
        userPanel.setVisible(false);
        
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ticketPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        fromBox = new javax.swing.JComboBox<>();
        departingDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        findButton = new javax.swing.JButton();
        adultSpinner = new javax.swing.JSpinner();
        childrenSpinner = new javax.swing.JSpinner();
        lapInfantsSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        toBox = new javax.swing.JComboBox<>();
        departingTimeBox = new javax.swing.JComboBox<>();
        warnLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        changeLabel = new javax.swing.JLabel();
        outLabel = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        ticketLabel = new javax.swing.JLabel();
        planeBg = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        backiconLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketPanel.setBackground(new java.awt.Color(255, 255, 255));
        ticketPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("From:");

        fromBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Russia", "Italy", "Finland", "Japan", "Germany", "China", "Brazil", "Canada", "France", "Canada" }));
        fromBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromBoxActionPerformed(evt);
            }
        });

        jLabel11.setText("Departing:");

        jLabel16.setText("Adult ");

        jLabel17.setText("Children (2 to 12)");

        jLabel18.setText("Lap Infants");

        findButton.setText("Find a flight ticket");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        adultSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        adultSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        childrenSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));

        lapInfantsSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));

        jLabel4.setText("To:");

        toBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Russia", "Italy", "Finland", "Japan", "Germany", "China", "Brazil", "Canada", "France", "Canada" }));

        departingTimeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06.00", "12.30", "19.45" }));

        jLabel12.setText("Departing Time:");

        javax.swing.GroupLayout ticketPanelLayout = new javax.swing.GroupLayout(ticketPanel);
        ticketPanel.setLayout(ticketPanelLayout);
        ticketPanelLayout.setHorizontalGroup(
            ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ticketPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ticketPanelLayout.createSequentialGroup()
                        .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adultSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lapInfantsSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(childrenSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132))
                    .addGroup(ticketPanelLayout.createSequentialGroup()
                        .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ticketPanelLayout.createSequentialGroup()
                                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(fromBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(toBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(warnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ticketPanelLayout.createSequentialGroup()
                                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departingDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departingTimeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ticketPanelLayout.setVerticalGroup(
            ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departingDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departingTimeBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ticketPanelLayout.createSequentialGroup()
                        .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(adultSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(childrenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ticketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lapInfantsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ticketPanelLayout.createSequentialGroup()
                        .addComponent(findButton)
                        .addGap(42, 42, 42))))
        );

        jPanel1.add(ticketPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 330, 340));

        userPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        changeLabel.setText("Change xx");
        changeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeLabelMouseExited(evt);
            }
        });

        outLabel.setText("Sign Out");
        outLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                outLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outLabelMouseExited(evt);
            }
        });

        faqLabel.setText("F.A.Q");
        faqLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                faqLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                faqLabelMouseExited(evt);
            }
        });

        ticketLabel.setText("My Tickets");
        ticketLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ticketLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ticketLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ticketLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ticketLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(faqLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, -1, 130));
        jPanel1.add(planeBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 740, 370));

        backiconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backiconLabelMouseClicked(evt);
            }
        });

        userLabel.setVerifyInputWhenFocusTarget(false);
        userLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(719, Short.MAX_VALUE)
                .addComponent(backiconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backiconLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 2, 18)); // NOI18N
        jLabel3.setText("\tFly like a CEO, pay like a temp!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public String dateToString(){
        String date = "";
        int month = departingDateChooser.getDate().getMonth();
        int year = departingDateChooser.getDate().getYear();
        int day = departingDateChooser.getDate().getDate();
        date = String.valueOf(day) +"/" +String.valueOf(month+1) +"/"+ String.valueOf(year+1900);
        return date;
    }
    
    private void fromBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromBoxActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
        
        String fromCountry = fromBox.getSelectedItem().toString();
        String toCountry = toBox.getSelectedItem().toString();
        String departing = dateToString();
        String departingTime = departingTimeBox.getSelectedItem().toString();
        int adult = Integer.parseInt(adultSpinner.getValue().toString());
        int child = Integer.parseInt(childrenSpinner.getValue().toString());
        int lapInfants = Integer.parseInt(lapInfantsSpinner.getValue().toString());
        
        PlaneTicket ticket = new PlaneTicket(fromCountry,toCountry,0,departing,departingTime,adult,child,lapInfants,"",false);
        ticket.setTicketPrice(ticket.calcPrice(fromCountry, toCountry, departingTime, adult, child, lapInfants));
        int userIndex = UIS.checkAccountIndex(Loginn.usernameTextField.getText());
        UIS.accounts.get(userIndex).addTicket(ticket);
        
        
        if(toBox.getSelectedItem().toString() == fromBox.getSelectedItem().toString()){
            warnLabel.setText("Your destination country and your departure country cannot be the same.");
        }
        if(toBox.getSelectedItem().toString() != fromBox.getSelectedItem().toString()){
            warnLabel.setVisible(false);
            PlaneSit planesit = new PlaneSit();
            planesit.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_findButtonActionPerformed

    private void userLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelMouseClicked

        if(userPanel.isVisible()){
            userPanel.setVisible(false);
        }
        else
        userPanel.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_userLabelMouseClicked

    private void backiconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backiconLabelMouseClicked
    this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_backiconLabelMouseClicked

    private void ticketLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketLabelMouseClicked
        // TODO add your handling code here:
        Tickets subTickets = new Tickets();
        subTickets.setVisible(true);
    }//GEN-LAST:event_ticketLabelMouseClicked

    private void ticketLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketLabelMouseEntered
        ticketLabel.setText("<HTML><U>My Tickets</U></HTML>");
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketLabelMouseEntered

    private void ticketLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketLabelMouseExited
        ticketLabel.setText("<HTML>My Tickets</HTML>");
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketLabelMouseExited

    private void changeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLabelMouseEntered
        changeLabel.setText("<HTML><U>Change xx</U></HTML>");
        // TODO add your handling code here:
    }//GEN-LAST:event_changeLabelMouseEntered

    private void changeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLabelMouseExited
        changeLabel.setText("<HTML>Change xx</HTML>");
        // TODO add your handling code here:
    }//GEN-LAST:event_changeLabelMouseExited

    private void faqLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqLabelMouseClicked
         FAQ subFrame = new FAQ();
         subFrame.setVisible(true);       
        // TODO add your handling code here:
    }//GEN-LAST:event_faqLabelMouseClicked

    private void faqLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqLabelMouseEntered
         faqLabel.setText("<HTML><U>F.A.Q</U></HTML>");
// TODO add your handling code here:
    }//GEN-LAST:event_faqLabelMouseEntered

    private void faqLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqLabelMouseExited
        faqLabel.setText("<HTML>F.A.Q</HTML>");
        // TODO add your handling code here:
    }//GEN-LAST:event_faqLabelMouseExited

    private void outLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outLabelMouseEntered
        outLabel.setText("<HTML><U>Sign Out</U></HTML>");
        // TODO add your handling code here:
    }//GEN-LAST:event_outLabelMouseEntered

    private void outLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outLabelMouseExited
    outLabel.setText("<HTML>Sign Out</HTML>");
        // TODO add your handling code here:
    }//GEN-LAST:event_outLabelMouseExited

    private void changeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLabelMouseClicked
         PersonalInformation subFrame = new PersonalInformation();
         subFrame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_changeLabelMouseClicked

    private void outLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outLabelMouseClicked
        Loginn subFrame=new Loginn();
        subFrame.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_outLabelMouseClicked

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
            java.util.logging.Logger.getLogger(PlaneTicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaneTicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaneTicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaneTicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaneTicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner adultSpinner;
    private javax.swing.JLabel backiconLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JSpinner childrenSpinner;
    private com.toedter.calendar.JDateChooser departingDateChooser;
    private javax.swing.JComboBox<String> departingTimeBox;
    private javax.swing.JLabel faqLabel;
    private javax.swing.JButton findButton;
    public static javax.swing.JComboBox<String> fromBox;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSpinner lapInfantsSpinner;
    private javax.swing.JLabel outLabel;
    private javax.swing.JLabel planeBg;
    private javax.swing.JLabel ticketLabel;
    private javax.swing.JPanel ticketPanel;
    private javax.swing.JComboBox<String> toBox;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel warnLabel;
    // End of variables declaration//GEN-END:variables
}
