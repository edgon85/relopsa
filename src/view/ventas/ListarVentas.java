/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.ventas;


import connection.DBConnection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelUniversal;
import view.principal.PrincipalAdmin;
import static view.principal.PrincipalAdmin.desktopPaneIndex;

/**
 *
 * @author gonza
 */
public class ListarVentas extends javax.swing.JInternalFrame {

    DefaultTableModel tableModel;
    ModelUniversal modelUniversal = new ModelUniversal();
    private TableRowSorter trsFiltro;

    public ListarVentas() {
        initComponents();
        this.setTitle("Listado de ventas");
        filtroBuscarVenta.setText("");
        filtroBuscarVenta.setPrompt("buscar");
        
        listarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogListarDetalleCompra = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        filtroBuscarVenta = new org.jdesktop.swingx.JXSearchField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaVentas = new javax.swing.JTable();
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

        filtroBuscarVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtroBuscarVenta.setText("Buscar");
        filtroBuscarVenta.setToolTipText("Buscar");
        filtroBuscarVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroBuscarVentaKeyTyped(evt);
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
                .addComponent(filtroBuscarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(261, 261, 261))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 720, 50));

        tableListaVentas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableListaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableListaVentas.setFocusable(false);
        jScrollPane1.setViewportView(tableListaVentas);

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

        btnRecibir.setText("Eliminar");
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

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        abrirVentanaVentas();
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificarVenta();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void filtroBuscarVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroBuscarVentaKeyTyped
       buscar();
    }//GEN-LAST:event_filtroBuscarVentaKeyTyped

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        //recibirProducto();
    }//GEN-LAST:event_btnRecibirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRecibir;
    private org.jdesktop.swingx.JXSearchField filtroBuscarVenta;
    private javax.swing.JDialog jDialogListarDetalleCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableListaVentas;
    // End of variables declaration//GEN-END:variables

