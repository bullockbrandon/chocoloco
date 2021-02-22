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
        studentname_Abe = new javax.swing.JLabel();
        studentname_Brandon = new javax.swing.JLabel();
        studentname_Sam = new javax.swing.JLabel();
        studentname_Jen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chocoloco");

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

        studentname_Abe.setText("Abe Salazar");

        studentname_Brandon.setText("Brandon Bullock");

        studentname_Sam.setText("Samuel O'Rear");

        studentname_Jen.setText("Jennifer Quintanilla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(system_name, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursenum)
                    .addComponent(studentname_Abe)
                    .addComponent(studentname_Brandon)
                    .addComponent(studentname_Sam)
                    .addComponent(startprogram)
                    .addComponent(studentname_Jen)
                    .addComponent(exitprogram))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(system_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coursenum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentname_Abe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentname_Brandon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentname_Sam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentname_Jen)
                .addGap(52, 52, 52)
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
       this.dispose();
        new SetDirectory().setVisible(true);
    }//GEN-LAST:event_startprogramActionPerformed

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
    private javax.swing.JLabel studentname_Abe;
    private javax.swing.JLabel studentname_Brandon;
    private javax.swing.JLabel studentname_Jen;
    private javax.swing.JLabel studentname_Sam;
    private javax.swing.JLabel system_name;
    // End of variables declaration//GEN-END:variables
}
