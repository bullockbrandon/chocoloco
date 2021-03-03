/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocoloco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author bullock.brandon
 */
public class addMember extends javax.swing.JFrame {

    /**
     * Creates new form addMember
     */
    public addMember() {
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

        jLabelmZip = new javax.swing.JLabel();
        system_name = new javax.swing.JLabel();
        memberZip = new javax.swing.JTextField();
        jLabelmID = new javax.swing.JLabel();
        jBtnBack = new javax.swing.JButton();
        memberID = new javax.swing.JTextField();
        addMemberBtn = new javax.swing.JButton();
        jLabelmID1 = new javax.swing.JLabel();
        statusBox = new javax.swing.JComboBox<>();
        jLabelmName = new javax.swing.JLabel();
        memberName = new javax.swing.JTextField();
        jLabelmStreet = new javax.swing.JLabel();
        memberAddress = new javax.swing.JTextField();
        jLabelmState = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        memberCity = new javax.swing.JTextField();
        stateBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelmZip.setText("Zip Code:");
        jLabelmZip.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabelmZip.setMinimumSize(new java.awt.Dimension(60, 70));

        system_name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        system_name.setText("ChocAn Information System");

        jLabelmID.setText("Member ID:");
        jLabelmID.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabelmID.setMinimumSize(new java.awt.Dimension(60, 70));

        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        memberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberIDActionPerformed(evt);
            }
        });

        addMemberBtn.setText("Add Member");
        addMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberBtnActionPerformed(evt);
            }
        });

        jLabelmID1.setText("Status:");
        jLabelmID1.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabelmID1.setMinimumSize(new java.awt.Dimension(60, 70));

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVE", "INACTIVE" }));
        statusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBoxActionPerformed(evt);
            }
        });

        jLabelmName.setText("  Name:");
        jLabelmName.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabelmName.setMinimumSize(new java.awt.Dimension(60, 70));

        memberName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberNameActionPerformed(evt);
            }
        });

        jLabelmStreet.setText("Address:");
        jLabelmStreet.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabelmStreet.setMinimumSize(new java.awt.Dimension(60, 70));

        memberAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberAddressActionPerformed(evt);
            }
        });

        jLabelmState.setText(" State:");
        jLabelmState.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabelmState.setMinimumSize(new java.awt.Dimension(60, 70));

        jLabel1.setText("City:");

        stateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(system_name)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(addMemberBtn)
                        .addGap(45, 45, 45)
                        .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(memberCity, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelmState, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(stateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelmZip, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(memberZip, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelmName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelmID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelmStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(memberID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabelmID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(memberName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(memberAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(system_name)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelmID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelmID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelmName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelmStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelmState, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelmZip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(memberCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBack)
                    .addComponent(addMemberBtn))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        this.dispose();
        new manageMembers().setVisible(true);
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void addMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberBtnActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chocoloco", "brandonbullock", "borderlands");
            
            String addData = "insert into members values (?, ?, ? , ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(addData);
            pstmt.setInt(1, Integer.parseInt(memberID.getText()));
            pstmt.setString(2, memberName.getText());
            pstmt.setString(3, memberAddress.getText());
            pstmt.setString(4, memberCity.getText());
            pstmt.setString(5, stateBox.getSelectedItem().toString());
            pstmt.setInt(6, Integer.parseInt(memberZip.getText()));
            pstmt.setString(7, statusBox.getSelectedItem().toString());
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Member Added");
            conn.close();
            
            memberID.setText("");
            memberName.setText("");
            memberAddress.setText("");
            memberCity.setText("");
            memberZip.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addMemberBtnActionPerformed

    private void memberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberIDActionPerformed

    private void memberAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberAddressActionPerformed

    private void memberNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberNameActionPerformed

    private void statusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusBoxActionPerformed

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
            java.util.logging.Logger.getLogger(addMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberBtn;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelmID;
    private javax.swing.JLabel jLabelmID1;
    private javax.swing.JLabel jLabelmName;
    private javax.swing.JLabel jLabelmState;
    private javax.swing.JLabel jLabelmStreet;
    private javax.swing.JLabel jLabelmZip;
    private javax.swing.JTextField memberAddress;
    private javax.swing.JTextField memberCity;
    private javax.swing.JTextField memberID;
    private javax.swing.JTextField memberName;
    private javax.swing.JTextField memberZip;
    private javax.swing.JComboBox<String> stateBox;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JLabel system_name;
    // End of variables declaration//GEN-END:variables
}
