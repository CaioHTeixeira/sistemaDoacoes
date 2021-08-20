package Controller;

import Dao.Conexao;
import Dao.ItemDao;
import Model.Usuario;
import View.ExcluirItemView;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class ExcluirItemController {

    private Usuario usuario;
    private ExcluirItemView excluirItemView;
    
    public ExcluirItemController() {
        
    }

    public ExcluirItemController(Usuario usuario, ExcluirItemView excluirItemView) {
        this.usuario = usuario;
        this.excluirItemView = excluirItemView;
    }
    
    public void excluirItem() {
        
        int idItem = Integer.parseInt(excluirItemView.getjTextFieldIdItemExcluirItem().getText());
        
        try {    
            Connection conexao = new Conexao().getConnection();
            ItemDao itemDao = new ItemDao(conexao);
            itemDao.excluirItemNoBancoDeDados(usuario, idItem);
            
            JOptionPane.showMessageDialog(null, "Item excluído com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ExcluirItemView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao excluir item!");
        }
    }
}
