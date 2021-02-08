/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocoloco;

/**
 *
 * @author ispre
 */
public class SetDirectory extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SetDirectory() {
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
        currentdate = new javax.swing.JLabel();
        currentdirectory = new javax.swing.JLabel();
        tomainmenu = new javax.swing.JButton();
        exitprogram = new javax.swing.JButton();
        changedate = new javax.swing.JButton();
        changedirectory = new javax.swing.JButton();
        entered_date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        system_name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        system_name.setText("ChocAn Information System");

        currentdate.setText("Current Date:");

        currentdirectory.setText("Current Directory:");

        tomainmenu.setText("Main Menu");
        tomainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomainmenuActionPerformed(evt);
            }
        });

        exitprogram.setText("Exit");
        exitprogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitprogramActionPerformed(evt);
            }
        });

        changedate.setText("Change Date");
        changedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changedateActionPerformed(evt);
            }
        });

        changedirectory.setText("Change Directory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(system_name)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tomainmenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                                .addComponent(exitprogram))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(currentdate)
                                .addGap(7, 7, 7)
                                .addComponent(entered_date, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(changedate)
                                .addGap(33, 33, 33)))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentdirectory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changedirectory)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(system_name)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changedate)
                    .addComponent(entered_date, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentdate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(changedirectory)
                    .addComponent(currentdirectory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomainmenu)
                    .addComponent(exitprogram))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitprogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitprogramActionPerformed
        System.out.println("\nProgram Exited\n");
        System.exit(0);
    }//GEN-LAST:event_exitprogramActionPerformed

    private void tomainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomainmenuActionPerformed
       new MainMenu().setVisible(true);
    }//GEN-LAST:event_tomainmenuActionPerformed

    private void changedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changedateActionPerformed
        date_dialog changedate = new date_dialog(this, true);
        changedate.setTitle("Test");
        changedate.setVisible(true);
        System.out.printf("\nVariable directory_date = '%s'\n", directory_date);
        System.out.println("test returned" + changedate.getReturnStatus());
    }//GEN-LAST:event_changedateActionPerformed

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
            java.util.logging.Logger.getLogger(SetDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetDirectory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changedate;
    private javax.swing.JButton changedirectory;
    private javax.swing.JLabel currentdate;
    private javax.swing.JLabel currentdirectory;
    private javax.swing.JLabel entered_date;
    private javax.swing.JButton exitprogram;
    private javax.swing.JLabel system_name;
    private javax.swing.JButton tomainmenu;
    // End of variables declaration//GEN-END:variables

    public static String directory_date = null; //global variable for use by app
}
