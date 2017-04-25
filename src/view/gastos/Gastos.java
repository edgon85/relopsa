/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gastos;

import view.categorias.*;

/**
 *
 * @author gonza
 */
public class Gastos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Categorias
     */
    public Gastos() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionGastos = new javax.swing.JTextArea();
        txtMontoGastos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnEliminarCat = new javax.swing.JPanel();
        btnGuardarGastos = new javax.swing.JButton();
        btnCancelarGastos = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese Descripción: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel2.setText("Ingresse Monto (Q)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtDescripcionGastos.setColumns(20);
        txtDescripcionGastos.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionGastos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 283, 67));

        txtMontoGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoGastosActionPerformed(evt);
            }
        });
        jPanel2.add(txtMontoGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, -1));

        jLabel3.setText("Tipo de documento:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 154, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 540, 390));

        btnEliminarCat.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGuardarGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonGuardar.png"))); // NOI18N
        btnGuardarGastos.setBorder(null);
        btnGuardarGastos.setBorderPainted(false);
        btnGuardarGastos.setContentAreaFilled(false);

        btnCancelarGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonCancelar.png"))); // NOI18N
        btnCancelarGastos.setBorder(null);
        btnCancelarGastos.setBorderPainted(false);
        btnCancelarGastos.setContentAreaFilled(false);

        javax.swing.GroupLayout btnEliminarCatLayout = new javax.swing.GroupLayout(btnEliminarCat);
        btnEliminarCat.setLayout(btnEliminarCatLayout);
        btnEliminarCatLayout.setHorizontalGroup(
            btnEliminarCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarCatLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnGuardarGastos)
                .addGap(49, 49, 49)
                .addComponent(btnCancelarGastos)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        btnEliminarCatLayout.setVerticalGroup(
            btnEliminarCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarCatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnEliminarCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarGastos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarGastos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnEliminarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoGastosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarGastos;
    private javax.swing.JPanel btnEliminarCat;
    private javax.swing.JButton btnGuardarGastos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtDescripcionGastos;
    private javax.swing.JTextField txtMontoGastos;
    // End of variables declaration//GEN-END:variables
}