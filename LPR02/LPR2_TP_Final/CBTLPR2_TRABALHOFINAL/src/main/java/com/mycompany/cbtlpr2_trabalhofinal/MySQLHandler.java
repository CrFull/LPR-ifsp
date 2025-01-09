package com.mycompany.cbtlpr2_trabalhofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  Atilio Almeida Costa
 *          João Victor Crivoi Cesar Souza 
 *          
 */

public class MySQLHandler {
    private Connection conn;
    public MySQLHandler(String url, String user, String password) throws SQLException {
        connect(url, user, password);
    }

    private void connect(String url, String user, String password) throws SQLException {
        conn = DriverManager.getConnection(url, user, password);
    }

    public void insertAluno(Aluno aluno) throws SQLException {
        String sql = "INSERT INTO aluno (nome, idade, peso, altura, objetivo) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Substituir os parâmetros da query pelos valores do objeto Aluno
            pstmt.setString(1, aluno.getNome());
            pstmt.setInt(2, aluno.getIdade());
            pstmt.setFloat(3, aluno.getPeso());
            pstmt.setFloat(4, aluno.getAltura());
            pstmt.setString(5, aluno.getObjetivo());
            pstmt.executeUpdate();
        }
    }

    public ArrayList<Aluno> selectAllAlunos() throws SQLException {
        String sql = "SELECT nome, idade, peso, altura, objetivo FROM aluno";
        ArrayList<Aluno> alunos = new ArrayList<>();

        try (Statement stmt = conn.createStatement();
             ResultSet r = stmt.executeQuery(sql)) {

            while (r.next()) {
                Aluno aluno = new Aluno(
                    r.getString("nome"),
                    r.getInt("idade"),
                    r.getFloat("peso"),
                    r.getFloat("altura"),
                    r.getString("objetivo")
                );
                alunos.add(aluno);
            }
        }

        return alunos;
    }
}
