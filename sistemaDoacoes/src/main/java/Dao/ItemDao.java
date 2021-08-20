package Dao;

import Model.Item;
import Model.Usuario;
import View.PesquisarItemView;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class ItemDao {
    private final Connection connection; 

    public ItemDao(Connection connection) {
        this.connection = connection;
    }
    
    private int buscaIdUsuario(String selectIdUsuario, Usuario usuario) throws SQLException {
        int resultadoSelectIdUsuario = 0;
        
        PreparedStatement statementIdUsuario = connection.prepareStatement(selectIdUsuario);
        statementIdUsuario.setString(1, usuario.getNome());
        statementIdUsuario.setString(2, usuario.getSenha());
        statementIdUsuario.execute();
        
        ResultSet resultSet = statementIdUsuario.getResultSet();
        
        if (resultSet.next()) {
            resultadoSelectIdUsuario = resultSet.getInt(1);
        }
        
        return resultadoSelectIdUsuario;
    }
    
    private int buscaIdUsuarioItem(String sqlSelectIdUsuarioItem, Item item) throws SQLException {
        int resultadoSelectIdUsuarioItem = 0;
        
        PreparedStatement statementIdUsuarioItem = connection.prepareStatement(sqlSelectIdUsuarioItem);
        statementIdUsuarioItem.setInt(1, item.getIdItem());
        statementIdUsuarioItem.execute();
        
        ResultSet resultSet = statementIdUsuarioItem.getResultSet();
        
        if (resultSet.next()) {
            resultadoSelectIdUsuarioItem = resultSet.getInt(1);
        }
        
        return resultadoSelectIdUsuarioItem;
    }
    
    public void insereItemNoBancoDeDados(Usuario usuario, Item item) throws SQLException {

        String sqlSelectIdUsuario = "select id_usuario from usuario where usuario = ? and senha = ? ";
        
        String sqlInsertIntoItem = "insert into item(id_item, quantidade, tipoitem, descricao, cidade, caminho_foto, id_usuario) "
                + "values(?, ?, ?, ?, ?, ?, ?) ";
        
        int resultadoSelectIdUsuario = buscaIdUsuario(sqlSelectIdUsuario, usuario);        
        usuario.setIdUsuario(resultadoSelectIdUsuario);
        
        PreparedStatement statement = connection.prepareStatement(sqlInsertIntoItem);
        
        statement.setInt(1, item.getIdItem());
        statement.setInt(2, item.getQuantidade());
        statement.setString(3, item.getTipoItem());
        statement.setString(4, item.getDescricao());
        statement.setString(5, item.getCidade());
        statement.setString(6, item.getCaminhoFotoItem());
        statement.setInt(7, resultadoSelectIdUsuario);
        statement.execute();
        connection.close();
    }
    
    public void alteraItemNoBancoDeDados(Usuario usuario, Item item) throws SQLException {

        String sqlSelectIdUsuario = "select id_usuario from usuario where usuario = ? and senha = ? ";
        
        String sqlSelectIdUsuarioItem = "select id_usuario from item where id_item = ? ";
        
        String sqlUpdateItem = "update item set quantidade = ?, tipoitem = ?, descricao = ?, "
                + "cidade = ?, caminho_foto = ? where id_item = ? and id_usuario = ?";
        
        int resultadoSelectIdUsuario = buscaIdUsuario(sqlSelectIdUsuario, usuario);        
        usuario.setIdUsuario(resultadoSelectIdUsuario);
        int resultadoSelectIdUsuarioItem = buscaIdUsuarioItem(sqlSelectIdUsuarioItem, item);
        
        if (resultadoSelectIdUsuario == resultadoSelectIdUsuarioItem) {
        
            PreparedStatement statement = connection.prepareStatement(sqlUpdateItem);
        
            statement.setInt(1, item.getQuantidade());
            statement.setString(2, item.getTipoItem());
            statement.setString(3, item.getDescricao());
            statement.setString(4, item.getCidade());
            statement.setString(5, item.getCaminhoFotoItem());
            statement.setInt(6, item.getIdItem());
            statement.setInt(7, resultadoSelectIdUsuario);
            statement.execute();
            connection.close();
            
            JOptionPane.showMessageDialog(null, "Item alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao alterar item!");
        }
    }

    public void excluirItemNoBancoDeDados(Usuario usuario, int idItem) throws SQLException {
        
        String sqlSelectIdUsuario = "select id_usuario from usuario where usuario = ? and senha = ? ";
        String sqlExcluirItem = "delete from item  where id_item = ? and id_usuario = ?";
        
        int resultadoSelectIdUsuario = buscaIdUsuario(sqlSelectIdUsuario, usuario);
        
        PreparedStatement statement = connection.prepareStatement(sqlExcluirItem);
        
        statement.setInt(1, idItem);
        statement.setInt(2, resultadoSelectIdUsuario);
        statement.execute();
        connection.close();
    }

    public void pesquisaItemNoBancoDeDados(Usuario usuario, PesquisarItemView pesquisarItemView, 
            String descricaoItem) throws SQLException { 
        
        if (!descricaoItem.isEmpty()) {
            String sqlPesquisarItem = "select * from item  where descricao like ? order by descricao";
            PreparedStatement statement = connection.prepareStatement(sqlPesquisarItem);

            statement.setString(1, descricaoItem);
            statement.execute();
            connection.close();

            ResultSet resultSet = statement.getResultSet();

            exibePesquisa(resultSet, pesquisarItemView);
        } else {
            JOptionPane.showMessageDialog(null, "Descrição do item não pode ser vazio!");
        }
    }
    
    public void exibePesquisa(ResultSet resultSet, PesquisarItemView pesquisarItemView) throws SQLException {
        
        String idItemResultado, quantidadeResultado, tipoItemResultado, descricaoItemResultado, 
                cidadeResultado, caminhoFotoResultado;
        
        while (resultSet.next()) {
            idItemResultado = resultSet.getString(1);
            quantidadeResultado = resultSet.getString(2);
            tipoItemResultado = resultSet.getString(3);
            descricaoItemResultado = resultSet.getString(4);
            cidadeResultado = resultSet.getString(5);
            caminhoFotoResultado = resultSet.getString(6);
            
            pesquisarItemView.getjTextFieldIdItemPesquisarItem().setText(idItemResultado);
            pesquisarItemView.getjTextFieldQuantidadeItemPesquisarItem().setText(quantidadeResultado);
            pesquisarItemView.getjTextFieldTipoItemPesquisarItem().setText(tipoItemResultado);
            pesquisarItemView.getjTextFieldCidadeItemPesquisarItem().setText(cidadeResultado);
            uploadFotoItem(caminhoFotoResultado, pesquisarItemView);
        }
    }
    
    public void uploadFotoItem(String caminhoFoto, PesquisarItemView pesquisarItemView) {
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(caminhoFoto);
        Image image = icon.getImage().getScaledInstance(pesquisarItemView.getjLabelImagem().getWidth(), 
                pesquisarItemView.getjLabelImagem().getHeight(), Image.SCALE_SMOOTH);
        pesquisarItemView.getjLabelImagem().setIcon(icon);
        pesquisarItemView.setCaminhoFotoItem(caminhoFoto);
    }
}
