/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 
 * Atilio Almeida Costa CB3025497
 * João Victor Crivoi Cesar Souza CB3026027
 */


public class Data {
    private int dia;
    private int mes;
    private int ano; 
    private Scanner ler = new Scanner(System.in);

    // Construtor padrão
    public Data() {
        System.out.println("Digite os valores para a data:");
        entraDia();
        entraMes();
        entraAno();
    }

    // Construtor com parâmetros
    public Data(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
        if (!dataValida()) {
            System.out.println("Data inválida fornecida. Inicializando com 01/01/1970.");
            dia = 1;
            mes = 1;
            ano = 1970;
        }
    }

    // Verifica se a data é válida
    private boolean dataValida() {
        if (dia <= 0 || dia > 31) return false;
        if (mes <= 0 || mes > 12) return false;
        if (ano <= 0) return false;

        boolean anoBissexto = bissexto();
        switch (mes) {
            case 2:
                return dia <= (anoBissexto ? 29 : 28);
            case 4: case 6: case 9: case 11:
                return dia <= 30;
            default:
                return dia <= 31;
        }
    }

    // Valida e atribui a data
    private void verificaDado(String mensagem, String tipoDado) {
        System.out.println(mensagem);
        try {
            switch(tipoDado) {
                case "Data":
                    do {
                        System.out.print("Dia: ");
                        this.dia = ler.nextInt();
                        System.out.print("Mês: ");
                        this.mes = ler.nextInt();
                        System.out.print("Ano: ");
                        this.ano = ler.nextInt();
                    } while (!dataValida());
                    break;
                case "Dia":
                    do {
                        this.dia = ler.nextInt();
                    } while (this.dia <= 0 || this.dia > 31);
                    break;
                case "Mês":
                    do {
                        this.mes = ler.nextInt();
                    } while (this.mes <= 0 || this.mes > 12);
                    break;
                case "Ano":
                    do {
                        this.ano = ler.nextInt();
                    } while (this.ano <= 0);
                    break;
            }
        } catch(InputMismatchException e) {
            System.out.println("Digite o tipo de valor correspondente Válido!!! \n\n" + e);
            ler.nextLine();          
        }
    }

    // Métodos de entrada
    public void entraDia(int d) {
        dia = d;
    }

    public void entraMes(int m) {
        mes = m;
    }

    public void entraAno(int a) {
        ano = a;
    }

    public void entraDia() {
        verificaDado("Digite o valor para o Dia", "Dia");
    }

    public void entraMes() {
        verificaDado("Digite o valor para o Mês", "Mês");
    }

    public void entraAno() {
        verificaDado("Digite o valor para o Ano", "Ano");
    }

    // Métodos de retorno
    public int retDia() {
        return dia;
    }

    public int retMes() {
        return mes;
    }

    public int retAno() {
        return ano;
    }

    // Formata a data como dd/mm/aaaa
    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    // Formata a data como dd/mesPorExtenso/ano
    public String mostra2() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return String.format("%02d/%s/%04d", dia, meses[mes - 1], ano);
    }

    // Verifica se o ano é bissexto
    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Calcula os dias transcorridos no ano até a data fornecida
    public int diasTranscorridos() {
        Calendar cal = Calendar.getInstance();
        cal.set(ano, mes - 1, dia);
        return cal.get(Calendar.DAY_OF_YEAR);
    }

    // Imprime a data atual
    public void apresentaDataAtual() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}