
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.compras.Compras;


public class Prueba {
    public static void main(String[] args){
        
      // pruebaCompras();
       //cobfirmDialog();
      // numeroCompra();
       obtenerCompra();
  
    
    }

    private static void pruebaCompras() {
     DBConnection dBConnection = new DBConnection();
        String querty = "SELECT * FROM relopsa.proveedores";
        
        try {
            Statement st = dBConnection.connetion().createStatement();
            ResultSet rs = st.executeQuery(querty);
            
            String datos[] = new String[1];
            int count = 0;
            
            while(rs.next()){
                //count++;
                datos[0] = rs.getString(1);
            }
           System.out.println(datos[0]);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }   
    }

    private static void cobfirmDialog() {
        int opcion = JOptionPane.showConfirmDialog(null, "Desea generar una nueva compra ?","Generar Compra",JOptionPane.CANCEL_OPTION);
        
        if(opcion != 0){
        
        }else {
            System.out.println("abrir venana compras");
        }
        
    }
    
    private static void obtenerCompra(){
        DBConnection dBConnection = new DBConnection();
    String querty = "SELECT c.compras_id AS Compra, c.fecha AS Fecha_Compra, pro.nombre AS Proveedor, c.forma_pago AS Término, SUM(detc.cantidad * detc.precio_compra) AS Total, c.estado as Condicion FROM detalleCompra AS detc JOIN compras AS c ON detc.compras_id=c.compras_id JOIN productos AS p ON detc.productos_id=p.productos_id JOIN proveedores AS pro ON c.proveedores_id=pro.proveedores_id GROUP BY Compra";
    //String querty = "SELECT c.compras_id, c.fecha, pro.nombre, c.forma_pago, SUM(detc.cantidad * detc.precio_compra), c.estado FROM detalleCompra AS detc JOIN compras AS c ON detc.compras_id=c.compras_id JOIN productos AS p ON detc.productos_id=p.productos_id JOIN proveedores AS pro ON c.proveedores_id=pro.proveedores_id GROUP BY Compra";
    String datos[] = new String[6];
        try {
            Statement st = dBConnection.connetion().createStatement();
            ResultSet rs = st.executeQuery(querty);
            
            while (rs.next()){
                   datos[0] = rs.getString(1);
                   datos[1] = rs.getString(2);
                   datos[2] = rs.getString(3);
                   datos[3] = rs.getString(4);
                   datos[4] = rs.getString(5);
                   datos[5] = rs.getString(6);
                   
            System.out.println("Compra= "+ datos[0]);
            System.out.println("Fecha= " + datos[1]);
            System.out.println("Proveedor= "+ datos[2]);
            System.out.println("terminos= "+ datos[3]);
            System.out.println("total= "+ datos[4]);
            System.out.println("condicion=" + datos[5]);
            System.out.println();
               }

           
            
            
        } catch (Exception e) {
        }
    
    }
    
    private static void numeroCompra() {
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
             //   Compras.txtNumCompras.setText("" + id);
             
             System.out.println("ID = "+ id);
            
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
