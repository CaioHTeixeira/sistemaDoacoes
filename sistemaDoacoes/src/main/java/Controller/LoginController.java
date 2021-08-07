package Controller;

import Dao.Conexao;
import Dao.UsuarioDao;
import Model.Usuario;
import View.HomeView;
import View.LoginView;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class LoginController {
    
    private LoginView loginView;

    public LoginController() {
    }

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
    }

    public void autenticar() throws SQLException  {
        
        String usuarioLogin = loginView.getTextUsuarioLogin().getText();
        String usuarioSenha = loginView.getTextSenhaLogin().getText();
        
        Usuario usuario = new Usuario(usuarioLogin, usuarioSenha);
        
        Connection conexao = new Conexao().getConnection();
        UsuarioDao usuarioDao = new UsuarioDao(conexao);
        
        boolean existeUsuarioNoBancoDeDados = usuarioDao.existeUsuarioNoBancoDeDados(usuario);
        
        if (existeUsuarioNoBancoDeDados) {
            HomeView telaHome = new HomeView();
            telaHome.setVisible(true);
            loginView.setVisible(false);
        } else {
           JOptionPane.showMessageDialog(loginView, "Usuário ou Senha inválidos!"); 
        }
    }
    
    public void erroAutenticacao() {
        JOptionPane.showMessageDialog(loginView, "Usuário ou Senha inválidos!");
    }
    
    
}
