/*  File:           Chocoloco.java
    Project:        Capstone Project Team #2
    University:     McMurry University
    Course:         COSC-4360 Spring 2021
    Instructor:     Mr. Brozovic
    Programmer:     Team 2
    Created by:     Rich Brozovic
    Created:        1/13/2021
    Updated by:     Rich Brozovic
    Updated:        1/14/2021
    Compiler:       Apache NetBeans IDE for Java SE
    Description:    Brief overview of purpose and contents of file
 */
package chocoloco;

/**
 *
 * @author brozovir
 */
public class Chocoloco extends javax.swing.JFrame {

    /**
     * Creates new form Program_Name
     */
    public Chocoloco() {
        initComponents();
       // setMinimumSize(new Dimension(700,400).getSize());
//setExtendedState(MAXIMIZED_BOTH);/*To see your application starts maximized!*/
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
        coursenum = new javax.swing.JLabel();
        startprogram = new javax.swing.JButton();
        exitprogram = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chocoloco");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        system_name.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        system_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        system_name.setText("ChocAn Information System");

        coursenum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        coursenum.setText("COSC-4360/SPRING");

        startprogram.setText("Start");
        startprogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startprogramActionPerformed(evt);
            }
        });

        exitprogram.setText("Exit");
        exitprogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitprogramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(system_name, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursenum)
                    .addComponent(startprogram)
                    .addComponent(exitprogram))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(system_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(coursenum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(startprogram)
                .addGap(18, 18, 18)
                .addComponent(exitprogram)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitprogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitprogramActionPerformed
        System.out.println("\nProgram Exited\n");
        System.exit(0);
    }//GEN-LAST:event_exitprogramActionPerformed

    private void startprogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startprogramActionPerformed
      //splashscreen goes to SetDirectory before MainMenu
        this.dispose();
        new SetDirectory().setVisible(true);
    }//GEN-LAST:event_startprogramActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

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
            java.util.logging.Logger.getLogger(Chocoloco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chocoloco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chocoloco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chocoloco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new Chocoloco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coursenum;
    private javax.swing.JButton exitprogram;
    private javax.swing.JButton startprogram;
    private javax.swing.JLabel system_name;
    // End of variables declaration//GEN-END:variables
}
