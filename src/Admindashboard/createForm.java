/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admindashboard;

import Config.DBConnector;
import Config.passwordHasher;
import Login.login;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author SSC-COLLEGE
 */
public class createForm extends javax.swing.JFrame {

    /**
     * Creates new form createForn
     */
    public createForm() {
        initComponents();
    }
    
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userImages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
   }
    
      public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }

     public static String em, usname;
          
          public boolean duplicateCheck(){
 
              DBConnector DBConnector = new DBConnector();
        try{
        String query = "SELECT * FROM rent WHERE t_username = '" + username.getText()+ "' OR t_email = '" + email.getText()+ "'";

        ResultSet resultSet = DBConnector .getData(query);
 
        if(resultSet.next()){
        em= resultSet.getString("t_email"); 
           if(em.equals(email.getText())){
                JOptionPane.showMessageDialog(null, "Email Already Exist!"); 
                 email.setText("");
                 }
        usname = resultSet.getString("t_username");
          if(usname.equals(username.getText())){
                JOptionPane.showMessageDialog(null, "Username Already Exist!"); 
                username.setText("");
            }
        return true;

        }else{
        return false;
        }
        }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
         }
         }
          
           public boolean updateCheck(){
 
              DBConnector DBConnector = new DBConnector();
        try{
      String query = "SELECT * FROM rent WHERE (t_username = '" + username.getText() + "' OR t_email = '" + email.getText() + "') AND t_id != '" + t_id.getText() + "'";


        ResultSet resultSet = DBConnector .getData(query);
 
        if(resultSet.next()){
        em= resultSet.getString("t_email"); 
           if(em.equals(email.getText())){
                JOptionPane.showMessageDialog(null, "Email Already Exist!"); 
                 email.setText("");
                 }
        usname = resultSet.getString("t_username");
          if(usname.equals(username.getText())){
                JOptionPane.showMessageDialog(null, "Username Already Exist!"); 
                username.setText("");
            }
        return true;

        }else{
        return false;
        }
        }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
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

        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pass1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        fn1 = new javax.swing.JTextField();
        ln1 = new javax.swing.JTextField();
        contact1 = new javax.swing.JTextField();
        asd1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        username1 = new javax.swing.JTextField();
        us1 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        asd = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        us = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("First Name:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Last Name:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Email:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("User Status:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 110, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Username:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 27));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Contact:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 27));

        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        jPanel3.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 290, 30));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setText("   RGISTRATION FORM");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(73, 22, 302, 29);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("User ID:");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(30, 90, 57, 30);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("First Name:");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(30, 130, 79, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Last Name:");
        jPanel4.add(jLabel29);
        jLabel29.setBounds(90, 260, 78, 17);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Email:");
        jPanel4.add(jLabel30);
        jLabel30.setBounds(40, 290, 41, 17);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Account Type:");
        jPanel4.add(jLabel31);
        jLabel31.setBounds(10, 420, 110, 30);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Username:");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(220, 310, 74, 27);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Password:");
        jPanel4.add(jLabel33);
        jLabel33.setBounds(60, 370, 72, 27);
        jPanel4.add(jTextField3);
        jTextField3.setBounds(120, 90, 170, 30);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jPanel3.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 290, 30));
        jPanel3.add(ln1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 290, 30));

        contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact1ActionPerformed(evt);
            }
        });
        jPanel3.add(contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 290, 30));

        asd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        asd1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        asd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asd1ActionPerformed(evt);
            }
        });
        jPanel3.add(asd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 120, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 90, 30));
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Password:");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 27));
        jPanel3.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 290, 30));
        jPanel3.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 290, 30));

        us1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        us1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        us1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                us1ActionPerformed(evt);
            }
        });
        jPanel3.add(us1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 120, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Account Type:");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PINK.png"))); // NOI18N
        jLabel1.setText("CREATE FORM");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Status:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 30));

        ps.setEnabled(false);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 290, 30));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("   RGISTRATION FORM");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(73, 22, 302, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("User ID:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 90, 57, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("First Name:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 130, 79, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Last Name:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(90, 260, 78, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Email:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 290, 41, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Account Type:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 420, 110, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Username:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(220, 310, 74, 27);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Password:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(60, 370, 72, 27);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(120, 90, 170, 30);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 290, 30));
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 290, 30));

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 290, 30));

        asd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        asd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        asd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asdActionPerformed(evt);
            }
        });
        jPanel1.add(asd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 120, 30));

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 90, 30));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel18.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Password:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 290, 30));

        us.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 120, 30));

        jLabel19.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Account Type:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, 30));

        jLabel37.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("First Name:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        t_id.setEnabled(false);
        jPanel1.add(t_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 290, 30));

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 110, 30));

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 110, 30));

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 110, 30));

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 110, 30));

        refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 120, 30));

        jLabel39.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("CREATE FORM");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 350, 50));

        jPanel5.setLayout(null);
        jPanel5.add(image);
        image.setBounds(10, 10, 240, 190);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 260, 210));

        select.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 120, 30));

        remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 360, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PINK.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact1ActionPerformed

    private void asd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asd1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void us1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_us1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_us1ActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(false);
        select.setEnabled(true);
        image.setIcon(null);
        destination = "";
        path = "";
        
        
    }//GEN-LAST:event_removeActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        UserForm UserForm = new UserForm();
        UserForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || email.getText().isEmpty()
            || username.getText().isEmpty() || ps.getText().isEmpty() ||  contact.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(null, "All fields are required!");

        }else if(ps.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above");
            ps.setText("");

        }else if(updateCheck()){
            System.out.println("Duplicate Exist!");
        }else{
            DBConnector DBConnector = new DBConnector ();

            DBConnector.updateData ("UPDATE rent SET t_fn = '" + fn.getText() + "', t_ln = '" + ln.getText() + "', " +
                "t_email = '" + email.getText() + "', t_username = '" + username.getText() + "', " +
                "t_pass = '" + ps.getText() + "', t_contact = '" + contact.getText() + "', " +
                "t_type = '" + asd.getSelectedItem() + "', t_status = '" + us.getSelectedItem() + "', t_image = '"+destination+"' WHERE t_id = '" + t_id.getText()+ "' ");
            
            if(destination.isEmpty()){
                File existingFile = new File(oldpath);
                if(existingFile.exists()){
                    existingFile.delete();
                }
            }else{
                if(!(oldpath.equals(path))){
                    imageUpdater(oldpath,path);
                }
            }
            
            
            setVisible(false);
            UserForm UserForm = new UserForm();
            UserForm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || email.getText().isEmpty()
            || username.getText().isEmpty() || ps.getText().isEmpty() ||  contact.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(null, "All fields are required!");

        }else if(ps.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password should be 8 character above");
            ps.setText("");

        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
        }else {
            DBConnector DBConnector = new DBConnector();

            try{
                String pass = passwordHasher.hashPassword(ps.getText());

                if(DBConnector.insertData("INSERT INTO rent (t_fn, t_ln, t_email, t_username, t_pass, t_contact, t_type, t_status, t_image) VALUES"
                    + " ('" + fn.getText() + "', '" + ln.getText() + "', '" + email.getText() + "', '" + username.getText() + "', '" + pass + "', '" + contact.getText() + "', '" + asd.getSelectedItem() + "','"+us.getSelectedItem()+"','"+destination+"')"))
            {
                try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);    
                JOptionPane.showMessageDialog(null,"Added Successfully!");
                setVisible(false);
                UserForm UserForm = new UserForm();
                UserForm.setVisible(true);
                this.dispose();
                }catch(IOException ex){
                    System.out.println("Insert Image Error:"+ex);
                }

            }else{

                JOptionPane.showMessageDialog(null,"Connection Error!");
            }
        } catch(NoSuchAlgorithmException ex) {
            System.out.println(""+ex);
        }
        }
    }//GEN-LAST:event_addActionPerformed

    private void asdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asdActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
       JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userImages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!"); 
                    }
                }

    }//GEN-LAST:event_selectActionPerformed

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
            java.util.logging.Logger.getLogger(createForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JComboBox<String> asd;
    private javax.swing.JComboBox<String> asd1;
    public javax.swing.JButton cancel;
    public javax.swing.JButton clear;
    public javax.swing.JTextField contact;
    private javax.swing.JTextField contact1;
    public javax.swing.JButton delete;
    public javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    public javax.swing.JTextField fn;
    private javax.swing.JTextField fn1;
    public javax.swing.JLabel image;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JTextField ln;
    private javax.swing.JTextField ln1;
    private javax.swing.JTextField pass1;
    public javax.swing.JTextField ps;
    public javax.swing.JButton refresh;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    public javax.swing.JTextField t_id;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> us;
    private javax.swing.JComboBox<String> us1;
    public javax.swing.JTextField username;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
}
