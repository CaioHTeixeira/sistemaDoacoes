<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
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
