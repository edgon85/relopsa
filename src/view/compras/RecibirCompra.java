
package view.compras;

import connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.compras.ListarCompras.tableListaCompras;

/**
 *
 * @author gonza
 */
public class RecibirCompra extends JDialog {

    /**
     * Creates new form RecibirCompra
     */
    
    DefaultTableModel tableModel;
    
    public RecibirCompra(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Detalle de Compra");
        
        this.setLocationRelativeTo(this);
        
        listarDetalleCompra();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecibirCompra = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbNumeroCompra = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbProveedorCompra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableRecibirCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableRecibirCompra);

        jLabel1.setText("Recibir compra:");

        lbNumeroCompra.setText("0000");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("De:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNumeroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProveedorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lbNumeroCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizarStock();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbNumeroCompra;
    public static javax.swing.JLabel lbProveedorCompra;
    private javax.swing.JTable tableRecibirCompra;
    // End of variables declaration//GEN-END:variables

    private void listarDetalleCompra(){
    DBConnection conListar = new DBConnection();
    DefaultTableModel tableModel = new DefaultTableModel();
    int filaSelected = ListarCompras.tableListaCompras.getSelectedRow();
    
    String querty = "select p.codigo as codigo, p.nombre, p.cantidad as Stock, det.cantidad, det.precio_compra, c.numero_compra as Num_compra, p.cantidad + det.cantidad as nuevo_stock, p.productos_id as Prod_id from detalleCompra as det inner join productos as p on det.productos_id = p.productos_id inner join compras as c on det.compras_id = c.compras_id where c.numero_compra="
                + tableListaCompras.getValueAt(filaSelected, 1).toString();

        tableModel.addColumn("Codigo");
        tableModel.addColumn("nombre");
        tableModel.addColumn("Stock");
        tableModel.addColumn("Cant. a Recibir");
        tableModel.addColumn("P. Compra");
        tableModel.addColumn("Num. Compra");
        tableModel.addColumn("Nuevo stock");
        tableModel.addColumn("Prod Id");
        
        tableRecibirCompra.setModel(tableModel);
        
        System.out.println(querty);
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
            
            }
            tableRecibirCompra.setModel(tableModel);

        } catch (SQLException e) {
            System.out.println(e.getMessage() + e);
            JOptionPane.showMessageDialog(null, "Insercion!", "Error", JOptionPane.ERROR);
        } finally {
            try {
                conListar.closeConnection();
                System.err.println("Conexion listar detalleCompra cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(RecibirCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
   }
    
    private void actualizarStock(){
        
            DBConnection conUpdate = new DBConnection();
            String querty = "UPDATE productos SET cantidad=? WHERE productos_id=?";
            String quertyC = " update compras set estado=? where compras_id= ?";
        try {
            PreparedStatement statement = conUpdate.connetion().prepareStatement(querty);
            PreparedStatement statementC = conUpdate.connetion().prepareStatement(quertyC);
            for (int i = 0; i < tableRecibirCompra.getRowCount(); i++) {

                    statement.setInt(1, Integer.parseInt(tableRecibirCompra.getValueAt(i, 6).toString()));
                    statement.setInt(2, Integer.parseInt(tableRecibirCompra.getValueAt(i, 7).toString()));                  
                    statement.executeUpdate();
                }
            
            JOptionPane.showMessageDialog(null, "Compra Recibida :D ");
            
            int filaSelected = tableListaCompras.getSelectedRow();
            statementC.setString(1, "Recibido");
            statementC.setString(2, tableListaCompras.getValueAt(filaSelected, 0).toString());                  
            statementC.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(RecibirCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
