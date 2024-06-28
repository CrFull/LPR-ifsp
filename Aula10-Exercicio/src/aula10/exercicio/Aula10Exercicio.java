package aula10.exercicio;

import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class Aula10Exercicio {

    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.println("Desenvolva um programa em Java que leia um arquivo de texto contendo uma lista de números inteiros,\n" +
                "um por linha, e ofereça ao usuário as seguintes opções de processamento:");
            System.out.println("Digite o path (caminho do arquivo no seguinte formato (exato, só mude o diretório, pasta ou arquivos conforme a necessidade): C:\\nomedapasta\\nomedoarquivo.extensão");
            String caminho = ler.nextLine();
            Path file = Paths.get(caminho);

            if (Files.isReadable(file)) {
                boolean sair = false;
                while (!sair) {
                    Scanner leitorArq = new Scanner(file);
                    
                    if (!leitorArq.hasNextLine()) {
                        System.out.println("O arquivo está vazio!");
                        break;
                    }

              
                    double soma = 0, qtdNumeros = 0;
                    double numero = Double.parseDouble(leitorArq.nextLine());
                    double maior = numero;
                    double menor = numero;
                    
                    soma += numero;
                    qtdNumeros++;

                    while (leitorArq.hasNextLine()) {
                        numero = Double.parseDouble(leitorArq.nextLine());
                        soma += numero;
                        qtdNumeros++;
                        if (numero > maior)
                            maior = numero;
                        if (numero < menor)
                            menor = numero;
                    }
                    double media = soma / qtdNumeros;
                    leitorArq.close();

                    System.out.println("1. Soma dos Números");
                    System.out.println("2. Média dos números");
                    System.out.println("3. Maior Número");
                    System.out.println("4. Menor Número");
                    System.out.println("5. Sair");
                    int op = ler.nextInt();

                    switch (op) {
                        case 1:
                            System.out.println("Soma: " + soma);
                            break;
                        case 2:
                            System.out.println("Média: " + media);
                            break;
                        case 3:
                            System.out.println("Maior Número: " + maior);
                            break;
                        case 4:
                            System.out.println("Menor Número: " + menor);
                            break;
                        case 5:
                            sair = true;
                            break;
                        default:
                            System.out.println("Digite uma opção válida!");
                            break;
                    }
                }
            } else {
                System.out.println("Não foi possível ler o Arquivo!");
            }

            ler.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
