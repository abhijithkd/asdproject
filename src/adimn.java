
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhijith KD
 */

public class adimn extends javax.swing.JFrame {

     
        String s;
        /**t
     * Creates new .form adimn
     * @param u
     */
    public adimn() {

        initComponents();
    }
    public adimn(String usrname,String sid)
    {
            initComponents();
            s=sid;
            table();
            //System.out.println(sid);
            jLabel1.setText(usrname);
            jLabel5.setText(sid);
            //shid = sid;
    }
    public void table()
    {
        
        
         try {
        Connection con=MyConnection.getConnection();
        PreparedStatement ps; 
            ps = con.prepareStatement("select M_id,M_Name,Disease,Price,Stock from medicines where Shopid='"+s+"' ");

            ResultSet rs=ps.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            while(rs.next())
            {
                   Object o[]={rs.getInt("M_id"),rs.getString("M_Name"),rs.getString("Disease"),rs.getInt("Stock"),rs.getInt("Price")};
                   tm.addRow(o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(adimn.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldDisease = new javax.swing.JTextField();
        jTextFieldM_id = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldM_name = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Welcome");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Logout");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 722, 42);

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine id", "Medicine Name", "Disease", "Stock", "Pricel"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(27, 86, 650, 353);

        jTextFieldDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiseaseActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDisease);
        jTextFieldDisease.setBounds(300, 460, 120, 40);

        jTextFieldM_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldM_idActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldM_id);
        jTextFieldM_id.setBounds(29, 462, 120, 40);

        jTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPrice);
        jTextFieldPrice.setBounds(580, 460, 100, 40);
        jPanel1.add(jTextFieldM_name);
        jTextFieldM_name.setBounds(160, 460, 120, 40);

        jTextFieldStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStockActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldStock);
        jTextFieldStock.setBounds(430, 460, 130, 40);

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 51));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate);
        jButtonUpdate.setBounds(300, 530, 100, 40);

        jButtonDelete.setBackground(new java.awt.Color(255, 0, 51));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete);
        jButtonDelete.setBounds(440, 530, 100, 40);

        jButtonInsert.setBackground(new java.awt.Color(0, 255, 0));
        jButtonInsert.setText("Insert");
        jButtonInsert.setActionCommand("jButtonInsert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonInsert);
        jButtonInsert.setBounds(140, 530, 100, 40);

        jLabel4.setText("Shop ID :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 60, 54, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 60, 20, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceActionPerformed

    private void jTextFieldStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStockActionPerformed

    private void jTextFieldM_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldM_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldM_idActionPerformed

    private void jTextFieldDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiseaseActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            this.setVisible(false);
            new homepage().setVisible(true);       // TODO add yonew adimn(uname).setVisible(true);ur handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
                  
        
        String mname = jTextFieldM_name.getText();
        String dis = jTextFieldDisease.getText();
        String stk = jTextFieldStock.getText();
        String prc = jTextFieldPrice.getText();
        String shid = jLabel5.getText();
     
                
 
            
        MyConnection databaseConnection = new MyConnection();
        Connection con=databaseConnection.getConnection();
        PreparedStatement ps;
        String query = "INSERT INTO `medicines`(`M_Name`, `Disease`, `Stock`, `Price`,`Shopid`) VALUES (?,?,?,?,?)";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            //ps.setString(1, mid);
            ps.setString(1, mname);
            ps.setString(2, dis);
            ps.setString(3, stk);
            ps.setString(4, prc);
            ps.setString(5,shid);
           
            
            if(ps.executeUpdate() > 0)
            {   //table();
                JOptionPane.showMessageDialog(null, "Medicine Entered");
            }
            
        } catch (SQLException ex) {
            
            Logger.getLogger(adimn.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Medicine not Entered");
        }
        table();
                      
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
                String mid = jTextFieldM_id.getText();
                String stk = jTextFieldStock.getText();
                
                MyConnection databaseConnection = new MyConnection();
                Connection con=databaseConnection.getConnection();
                PreparedStatement ps;
                String query = "UPDATE medicines SET Stock='"+stk+"' where M_id='"+mid+"'";
           try {
            ps = MyConnection.getConnection().prepareStatement(query);
            //ps.setString(1, mid);
            //ps.setString(2, stk);
            
            if(ps.executeUpdate() > 0)
            {   
                JOptionPane.showMessageDialog(null, "Stock Updated");
            }
            
        } catch (SQLException ex) {
            
            Logger.getLogger(adimn.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Stock not Updated");
        }     
          table();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
                  
        
        String mid = jTextFieldM_id.getText();
            
        MyConnection databaseConnection = new MyConnection();
        Connection con=databaseConnection.getConnection();
        PreparedStatement ps;
        String query = "DELETE from medicines where M_id='"+mid+"'";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            //ps.setString(1, mid);
            //ps.setString(2,shid);
           
           
            
            if(ps.executeUpdate() > 0)
            {   //table();
                JOptionPane.showMessageDialog(null, "Medicine Deleted");
            }
            
        } catch (SQLException ex) {
            
            Logger.getLogger(adimn.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Medicine not Deleted");
        }
        table();                    
    }//GEN-LAST:event_jButtonDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(adimn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adimn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adimn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adimn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adimn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDisease;
    private javax.swing.JTextField jTextFieldM_id;
    private javax.swing.JTextField jTextFieldM_name;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldStock;
    // End of variables declaration//GEN-END:variables
}
