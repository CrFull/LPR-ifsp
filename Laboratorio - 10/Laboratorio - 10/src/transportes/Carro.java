package transportes;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel
{
	private int numeroCilindrada;
	
	public Carro(int numero, String nome, int passageiros, int velocidade)
	{
		super(nome,passageiros,velocidade,"Carro");
		this.numeroCilindrada = numero;
	}

	public int getNumeroCilindrada() 
	{
		return numeroCilindrada;
	}
	
	public boolean estaParado()
	{
		if(super.estaParado())
		{
			return true;
		}
		return false;
	}
	
	public void estacionar()
	{
		super.setVelocidadeActual(0);
		System.out.println("Carro estacionado!");
	}
	
	public void curvar(float angulo)
	{		
		if(angulo > 0 && angulo <= 180 )
			System.out.println("O carro esta a fazendo uma curva de " + angulo );
		else
			System.out.println("Operacao rejeitada! O MEU PAI?");
	}
	
	public void abastecer(int numLitros)
	{
		
		if(numLitros <= 0)
			System.out.println("SEU PAI TEM GONORREIA!");
		else
			System.out.println("Abastecido com: " + numLitros + "litros");
	}
	
	public boolean ligarMotor()
	{
		System.out.println("Motores ligados!");
		return true;
	}
	
	
}
