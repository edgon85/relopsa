
package main;

import connection.DBConnection;
import controler.Controler;
import model.ModelUniversal;
import model.ModelUsers;
import view.login.Login;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Main {
    public static void main(String[] args){
        //DBConnection conexion = new DBConnection();
        //conexion.connetion();
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
               
        ModelUsers modelUsers = new ModelUsers();
        Login login = new Login();
        Controler controlador = new Controler(modelUsers, login);
        controlador.login();
    }    
}
