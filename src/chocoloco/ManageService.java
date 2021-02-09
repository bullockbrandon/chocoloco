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
public class ManageService extends javax.swing.JFrame {

    /**
     * Creates new form ManageService
     */
    public ManageService() {
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

        add_service = new javax.swing.JButton();
        delete_service = new javax.swing.JButton();
        main_menu = new javax.swing.JButton();
        exit_program = new javax.swing.JButton();
        view_service = new javax.swing.JButton();
        update_service = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add_service.setText("Add Service");
        add_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_serviceActionPerformed(evt);
            }
        });

        delete_service.setText("Delete Service");

        main_menu.setText("Main Menu");
        main_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_menuActionPerformed(evt);
            }
        });

        exit_program.setText("Exit");
        exit_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_programActionPerformed(evt);
            }
        });

        view_service.setText("View Service");
        view_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_serviceActionPerformed(evt);
            }
        });

        update_service.setText("Update Service");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Manage Service");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(main_menu)
                                .addGap(119, 119, 119)
                                .addComponent(exit_program))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delete_service)
                                .addGap(75, 75, 75)
                                .addComponent(view_service))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_service)
                                .addGap(87, 87, 87)
                                .addComponent(update_service))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_service)
                    .addComponent(update_service))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_service)
                    .addComponent(view_service))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(main_menu)
                    .addComponent(exit_program))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_programActionPerformed
        System.out.println("\nProgram Exited\n");
        System.exit(0);
    }//GEN-LAST:event_exit_programActionPerformed

    private void main_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_menuActionPerformed
       this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_main_menuActionPerformed

    private void add_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_serviceActionPerformed
        this.dispose();
        new AddService().setVisible(true);
    }//GEN-LAST:event_add_serviceActionPerformed

    private void view_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_serviceActionPerformed
        this.dispose();
        new ViewService().setVisible(true);
    }//GEN-LAST:event_view_serviceActionPerformed

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
            java.util.logging.Logger.getLogger(ManageService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_service;
    private javax.swing.JButton delete_service;
    private javax.swing.JButton exit_program;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton main_menu;
    private javax.swing.JButton update_service;
    private javax.swing.JButton view_service;
    // End of variables declaration//GEN-END:variables
}
