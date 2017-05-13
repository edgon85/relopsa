/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.compras;

import connection.DBConnection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelUniversal;
import static view.principal.PrincipalAdmin.desktopPaneIndex;

/**
 *
 * @author gonza
 */
public class ListarCompras extends javax.swing.JInternalFrame {

    DefaultTableModel tableModel;
    ModelUniversal modelUniversal = new ModelUniversal();
    private TableRowSorter trsFiltro;

    public ListarCompras() {
        initComponents();
        this.setTitle("Listado de compras");
        filtroBuscarCompra.setText("");
        filtroBuscarCompra.setPrompt("buscar");
        
        listarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogListarDetalleCompra = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        filtroBuscarCompra = new org.jdesktop.swingx.JXSearchField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaCompras = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialogListarDetalleCompraLayout = new javax.swing.GroupLayout(jDialogListarDetalleCompra.getContentPane());
        jDialogListarDetalleCompra.getContentPane().setLayout(jDialogListarDetalleCompraLayout);
        jDialogListarDetalleCompraLayout.setHorizontalGroup(
            jDialogListarDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogListarDetalleCompraLayout.setVerticalGroup(
            jDialogListarDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        filtroBuscarCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtroBuscarCompra.setText("Buscar");
        filtroBuscarCompra.setToolTipText("Buscar");
        filtroBuscarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroBuscarCompraKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(filtroBuscarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(261, 261, 261))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroBuscarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 720, 50));

        tableListaCompras = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableListaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableListaCompras.setFocusable(false);
        jScrollPane1.setViewportView(tableListaCompras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 720, 360));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        btnRecibir.setText("Recibir");
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        btModificar.setText("Imprimir");
        jPanel1.add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        recibirProducto();
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        abrirVentanaCompras();
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificarCompra();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void filtroBuscarCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroBuscarCompraKeyTyped
       buscar();
    }//GEN-LAST:event_filtroBuscarCompraKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRecibir;
    private org.jdesktop.swingx.JXSearchField filtroBuscarCompra;
    private javax.swing.JDialog jDialogListarDetalleCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableListaCompras;
    // End of variables declaration//GEN-END:variables

