/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova02_lpr1;
import java.util.Scanner;

/**
 *
 * @author  Atilio Almeida Costa e João Victor Crivoi Cesar Souza
 */
public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    // Construtor padrão
    public ConsultaAgendada() {
        this.data = new Data();
        this.hora = new Hora();
        this.nomePaciente = "";
        this.nomeMedico = "";
        quantidade++;
    }

    
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String nmMed) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = nmMed;
        quantidade++;
    }


    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

   
    public void setData() {
        this.data = new Data();
    }

    public void setHora() {
        this.hora = new Hora();
    }

    public void setNomePaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do paciente: ");
        this.nomePaciente = scanner.nextLine();
    }

    public void setNomeMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do médico: ");
        this.nomeMedico = scanner.nextLine();
    }


    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setHora(int h, int mi, int s) {
        this.hora = new Hora(h, mi, s);
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }


    public int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.mostra1(); 
    }

    public String getHora() {
        return hora.mostra1(); 
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
    
    public static int getQuantidade() {
        return quantidade;
    }
}

   

