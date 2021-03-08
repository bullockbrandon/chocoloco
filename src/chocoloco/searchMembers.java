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
public class searchMembers extends javax.swing.JFrame {

    /**
     * Creates new form searchMembers
     */
    public searchMembers() {
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

        system_name = new javax.swing.JLabel();
        jBtnBack = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        system_name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        system_name.setText("ChocAn Information System");

        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Member ID:");
        jLabel1.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel1.setMinimumSize(new java.awt.Dimension(60, 70));

        jBtnSearch.setText("Search");
        jBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(system_name)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(system_name)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBack)
                    .addComponent(jBtnSearch))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        this.dispose();
        new manageMembers().setVisible(true);
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void jBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chocoloco", "root", "");
            
            String getData = "select * from members where memberID = ?";
            PreparedStatement pstmt = conn.prepareStatement(getData);
            pstmt.setInt(1, Integer.parseInt(searchBox.getText()));
            
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
    }//GEN-LAST:event_jBtnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(searchMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JLabel system_name;
    // End of variables declaration//GEN-END:variables
}
