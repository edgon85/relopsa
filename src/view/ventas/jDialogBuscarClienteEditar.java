
package view.ventas;
import view.compras.*;
import connection.DBConnection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelUniversal;
import view.proveedor.Proveedores;

public class jDialogBuscarClienteEditar extends JDialog {

    ModelUniversal modelUniversal = new ModelUniversal();
    DefaultTableModel tableModel;
    private TableRowSorter trsFiltro;
  
    public jDialogBuscarClienteEditar(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.jRadioNit.setSelected(true);
        this.setTitle("Datos del Cliente");
        txtFiltro.setText("");
        txtFiltro.setPrompt("buscar");
        
        listarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDialogProveedores = new javax.swing.ButtonGroup();
        jDialogCrearProvee = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        txtFiltro = new org.jdesktop.swingx.JXSearchField();
        jRadioNombre = new javax.swing.JRadioButton();
        jRadioNit = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();

        javax.swing.GroupLayout jDialogCrearProveeLayout = new javax.swing.GroupLayout(jDialogCrearProvee.getContentPane());
        jDialogCrearProvee.getContentPane().setLayout(jDialogCrearProveeLayout);
        jDialogCrearProveeLayout.setHorizontalGroup(
            jDialogCrearProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogCrearProveeLayout.setVerticalGroup(
            jDialogCrearProveeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableCliente);

        txtFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFiltro.setText("Buscar");
        txtFiltro.setToolTipText("Buscar");
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        buttonGroupDialogProveedores.add(jRadioNombre);
        jRadioNombre.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jRadioNombre.setText("Nombre");

        buttonGroupDialogProveedores.add(jRadioNit);
        jRadioNit.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jRadioNit.setText("NIT");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioNombre)
                            .addComponent(jRadioNit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrear)
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioNit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnCrear))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        buscar();
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarDatos();
     //   generarCompra();
     //   numeroCompra();
     //   Compras.jComboBoxTipoDoc.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        crearProveedor();
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCrear;
    private javax.swing.ButtonGroup buttonGroupDialogProveedores;
    private javax.swing.JDialog jDialogCrearProvee;
    private javax.swing.JRadioButton jRadioNit;
    protected static javax.swing.JRadioButton jRadioNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCliente;
    public static org.jdesktop.swingx.JXSearchField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void agregarDatos() {
        int filaSelcted = tableCliente.getSelectedRow();

        try {
            String id, nit, nombre, apellido, direccion, telefono;
            
            if (filaSelcted == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un Cliente", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                tableModel = (DefaultTableModel) tableCliente.getModel();
                id = tableCliente.getValueAt(filaSelcted, 0).toString();
                nit = tableCliente.getValueAt(filaSelcted, 3).toString();
                nombre = tableCliente.getValueAt(filaSelcted, 1).toString();
                apellido = tableCliente.getValueAt(filaSelcted,2).toString();
                direccion = tableCliente.getValueAt(filaSelcted, 4).toString();
                telefono = tableCliente.getValueAt(filaSelcted, 6).toString();
                
                EditarVenta.txt_id_cliente.setText(id);
                EditarVenta.txtNitVentas.setText(nit);
                EditarVenta.txtNombreVentas.setText(nombre+" "+apellido);
                EditarVenta.txtDireccionVentas.setText(direccion);
                EditarVenta.txtTelVentas.setText(telefono);
                
                this.dispose();
            }
        } catch (Exception e) {
        }

    }

    
    public  void listarDatos() {
        DBConnection conListar = new DBConnection();
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("ID");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Nit");
        tableModel.addColumn("Dirección");
        tableModel.addColumn("Correo");
        tableModel.addColumn("Teléfono");
        tableModel.addColumn("Observaciones");
        tableCliente.setModel(tableModel);
        
        //        ocultamos la columna ID
        modelUniversal.ocultarColumnas(tableCliente, 0);
        //modelUniversal.ocultarColumnas(tableCliente, 3);
        modelUniversal.ocultarColumnas(tableCliente, 5);
        modelUniversal.ocultarColumnas(tableCliente, 7);
      
        
          TableRowSorter<TableModel> ordertable = new TableRowSorter<>(tableModel);
            tableCliente.setRowSorter(ordertable);
            this.tableCliente.setModel(tableModel);
        //select * from proveedores order by proveedores_id desc
        String querty = "SELECT * FROM relopsa.clientes order by clientes_id desc";
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
            
            //    txtNumProv.setText(Integer.toString(numeroProveedores()));
            }
            tableCliente.setModel(tableModel);

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
        trsFiltro = new TableRowSorter(tableCliente.getModel());
        tableCliente.setRowSorter(trsFiltro);
    }
       
    private void filtro(){
        buttonGroupDialogProveedores.add(jRadioNombre);
        buttonGroupDialogProveedores.add(jRadioNit);
        int columnaABuscar = 0;
        
        if (jRadioNombre.isSelected()) {
            columnaABuscar = 1;
        }
        if (jRadioNit.isSelected()) {
            columnaABuscar = 2;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }

    private void crearProveedor() {
        (new jDialogcrearProveedor(jDialogCrearProvee, true)).setVisible(true);
    }

    private void generarCompra() {
        DBConnection conCompras = new DBConnection();
        int filaSelcted = tableCliente.getSelectedRow();
        String idProv = tableCliente.getValueAt(filaSelcted, 0).toString();

        //obtener fecha
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/YYYY");
        String date = fecha.format(Compras.jDateFechaCompra.getDate());

        String querti = "INSERT INTO compras(tipo_doc, numero_doc, numero_compra, forma_pago, fecha, estado, proveedores_id) VALUES(?, ?, ?, ?, STR_TO_DATE(REPLACE(?,'/','.'), GET_FORMAT(date,'EUR')), ?, ?)";

        try {
            PreparedStatement statement = conCompras.connetion().prepareStatement(querti);

            statement.setString(1, Compras.jComboBoxTipoDoc.getSelectedItem().toString());
            statement.setString(2, Compras.txtNumDocumentoCompra.getText());
            statement.setInt(3, Integer.parseInt(Compras.txtNumCompras.getText()));
            statement.setString(4, Compras.jComboFormaPago.getSelectedItem().toString());
            statement.setString(5, date);
            statement.setString(6, Compras.jComboEstado.getSelectedItem().toString());
            statement.setInt(7, Integer.parseInt(idProv));

            statement.executeUpdate();

            System.out.println("Compra jenerada!");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + ex);
            JOptionPane.showMessageDialog(null, "Insercion no exitosa!", "Error", JOptionPane.ERROR);
        } finally {
            try {
                conCompras.closeConnection();
                System.err.println("Conexion generar compras cerrada");
            } catch (SQLException ex) {
                System.err.println(ex);
                //Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
   private void numeroCompra() {
        DBConnection dBConnection = new DBConnection();
        String querty = "SELECT * FROM relopsa.compras";

        int id;
        String datos[] = new String[1];
        

        try {
            Statement st = dBConnection.connetion().createStatement();
            ResultSet rs = st.executeQuery(querty);
       
               while (rs.next()){
                   datos[0] = rs.getString(1);
               }

                id = Integer.parseInt(datos[0]);
                Compras.txtIdCompra.setText("" + id);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //   JOptionPane.showMessageDialog(null, "Insercion no exitosa!");
        } finally {
            try {
                dBConnection.closeConnection();
                System.err.println("Conexion cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}


/*
public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jDialogComprasProvee dialog = new jDialogComprasProvee(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
*/