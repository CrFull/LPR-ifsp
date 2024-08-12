package com.mycompany.prova02_lpr1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author  Atilio Almeida Costa e João Victor Crivoi Cesar Souza
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano; 
    private Scanner ler = new Scanner(System.in);

    public Data() {
        setData(0, 0, 0); 
    }

    
    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
        verificaData();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    
    public void setDia(int dia) {
        this.dia = dia;
        verificaData();
    }

    public void setMes(int mes) {
        this.mes = mes;
        verificaData();
    }

    public void setAno(int ano) {
        this.ano = ano;
        verificaData();
    }

    
    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        verificaData();
    }

   
    private int[] diasEmCadaMes() {
        if (bissexto()) {
            return new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        } else {
            return new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        }
    }

   
    private void verificaData() {
        int[] diasEmCadaMes = diasEmCadaMes();
    
        while (this.mes < 1 || this.mes > 12) {
        System.out.println("Mês inválido! Digite um mês válido (1-12):");
        this.mes = ler.nextInt();
    }
    
  
        while (this.dia < 1 || this.dia > diasEmCadaMes[this.mes - 1]) {
        System.out.println("Dia inválido para o mês especificado! Digite um dia válido:");
        this.dia = ler.nextInt();
    }
        
        while (this.ano <= 0) {
        System.out.println("Ano inválido! Digite um ano válido:");
        this.ano = ler.nextInt();
    }
}


    
    public String mostra1() {
        return String.format("%02d/%02d/%d", this.dia, this.mes, this.ano);
    }

    
    public String mostra2() {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return String.format("%02d/%s/%d", this.dia, meses[mes - 1], this.ano);
    }

  
    public boolean bissexto() {
        return (this.ano % 4 == 0) && (this.ano % 100 != 0 || this.ano % 400 == 0);
    }

  
    public int diasTranscorridos() {
        int[] diasEmCadaMes = diasEmCadaMes();
        int qtdDias = 0;
        for (int i = 0; i < this.mes - 1; i++)
            qtdDias += diasEmCadaMes[i];
        qtdDias += this.dia;
        return qtdDias;
    }

   
    public void apresentaDataAtual() {
        Date dataAtual = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
        String dataFormatada = formatador.format(dataAtual);
        System.out.println(dataFormatada);
    }
}
