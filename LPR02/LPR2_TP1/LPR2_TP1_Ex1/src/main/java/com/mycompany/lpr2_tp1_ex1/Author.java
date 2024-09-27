/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpr2_tp1_ex1;

/**
 *
 * @author 
 Atilio Almeida Costa
 João Victor Crivoi Cesar Souza 
 
 */
public class Author {
    private String name;
    private String email; 
    private char gender;
    
    public Author(String name, String email, char gender){
       setName(name);
       setEmail(email);
       setGender(gender);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString(){
        return "Author[name= " + name + ", email= " + email + ", gender= " + gender + "]";
    }
    
    
    
}
