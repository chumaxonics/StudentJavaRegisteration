/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chumaxonics;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableColumnModel;
import java.sql.ResultSet; //check it 
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
 
/**
 *
 * @author Chumaxonics
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        tableDetails();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtstudentnumber = new javax.swing.JTextField();
        txtnationality = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Student Registration");

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registeration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 12), new java.awt.Color(204, 204, 255))); // NOI18N

        jLabel2.setText("Student Name:");

        jLabel3.setText("Mobile:");

        jLabel4.setText("Course:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 0, 204));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 0, 204));
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 0, 204));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("StudentNo:");

        jLabel6.setText("Nationality:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnationality, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmobile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcourse, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstudentnumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtstudentnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "mobile", "course", "studentNum", "Nationality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
        Connection conn;
        PreparedStatement insert, update,ChangeData;

       private void tableDetails(){
           
         int cout; 
         
         try {
             
            Class.forName("java.sql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/chumaxonics","root","");
            
            update =conn.prepareStatement("select*from record");
            ResultSet results =update.executeQuery();
            ResultSetMetaData Rss =results.getMetaData();
         /*getMetadata*/   
         
         cout =Rss.getColumnCount();
         
             DefaultTableModel Dfobject =(DefaultTableModel)jTable1.getModel();
             Dfobject.setRowCount(0);
             
             while (results.next()) {
                 
                 Vector vector_one = new Vector();
                 
                 for (int i = 0; i < cout; i++) {   
                     vector_one.add(results.getString("id"));
                     vector_one.add(results.getString("name"));
                     vector_one.add(results.getString("mobile"));
                     vector_one.add(results.getString("course"));
                     vector_one.add(results.getString("studentnumber"));
                     vector_one.add(results.getString("nationality"));
                 }
                 Dfobject.addRow(vector_one);
             }
             
         } catch (ClassNotFoundException | SQLException ex) {
            
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       } 
        

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
DefaultTableModel Dfobject =(DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        
         try {         
             
        int databaseId = Integer.parseInt(Dfobject.getValueAt(selectedIndex, 0).toString());
        
        int checkdelete = JOptionPane.showConfirmDialog(null,"Do you want to delete the data ?","warning",JOptionPane.YES_NO_OPTION);
        
             if (checkdelete==JOptionPane.YES_OPTION) {
                 
            Class.forName("java.sql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/chumaxonics","root","");     

            ChangeData =conn.prepareStatement("delete from record where id=?");
            
            ChangeData.setInt(1, databaseId); // the initialized Idfrom Database
            
            //execute the query below .. 
            ChangeData.executeUpdate();
            
            // if the data is added, we need to know
            JOptionPane.showMessageDialog(this, "The information was deleted successfully");
            tableDetails();// Calling the method after adding information into the Database 
            
            //after adding the information, set text to empty on the inputs _ GUI
            txtname.setText("");
            txtmobile.setText("");
            txtcourse.setText("");
            txtstudentnumber.setText("");
            txtnationality.setText("");
             } else {
             
              JOptionPane.showMessageDialog(this, " You decided not to delete information");
             
             }

        } catch (ClassNotFoundException | SQLException ex) {
            
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // This is our add button, when the user press it, data should be added successfully. . 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // The variables are declared to catch information entered by the user in our GUI
        String name = txtname.getText();
        String mobile= txtmobile.getText();
        String course =txtcourse.getText();
        String studentnumber =txtstudentnumber.getText();
        String nationality =txtnationality.getText();
        
//------------------------------------use if statement for data validation-----------------------------------------------------------
        if ( !(name.isEmpty()) || !(mobile.isEmpty()) ||!(course.isEmpty())||!(studentnumber.isEmpty())||!(nationality.isEmpty())) {
            
            
            
        } else {
            
            
        }
        
        
        
        try {
            
            Class.forName("java.sql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/chumaxonics","root","");
            

            insert =conn.prepareStatement("insert into record(name,mobile,course,studentnumber,nationality)values(?,?,?,?,?)");
            
         
            //we have to use the index to pass the values into our desired position*variables
            insert.setString(1, name);
            insert.setString(2, mobile);
            insert.setString(3, course);
            insert.setString(4, studentnumber);
            insert.setString(5, nationality);
            //execute the query below .. 
            insert.executeUpdate();
            
            // if the data is added, we need to know
            JOptionPane.showMessageDialog(this, "The information was added successfully");
            tableDetails();// Calling the method after adding information into the Database 
            
            //after adding the information, set text to empty on the inputs _ GUI
            txtname.setText("");
            txtmobile.setText("");
            txtcourse.setText("");
            txtstudentnumber.setText("");
            txtnationality.setText("");
      
        } catch (ClassNotFoundException | SQLException ex) {
            
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        //-----------------------------------------------------------------------------------------------

       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
//new method required for editing the data selected on the GUI
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel Dfobject =(DefaultTableModel)jTable1.getModel();
        
            int selectedIndex = jTable1.getSelectedRow();
  
            txtname.setText( Dfobject.getValueAt(selectedIndex,1).toString());
            txtmobile.setText( Dfobject.getValueAt(selectedIndex,2).toString());
            txtcourse.setText( Dfobject.getValueAt(selectedIndex,3).toString());
            txtstudentnumber.setText( Dfobject.getValueAt(selectedIndex,4).toString());
            txtnationality.setText( Dfobject.getValueAt(selectedIndex,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    
    // Edit button fiunctionality coded here.. . 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Dfobject =(DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        
         try {         
             
        int databaseId = Integer.parseInt(Dfobject.getValueAt(selectedIndex, 0).toString());
             
        String name = txtname.getText();
        String mobile= txtmobile.getText();
        String course =txtcourse.getText();
        String studentnumber =txtstudentnumber.getText();
        String nationality =txtnationality.getText();
            
            Class.forName("java.sql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/chumaxonics","root","");     

            ChangeData =conn.prepareStatement("update record set name=?,mobile=?,course=?,studentnumber=?,nationality=? where id=?");
            
         
            //we have to use the index to pass the values into our desired position*variables
            ChangeData.setString(1, name);
            ChangeData.setString(2, mobile);
            ChangeData.setString(3, course);
            ChangeData.setString(4, studentnumber);
            ChangeData.setString(5, nationality);
            ChangeData.setInt(6, databaseId); // the initialized Idfrom Database
            //execute the query below .. 
            ChangeData.executeUpdate();
            
            // if the data is added, we need to know
            JOptionPane.showMessageDialog(this, "The information was updated successfully");
            tableDetails();// Calling the method after adding information into the Database 
            
            //after adding the information, set text to empty on the inputs _ GUI
            txtname.setText("");
            txtmobile.setText("");
            txtcourse.setText("");
            txtstudentnumber.setText("");
            txtnationality.setText("");
      
        } catch (ClassNotFoundException | SQLException ex) {
            
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnationality;
    private javax.swing.JTextField txtstudentnumber;
    // End of variables declaration//GEN-END:variables
}
