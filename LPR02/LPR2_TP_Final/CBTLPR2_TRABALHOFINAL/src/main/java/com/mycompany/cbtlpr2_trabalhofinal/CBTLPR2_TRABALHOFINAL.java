/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cbtlpr2_trabalhofinal;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author  Atilio Almeida Costa
 *          João Victor Crivoi Cesar Souza 
 * 
 * 
 */
public class CBTLPR2_TRABALHOFINAL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Configurações do Banco(Mysql): \n\n ");
        System.out.print("Digite o usuário do banco de dados: ");
        String user = scanner.nextLine();
        
        System.out.print("\nDigite a senha do banco de dados: ");
        String password = scanner.nextLine();
        
        System.out.print("\nDigite a porta do em que o banco está(default 3306): ");
        String port = scanner.nextLine();
        
        System.out.print("\nDigite o nome do banco de dados: ");
        String nomeDoBanco = scanner.nextLine();
        
        StringBuilder urlDeConexao = new StringBuilder();
        urlDeConexao.append("jdbc:mysql://localhost:").append(port).append("/").append(nomeDoBanco);
        
        try {
          
            System.out.println("\nCarregando...");
            MySQLHandler dbHandler = new MySQLHandler(urlDeConexao.toString(), user, password);
            System.out.print("\nConectado! Formulario Cadastro aberto!");
            CadastroAlunoAcademia cadastroAlunoAcademiaForms = new CadastroAlunoAcademia(dbHandler);
    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
