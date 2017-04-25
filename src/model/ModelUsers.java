/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.DBConnection;
import interfaces.buttons;
import view.usuario.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gonza
 */
public class ModelUsers extends DBConnection implements buttons{
    
    //Usuarios viewUsers = new Usuarios();

    @Override
    public void registrar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() throws Exception {
        
        DefaultTableModel tableModel = new DefaultTableModel();
        
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Usuario");
        tableModel.addColumn("Tipo Usuario");
    //    viewUsers.tableUsers.setModel(tableModel);
        
        String sql = "SELECT * FROM relopsa.users";
        String data[] = new String[3];
        
        try {
            this.connetion();
            PreparedStatement statement = 
                    this.connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                tableModel.addRow(data);    
            }
            
      //      viewUsers.tableUsers.setModel(tableModel);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validarBtn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpiarBtn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquearBtn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desbloquearBtn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
