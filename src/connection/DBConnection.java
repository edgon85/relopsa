
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
     private final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/relopsa?useSSL=false";
    
    private final String USER = "root";
    private final String PASS = "root";
    
    protected Connection connection;
    
    public Connection connetion(){
        
        try {
           connection = DriverManager.getConnection(DB_URL,USER,PASS);
           Class.forName(JDBC_DRIVER);
           
            if (connection != null) {
                System.out.println("Conexion a base de datos " + DB_URL + " ...ok");
            }
           
        } catch (SQLException e) {
            System.out.println("Error al conectar con " + DB_URL);
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return connection;
    }
    
    public void closeConnection() throws SQLException{
        if (connection != null) {
            if (!connection.isClosed()) {
                connection.close();
            }
        }
    }
}
