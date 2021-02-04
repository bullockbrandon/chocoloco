/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocoloco;

/**
 *
 * @author bullock.brandon
 */
public class manageMembers extends javax.swing.JFrame {

    /**
     * Creates new form manageMembers
     */
    public manageMembers() {
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
        jBtnMainMenu = new javax.swing.JButton();
        jBtnAddMember = new javax.swing.JButton();
        jBtnDeleteMember = new javax.swing.JButton();
        jBtnSearchMember = new javax.swing.JButton();
        jBtnUpdateMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Members");

        system_name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        system_name.setText("ChocAn Information System");

        jBtnMainMenu.setText("Main Menu");
        jBtnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMainMenuActionPerformed(evt);
            }
        });

        jBtnAddMember.setText("Add Member");
        jBtnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddMemberActionPerformed(evt);
            }
        });

        jBtnDeleteMember.setText("Delete Member");
        jBtnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteMemberActionPerformed(evt);
            }
        });

        jBtnSearchMember.setText("Search Member");
        jBtnSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchMemberActionPerformed(evt);
            }
        });

        jBtnUpdateMember.setText("Update Member");
        jBtnUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(system_name))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jBtnMainMenu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnAddMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnSearchMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnUpdateMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(system_name)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAddMember)
                    .addComponent(jBtnUpdateMember))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDeleteMember)
                    .addComponent(jBtnSearchMember))
                .addGap(28, 28, 28)
                .addComponent(jBtnMainMenu)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMainMenuActionPerformed
        this.dispose();
        //new MainMenu().setVisible(true);
    }//GEN-LAST:event_jBtnMainMenuActionPerformed

    private void jBtnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddMemberActionPerformed
        this.dispose();
        //new Add_mbr().setVisible(true);
    }//GEN-LAST:event_jBtnAddMemberActionPerformed

    private void jBtnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteMemberActionPerformed
        this.dispose();
        new searchMembers().setVisible(true);
    }//GEN-LAST:event_jBtnDeleteMemberActionPerformed

    private void jBtnSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchMemberActionPerformed
        this.dispose();
        new searchMembers().setVisible(true);
    }//GEN-LAST:event_jBtnSearchMemberActionPerformed

    private void jBtnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateMemberActionPerformed
        this.dispose();
        new searchMembers().setVisible(true);
    }//GEN-LAST:event_jBtnUpdateMemberActionPerformed

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
            java.util.logging.Logger.getLogger(manageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddMember;
    private javax.swing.JButton jBtnDeleteMember;
    private javax.swing.JButton jBtnMainMenu;
    private javax.swing.JButton jBtnSearchMember;
    private javax.swing.JButton jBtnUpdateMember;
    private javax.swing.JLabel system_name;
    // End of variables declaration//GEN-END:variables
}
