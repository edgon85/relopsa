
package view.compras;
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

public class DialogBuscarProveedor extends JDialog {

    ModelUniversal modelUniversal = new ModelUniversal();
    DefaultTableModel tableModel;
    private TableRowSorter trsFiltro;
  
    public DialogBuscarProveedor(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.jRadioNombre.setSelected(true);
        this.setTitle("Datos del proveedor");
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
        tableProveedor = new javax.swing.JTable();
        txtFiltro = new org.jdesktop.swingx.JXSearchField();
        jRadioNombre = new javax.swing.JRadioButton();
        jRadioNit = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(tableProveedor);

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

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
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
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        buscar();
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregarDatos();
        generarCompra();
        numeroCompra();
        Compras.jComboBoxTipoDoc.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crearProveedor();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDialogProveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialogCrearProvee;
    private javax.swing.JRadioButton jRadioNit;
    protected static javax.swing.JRadioButton jRadioNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProveedor;
    public static org.jdesktop.swingx.JXSearchField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void agregarDatos() {
        int filaSelcted = tableProveedor.getSelectedRow();

        try {
            String id, nit, nombre, direccion, telefono;
            
            if (filaSelcted == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                tableModel = (DefaultTableModel) tableProveedor.getModel();
                id = tableProveedor.getValueAt(filaSelcted, 0).toString();
                nit = tableProveedor.getValueAt(filaSelcted, 2).toString();
                nombre = tableProveedor.getValueAt(filaSelcted, 1).toString();
                direccion = tableProveedor.getValueAt(filaSelcted, 4).toString();
                telefono = tableProveedor.getValueAt(filaSelcted, 6).toString();
                
                Compras.txtNitCompras.setText(nit);
                Compras.txtNombreCompras.setText(nombre);
                Compras.txtDireccionCompras.setText(direccion);
                Compras.txtTelCompras.setText(telefono);
                
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
        tableModel.addColumn("Nit");
        tableModel.addColumn("Contacto");
        tableModel.addColumn("Dirección");
        tableModel.addColumn("Correo");
        tableModel.addColumn("Teléfono");
        tableModel.addColumn("Observaciones");
        tableProveedor.setModel(tableModel);
        
        //        ocultamos la columna ID
        modelUniversal.ocultarColumnas(tableProveedor, 0);
        modelUniversal.ocultarColumnas(tableProveedor, 3);
        modelUniversal.ocultarColumnas(tableProveedor, 5);
        modelUniversal.ocultarColumnas(tableProveedor, 7);
      
        
          TableRowSorter<TableModel> ordertable = new TableRowSorter<>(tableModel);
            tableProveedor.setRowSorter(ordertable);
            this.tableProveedor.setModel(tableModel);
        //select * from proveedores order by proveedores_id desc
        String querty = "SELECT * FROM relopsa.proveedores order by proveedores_id desc";
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
        int filaSelcted = tableProveedor.getSelectedRow();
        String idProv = tableProveedor.getValueAt(filaSelcted, 0).toString();

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