/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04.data;

/**
 *
 * @author Atilio Almeida Costa, João Victor Crivoi Cesar Souza 
 *          
 */
public class TP04Data {

  
    public static void main(String[] args) {
        //Exercício 02 Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.
        
        // Teste 1: Testando o construtor padrão e a verificação de data
        System.out.println("Teste 1: Construtor Padrão");
        Data data1 = new Data();
        System.out.println("Data inserida: " + data1.mostra2());
        
        // Teste 2: Testando o construtor com parâmetros válidos
        System.out.println("\nTeste 2: Construtor com Parâmetros Válidos");
        Data data2 = new Data(29, 2, 2024); // Ano bissexto
        System.out.println("Data inserida: " + data2.mostra2());
        
        // Teste 3: Testando o construtor com parâmetros inválidos
        System.out.println("\nTeste 3: Construtor com Parâmetros Inválidos");
        Data data3 = new Data(31, 4, 2024); // Abril tem 30 dias
        System.out.println("Data corrigida: " + data3.mostra2());
        
        // Teste 4: Testando métodos de entrada de dados
        System.out.println("\nTeste 4: Métodos de Entrada de Dados");
        data3.entraDia();
        data3.entraMes();
        data3.entraAno();
        System.out.println("Nova data inserida: " + data3.mostra2());
        
        // Teste 5: Testando métodos de retorno de dados
        System.out.println("\nTeste 5: Métodos de Retorno de Dados");
        System.out.println("Dia: " + data3.retDia());
        System.out.println("Mês: " + data3.retMes());
        System.out.println("Ano: " + data3.retAno());
        
        // Teste 6: Testando métodos de formatação de data
        System.out.println("\nTeste 6: Métodos de Formatação de Data");
        System.out.println("Formato 1: " + data3.mostra1());
        System.out.println("Formato 2: " + data3.mostra2());
        
        // Teste 7: Testando cálculo de dias transcorridos
        System.out.println("\nTeste 7: Cálculo de Dias Transcorridos");
        System.out.println("Dias transcorridos no ano até " + data3.mostra1() + ": " + data3.diasTranscorridos());
        
        // Teste 8: Testando apresentação da data atual
        System.out.println("\nTeste 8: Apresentação da Data Atual");
        data3.apresentaDataAtual();
     
    }
    
}
