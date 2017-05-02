/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.compras;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelUniversal;
import view.principal.PrincipalAdmin;
import view.productos.Productos;

/**
 *
 * @author gonza
 */
public class DialogBuscarProductoEditar extends JDialog {

    ModelUniversal modelUniversal = new ModelUniversal();
    DefaultTableModel tableModel;
    private TableRowSorter trsFiltro;
    
    /**
     * Creates new form DialogBuscarProducto
     * @param parent
     * @param modal
     */
    public DialogBuscarProductoEditar(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        this.setTitle("Busqueda de productos");
        txtFiltro.setText("");
        txtFiltro.setPrompt("buscar");
        
        listarDatos();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFiltro = new org.jdesktop.swingx.JXSearchField();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductoCompra = new javax.swing.JTable();
        buttonTask2 = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFiltro.setText("Buscar");
        txtFiltro.setToolTipText("Buscar");

        buttonTask1.setText("Agregar");
        buttonTask1.setDescription(" ");
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
            }
        });

        tableProductoCompra = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableProductoCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProductoCompra.setFocusable(false);
        jScrollPane1.setViewportView(tableProductoCompra);

        buttonTask2.setText("Crear");
        buttonTask2.setDescription(" ");
        buttonTask2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTask2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonTask2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTask1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask1ActionPerformed
        agregarDatos();
        validarDatosRepetidosProductos(EditarCompra.txtCodigoCompras, EditarCompra.tableCompras, 0, "Código");
       // Compras.txtPrecioCompras.setEditable(true);
       // Compras.txtCantidadCompras.setEditable(true);
       // Compras.txtCantidadCompras.requestFocus();
    }//GEN-LAST:event_buttonTask1ActionPerformed

    private void buttonTask2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask2ActionPerformed
            abrirVentanaProducto();
            this.dispose();
            
    }//GEN-LAST:event_buttonTask2ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private org.edisoncor.gui.button.ButtonTask buttonTask2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProductoCompra;
    private org.jdesktop.swingx.JXSearchField txtFiltro;
    // End of variables declaration//GEN-END:variables

   //------------Listar datos------------------------
    private final void listarDatos() {
        DBConnection conListar = new DBConnection();
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("ID");                 //0
        tableModel.addColumn("Codigo");             //1 //si
        tableModel.addColumn("Nombre");             //2 //si
        tableModel.addColumn("Precio compra");      //3  //si
        tableModel.addColumn("Precio Venta");       //4
        tableModel.addColumn("Stock");              //5 //si
        tableModel.addColumn("Fecha vencimiento");  //6
        tableModel.addColumn("Categoria");          //7 
        tableModel.addColumn("Proveedor");          //8
        tableModel.addColumn("Observaciones");      //9
        tableProductoCompra.setModel(tableModel);
        
        //        ocultamos la columna ID
        modelUniversal.ocultarColumnas(tableProductoCompra, 0);
        modelUniversal.ocultarColumnas(tableProductoCompra, 4);
        modelUniversal.ocultarColumnas(tableProductoCompra, 6);
        modelUniversal.ocultarColumnas(tableProductoCompra, 8);
        modelUniversal.ocultarColumnas(tableProductoCompra, 9);
        
          TableRowSorter<TableModel> ordertable = new TableRowSorter<>(tableModel);
            tableProductoCompra.setRowSorter(ordertable);
            this.tableProductoCompra.setModel(tableModel);

       // String querty = "SELECT * FROM relopsa.productos";
        String sql = "select productos_id, productos.codigo, productos.nombre, precio_compra, precio_venta, cantidad, fecha_vencimiento, categorias.nombre, proveedores.nombre, productos.observaciones from productos " +
                     "INNER JOIN categorias ON productos.categorias_id=categorias.categorias_id " +
                     "INNER JOIN proveedores ON productos.proveedores_id=proveedores.proveedores_id;";
        String datos[] = new String[10];

        try {
            Statement st = conListar.connetion().createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                tableModel.addRow(datos);
            
            }
            tableProductoCompra.setModel(tableModel);

        } catch (SQLException e) {
            System.out.println(e.getMessage() + e);
            JOptionPane.showMessageDialog(null, "Insercion!", "Error", JOptionPane.ERROR);
        } finally {
            try {
                conListar.closeConnection();
                System.err.println("Conexion listar productos cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(DialogBuscarProductoEditar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //------------Fin Fistar datos--------------------
    
    private void agregarDatos() {
        int filaSelcted = tableProductoCompra.getSelectedRow();

        try {
            String id, codigo, nombre, stock, precio;
            
            if (filaSelcted == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                tableModel = (DefaultTableModel) tableProductoCompra.getModel();
                id = tableProductoCompra.getValueAt(filaSelcted,0).toString();
                codigo = tableProductoCompra.getValueAt(filaSelcted, 1).toString();
                nombre = tableProductoCompra.getValueAt(filaSelcted, 2).toString();
                stock = tableProductoCompra.getValueAt(filaSelcted, 5).toString();
                precio = tableProductoCompra.getValueAt(filaSelcted, 3).toString();
                        
                EditarCompra.txtIdProducto.setText(id);
                EditarCompra.txtCodigoCompras.setText(codigo);
                EditarCompra.txtnombreComprasProducto.setText(nombre);
                EditarCompra.txtstockCompras.setText(stock);
                EditarCompra.txtPrecioCompras.setText(precio);

                
            }
        } catch (Exception e) {
        }
        this.dispose();
        EditarCompra.txtPrecioCompras.setEditable(true);
        EditarCompra.txtCantidadCompras.setEditable(true);

        EditarCompra.btnEditarProducto.setVisible(false);
        EditarCompra.btnCancelarProducto.setVisible(true);
        
        EditarCompra.txtCantidadCompras.requestFocus();
    }

    
    public void validarDatosRepetidosProductos(JTextField textField, JTable table, int columna, String nombre){
        String dato = textField.getText();
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, columna).equals(dato)) {
                JOptionPane.showMessageDialog(null, "El "+nombre+" ya exixte");
                textField.setText("");
                EditarCompra.txtnombreComprasProducto.setText("");
                EditarCompra.txtstockCompras.setText("");
                EditarCompra.txtPrecioCompras.setText("");
                EditarCompra.txtCantidadCompras.setText("");
                
                EditarCompra.btnEditarProducto.setVisible(false);
                EditarCompra.btnCancelarProducto.setVisible(false);
                
                EditarCompra.txtPrecioCompras.setEditable(false);
                EditarCompra.txtCantidadCompras.setEditable(false);
            }
        }
    }
    
    
     private void abrirVentanaProducto() {
        Productos producto = new Productos();
        if (producto.isShowing()) {
            System.err.println("ya esta abierto");
        }else{
            
            PrincipalAdmin.desktopPaneIndex.add(producto);
            modelUniversal.centerJIF(PrincipalAdmin.desktopPaneIndex, producto);
            producto.show();
        }
    }

}
