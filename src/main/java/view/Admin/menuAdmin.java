/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Admin;

import view.login.menu;

/**
 *
 * @author Sebastian Muñoz
 */
public class menuAdmin extends javax.swing.JFrame {


    public menuAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tarifas = new javax.swing.JButton();
        tarifas1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        automoviles = new javax.swing.JButton();
        reportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tarifas.setBackground(new java.awt.Color(0, 204, 255));
        tarifas.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        tarifas.setForeground(new java.awt.Color(255, 255, 255));
        tarifas.setText("Tarifas");
        tarifas.setBorder(null);
        tarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarifasActionPerformed(evt);
            }
        });
        jPanel1.add(tarifas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 241, 80));

        tarifas1.setBackground(new java.awt.Color(0, 204, 255));
        tarifas1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        tarifas1.setForeground(new java.awt.Color(255, 255, 255));
        tarifas1.setText("Volver al Login");
        tarifas1.setBorder(null);
        tarifas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarifas1ActionPerformed(evt);
            }
        });
        jPanel1.add(tarifas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 28));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(207, 207, 207))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 230, 500));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setText("ADMINISTRADOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        Registrarse.setBackground(new java.awt.Color(0, 204, 255));
        Registrarse.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        Registrarse.setText("Registrar usuarios");
        Registrarse.setBorder(null);
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 240, 80));

        automoviles.setBackground(new java.awt.Color(0, 204, 255));
        automoviles.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        automoviles.setForeground(new java.awt.Color(255, 255, 255));
        automoviles.setText("Automoviles");
        automoviles.setBorder(null);
        automoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automovilesActionPerformed(evt);
            }
        });
        jPanel1.add(automoviles, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 241, 80));

        reportes.setBackground(new java.awt.Color(0, 204, 255));
        reportes.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        reportes.setForeground(new java.awt.Color(255, 255, 255));
        reportes.setText("Visualizar reportes");
        reportes.setBorder(null);
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });
        jPanel1.add(reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 241, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarifasActionPerformed
    this.setVisible(false);
    establecerPrecios a6 = new establecerPrecios();
    a6.setVisible(true);
    }//GEN-LAST:event_tarifasActionPerformed

    private void tarifas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarifas1ActionPerformed
    this.setVisible(false);
    menu a1 = new menu();
    a1.setVisible(true);
    }//GEN-LAST:event_tarifas1ActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        registro ventana=new registro();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarseActionPerformed

    private void automovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automovilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_automovilesActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
    visualizaReporte a1 = new visualizaReporte();
    a1.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_reportesActionPerformed

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
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrarse;
    private javax.swing.JButton automoviles;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reportes;
    private javax.swing.JButton tarifas;
    private javax.swing.JButton tarifas1;
    // End of variables declaration//GEN-END:variables
}
