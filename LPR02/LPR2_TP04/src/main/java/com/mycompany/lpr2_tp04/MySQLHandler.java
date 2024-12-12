package com.mycompany.lpr2_tp04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author  Atilio Almeida Costa
 *          João Victor Crivoi Cesar Souza 
 *          
 */

public class MySQLHandler {
    private Connection conn;
    private ResultSet rs;

    public MySQLHandler(String url, String user, String password) throws SQLException {
        connect(url, user, password);
    }

    private void connect(String url, String user, String password) throws SQLException {
        conn = DriverManager.getConnection(url, user, password);
    }

    public ResultSet pesquisar(String nomePesquisa) throws SQLException {
        String sql = "SELECT f.nome_func, f.sal_func, c.ds_cargo " +
                     "FROM tbfuncs f " +
                     "JOIN tbcargos c ON f.cod_cargo = c.cd_cargo " +
                     "WHERE f.nome_func LIKE ?";
        PreparedStatement pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        pstmt.setString(1, "%" + nomePesquisa + "%");
        rs = pstmt.executeQuery();
        return rs;
    }

    public boolean mostrar() throws SQLException {
        if (rs != null && rs.next()) {
            return true;
        } else {
            return false;
        }
    }

    public String getNome() throws SQLException {
        return rs.getString("nome_func");
    }

    public String getSalario() throws SQLException {
        return rs.getString("sal_func");
    }

    public String getCargo() throws SQLException {
        return rs.getString("ds_cargo");
    }

    public void close() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}
