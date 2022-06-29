/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

import Account.UIS;
import Account.UserAccount;
import SignUp.SignSystem;
import javax.swing.ImageIcon;



/**
 *
 * @author Duygu-Alperen
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        ImageIcon imageicon=new ImageIcon("Images/signup.png");
        jLabel7.setIcon(imageicon);
        ImageIcon imageicon1=new ImageIcon("Images/backicon.png");
        jLabel10.setIcon(imageicon1);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        surnameText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        femaleRb = new javax.swing.JRadioButton();
        maleRb = new javax.swing.JRadioButton();
        birthDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        infoText = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("First Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 80, 20));

        jLabel3.setText("Second Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setText("Username:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel5.setText("Password:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel6.setText("Date of Birth:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));
        jPanel2.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, -1));
        jPanel2.add(surnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, -1));
        jPanel2.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, -1));
        jPanel2.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, -1));

        jLabel8.setText("Gender: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        buttonGroup1.add(femaleRb);
        femaleRb.setText("Female");
        jPanel2.add(femaleRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        buttonGroup1.add(maleRb);
        maleRb.setText("Male");
        jPanel2.add(maleRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));
        jPanel2.add(birthDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 110, -1));

        jLabel9.setText("Phone Number:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        jPanel2.add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, -1));

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 25, 25));
        jPanel2.add(infoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 30));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 360, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public String dateToString(){
        String date = "";
        int month = birthDateChooser.getDate().getMonth();
        int year = birthDateChooser.getDate().getYear();
        int day = birthDateChooser.getDate().getDate();
        date = String.valueOf(day) +"/" +String.valueOf(month+1) +"/"+ String.valueOf(year+1900);
        return date;
    }
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        String name = nameText.getText();
        String surname = surnameText.getText();
        String username = usernameText.getText();
        String password = passwordText.getText();
        String birthdate = dateToString();
        String gender = "";
        String phoneNum = phoneText.getText();
        if(femaleRb.isSelected()){
            gender = "female";
        }
        else{
            gender = "male";
        }
        boolean validName = SignSystem.checkNameSurname(name);
        boolean validSurname = SignSystem.checkNameSurname(surname);
        boolean validPassword = SignSystem.checkPassword(password);
        boolean validPhone = SignSystem.checkPhone(phoneNum);
        
        if(!validName || !validSurname){
            infoText.setText("Name and surname can be only\n alphabetical");
        }
        
        if(!validPassword){
            infoText.setText("Password should contain at least one A-Z\n,a-z and 0-9");
        }
        
        if(!validPhone){
            infoText.setText("Phone number can contain only digits");
        }
        
 
        if(SignSystem.checkNameSurname(name) && SignSystem.checkNameSurname(surname) && SignSystem.checkPassword(password) && SignSystem.checkPhone(phoneNum)){
            UIS.accounts.add(new UserAccount(username, password, name, surname, phoneNum, gender, birthdate));
            this.dispose();
        }
        
    }//GEN-LAST:event_registerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser birthDateChooser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton femaleRb;
    private javax.swing.JLabel infoText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton maleRb;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField surnameText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
