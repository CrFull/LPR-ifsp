package tp04.data;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;

public class Data {
    private int dia;
    private int mes;
    private int ano; 
    private Scanner ler = new Scanner(System.in);

    public Data() {
        verificaDado("Digite os valores para o Dia, Mês e Ano", "Data");
        verificaData();
    }

    public Data(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
        verificaData();
    }

    private int[] diasEmCadaMes() {
        if (bissexto()) {
            return new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        } else {
            return new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        }
    }

    private int verificaDia() throws InputMismatchException {
        do {
            System.out.println("Dia(1-31): ");
            dia = ler.nextInt();
        } while (dia <= 0 || dia > 31);
        return dia;
    }

    private int verificaMes() throws InputMismatchException {
        do {
            System.out.println("Mês(1-12): ");
            mes = ler.nextInt();
        } while (mes <= 0 || mes > 12);
        return mes;
    }

    private int verificaAno() throws InputMismatchException {
        do {
            System.out.println("Ano(maior que zero): ");
            ano = ler.nextInt();
        } while (ano <= 0);
        return ano;
    }

    private void verificaData() {
        int[] diasEmCadaMes = diasEmCadaMes();
        if (this.dia > diasEmCadaMes[this.mes - 1]) {
            System.out.println("Data digitada inválida!");
            verificaDado("Digite os valores para o Dia, Mês e Ano", "Data");
        }
    }

    private String verificaDado(String mensagem, String tipoDado) {
        boolean erro;
        do {
            System.out.println(mensagem);
            try {
                switch (tipoDado) {
                    case "Data":
                        this.dia = verificaDia();
                        this.mes = verificaMes();
                        this.ano = verificaAno();
                        break;
                    case "Dia":
                        this.dia = verificaDia();
                        break;
                    case "Mês":
                        this.mes = verificaMes();
                        break;   
                    case "Ano":
                        this.ano = verificaAno();
                        break;
                }
                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Digite o tipo de Valor correspondente Válido!!! \n\n" + e);
                ler.nextLine(); 
                erro = true;
            }
        } while (erro);
        return "";
    }

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

    public int retDia() {
        return dia;
    }

    public int retMes() {
        return mes;
    }

    public int retAno() {
        return ano;
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
