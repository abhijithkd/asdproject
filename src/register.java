
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhijith KD
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldShopname = new javax.swing.JTextField();
        jTextFieldOwnername = new javax.swing.JTextField();
        jTextFieldLocation = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jPasswordField_REPASS = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddr = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(680, 620));
        setSize(new java.awt.Dimension(710, 620));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Registration");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("-");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 690, 100);

        jLabel1.setText("Shop Name           :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 130, 120, 16);

        jLabel3.setText("Owner Name         :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 170, 120, 16);

        jLabel4.setText("Location                :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 210, 120, 16);

        jLabel5.setText("Address                :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 250, 120, 16);

        jLabel6.setText("e-Mail                   :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 340, 120, 16);

        jLabel8.setText("Enter Password      :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 380, 130, 16);

        jLabel9.setText("Confirm Passwrod  :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 420, 130, 16);

        jTextFieldShopname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldShopnameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldShopname);
        jTextFieldShopname.setBounds(200, 120, 310, 30);

        jTextFieldOwnername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOwnernameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldOwnername);
        jTextFieldOwnername.setBounds(200, 160, 310, 30);
        jPanel1.add(jTextFieldLocation);
        jTextFieldLocation.setBounds(200, 200, 310, 30);

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(200, 330, 310, 30);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 470, 120, 40);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 470, 130, 40);
        jPanel1.add(jPasswordField_PASS);
        jPasswordField_PASS.setBounds(200, 370, 310, 30);

        jPasswordField_REPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_REPASSActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField_REPASS);
        jPasswordField_REPASS.setBounds(200, 410, 310, 30);

        jTextAreaAddr.setColumns(20);
        jTextAreaAddr.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddr);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 240, 310, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 660, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldShopnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldShopnameActionPerformed
                    // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldShopnameActionPerformed

    private void jTextFieldOwnernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOwnernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOwnernameActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String sname = jTextFieldShopname.getText();
        String oname = jTextFieldOwnername.getText();
        String location = jTextFieldLocation.getText();
        String addr = jTextAreaAddr.getText();
        String email = jTextFieldEmail.getText();
        String pass = String.valueOf(jPasswordField_PASS.getPassword());
        String re_pass = String.valueOf(jPasswordField_REPASS.getPassword());
     
                
        if(sname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Shop Name");
        }
        
        else if(oname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the Owner Name");
        }
        else if(location.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the Location");
        }
        else if(addr.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the Address");
        }    
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter your Email");
        }
        
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter a Password");
        }        
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Retype The Password Again");
        }
        
        /*else if(checkUsername(sid))
        {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        */
        else{
            
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        String query = "INSERT INTO `admin`(`ShopName`, `Owner Name`, `Location`, `Address`, `Email`, `Password`) VALUES (?,?,?,?,?,?)";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, sname);
            ps.setString(2, oname);
            ps.setString(3, location);
            ps.setString(4, addr);
            ps.setString(5, email);
            ps.setString(6, pass);
           
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "New User Add");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField_REPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_REPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_REPASSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            jTextFieldShopname.setText(" ");  
            jTextFieldOwnername.setText(" ");
            jTextFieldLocation.setText(" ");
            jTextAreaAddr.setText(" ");
            jTextFieldEmail.setText(" ");
            jPasswordField_PASS.setText(" ");
            jPasswordField_REPASS.setText(" ");

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setState(JFrame.ICONIFIED);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAddr;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLocation;
    private javax.swing.JTextField jTextFieldOwnername;
    private javax.swing.JTextField jTextFieldShopname;
    // End of variables declaration//GEN-END:variables
}