//------------Listar datos------------------------
    private final void listarDatos() {
        DBConnection conListar = new DBConnection();
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("ID");
        tableModel.addColumn("Compra");
        tableModel.addColumn("Fecha");
        tableModel.addColumn("Proveedor");
        tableModel.addColumn("Termino");
        tableModel.addColumn("Total");
        tableModel.addColumn("Condicion");
        tableListaCompras.setModel(tableModel);

        //        ocultamos la columna ID
        modelUniversal.ocultarColumnas(tableListaCompras, 0);

        TableRowSorter<TableModel> ordertable = new TableRowSorter<>(tableModel);
        tableListaCompras.setRowSorter(ordertable);
        this.tableListaCompras.setModel(tableModel);

        String querty = "SELECT c.compras_id AS Compra, c.numero_compra AS num_compra,DATE_FORMAT(c.fecha, '%d/%m/%Y') AS Fecha_Compra, pro.nombre AS Proveedor, c.forma_pago AS Término, SUM(detc.cantidad * detc.precio_compra) AS Total, c.estado as Condicion FROM detalleCompra AS detc JOIN compras AS c ON detc.compras_id=c.compras_id JOIN productos AS p ON detc.productos_id=p.productos_id JOIN proveedores AS pro ON c.proveedores_id=pro.proveedores_id GROUP BY Compra ORDER BY num_compra desc";
        String datos[] = new String[7];

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

                tableModel.addRow(datos);

            }
            tableListaCompras.setModel(tableModel);

        } catch (SQLException e) {
            System.out.println(e.getMessage() + e);
            JOptionPane.showMessageDialog(null, "Insercion!", "Error", JOptionPane.ERROR);
        } finally {
            try {
                conListar.closeConnection();
                System.err.println("Conexion listar compras cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(ListarCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void recibirProducto() {
        int filaSelected = tableListaCompras.getSelectedRow();
        tableModel = (DefaultTableModel) tableListaCompras.getModel();

        if (filaSelected == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una compra", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (tableListaCompras.getValueAt(filaSelected, 6).equals("Recibido")) {
            JOptionPane.showMessageDialog(null, "Campra ya fue recibida", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Recibir producto", "Recibir", JOptionPane.YES_NO_OPTION);

            if (option == 0) {

                //(new RecibirCompra(jDialogListarDetalleCompra, true)).setVisible(true);
                //RecibirCompra.lbNumeroCompra.setText(tableListaCompras.getValueAt(filaSelected, 1).toString());
                //RecibirCompra.lbProveedorCompra.setText(tableListaCompras.getValueAt(filaSelected, 3).toString());
                RecibirCompra recibirCompra = new RecibirCompra(jDialogListarDetalleCompra, closable);
                recibirCompra.lbNumeroCompra.setText(tableListaCompras.getValueAt(filaSelected, 1).toString());
                recibirCompra.lbProveedorCompra.setText(tableListaCompras.getValueAt(filaSelected, 3).toString());
                recibirCompra.setVisible(true);

//                DBConnection conexion = new DBConnection();
//                String querty = " update compras set estado=? where compras_id= ?";
//                
//                try {
//                    PreparedStatement statement = conexion.connetion().prepareStatement(querty);
//                     statement.setString(1, "Recibido");
//                     statement.setString(2, tableListaCompras.getValueAt(filaSelected, 0).toString());                  
//                    statement.executeUpdate();
//                } catch (SQLException ex) {
//                    Logger.getLogger(ListarCompras.class.getName()).log(Level.SEVERE, null, ex);
//                }
            } else {
//                String estado = tableListaCompras.getValueAt(filaSelected, 5).toString();
//                System.out.println(estado);
            }
        }
        listarDatos();
    }

    private void abrirVentanaCompras() {
        Compras compras = new Compras();
        if (compras.isShowing()) {
            System.err.println("ya esta abierto");
        } else {
            desktopPaneIndex.add(compras);
            modelUniversal.centerJIF(desktopPaneIndex, compras);
            compras.show();
        }
    }

    private void modificarCompra() {
        int filaSelected = tableListaCompras.getSelectedRow();

        if (filaSelected == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una compra", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (tableListaCompras.getValueAt(filaSelected, 6).equals("Recibido")) {
            JOptionPane.showMessageDialog(null, "No se puede modificar, la compra ya fue recibida", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            EditarCompra editarCompras = new EditarCompra();
            String numCompra = tableListaCompras.getValueAt(filaSelected, 1).toString();
            String fecha = tableListaCompras.getValueAt(filaSelected, 2).toString().trim();
            String datosC[] = new String[8];
            String datosP[] = new String[5];

            DBConnection conEditar = new DBConnection();
            String quertyCompra = "select * from compras where numero_compra = " + numCompra;

            if (editarCompras.isShowing()) {
                System.err.println("ya esta abierto");
            } else {
                desktopPaneIndex.add(editarCompras);
                modelUniversal.centerJIF(desktopPaneIndex, editarCompras);
                //recibirCompra.lbNumeroCompra.setText(tableListaCompras.getValueAt(filaSelected, 1).toString());
                EditarCompra.txtNumCompras.setText(numCompra);

                try {
                    Statement st = conEditar.connetion().createStatement();
                    ResultSet rsC = st.executeQuery(quertyCompra);

                    while (rsC.next()) {

                        datosC[0] = rsC.getString(1);
                        datosC[1] = rsC.getString(2);
                        datosC[2] = rsC.getString(3);
                        datosC[3] = rsC.getString(4);
                        datosC[4] = rsC.getString(5);
                        datosC[5] = rsC.getString(6);
                        datosC[6] = rsC.getString(7);
                        datosC[7] = rsC.getString(8);
                    }

                    EditarCompra.txtIdCompra.setText(datosC[0]);
                    if (datosC[1].equals("Factura")) {
                        EditarCompra.jComboBoxTipoDoc.setSelectedIndex(0);
                    } else {
                        EditarCompra.jComboBoxTipoDoc.setSelectedIndex(1);
                    }
                    EditarCompra.txtNumDocumentoCompra.setText(datosC[2]);

                    if (datosC[4].equals("Contado")) {
                        EditarCompra.jComboFormaPago.setSelectedIndex(1);
                    } else {
                        EditarCompra.jComboFormaPago.setSelectedIndex(2);
                    }

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    EditarCompra.jDateFechaCompra.setDate(dateFormat.parse(fecha));

                    if (datosC[6].equals("Sin Recibir")) {
                        EditarCompra.jComboEstado.setSelectedIndex(0);
                    } else {
                        EditarCompra.jComboEstado.setSelectedIndex(1);
                    }

                    //System.out.println("proveedor: " + datosC[7]);
                    String quertyProv = "select proveedores_id, nit, nombre, direccion, telefono from proveedores where proveedores_id =" + datosC[7];

                    ResultSet rsP = st.executeQuery(quertyProv);

                    while (rsP.next()) {

                        datosP[0] = rsP.getString(1);
                        datosP[1] = rsP.getString(2);
                        datosP[2] = rsP.getString(3);
                        datosP[3] = rsP.getString(4);
                        datosP[4] = rsP.getString(5);
                    }

                    EditarCompra.txtIdProveedor.setText(datosP[0]);
                    EditarCompra.txtNitCompras.setText(datosP[1]);
                    EditarCompra.txtNombreCompras.setText(datosP[2]);
                    EditarCompra.txtDireccionCompras.setText(datosP[3]);
                    EditarCompra.txtTelCompras.setText(datosP[4]);

                } catch (Exception e) {
                }
            }
            editarCompras.show();
        }
       //this.dispose();
    }
    
      public void buscar(){
        filtroBuscarCompra.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (filtroBuscarCompra.getText());
                filtroBuscarCompra.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tableListaCompras.getModel());
        tableListaCompras.setRowSorter(trsFiltro);
    }
       
    private void filtro(){
      //  buttonGroupDialogProveedores.add(jRadioNombre);
      //  buttonGroupDialogProveedores.add(jRadioNit);
        int columnaABuscar = 1;
        
//        if (jRadioNombre.isSelected()) {
//            columnaABuscar = 1;
//        }
//        if (jRadioNit.isSelected()) {
//            columnaABuscar = 2;
//        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(filtroBuscarCompra.getText(), columnaABuscar));
    }

}
