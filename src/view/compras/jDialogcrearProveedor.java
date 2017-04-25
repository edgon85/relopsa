package view.compras;

import connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import view.proveedor.Proveedores;

/**
 *
 * @author gonza
 */
public class jDialogcrearProveedor extends JDialog {

    public jDialogcrearProveedor(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombreProv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNitProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccionProv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelProve = new javax.swing.JTextField();
        btnGuardarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Nit:");

        jLabel3.setText("Direccion:");

        jLabel4.setText("Telefono:");

        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonGuardar.png"))); // NOI18N
        btnGuardarProducto.setBorder(null);
        btnGuardarProducto.setBorderPainted(false);
        btnGuardarProducto.setContentAreaFilled(false);
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreProv)
                            .addComponent(txtDireccionProv, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnGuardarProducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNitProveedor)
                    .addComponent(txtTelProve, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarProducto)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
       
        guardarProveedor();   
        abrirJDialogProveedores();
       
    }//GEN-LAST:event_btnGuardarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDireccionProv;
    private javax.swing.JTextField txtNitProveedor;
    private javax.swing.JTextField txtNombreProv;
    private javax.swing.JTextField txtTelProve;
    // End of variables declaration//GEN-END:variables

    private void abrirJDialogProveedores() {        
        (new DialogBuscarProveedor(Compras.jDialogComprasProveedores, true)).setVisible(true);
      //  DialogBuscarProveedor.txtFiltro.setText(txtNombreProv.getText());
    }
    
    public void guardarProveedor() {
        DBConnection conGuardar = new DBConnection();

        if (txtNombreProv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtNombreProv.requestFocus();
        } else {

            try {
                //String querty = "INSERT INTO relopsa.proveedores (nombre, nit, contacto, direccion, correo, telefono, observaciones) VALUES (?,?,?,?,?,?,?)";
                String querty = "INSERT INTO relopsa.proveedores (nombre, nit, direccion, telefono) VALUES (?,?,?,?)";
                PreparedStatement statement = conGuardar.connetion().prepareStatement(querty);
                statement.setString(1, txtNombreProv.getText());
                statement.setString(2, txtNitProveedor.getText());
                // statement.setString(3, txtContactoProveedor.getText());
                statement.setString(3, txtDireccionProv.getText());
                // statement.setString(5, txtCorreoProv.getText());
                statement.setString(4, txtTelProve.getText());
                // statement.setString(7, txtAreaObservaciones.getText());
                statement.executeUpdate();
             //   JOptionPane.showMessageDialog(null, "Proveedor ingresado");

            } catch (SQLException e) {
                System.out.println(e.getMessage() + e);
                JOptionPane.showMessageDialog(null, "Insercion no exitosa!", "Error", JOptionPane.ERROR);
            } finally {
                try {
                    conGuardar.closeConnection();
                    System.err.println("Conexion cerrada");
                } catch (SQLException ex) {
                    System.err.println(ex);
                    Logger.getLogger(jDialogcrearProveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

      //  DialogBuscarProveedor.txtFiltro.setText(txtNombreProv.getText());
//        Compras.txtNitCompras.setText(txtNitProveedor.getText());
//        Compras.txtNombreCompras.setText(txtNombreProv.getText());
//        Compras.txtDireccionCompras.setText(txtDireccionProv.getText());
//        Compras.txtTelCompras.setText(txtTelProve.getText());

        this.dispose();
    }
}
