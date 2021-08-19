package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author caiot
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException {
        Connection conexao;
        conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sistemaDoacoes", "postgres", "postgres");
        
        return conexao;
    }
}
