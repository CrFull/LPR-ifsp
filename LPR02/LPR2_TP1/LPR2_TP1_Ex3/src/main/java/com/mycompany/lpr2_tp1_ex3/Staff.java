/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpr2_tp1_ex3;

/**
 *
* @author 
 Atilio Almeida Costa
 João Victor Crivoi Cesar Souza 
 */
public class Staff extends Person{

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the pay
     */
    public double getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(double pay) {
        this.pay = pay;
    }
    private String school;
    private double pay; 
    
    public Staff(String nome, String address,String school, double pay){
        super(nome,address);
        setSchool(school);
        setPay(pay);
    }
    
    @Override
    public String toString(){
        return "Staff[" + super.toString() +
        ", "+"school = " + this.getSchool() +
        ", year= " + this.getPay() + "]";
    }
    
    
}
