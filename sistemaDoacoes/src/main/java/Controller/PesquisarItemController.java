package Controller;

import Dao.Conexao;
import Dao.ItemDao;
import Model.Usuario;
import View.CadastroItemView;
import View.PesquisarItemView;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class PesquisarItemController {
    
    private Usuario usuario;
    private PesquisarItemView pesquisarItemView;
    
    public PesquisarItemController() {
        
    }
    
    public PesquisarItemController(Usuario usuario, PesquisarItemView pesquisarItemView) {
        this.usuario = usuario;
        this.pesquisarItemView = pesquisarItemView;
    }

    public void pesquisaItem() {
        String descricaoItem = pesquisarItemView.getjTextFieldDescricaoItemPesquisarItem().getText();
        
        try {    
            if (!descricaoItem.isEmpty()) {    
                Connection conexao = new Conexao().getConnection();
                ItemDao itemDao = new ItemDao(conexao);
                itemDao.pesquisaItemNoBancoDeDados(usuario, pesquisarItemView, descricaoItem);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroItemView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao pesquisar item!");
        }
    }
}
