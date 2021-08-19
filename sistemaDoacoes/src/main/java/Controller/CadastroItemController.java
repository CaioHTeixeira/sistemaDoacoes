package Controller;

import Dao.Conexao;
import Dao.ItemDao;
import Model.Item;
import Model.Usuario;
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
public class CadastroItemController {
    
    private CadastroItemView cadastroItemView;
    private Usuario usuario;
    
    public CadastroItemController() {
    }
    
    public CadastroItemController(Usuario usuario, CadastroItemView cadastroItemView) {
        this.usuario = usuario;
        this.cadastroItemView = cadastroItemView;
    }
    
    public CadastroItemController(CadastroItemView cadastroItemView) {
        this.cadastroItemView = cadastroItemView;
    }
    
    public void uploadFotoItem() {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String caminhoFoto = f.getAbsolutePath();
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(caminhoFoto);
        Image image = icon.getImage().getScaledInstance(cadastroItemView.getjLabelImagemCadastro().getWidth(), 
                cadastroItemView.getjLabelImagemCadastro().getHeight(), Image.SCALE_SMOOTH);
        cadastroItemView.getjLabelImagemCadastro().setIcon(icon);
        cadastroItemView.setCaminhoFotoItem(caminhoFoto);
    }
    
    public void salvaItem() {
        
        int idItem = Integer.parseInt(cadastroItemView.getjTextFieldIdItemCadastroItem().getText());
        String tipoItem = (String)cadastroItemView.getjComboBoxTipoItemCadastroItem().getSelectedItem();
        String descricaoItem = cadastroItemView.getjTextFieldDescricaoItemCadastroItem().getText();
        int quantidadeItem = Integer.parseInt(cadastroItemView
                .getjTextFieldQuantidadeItemCadastroItem().getText());
        String cidadeItem = cadastroItemView.getjTextFieldCidadeItemCadastroItem().getText();
        String caminhoFoto = cadastroItemView.getCaminhoFotoItem();
        
        Item item = new Item(idItem, quantidadeItem, tipoItem, descricaoItem, cidadeItem, caminhoFoto);
        
        try {    
            if (!usuario.equals(null)) {
                Connection conexao = new Conexao().getConnection();
                ItemDao itemDao = new ItemDao(conexao);
                itemDao.insereItemNoBancoDeDados(usuario, item);
                JOptionPane.showMessageDialog(null, "Item salvo com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao salvar item!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroItemView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao salvar item!");
        }
    }
}
