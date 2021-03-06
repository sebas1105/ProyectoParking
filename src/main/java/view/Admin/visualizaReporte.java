/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Admin;

import java.sql.Connection;
import Model.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import viewModel.reportes;


/**
 *
 * @author Sebastian Muñoz
 */
public class visualizaReporte extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.establecerConexion();
    public static DefaultTableModel model3;

public visualizaReporte() {
        initComponents();
        setLocationRelativeTo(null);
        model3 = new DefaultTableModel();
        model3.addColumn("ID");
        model3.addColumn("Nombre del Reporte");
        model3.addColumn("Fecha de Realizacion");
        model3.addColumn("Ganancias");
        tablareportesadmin.setModel(model3);

        String[] datos = new String[4];
        try {
            String SQL4;
            SQL4 = "select * from reportes";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL4);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model3.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());

        }
    }
   void limpiar(){
        txtreporteseleccionado.setText("");
        txtnombrereporte.setText("");
        txtganancia.setText("");
        txtfecha.setText("");   
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
        menu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablareportesadmin = new javax.swing.JTable();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtreporteseleccionado = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtganancia = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtnombrereporte = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 204, 255));
        menu.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("Volver al menu");
        menu.setBorder(null);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(230, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 230, 600));

        tablareportesadmin.setBackground(new java.awt.Color(0, 204, 255));
        tablareportesadmin.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        tablareportesadmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablareportesadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablareportesadminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablareportesadmin);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 670, -1));

        modificar.setBackground(new java.awt.Color(0, 204, 255));
        modificar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 170, 60));

        eliminar.setBackground(new java.awt.Color(0, 204, 255));
        eliminar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 170, 60));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setText("VISUALIZAR REPORTES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setText("REPORTE SELECCIONADO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, -1, -1));

        txtreporteseleccionado.setEditable(false);
        txtreporteseleccionado.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtreporteseleccionado.setBorder(null);
        txtreporteseleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreporteseleccionadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtreporteseleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 210, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 210, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel5.setText("MODIFICAR FECHA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        txtfecha.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtfecha.setBorder(null);
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 210, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 210, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel6.setText("MODIFICAR GANANCIA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));

        txtganancia.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtganancia.setBorder(null);
        txtganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgananciaActionPerformed(evt);
            }
        });
        jPanel1.add(txtganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 210, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 210, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel7.setText("MODIFICAR NOMBRE DEL REPORTE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        txtnombrereporte.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtnombrereporte.setBorder(null);
        jPanel1.add(txtnombrereporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 210, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 210, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
    this.setVisible(false);
    menuAdmin a1 = new menuAdmin();
    a1.setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
    reportes a1=new reportes();
    a1.Modificar();
    a1.actualizarReportesAdmin();
    limpiar();
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    reportes a1 = new reportes();
    a1.Eliminar();
    a1.actualizarReportesAdmin();
    limpiar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void txtgananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgananciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgananciaActionPerformed

    private void txtreporteseleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreporteseleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreporteseleccionadoActionPerformed

    private void tablareportesadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablareportesadminMouseClicked
    int seleccionado = tablareportesadmin.rowAtPoint(evt.getPoint());
    txtreporteseleccionado.setText(String.valueOf(tablareportesadmin.getValueAt(seleccionado,1)));
    }//GEN-LAST:event_tablareportesadminMouseClicked

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
            java.util.logging.Logger.getLogger(visualizaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visualizaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visualizaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visualizaReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visualizaReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton menu;
    private javax.swing.JButton modificar;
    public static javax.swing.JTable tablareportesadmin;
    public static javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtganancia;
    public static javax.swing.JTextField txtnombrereporte;
    public static javax.swing.JTextField txtreporteseleccionado;
    // End of variables declaration//GEN-END:variables
}
