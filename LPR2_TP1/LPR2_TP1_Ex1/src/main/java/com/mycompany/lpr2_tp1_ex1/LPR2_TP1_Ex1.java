/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpr2_tp1_ex1;

import java.util.Scanner;

/**
 *
 * @author joaos
 */
public class LPR2_TP1_Ex1 {

    
    
    
    public static void main(String[] args) {
        String name;
        String email;
        char gender;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do autor: ");
        name = ler.nextLine();
        System.out.println("\nDigite o email do autor: ");
        email = ler.nextLine();
        
        do{
            System.out.println("\nDigite o genêro(m ou f): ");
            gender = ler.next().charAt(0);
        }while(gender != 'm' && gender != 'f' );
       
       ler.nextLine();
       Author a1 = new Author(name, email , gender);
       
       System.out.println(a1.toString());
       System.out.println("\nDigite o novo nome do autor: ");
       name = ler.nextLine();
       a1.setName(name);
       System.out.println("\nO novo nome do autor é: " + a1.getName());
       System.out.println(a1.toString());
    }
}
