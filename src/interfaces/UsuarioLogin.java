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
public interface UsuarioLogin {
    public void acceder(String user, String password)  throws Exception;
    public void limpiar();
}
