package transportes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TesteTransportes 
{
	public static void main (String[]args)
	{
		Scanner teclado = new Scanner(System.in);
		ArrayList<Conduzivel> conduziveis = new ArrayList<Conduzivel>();
		ArrayList<Motorizado> motorizados = new ArrayList<Motorizado>();
		ArrayList<Transporte> transportes = new ArrayList<Transporte>();
		
		Aviao aviao = new Aviao(0,4,"OnzeDeSetembro",400, 0);	
		Balao balao = new Balao(0, "Testa", 8,0, 20);	
		Carro carro = new Carro(50, "Ola", 5 , 300);	
		Bicicleta bicicleta = new Bicicleta("Tifanny",4, 10, "BMX",4);
		
		transportes.add(aviao);
		transportes.add(balao);
		transportes.add(carro);
		transportes.add(bicicleta);
		
		Conduzivel ca1 = carro;
		Conduzivel av1 = aviao;
		Conduzivel bi1 = bicicleta;
			
		conduziveis.add(av1);
		conduziveis.add(ca1);	
		conduziveis.add(bi1);
	
	    Motorizado ca2 = carro;
	    Motorizado av2 = aviao;
	    
		motorizados.add(ca2);
		motorizados.add(av2);
		
		System.out.println("AVIAO\n");
		
		aviao.abastecer(10000);
		aviao.setVelocidadeActual(300);
		aviao.subir(5000);
		aviao.curvar(90);
		aviao.desce(200);
		
		System.out.println("\nBALAO\n");
		
		balao.aquecerAr(200);
		balao.setPesoLargada(20);
		balao.largarPeso(10);
		balao.subir(100);
		balao.setVelocidadeActual(10);
		balao.descer(20);
		
		System.out.println("\nCARRO\n");
		
		carro.abastecer(10000);
		carro.setVelocidadeActual(90);
		carro.estacionar();
		
		System.out.println("\nBICICLETA\n");
		
		bicicleta.pedalar();
		bicicleta.curvar(70);
		bicicleta.estacionar();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	   
		
	}
}
