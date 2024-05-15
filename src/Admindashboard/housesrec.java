/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admindashboard;

import Config.DBConnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SSC-COLLEGE
 */
public class housesrec extends javax.swing.JFrame {

    private Connection connect;
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public housesrec() {
        initComponents();
        displayData();
    }

    public void displayData() {
        try {
            DBConnector DBConnector = new DBConnector();
            ResultSet rs = DBConnector.getData("SELECT * FROM houses");
            h_table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Errors: " + ex.getMessage());

        }

    }

    Color navcolor = new Color(255, 204, 255);
    Color hovercolor = new Color(255, 0, 102);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hdate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        hcash = new javax.swing.JComboBox<>();
        hprice = new javax.swing.JTextField();
        p_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        p_edit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hstatus = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        hno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        h_table = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        acc_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Payment Method");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(180, 390, 170, 34);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 370, 121, 30);

        hdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdateActionPerformed(evt);
            }
        });
        jPanel3.add(hdate);
        hdate.setBounds(10, 530, 390, 50);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Due Date");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(30, 490, 190, 34);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Price");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(20, 590, 190, 34);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(jTextField5);
        jTextField5.setBounds(10, 430, 390, 50);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Occupant ID");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(20, 90, 121, 34);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(jTextField6);
        jTextField6.setBounds(10, 130, 390, 50);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Contact Number");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(20, 390, 170, 34);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel4.add(jComboBox2);
        jComboBox2.setBounds(10, 530, 390, 50);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("First Name");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(20, 190, 121, 34);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(jTextField7);
        jTextField7.setBounds(10, 230, 390, 50);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Last Name");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(20, 290, 121, 34);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(jTextField8);
        jTextField8.setBounds(10, 330, 390, 50);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Number of Members");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(20, 490, 190, 34);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 0, 0);

        hcash.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hcash.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash Deposit", "Cash Advance" }));
        jPanel3.add(hcash);
        hcash.setBounds(170, 430, 230, 50);

        hprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpriceActionPerformed(evt);
            }
        });
        jPanel3.add(hprice);
        hprice.setBounds(10, 430, 140, 50);

        p_add.setBackground(new java.awt.Color(255, 204, 255));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD");
        p_add.add(jLabel6);
        jLabel6.setBounds(50, 0, 60, 40);

        jPanel3.add(p_add);
        p_add.setBounds(20, 610, 170, 40);

        p_edit.setBackground(new java.awt.Color(255, 204, 255));
        p_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_editMouseExited(evt);
            }
        });
        p_edit.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EDIT");
        p_edit.add(jLabel7);
        jLabel7.setBounds(40, 0, 79, 40);

        jPanel3.add(p_edit);
        p_edit.setBounds(210, 610, 170, 40);

        delete.setBackground(new java.awt.Color(255, 204, 255));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DELETE");
        delete.add(jLabel2);
        jLabel2.setBounds(40, 0, 90, 40);

        jPanel3.add(delete);
        delete.setBounds(100, 670, 180, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Status");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 290, 170, 34);

        hstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(hstatus);
        hstatus.setBounds(10, 330, 390, 50);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Price");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(30, 390, 130, 34);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("House Number");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(20, 190, 160, 34);

        hno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(hno);
        hno.setBounds(10, 230, 390, 50);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 410, 840));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HOUSES RECORDS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 370, 50));

        h_table.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        h_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        h_table.setGridColor(new java.awt.Color(204, 0, 102));
        h_table.setRowHeight(25);
        h_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(h_table);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 650, 430));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 1110, 690));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 70, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 10));

        acc_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        jPanel1.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 60, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Current User");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-multiple-users-100.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 90));

        jPanel5.setBackground(new java.awt.Color(153, 0, 51));
        jPanel5.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("LANDLORD MANAGEMENT");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(10, 10, 630, 50);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-back-arrow-50.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel25);
        jLabel25.setBounds(1260, 10, 60, 50);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        if (hno.getText().isEmpty() || hstatus.getText().isEmpty()
                || hprice.getText().isEmpty() || hdate.getText().isEmpty()) {

        } else {
            Connection cn = null;
            PreparedStatement save = null;

            try {
                DBConnector dc = new DBConnector();
                cn = dc.getConnection();

                save = cn.prepareStatement("INSERT INTO houses (h_number, h_status, h_price, h_payment, h_date) VALUES (?, ?, ?, ?, ?)");
                save.setString(1, hno.getText());
                save.setString(2, hstatus.getText());
                save.setString(3, hprice.getText());
                save.setString(4, hcash.getSelectedItem().toString());
                save.setString(5, hdate.getText());

                int row = save.executeUpdate();

                if (row > 0) {
                    JOptionPane.showMessageDialog(this, "Record Added!");
                    displayData();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add record!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            } finally {
                try {
                    if (save != null) {
                        save.close();
                    }
                    if (cn != null) {
                        cn.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("error" + ex.getMessage());
                }
            }
        }

    }//GEN-LAST:event_p_addMouseClicked

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseClicked
        int rowIndex = h_table.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                DBConnector dbConnector = new DBConnector();
                connection = dbConnector.getConnection();

                TableModel tbl = h_table.getModel();
                String selectedId = tbl.getValueAt(rowIndex, 0).toString();

                String updateQuery = "UPDATE houses SET h_number = ?, h_status = ?, h_price = ?, h_payment = ?, h_date = ? WHERE h_id = ?";
                preparedStatement = connection.prepareStatement(updateQuery);

                preparedStatement.setString(1, hno.getText());
                preparedStatement.setString(2, hstatus.getText());
                preparedStatement.setString(3, hprice.getText());
                preparedStatement.setString(4, hcash.getSelectedItem().toString());
                preparedStatement.setString(5, hdate.getText());
                preparedStatement.setString(6, selectedId);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Record updated successfully!");
                    displayData();
                } else {
                    JOptionPane.showMessageDialog(null, "No data found for the selected item.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error updating data: " + ex.getMessage());
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error updating data: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_p_editMouseClicked

    private void p_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseEntered
        p_edit.setBackground(hovercolor);
    }//GEN-LAST:event_p_editMouseEntered

    private void p_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseExited
        p_edit.setBackground(navcolor);
    }//GEN-LAST:event_p_editMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = h_table.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                DBConnector DBConnector = new DBConnector();
                TableModel tbl = h_table.getModel();
                String t_id = tbl.getValueAt(rowIndex, 0).toString();
                String sql = "DELETE FROM houses WHERE h_id = '" + t_id + "'";
                int affectedRows = DBConnector.updateData(sql);
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully!");
                    displayData();
                } else {
                    JOptionPane.showMessageDialog(null, "Record deletion failed!");
                }
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(hovercolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void h_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_tableMouseClicked
        int rowIndex = h_table.getSelectedRow();
        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            TableModel model = h_table.getModel();

            String hnoValue = model.getValueAt(rowIndex, 0).toString();
            String hstatusValue = model.getValueAt(rowIndex, 1).toString();
            String hpriceValue = model.getValueAt(rowIndex, 2).toString();
            String hdateValue = model.getValueAt(rowIndex, 3).toString();
            String hcashValue = model.getValueAt(rowIndex, 4).toString();

            hno.setText(hnoValue);
            hstatus.setText(hstatusValue);
            hprice.setText(hpriceValue);
            hcash.setSelectedItem(hcashValue);
            hdate.setText(hdateValue);
        }
    }//GEN-LAST:event_h_tableMouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        Admin Admin = new Admin();
        Admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void hdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hdateActionPerformed

    private void hpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpriceActionPerformed

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
            java.util.logging.Logger.getLogger(housesrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(housesrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(housesrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(housesrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new housesrec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JPanel delete;
    private javax.swing.JTable h_table;
    private javax.swing.JComboBox<String> hcash;
    private javax.swing.JTextField hdate;
    private javax.swing.JTextField hno;
    private javax.swing.JTextField hprice;
    private javax.swing.JTextField hstatus;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_edit;
    // End of variables declaration//GEN-END:variables
}
