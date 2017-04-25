
package controler;

import model.ModelUniversal;
import model.ModelUsers;
import view.login.Login;
import view.principal.WindowAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Controler implements ActionListener{
    
    private ModelUsers modelUsers;
    private Login login;


    public Controler(ModelUsers modelUsers, Login login) {
        this.modelUsers = modelUsers;
        this.login = login;
    }
    
    
    public void login() {
        login.setTitle("Login");
        login.pack();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
       // modelUsers.listar("");
    }

    
    

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
}
