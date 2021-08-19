package Controller;

import Dao.Conexao;
import Dao.ItemDao;
import Model.Item;
import Model.Usuario;
import View.AlterarItemView;
import View.CadastroItemView;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class AlterarItemController {

    private Usuario usuario;
    private AlterarItemView alterarItemView;
     
    public AlterarItemController() {
        
    }

    public AlterarItemController(Usuario usuario, AlterarItemView alterarItemView) {
        this.usuario = usuario;
        this.alterarItemView = alterarItemView;
    }
    
    public void uploadFotoItem() {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String caminhoFoto = f.getAbsolutePath();
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(caminhoFoto);
        Image image = icon.getImage().getScaledInstance(alterarItemView.getjLabelImagem().getWidth(), 
                alterarItemView.getjLabelImagem().getHeight(), Image.SCALE_SMOOTH);
        alterarItemView.getjLabelImagem().setIcon(icon);
        alterarItemView.setCaminhoFotoItem(caminhoFoto);
    }
    
    public void alteraItem() {
        
        int idItem = Integer.parseInt(alterarItemView.getjTextFieldIdItemAlterarItem().getText());
        String tipoItem = (String)alterarItemView.getjComboBoxTipoItemAlterarItem().getSelectedItem();
        String descricaoItem = alterarItemView.getjTextFieldDescricaoItemAlterarItem().getText();
        int quantidadeItem = Integer.parseInt(alterarItemView
                .getjTextFieldQuantidadeItemAlterarItem().getText());
        String cidadeItem = alterarItemView.getjTextFieldCidadeItemAlterarItem().getText();
        String caminhoFoto = alterarItemView.getCaminhoFotoItem();
        
        Item item = new Item(idItem, quantidadeItem, tipoItem, descricaoItem, cidadeItem, caminhoFoto);
        
        try {    
            if (!usuario.equals(null)) {    
                Connection conexao = new Conexao().getConnection();
                ItemDao itemDao = new ItemDao(conexao);
                itemDao.alteraItemNoBancoDeDados(usuario, item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroItemView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao alterar item!");
        }
    }
}
