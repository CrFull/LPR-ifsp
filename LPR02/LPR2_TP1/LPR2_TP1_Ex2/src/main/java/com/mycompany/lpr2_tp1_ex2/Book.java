/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpr2_tp1_ex2;

import java.util.Arrays;

/**
 *
 * @author joaos
 */
public class Book {

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
     * @return the author
     */
    public Author[] getAuthor() {
        return author;
    }
    
     public String getAuthorsName(){
         String authorsNameText ="";
         for(Author authors: author){
             authorsNameText += authors.getName() + ", ";
         }
         authorsNameText = authorsNameText.substring(0, authorsNameText.length() -1);
         return authorsNameText;
     }
    
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the qtd
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    private String name;
    final private Author[] author;
    private double price;
    private int qty; 
    
    public Book(String name, Author[] authors, double price, int qty){
        setName(name);
        setPrice(price);
        setQty(qty);
        author = authors;
    }
     public Book(String name, Author[] authors, double price){
        setName(name);
        setPrice(price);
        author = authors;
    }
     
    @Override
    public String toString() {
        return "Book [name=" + name
                + ", authors=" + Arrays.toString(author)  
                + ", price=" + String.valueOf(price)  
                + ", qty=" + Integer.toString(qty) + "]";
    }
}
