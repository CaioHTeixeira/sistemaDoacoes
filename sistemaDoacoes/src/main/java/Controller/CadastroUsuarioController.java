package Controller;

import Dao.Conexao;
import Dao.UsuarioDao;
import Model.Usuario;
import View.CadastroUsuarioView;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class CadastroUsuarioController {
    
    private CadastroUsuarioView cadastroUsuarioView;

    public CadastroUsuarioController() {
    }
    
    public CadastroUsuarioController(CadastroUsuarioView cadastroUsuarioView) {
        this.cadastroUsuarioView = cadastroUsuarioView;
    }
    
    public void salvaUsuario() {
        
        String loginUsuario = cadastroUsuarioView.getjTextFieldUsuarioCadastroUsuario().getText();
        String senhaUsuario = cadastroUsuarioView.getjPasswordSenhaCadastroUsuario().getText();
        String emailUsuario = cadastroUsuarioView.getjTextFieldEmailCadastroUsuario().getText();
        String tipoPessoa = cadastroUsuarioView.getjRadioButtonFisicaCadastroUsuario().isSelected() 
                ? "F" : "J"; 
        
        Usuario usuario = new Usuario(loginUsuario, senhaUsuario, emailUsuario, tipoPessoa);
        
        try {    
            Connection conexao = new Conexao().getConnection();
            UsuarioDao usuarioDao = new UsuarioDao(conexao);
            usuarioDao.insereUsuarioNoBancoDeDados(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroUsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
<<<<<<< HEAD
=======
    
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
}
