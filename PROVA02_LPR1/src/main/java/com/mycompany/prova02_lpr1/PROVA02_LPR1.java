/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova02_lpr1;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author  Atilio Almeida Costa e João Victor Crivoi Cesar Souza
 */
public class PROVA02_LPR1 {

    public static void main(String[] args) {
        
        // Passo 1: Instanciar o objeto p1 usando o construtor ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String m)
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 8, 2024, "João", "Dr. Silva");

        // Passo 2: Exibir todas as propriedades de p1
        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());

        // Passo 3: Instanciar o objeto p2 usando o construtor padrão ConsultaAgendada()
        ConsultaAgendada p2 = new ConsultaAgendada();

        // Passo 4: Exibir todas as propriedades de p2
        System.out.println("\nPropriedades de p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());

        // Passo 5: Alterar as propriedades de p1 usando os métodos setData(), setHora(), setNomePaciente(), setNomeMedico
        p1.setData(20, 9, 2024); 
        p1.setHora(14, 45, 30);  
        p1.setNomePaciente("Maria"); 
        p1.setNomeMedico("Dr. Oliveira"); 

        // Passo 6: Exibir todas as propriedades de p1 novamente
        System.out.println("\nPropriedades de p1 após alterações:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());

        // Passo 7: Exibir a quantidade final de consultas
        System.out.println("\nQuantidade final de consultas: " + p1.getAmostra());
        
        String arquivo = "resultado.txt";
        try (FileWriter fileWriter = new FileWriter(arquivo, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println("Propriedades de p1:");
            printWriter.println("Data: " + p1.getData());
            printWriter.println("Hora: " + p1.getHora());
            printWriter.println("Nome do Paciente: " + p1.getNomePaciente());
            printWriter.println("Nome do Médico: " + p1.getNomeMedico());
            printWriter.println();
           
            printWriter.println("Propriedades de p2:");
            printWriter.println("Data: " + p2.getData());
            printWriter.println("Hora: " + p2.getHora());
            printWriter.println("Nome do Paciente: " + p2.getNomePaciente());
            printWriter.println("Nome do Médico: " + p2.getNomeMedico());
            printWriter.println();
    
            p1.setData(1, 1, 2025);
            p1.setHora(15, 45, 0);
            p1.setNomePaciente("Maria");
            p1.setNomeMedico("Dr. Souza");
  
            printWriter.println("Propriedades de p1 após alterações:");
            printWriter.println("Data: " + p1.getData());
            printWriter.println("Hora: " + p1.getHora());
            printWriter.println("Nome do Paciente: " + p1.getNomePaciente());
            printWriter.println("Nome do Médico: " + p1.getNomeMedico());
            printWriter.println();

            printWriter.println("Quantidade final de consultas: " + ConsultaAgendada.getQuantidade());

            System.out.println("Resultado salvo em " + arquivo);
            
             File file = new File(arquivo);
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (file.exists()) {
                    desktop.open(file);
                } else {
                    System.out.println("O arquivo não existe.");
                }
            } else {
                System.out.println("Desktop não é suportado.");
            }

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }
        
}

