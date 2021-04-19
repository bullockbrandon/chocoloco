/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocoloco;

import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JFileChooser;

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
        directory_datePicker = new com.github.lgooddatepicker.components.DatePicker();
        entered_date = new javax.swing.JLabel();
        choose_folder = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        system_name.setText("ChocAn Information System");
        system_name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

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
        changedirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changedirectoryActionPerformed(evt);
            }
        });

        choose_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_folderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(system_name)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tomainmenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitprogram))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(currentdate)
                                .addGap(9, 9, 9)
                                .addComponent(entered_date, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(directory_datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(changedate)
                                .addGap(33, 33, 33))
                            .addComponent(choose_folder, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentdirectory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changedirectory)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(system_name)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changedate)
                        .addComponent(directory_datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(currentdate)
                        .addComponent(entered_date, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changedirectory)
                    .addComponent(currentdirectory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choose_folder, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.dispose();
        new AreYouSure().setVisible(true);
    }//GEN-LAST:event_tomainmenuActionPerformed

    private void changedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changedateActionPerformed
        //DatePicker current_date;
        current_date = directory_datePicker;
        DatePicker entered_date;
        entered_date = current_date;
        System.out.println("\n current_date" +current_date);
    }//GEN-LAST:event_changedateActionPerformed

    private void changedirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changedirectoryActionPerformed
                    //  this.dispose();
        choose_folder = new JFileChooser();
                   choose_folder.setCurrentDirectory(new java.io.File("."));
    //choose_folder.setDialogTitle(choose_folder);
    choose_folder.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    choose_folder.setAcceptAllFileFilterUsed(false);
    
       if (choose_folder.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
           current_directory = choose_folder;
        JFileChooser test_directory;
        test_directory = current_directory;
              System.out.println("getCurrentDirectory(): " 
         +  choose_folder.getCurrentDirectory());
              current_file = choose_folder;
              JFileChooser test_folder;
              test_folder = current_file;
      System.out.println("getSelectedFile() : " 
         +  choose_folder.getSelectedFile());
       }
       else{
           System.out.println("No Selection ");
       }
    }//GEN-LAST:event_changedirectoryActionPerformed

    private void choose_folderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_folderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_choose_folderActionPerformed

    
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
    private javax.swing.JFileChooser choose_folder;
    private javax.swing.JLabel currentdate;
    private javax.swing.JLabel currentdirectory;
    private com.github.lgooddatepicker.components.DatePicker directory_datePicker;
    private javax.swing.JLabel entered_date;
    private javax.swing.JButton exitprogram;
    private javax.swing.JLabel system_name;
    private javax.swing.JButton tomainmenu;
    // End of variables declaration//GEN-END:variables

    public static DatePicker current_date = null; //global variable for use by app
    public static JFileChooser current_directory = null;
    public static JFileChooser current_file = null;
}
