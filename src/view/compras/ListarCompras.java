/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.compras;

import connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelUniversal;


/**
 *
 * @author gonza
 */
public class ListarCompras extends javax.swing.JInternalFrame {

    DefaultTableModel tableModel;
    ModelUniversal modelUniversal = new ModelUniversal();

    public ListarCompras() {
        initComponents();
        listarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        filtroBuscarCompra = new org.jdesktop.swingx.JXSearchField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaCompras = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        filtroBuscarCompra.setText("jXSearchField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filtroBuscarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(442, 442, 442))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(filtroBuscarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        btnModificar.setText("Modificar");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRecibir;
    private org.jdesktop.swingx.JXSearchField filtroBuscarCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListaCompras;
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

        String querty = "SELECT c.compras_id AS Compra, c.numero_compra AS num_compra, c.fecha AS Fecha_Compra, pro.nombre AS Proveedor, c.forma_pago AS Término, SUM(detc.cantidad * detc.precio_compra) AS Total, c.estado as Condicion FROM detalleCompra AS detc JOIN compras AS c ON detc.compras_id=c.compras_id JOIN productos AS p ON detc.productos_id=p.productos_id JOIN proveedores AS pro ON c.proveedores_id=pro.proveedores_id GROUP BY Compra";
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
        } else if(tableListaCompras.getValueAt(filaSelected, 6).equals("Recibido")){
            JOptionPane.showMessageDialog(null, "Campra ya fue recibida", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
            
            
            int option = JOptionPane.showConfirmDialog(null, "Recibir producto","Recibir",JOptionPane.YES_NO_OPTION); 
            
            if(option == 0){
                DBConnection conexion = new DBConnection();
                String querty = " update compras set estado=? where compras_id= ?";
                
                try {
                    PreparedStatement statement = conexion.connetion().prepareStatement(querty);
                     statement.setString(1, "Recibido");
                     statement.setString(2, tableListaCompras.getValueAt(filaSelected, 0).toString());                  
                    statement.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(ListarCompras.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }else {
//                String estado = tableListaCompras.getValueAt(filaSelected, 5).toString();
//                System.out.println(estado);
            }
        }
        listarDatos();
    }
}