//------------Listar datos------------------------
    private final void listarDatos() {
        DBConnection conListar = new DBConnection();
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("ID");
        tableModel.addColumn("Venta");
        tableModel.addColumn("Documento");
        tableModel.addColumn("Fecha");
        tableModel.addColumn("Vendido a:");
        tableModel.addColumn("Termino");
        tableModel.addColumn("Total");
        tableListaVentas.setModel(tableModel);

        //        ocultamos la columna ID
        modelUniversal.ocultarColumnas(tableListaVentas, 0);

        TableRowSorter<TableModel> ordertable = new TableRowSorter<>(tableModel);
        tableListaVentas.setRowSorter(ordertable);
        this.tableListaVentas.setModel(tableModel);

        String querty = "select v.ventas_id as Id, v.num_venta as Venta, v.tipo_doc as Documento, DATE_FORMAT(v.fecha, '%d/%m/%Y') as Fecha, CONCAT(c.nombre,' ', c.apellido) as Vendido_a, v.forma_pago as Termino, if(v.tipo_doc='Factura',sum((det.cantidad * det.precio_venta)*"
                + PrincipalAdmin.txtImpuesto.getText()
                + " + det.cantidad * det.precio_venta),sum(det.cantidad * det.precio_venta)) as total from ventas as v join detalleVenta as det on v.ventas_id=det.ventas_id join clientes as c on v.clientes_id = c.clientes_id group by Venta";
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
            tableListaVentas.setModel(tableModel);

        } catch (SQLException e) {
            System.out.println(e.getMessage() + e);
            JOptionPane.showMessageDialog(null, "Insercion!", "Error", JOptionPane.ERROR);
        } finally {
            try {
                conListar.closeConnection();
                System.err.println("Conexion listar ventas cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(ListarVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

  /*  private void recibirProducto() {
        int filaSelected = tableListaVentas.getSelectedRow();
        tableModel = (DefaultTableModel) tableListaVentas.getModel();

        if (filaSelected == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una compra", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (tableListaVentas.getValueAt(filaSelected, 6).equals("Recibido")) {
            JOptionPane.showMessageDialog(null, "Campra ya fue recibida", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Recibir producto", "Recibir", JOptionPane.YES_NO_OPTION);

            if (option == 0) {

                RecibirCompra recibirCompra = new RecibirCompra(jDialogListarDetalleCompra, closable);
                recibirCompra.lbNumeroCompra.setText(tableListaVentas.getValueAt(filaSelected, 1).toString());
                recibirCompra.lbProveedorCompra.setText(tableListaVentas.getValueAt(filaSelected, 3).toString());
                recibirCompra.setVisible(true);

            } else {
            }
        }
        listarDatos();
    }*/

    private void abrirVentanaVentas() {
        Ventas ventas = new Ventas();
        if (ventas.isShowing()) {
            System.err.println("ya esta abierto");
        } else {
            desktopPaneIndex.add(ventas);
            modelUniversal.centerJIF(desktopPaneIndex, ventas);
            ventas.show();
        }
    }

    private void modificarVenta() {
        int filaSelected = tableListaVentas.getSelectedRow();

        if (filaSelected == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una venta", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            EditarVenta editarVenta = new EditarVenta();
            String numVenta = tableListaVentas.getValueAt(filaSelected, 1).toString();
            String fecha = tableListaVentas.getValueAt(filaSelected, 3).toString().trim();
            String datosV[] = new String[8];
            String datosC[] = new String[5];
            
           // System.err.println(fecha);

            DBConnection conEditar = new DBConnection();
            String quertyCompra = "select ventas_id, num_venta,tipo_doc,serie,LPAD(num_doc,6,0),forma_pago,DATE_FORMAT(fecha, '%d/%m/%y'),clientes_id from ventas where num_venta=" + numVenta;

            if (editarVenta.isShowing()) {
                System.err.println("ya esta abierto");
            } else {
                desktopPaneIndex.add(editarVenta);
                modelUniversal.centerJIF(desktopPaneIndex, editarVenta);
                //recibirCompra.lbNumeroCompra.setText(tableListaCompras.getValueAt(filaSelected, 1).toString());
                EditarVenta.txtNumVentas.setText(numVenta);

                try {
                    Statement st = conEditar.connetion().createStatement();
                    ResultSet rsV = st.executeQuery(quertyCompra);

                    while (rsV.next()) {

                        datosV[0] = rsV.getString(1); //id
                        datosV[1] = rsV.getString(2); //num_venta
                        datosV[2] = rsV.getString(3); //tipo_doc
                        datosV[3] = rsV.getString(4); //serie
                        datosV[4] = rsV.getString(5); //num_doc
                        datosV[5] = rsV.getString(6); //forma_pago
                        datosV[6] = rsV.getString(7); //fecha
                        datosV[7] = rsV.getString(8); //clientes_id
                    }

                    EditarVenta.txtIdVenta.setText(datosV[0]);
                    EditarVenta.txtNumVentas.setText(datosV[1]);                   
                    if (datosV[2].equals("Factura")) {
                        EditarVenta.jComboBoxTipoDoc.setSelectedIndex(0);
                    } else {
                        EditarVenta.jComboBoxTipoDoc.setSelectedIndex(1);
                    }
                    EditarVenta.txtSerieVenta.setText(datosV[3]);
                    EditarVenta.txtNumDocVenta.setText(datosV[4]);

                    if (datosV[5].equals("Contado")) {
                        EditarVenta.jComboFormaPago.setSelectedIndex(0);
                    } else {
                        EditarVenta.jComboFormaPago.setSelectedIndex(1);
                    }

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    EditarVenta.jDateFechaVenta.setDate(dateFormat.parse(fecha));
                   // System.err.println(fecha);
                    EditarVenta.txt_id_cliente.setText(datosV[7]);
                            
                    String quertyCliente = "select clientes_id, nit, CONCAT(nombre,' ',apellido), direccion, telefono from clientes where clientes_id =" + datosV[7];

                    ResultSet rsC = st.executeQuery(quertyCliente);

                    while (rsC.next()) {

                        datosC[0] = rsC.getString(1);
                        datosC[1] = rsC.getString(2);
                        datosC[2] = rsC.getString(3);
                        datosC[3] = rsC.getString(4);
                        datosC[4] = rsC.getString(5);
                    }

                    EditarVenta.txt_id_cliente.setText(datosC[0]);
                    EditarVenta.txtNitVentas.setText(datosC[1]);
                    EditarVenta.txtNombreVentas.setText(datosC[2]);
                    EditarVenta.txtDireccionVentas.setText(datosC[3]);
                    EditarVenta.txtTelVentas.setText(datosC[4]);

                } catch (Exception e) {
                    System.err.println("No se puede modificar venta: " + e.getMessage());
                }finally {
                try {
                    conEditar.closeConnection();
                    System.err.println("Conexion cerrada...");
                } catch (SQLException ex) {
                    Logger.getLogger(ListarVentas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
            editarVenta.show();
        }
    }
    
      public void buscar(){
        filtroBuscarVenta.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (filtroBuscarVenta.getText());
                filtroBuscarVenta.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tableListaVentas.getModel());
        tableListaVentas.setRowSorter(trsFiltro);
    }
       
    private void filtro(){
        int columnaABuscar = 1;
        trsFiltro.setRowFilter(RowFilter.regexFilter(filtroBuscarVenta.getText(), columnaABuscar));
    }
}
