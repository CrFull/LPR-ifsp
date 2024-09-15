/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpr2_tp1_ex2;

import java.util.Scanner;

/**
 *
 * @author joaos
 */
public class LPR2_TP1_Ex2 {
    private static Scanner ler  = new Scanner(System.in);
    public static void main(String[] args) {
     
        int qtdAuthors, qtyBook;
        double price;
        String bookName;
        System.out.println("Digite o nome do Livro: ");
        bookName = ler.nextLine();
        
        System.out.println("Digite o preço do livro: ");
        price = ler.nextDouble();
        
        System.out.println("Digite a quantidade de livros: ");
        qtyBook = ler.nextInt();
           
        System.out.println("Digite a quantidade de autores: ");
        qtdAuthors = ler.nextInt();
        Author[] authors = new Author[qtdAuthors];
        for(int i =0; i<qtdAuthors; i++){
            authors[i] = buildAuthors(i);
        }
        
        Book b1 = new Book( bookName, authors,  price, qtyBook);
        System.out.println(b1.toString());
    }
    
    public static Author buildAuthors(int i){
        if (ler.hasNextLine()) {
                ler.nextLine();
        }
        System.out.println("\n\nAUTOR " + i + "\n");
        System.out.println("Digite o nome do autor: ");
        String name = ler.nextLine();
        System.out.println("\nDigite o email do autor: ");
        String email = ler.nextLine();
        char gender;
        do{
            System.out.println("\nDigite o genêro(m ou f): ");
            gender = ler.next().charAt(0);
            ler.nextLine();
        }while(gender != 'm' && gender != 'f' );
       
       ler.nextLine();
       Author a1 = new Author(name, email , gender);
       return a1;
    }
}
