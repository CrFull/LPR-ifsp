/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author 
 * Atilio Almeida Costa CB3025497
 * João Victor Crivoi Cesar Souza CB3026027
 */



public class TesteData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testa o construtor padrão
        System.out.println("Testando o construtor padrão:");
        Data dataPadrao = new Data();
        System.out.println("Data inicial: " + dataPadrao.mostra1());
        System.out.println("Data inicial (por extenso): " + dataPadrao.mostra2());
        System.out.println("Ano bissexto: " + dataPadrao.bissexto());
        System.out.println("Dias transcorridos: " + dataPadrao.diasTranscorridos());
        dataPadrao.apresentaDataAtual();
        
        // Testa o construtor com parâmetros
        System.out.println("\nTestando o construtor com parâmetros:");
	System.out.println("\nDados inseridos no código: 15/08/2024");
        Data dataParametros = new Data(15, 8, 2024);
        System.out.println("Data fornecida: " + dataParametros.mostra1());
        System.out.println("Data fornecida (por extenso): " + dataParametros.mostra2());
        System.out.println("Ano bissexto: " + dataParametros.bissexto());
        System.out.println("Dias transcorridos: " + dataParametros.diasTranscorridos());
        
        // Testa métodos de entrada e alteração
        System.out.println("\nTestando métodos de entrada e alteração:");
        Data dataAlterada = new Data();
	System.out.println("\nData Inicial de entrada: " + dataAlterada.mostra1());
        
        System.out.print("\nDigite o novo dia: ");
        int novoDia = scanner.nextInt();
        dataAlterada.entraDia(novoDia);
        
        System.out.print("Digite o novo mês: ");
        int novoMes = scanner.nextInt();
        dataAlterada.entraMes(novoMes);
        
        System.out.print("Digite o novo ano: ");
        int novoAno = scanner.nextInt();
        dataAlterada.entraAno(novoAno);
        
        System.out.println("Data alterada: " + dataAlterada.mostra1());
        System.out.println("Data alterada (por extenso): " + dataAlterada.mostra2());
        System.out.println("Ano bissexto: " + dataAlterada.bissexto());
        System.out.println("Dias transcorridos: " + dataAlterada.diasTranscorridos());
        
        // Testa métodos de retorno
        System.out.println("\nTestando métodos de retorno:");
        System.out.println("Dia retornado: " + dataAlterada.retDia());
        System.out.println("Mês retornado: " + dataAlterada.retMes());
        System.out.println("Ano retornado: " + dataAlterada.retAno());
        
        // Testa método de data atual
        System.out.println("\nTestando a exibição da data atual:");
        dataAlterada.apresentaDataAtual();
        
        scanner.close();
    }
}
