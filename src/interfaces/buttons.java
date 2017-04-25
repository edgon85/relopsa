/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author gonza
 */
public interface buttons {
    
    public void registrar() throws Exception;
    public void modificar() throws Exception;
    public void eliminar()  throws Exception;
    public void listar() throws Exception;
    public void consultar();
    
    
    public void validarBtn();
    public void limpiarBtn();
    public void bloquearBtn();
    public void desbloquearBtn();
    
}
