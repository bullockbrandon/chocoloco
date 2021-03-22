/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocoloco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author bullock.brandon
 */
public class confirmDelete extends javax.swing.JFrame {

    /**
     * Creates new form confirmDelete
     */
    public confirmDelete() {
        initComponents();
    }
    public confirmDelete(String a) {
        initComponents();
        
        memberIDBox.setText(a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        system_name = new javax.swing.JLabel();
        jBtnconDelete = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jLabelConfirm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        memberIDBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        system_name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        system_name.setText("ChocAn Information System");

        jBtnconDelete.setText("Confirm Delete");
        jBtnconDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnconDeleteActionPerformed(evt);
            }
        });

        jBtnCancel.setText("Cancel");
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        jLabelConfirm.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Member ID: ");

        memberIDBox.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jBtnconDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(system_name))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(memberIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(system_name)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(memberIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnconDelete)
                    .addComponent(jBtnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnconDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnconDeleteActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chocoloco", "choco", "loco");
            
            String deleteData = "delete from members where memberID = ?";
            PreparedStatement pstmt = conn.prepareStatement(deleteData);
            pstmt.setInt(1, Integer.parseInt(memberIDBox.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Member Deleted");
            conn.close();
            
            new manageMembers().setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jBtnconDeleteActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chocoloco", "choco", "loco");
            
            String getData = "select * from members where memberID = ?";
            PreparedStatement pstmt = conn.prepareStatement(getData);
            pstmt.setInt(1, Integer.parseInt(memberIDBox.getText()));
            
            ResultSet rs = pstmt.executeQuery();   
            if (rs.next()){
                String memberID = rs.getString("memberID");
                String memberName = rs.getString("memberName");
                String memberAddress = rs.getString("memberAddress");
                String memberCity = rs.getString("memberCity");
                String memberState = rs.getString ("memberState");
                String memberZip = rs.getString("memberZip");
                String memberStatus = rs.getString("memberStatus");
                
                new viewMembers(memberID, memberName, memberAddress, memberCity, memberState, memberZip, memberStatus).setVisible(true);
                this.dispose();
                
            } else JOptionPane.showMessageDialog(null, "Member not found!");
            
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jBtnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(confirmDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confirmDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnconDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConfirm;
    private javax.swing.JTextField memberIDBox;
    private javax.swing.JLabel system_name;
    // End of variables declaration//GEN-END:variables
}
