
package view.proveedor;

import connection.DBConnection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import validaciones.EmailValidator;


public class Proveedores extends javax.swing.JInternalFrame {

   // DBConnection conexion;
    private TableRowSorter trsFiltro;
    
    
    public Proveedores() {
        initComponents();
        this.setTitle("Datos del proveedor");
        txtFiltro.setText("");
        txtFiltro.setPrompt("buscar");
        txtNumProv.requestFocus();
        
        mensaje02.setVisible(false);
        mensaje01.setVisible(false);
        
        
        txtIdProv.setVisible(false);
        txtNumProv.setEditable(false);
        // ----bloqueat blotones
        bloquearBtn();
        btnNuevoProv.setEnabled(true);
        // -------------------------------
        
        listarDatos();
        dobleClickTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreProv = new javax.swing.JTextField();
        txtDireccionProv = new javax.swing.JTextField();
        txtCorreoProv = new javax.swing.JTextField();
        txtTelefonoProve = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservaciones = new javax.swing.JTextArea();
        txtIdProv = new javax.swing.JTextField();
        mensaje02 = new javax.swing.JLabel();
        mensaje01 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNitProveedor = new javax.swing.JTextField();
        txtContactoProveedor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNuevoProv = new javax.swing.JButton();
        btnGuardarProv = new javax.swing.JButton();
        btnModificarProv = new javax.swing.JButton();
        btnEliminarProv = new javax.swing.JButton();
        btnCancelarProv = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNumProv = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProveedor = new javax.swing.JTable();
        txtFiltro = new org.jdesktop.swingx.JXSearchField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Direccion :");

        jLabel4.setText("Correo: ");

        jLabel5.setText("Teléfono: ");

        jLabel6.setText("Observaciones: ");

        txtCorreoProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoProvKeyTyped(evt);
            }
        });

        txtTelefonoProve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoProveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveKeyTyped(evt);
            }
        });

        txtAreaObservaciones.setColumns(20);
        txtAreaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtAreaObservaciones);

        mensaje02.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        mensaje02.setForeground(new java.awt.Color(255, 0, 0));
        mensaje02.setText("El teléfono debe tener 8 digitos");

        mensaje01.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        mensaje01.setText("ejemplo@correo.com");

        jLabel1.setText("Nit:");

        jLabel8.setText("Contacto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccionProv)
                    .addComponent(txtNombreProv)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensaje02)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTelefonoProve, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtCorreoProv, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mensaje01)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContactoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdProv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txtIdProv, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCorreoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mensaje01)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefonoProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensaje02))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNuevoProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonNuevo.png"))); // NOI18N
        btnNuevoProv.setBorder(null);
        btnNuevoProv.setBorderPainted(false);
        btnNuevoProv.setContentAreaFilled(false);
        btnNuevoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProvActionPerformed(evt);
            }
        });

        btnGuardarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonGuardar.png"))); // NOI18N
        btnGuardarProv.setBorder(null);
        btnGuardarProv.setBorderPainted(false);
        btnGuardarProv.setContentAreaFilled(false);
        btnGuardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProvActionPerformed(evt);
            }
        });

        btnModificarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonModificar.png"))); // NOI18N
        btnModificarProv.setBorder(null);
        btnModificarProv.setBorderPainted(false);
        btnModificarProv.setContentAreaFilled(false);
        btnModificarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProvActionPerformed(evt);
            }
        });

        btnEliminarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonCancelar.png"))); // NOI18N
        btnEliminarProv.setBorder(null);
        btnEliminarProv.setBorderPainted(false);
        btnEliminarProv.setContentAreaFilled(false);
        btnEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProvActionPerformed(evt);
            }
        });

        btnCancelarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buttonCancelar.png"))); // NOI18N
        btnCancelarProv.setBorder(null);
        btnCancelarProv.setBorderPainted(false);
        btnCancelarProv.setContentAreaFilled(false);
        btnCancelarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnNuevoProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarProv)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNuevoProv, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGuardarProv)
                        .addComponent(btnModificarProv)
                        .addComponent(btnEliminarProv))
                    .addComponent(btnCancelarProv))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel7.setText("Cantidad de proveedores");

        txtNumProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tableProveedor = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProveedor.setFocusable(false);
        jScrollPane3.setViewportView(tableProveedor);

        txtFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFiltro.setText("Buscar");
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(451, 451, 451)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumProv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProvActionPerformed
        desbloquearBtn();
        btnNuevoProv.setEnabled(false);
        btnModificarProv.setEnabled(false);
        btnEliminarProv.setEnabled(false);
        txtNombreProv.requestFocus();
    }//GEN-LAST:event_btnNuevoProvActionPerformed

    private void btnCancelarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProvActionPerformed
        bloquearBtn();
        limpiar();
        btnNuevoProv.setEnabled(true);
    }//GEN-LAST:event_btnCancelarProvActionPerformed

    private void btnGuardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProvActionPerformed
        try {
//            EmailValidator emailValidator = new EmailValidator();
//        if (!emailValidator.validate(txtCorreoProv.getText().trim())) {
//           JOptionPane.showMessageDialog(null, "Correo Invalido");
//           txtCorreoProv.requestFocus();
//        }
            
            guardarProveedor();
        } catch (Exception e) {
            System.err.println(e.getMessage()); 
        }
        
    }//GEN-LAST:event_btnGuardarProvActionPerformed

    private void btnModificarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProvActionPerformed
        editarDatos();
        btnNuevoProv.setEnabled(true);
    }//GEN-LAST:event_btnModificarProvActionPerformed

    private void btnEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProvActionPerformed
        eliminarDatos();
    }//GEN-LAST:event_btnEliminarProvActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        buscar();
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void txtTelefonoProveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveKeyReleased
        if (!txtTelefonoProve.getText().matches("[0-9--]*")) {
            JOptionPane.showMessageDialog(null, "Solo se permite números","Advertencia",JOptionPane.ERROR_MESSAGE);
            txtTelefonoProve.setText("");
            txtTelefonoProve.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoProveKeyReleased

    private void txtTelefonoProveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveKeyTyped
        if (txtTelefonoProve.getText().length() == 8) {
            mensaje02.setVisible(true);
            txtTelefonoProve.setText("");
            txtTelefonoProve.requestFocus();
            evt.consume();
        }else if(txtTelefonoProve.getText().length() == 7){
            mensaje02.setVisible(false);
        }
    }//GEN-LAST:event_txtTelefonoProveKeyTyped

    private void txtCorreoProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoProvKeyTyped
        EmailValidator emailValidator = new EmailValidator();
        if (!emailValidator.validate(txtCorreoProv.getText().trim())) {
            mensaje01.setVisible(true);
           //JOptionPane.showMessageDialog(null, "Correo Invalido");
           //txtCorreoProv.requestFocus();
        }else{
            mensaje01.setVisible(false);
        }
    }//GEN-LAST:event_txtCorreoProvKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarProv;
    private javax.swing.JButton btnEliminarProv;
    private javax.swing.JButton btnGuardarProv;
    private javax.swing.JButton btnModificarProv;
    private javax.swing.JButton btnNuevoProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mensaje01;
    private javax.swing.JLabel mensaje02;
    private javax.swing.JTable tableProveedor;
    private javax.swing.JTextArea txtAreaObservaciones;
    private javax.swing.JTextField txtContactoProveedor;
    private javax.swing.JTextField txtCorreoProv;
    private javax.swing.JTextField txtDireccionProv;
    private org.jdesktop.swingx.JXSearchField txtFiltro;
    private javax.swing.JTextField txtIdProv;
    private javax.swing.JTextField txtNitProveedor;
    private javax.swing.JTextField txtNombreProv;
    private javax.swing.JTextField txtNumProv;
    private javax.swing.JTextField txtTelefonoProve;
    // End of variables declaration//GEN-END:variables

    
    public void guardarProveedor() {
        DBConnection conGuardar = new DBConnection();

        if (txtNombreProv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtNombreProv.requestFocus();
        } /*else if (txtDireccionProv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Direccion", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtDireccionProv.requestFocus();
        } else if (txtCorreoProv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Correo", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtCorreoProv.requestFocus();
        } else if (txtTelefonoProve.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Telefono", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtTelefonoProve.requestFocus();
        }*/ else {

            try {
                String querty = "INSERT INTO relopsa.proveedores (nombre, nit, contacto, direccion, correo, telefono, observaciones) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement statement = conGuardar.connetion().prepareStatement(querty);
                statement.setString(1, txtNombreProv.getText());
                statement.setString(2, txtNitProveedor.getText());
                statement.setString(3, txtContactoProveedor.getText());
                statement.setString(4, txtDireccionProv.getText());
                statement.setString(5, txtCorreoProv.getText());
                statement.setString(6, txtTelefonoProve.getText());
                statement.setString(7, txtAreaObservaciones.getText());
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Proveedor ingresado");
                limpiar();
                bloquearBtn();
                btnNuevoProv.setEnabled(true);

            } catch (SQLException e) {
                System.out.println(e.getMessage() + e);
                JOptionPane.showMessageDialog(null, "Insercion no exitosa!", "Error", JOptionPane.ERROR);
            } finally {
                try {
                    conGuardar.closeConnection();
                    System.err.println("Conexion cerrada");
                } catch (SQLException ex) {
                    System.err.println(ex);
                    Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        listarDatos();
    }

    public final void listarDatos() {
        DBConnection conListar = new DBConnection();
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("ID");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Nit");
        tableModel.addColumn("Contacto");
        tableModel.addColumn("Dirección");
        tableModel.addColumn("Correo");
        tableModel.addColumn("Teléfono");
        tableModel.addColumn("Observaciones");
        tableProveedor.setModel(tableModel);
        
        //        ocultamos la columna ID
        tableProveedor.getColumnModel().getColumn(0).setMaxWidth(0);
        tableProveedor.getColumnModel().getColumn(0).setMinWidth(0);
        tableProveedor.getColumnModel().getColumn(0).setPreferredWidth(0);
        
          TableRowSorter<TableModel> ordertable = new TableRowSorter<>(tableModel);
            tableProveedor.setRowSorter(ordertable);
            this.tableProveedor.setModel(tableModel);

        String querty = "SELECT * FROM relopsa.proveedores";
        String datos[] = new String[8];

        try {
            Statement st = conListar.connetion().createStatement();
            ResultSet rs = st.executeQuery(querty);
           
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                tableModel.addRow(datos);
            
                txtNumProv.setText(Integer.toString(numeroProveedores()));
            }
            tableProveedor.setModel(tableModel);

        } catch (SQLException e) {
            System.out.println(e.getMessage() + e);
            JOptionPane.showMessageDialog(null, "Insercion!", "Error", JOptionPane.ERROR);
        } finally {
            try {
                conListar.closeConnection();
                System.err.println("Conexion cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void editarDatos(){
        
        DBConnection conEditar = new DBConnection();
        String querty = "UPDATE relopsa.proveedores SET nombre=?, nit=?, contacto=?, direccion=?, correo=?, telefono=?, observaciones=? WHERE proveedores_id=?";
        
        if (txtNombreProv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtNombreProv.requestFocus();
        } /*else if (txtDireccionProv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Direccion", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtDireccionProv.requestFocus();
        } else if (txtCorreoProv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Correo", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtCorreoProv.requestFocus();
        } else if (txtTelefonoProve.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Telefono", "Advertencia", JOptionPane.ERROR_MESSAGE);
            this.txtTelefonoProve.requestFocus();
        }*/ else {
            try {
                PreparedStatement statement = conEditar.connetion().prepareStatement(querty);
                
                statement.setString(1, txtNombreProv.getText());
                statement.setString(2, txtNitProveedor.getText());
                statement.setString(3, txtContactoProveedor.getText());
                statement.setString(4, txtDireccionProv.getText());
                statement.setString(5, txtCorreoProv.getText());
                statement.setString(6, txtTelefonoProve.getText());
                statement.setString(7, txtAreaObservaciones.getText());
                statement.setString(8, txtIdProv.getText());
                
                statement.executeUpdate();
               // System.err.println(querty);
                JOptionPane.showMessageDialog(null, "Proveedor Modificado!");
                listarDatos();
                limpiar();
                bloquearBtn();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Insercion no exitosa!");
            } finally {
                try {
                    conEditar.closeConnection();
                    System.err.println("Conexion cerrada");
                } catch (SQLException ex) {
                    Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void eliminarDatos(){
        DBConnection conDelete = new DBConnection();
        String id = txtIdProv.getText();
        String querty = "DELETE FROM relopsa.proveedores WHERE proveedores_id=?";
        
        int option = JOptionPane.showConfirmDialog(null, "Desea elminar proveedor ?","Eliminar",JOptionPane.YES_NO_OPTION); 
        
        if (option == 0) {
            
            try {
                PreparedStatement statement = conDelete.connetion().prepareStatement(querty);
                statement.setString(1, id);
                statement.executeLargeUpdate();
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                limpiar();
                bloquearBtn();
                btnNuevoProv.setEnabled(true);
                listarDatos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar");
            } finally{
                try {
                    conDelete.closeConnection();
                } catch (SQLException ex) {
                    Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else {
            limpiar();
            bloquearBtn();
            btnNuevoProv.setEnabled(true);
        }
        
    }
    

    public void limpiar() {
        txtNombreProv.setText("");
        txtDireccionProv.setText("");
        txtCorreoProv.setText("");
        txtTelefonoProve.setText("");
        txtAreaObservaciones.setText("");
        txtFiltro.setText("");
        txtFiltro.setText("");
        txtNitProveedor.setText("");
        txtContactoProveedor.setText("");
        txtNumProv.requestFocus();
        
        mensaje02.setVisible(false);
        mensaje01.setVisible(false);
    }

    public final void bloquearBtn() {
        txtNombreProv.setEnabled(false);
        txtDireccionProv.setEnabled(false);
        txtCorreoProv.setEnabled(false);
        txtTelefonoProve.setEnabled(false);
        txtAreaObservaciones.setEnabled(false);
        txtNitProveedor.setEnabled(false);
        txtContactoProveedor.setEnabled(false);

        btnNuevoProv.setEnabled(false);
        btnGuardarProv.setEnabled(false);
        btnModificarProv.setEnabled(false);
        btnEliminarProv.setEnabled(false);
        btnCancelarProv.setEnabled(false);
    }

    public void desbloquearBtn() {
        txtNombreProv.setEnabled(true);
        txtDireccionProv.setEnabled(true);
        txtCorreoProv.setEnabled(true);
        txtTelefonoProve.setEnabled(true);
        txtAreaObservaciones.setEnabled(true);
        txtNitProveedor.setEnabled(true);
        txtContactoProveedor.setEnabled(true);

        btnNuevoProv.setEnabled(true);
        btnGuardarProv.setEnabled(true);
        btnModificarProv.setEnabled(true);
        btnEliminarProv.setEnabled(true);
        btnCancelarProv.setEnabled(true);
    }

    public int numeroProveedores() {
        int numProveedores = 0;

        for (int i = 0; i < tableProveedor.getRowCount(); i++) {
            numProveedores = 1 + i;
        }
        return numProveedores;
    }

    public final void dobleClickTabla() {

        tableProveedor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    //System.err.println("Dos clicks");
                    desbloquearBtn();
                    btnNuevoProv.setEnabled(false);
                    btnGuardarProv.setEnabled(false);

                    int fila = tableProveedor.getSelectedRow();
                    // System.err.println("fila: " + fila);
                    txtIdProv.setText(tableProveedor.getValueAt(fila, 0).toString());
                    txtNombreProv.setText(tableProveedor.getValueAt(fila, 1).toString());
                    txtDireccionProv.setText(tableProveedor.getValueAt(fila, 2).toString());
                    txtCorreoProv.setText(tableProveedor.getValueAt(fila, 3).toString());
                    txtTelefonoProve.setText(tableProveedor.getValueAt(fila, 4).toString());
                    txtAreaObservaciones.setText(tableProveedor.getValueAt(fila, 5).toString());
                }
            }
        });
    }
    
    public void buscar(){
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tableProveedor.getModel());
        tableProveedor.setRowSorter(trsFiltro);
    }
       
    public void filtro() {
        int columnaABuscar = 1;
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }
}

