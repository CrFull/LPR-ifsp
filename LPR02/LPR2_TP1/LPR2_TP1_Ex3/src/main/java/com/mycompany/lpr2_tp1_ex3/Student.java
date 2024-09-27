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
public class Student extends Person {

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
    private String program;
    private int year; 
    private double fee;
    
    public Student (String nome, String address, String program,int year, double fee){
        super(nome,address);
        setProgram(program);
        setYear(year);
        setFee(fee);
    }
    @Override
    public String toString(){
        return "Student[" + super.toString() +
        ", "+"program = " + this.getProgram() +
        ", year= " + this.getYear() + 
        ", fee= " + this.getFee() + "]";
    }
}
