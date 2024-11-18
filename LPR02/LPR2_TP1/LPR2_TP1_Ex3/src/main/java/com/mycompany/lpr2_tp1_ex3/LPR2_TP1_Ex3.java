/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpr2_tp1_ex3;

/**
 *
* @author 
 Atilio Almeida Costa
 João Victor Crivoi Cesar Souza 
 */
public class LPR2_TP1_Ex3 {

    public static void main(String[] args) {
       Person person = new Person("John Doe", "123 Elm Street");
       Student student = new Student("Jane Smith", "456 Oak Avenue", "Computer Science", 3, 1500.00);
       Staff staff = new Staff("Emily Johnson", "789 Pine Road", "Greenwood High", 50000.00);
        
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}
