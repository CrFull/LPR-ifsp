/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova02_lpr1;

/**
 *
 * @author Atilio Almeida Costa e João Victor Crivoi Cesar Souza
 */
import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    private Scanner scanner = new Scanner(System.in);

    public Hora() {
        setHora();
    }

    public Hora(int h, int mi, int s) {
        this.hora = h;
        this.minuto = mi;
        this.segundo = s;
        verificaHora();
    }

    private void verificaHora() {
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            System.out.println("Hora digitada inválida!");
            setHora();
        }
    }

    
    public void setHora() {
        System.out.println("Digite a hora (0-23): ");
        this.hora = scanner.nextInt();
        System.out.println("Digite o minuto (0-59): ");
        this.minuto = scanner.nextInt();
        System.out.println("Digite o segundo (0-59): ");
        this.segundo = scanner.nextInt();
        verificaHora();
    }

  
    public void setHora(int h, int mi, int s) {
        this.hora = h;
        this.minuto = mi;
        this.segundo = s;
        verificaHora();
    }

    public void setMinuto(int mi) {
        this.minuto = mi;
        verificaHora();
    }

    public void setSegundo(int s) {
        this.segundo = s;
        verificaHora();
    }

    
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    
    public String mostra1() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}