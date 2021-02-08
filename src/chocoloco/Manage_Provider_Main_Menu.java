/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocoloco;

/**
 *
 * @author salazar.abraham
 */
public class Manage_Provider_Main_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Manage_Provider_Main_Menu
     */
    public Manage_Provider_Main_Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Man_Pro_MM_lbl = new javax.swing.JLabel();
        Add_Pro_btn = new javax.swing.JButton();
        Update_Pro_btn = new javax.swing.JButton();
        Del_Pro_btn = new javax.swing.JButton();
        View_Pro_btn = new javax.swing.JButton();
        Man_Pro_Exit_btn = new javax.swing.JButton();
        Man_Pro_MM_btn = new javax.swing.JButton();
        Srch_Pro_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Man_Pro_MM_lbl.setText("Manage Provider Main Menu");

        Add_Pro_btn.setText("Add Provider");

        Update_Pro_btn.setText("Update Provider");
        Update_Pro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Pro_btnActionPerformed(evt);
            }
        });

        Del_Pro_btn.setText("Delete Provider");
        Del_Pro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_Pro_btnActionPerformed(evt);
            }
        });

        View_Pro_btn.setText("View Provider");
        View_Pro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Pro_btnActionPerformed(evt);
            }
        });

        Man_Pro_Exit_btn.setText("Exit");
        Man_Pro_Exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Man_Pro_Exit_btnActionPerformed(evt);
            }
        });

        Man_Pro_MM_btn.setText("Main Menu");
        Man_Pro_MM_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Man_Pro_MM_btnActionPerformed(evt);
            }
        });

        Srch_Pro_Btn.setText("Search for Provider");
        Srch_Pro_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Srch_Pro_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(Man_Pro_MM_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Man_Pro_MM_btn)
                .addGap(18, 18, 18)
                .addComponent(Man_Pro_Exit_btn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Srch_Pro_Btn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Add_Pro_btn)
                            .addComponent(Del_Pro_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Update_Pro_btn)
                            .addComponent(View_Pro_btn))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Man_Pro_MM_lbl)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Pro_btn)
                    .addComponent(Update_Pro_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Del_Pro_btn)
                    .addComponent(View_Pro_btn))
                .addGap(18, 18, 18)
                .addComponent(Srch_Pro_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Man_Pro_Exit_btn)
                    .addComponent(Man_Pro_MM_btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void Update_Pro_btnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void Del_Pro_btnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void Man_Pro_Exit_btnActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        System.out.println("\nProgram Exited\n");
        System.exit(0);// TODO add your handling code here:
    }                                                

    private void Srch_Pro_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
        new Search_Provider().setVisible(true);
    }                                            

    private void Man_Pro_MM_btnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.dispose();
        new MainMenu().setVisible(true);// TODO add your handling code here:
    }                                              

    private void View_Pro_btnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
        new ViewProvider().setVisible(true);// TODO add your handling code here:
    }                                            

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
            java.util.logging.Logger.getLogger(Manage_Provider_Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Provider_Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Provider_Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Provider_Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Provider_Main_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Add_Pro_btn;
    private javax.swing.JButton Del_Pro_btn;
    private javax.swing.JButton Man_Pro_Exit_btn;
    private javax.swing.JButton Man_Pro_MM_btn;
    private javax.swing.JLabel Man_Pro_MM_lbl;
    private javax.swing.JButton Srch_Pro_Btn;
    private javax.swing.JButton Update_Pro_btn;
    private javax.swing.JButton View_Pro_btn;
    // End of variables declaration                   
}
