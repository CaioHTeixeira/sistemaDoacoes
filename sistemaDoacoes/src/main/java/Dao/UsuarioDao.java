package Dao;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author caiot
 */
public class UsuarioDao {
    
    private final Connection connection;

    public UsuarioDao(Connection connection) {
        this.connection = connection;
    }
    
    public void insereUsuarioNoBancoDeDados(Usuario usuario) throws SQLException {

        String sql = "insert into usuario(usuario, senha, email, tipopessoa) "
                + "values(?, ?, ?, ?) ";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.setString(3, usuario.getEmail());
        statement.setString(4, usuario.getTipoPessoa());
        statement.execute();
        connection.close();
    }

    public boolean existeUsuarioNoBancoDeDados(Usuario usuario) throws SQLException {
        String sql = "select * from usuario where usuario = ? and senha = ? ";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        boolean existeUsuario = resultSet.next();
        
        return existeUsuario;
    }    
}
