/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpr2_tp04;

import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author  Atilio Almeida Costa
 *          João Victor Crivoi Cesar Souza 
 *          
 */



public class LPR2_TP04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o usuário do banco de dados: ");
        String user = scanner.nextLine();
        
        System.out.print("Digite a senha do banco de dados: ");
        String password = scanner.nextLine();
        
        try {
            MySQLHandler dbHandler = new MySQLHandler("jdbc:mysql://localhost:3306/aulajava", user, password);
             System.out.print("Conectado! Formulario de pesquisa aberto!!");
            FormularioPesquisa formularioPesquisa = new FormularioPesquisa(dbHandler);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


