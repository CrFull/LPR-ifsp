/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpr2_tp1_ex3;

/**
 *
 * @author joaos
 */
public class Person {

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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    private String name;
    private String address; 
    
    public Person(String name, String address){
        setName(name);
        setAddress(address);
    }
    
    @Override
    public String toString(){
        return "Person[name= "+ this.getName() +
        ", address= "+ this.getAddress() + "]";
    }
}
