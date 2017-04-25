/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.stock;

import connection.DBConnection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Stock extends javax.swing.JInternalFrame {

    private TableRowSorter trsFiltro;
    
    public Stock() {
        initComponents();
        filtroStock.setText("");
        filtroStock.setPrompt("buscar");
        
        
        listarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStock = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        filtroStock = new org.jdesktop.swingx.JXSearchField();
        radioButtonCodigo = new javax.swing.JRadioButton();
        radioButtonNombre = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        filtroStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filtroStock.setText("jXSearchField1");
        filtroStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroStockKeyTyped(evt);
            }
        });

        radioButtonCodigo.setText("Cod-Producto");

        radioButtonNombre.setText("Nombre");

        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroStock, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButtonNombre)
                .addGap(143, 143, 143))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButtonCodigo)
                    .addComponent(radioButtonNombre)
                    .addComponent(jLabel1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 720, 60));

        tableStock = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableStock.setFocusable(false);
        jScrollPane1.setViewportView(tableStock);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 720, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtroStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroStockKeyTyped
        buscar();
    }//GEN-LAST:event_filtroStockKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupStock;
    private org.jdesktop.swingx.JXSearchField filtroStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioButtonCodigo;
    private javax.swing.JRadioButton radioButtonNombre;
    private javax.swing.JTable tableStock;
    // End of variables declaration//GEN-END:variables

    private void listarDatos() {
        DBConnection conListar = new DBConnection();
        DefaultTableModel tableModel = new DefaultTableModel();
        String querty = "SELECT P.codigo AS Cod_Prod, P.nombre, P.precio_compra AS P_Compra, P.precio_venta AS P_Venta, P.cantidad AS Stock, C.nombre AS Categoria FROM productos AS P JOIN categorias AS C ON P.categorias_id = C.categorias_id";
        
        tableModel.addColumn("Cod. Prod");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("P. Compra");
        tableModel.addColumn("P. Venta");
        tableModel.addColumn("Stock");
        tableModel.addColumn("Categoria");
        tableStock.setModel(tableModel);
        
        String datos[] = new String[6];

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
                
               tableModel.addRow(datos);
            
            }
            tableStock.setModel(tableModel);

        } catch (SQLException e) {
            System.out.println(e.getMessage() + e);
            JOptionPane.showMessageDialog(null, "Insercion!", "Error", JOptionPane.ERROR);
        } finally {
            try {
                conListar.closeConnection();
                System.err.println("Conexion listar stock cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    private void buscar(){
        filtroStock.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (filtroStock.getText());
                filtroStock.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tableStock.getModel());
        tableStock.setRowSorter(trsFiltro);
    }
    
    private void filtro(){
        buttonGroupStock.add(radioButtonCodigo);
        buttonGroupStock.add(radioButtonNombre);
        int columnaABuscar = 0;
        
        if (radioButtonCodigo.isSelected()) {
            columnaABuscar = 0;
        }
        if (radioButtonNombre.isSelected()) {
            columnaABuscar = 1;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(filtroStock.getText(), columnaABuscar));
    }   
}
