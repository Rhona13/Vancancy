/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Admindashboard.Admin;
import Config.DBConnector;
import Config.Session;
import Config.passwordHasher;
import Registration.registrationform;
import User.UserDash;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author Big Boss
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }
    
     static String status;
      static String type;
      
    public static boolean loginAcc(String username, String password){
        DBConnector connector = new DBConnector();
        try{
            String query = "SELECT * FROM rent  WHERE t_username = '" + username + "'";
            ResultSet resultSet = connector.getData(query);

                if(resultSet.next()){
                    
                    String hashedPass = resultSet.getString("t_pass");
                    String rehashedPass = passwordHasher.hashPassword(password);
                    
                    System.out.println(""+hashedPass);
                    System.out.println(""+rehashedPass);
                    if(hashedPass.equals(rehashedPass)){
                status= resultSet.getString("t_status");
                type= resultSet.getString("t_type");
                Session sess = Session.getInstance();
                sess.setId(resultSet.getInt("t_id"));
                sess.setFn(resultSet.getString("t_fn"));
                sess.setLn(resultSet.getString("t_ln"));
                sess.setEmail(resultSet.getString("t_email"));
                sess.setUsername(resultSet.getString("t_username"));
                sess.setContact(resultSet.getString("t_contact"));
                sess.setType(resultSet.getString("t_type"));
                sess.setStatus(resultSet.getString("t_status"));
                
                return true;
            }else{
                return false;
            }
                   }else{
                return false;
            }
        }catch (SQLException | NoSuchAlgorithmException ex) {
            System.out.println(""+ex);
            return false;
        }

    }



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("VACANCY VISTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("MANAGEMENT SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 320, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("   Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 220, 30));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 220, 30));

        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("Register here.");
        jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("Don't have an account?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 160, 20));

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 320, 380));

        cbox.setText("Show Password");
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });
        jPanel1.add(cbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
   
          
            if ( loginAcc(user.getText() ,pass.getText())) {
                 if(!status.equals("Active")){
                        JOptionPane.showMessageDialog(null,"In-Active Account, Contact Admin!"); 
                 }else{
                          if(type.equals("Admin")){
                                 JOptionPane.showMessageDialog(null,"Login Successfully!");
                                Admin admin = new Admin();
                               admin.setVisible(true);
                               this.dispose(); 
                 }else if(type.equals("User")){
                        JOptionPane.showMessageDialog(null,"Login Successfully!");
                        UserDash user = new UserDash();
                        user.setVisible(true);
                        this.dispose();
                     }else{
                     JOptionPane.showMessageDialog(null,"No Account Type Found, Contact Admin!"); 
                 }
            }
          } else {
                        JOptionPane.showMessageDialog(null,"Login Failed!");
                    }
          
            

    }//GEN-LAST:event_loginActionPerformed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      registrationform registrationform = new registrationform();
      registrationform.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
           if(cbox.isSelected()){
               pass.setEchoChar((char)0);
           }else{
              pass.setEchoChar('*');
           }
    }//GEN-LAST:event_cboxActionPerformed

    private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel7AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7AncestorAdded

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
