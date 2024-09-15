package transportes;

public class Aviao extends TransporteAereo implements Motorizado,Conduzivel
{
	private int numeroMotores;
	
	public Aviao(int altitude ,int motores, String nome, int passageiros, int velocidade)
	{
		super(altitude,nome,passageiros,velocidade);
		this.numeroMotores = motores;
	}
	
	public int getMotores()
	{
		return this.numeroMotores;
	}
	
	public boolean estaParado()
	{
		if(super.estaParado())
		{
			return true;
		}
		return false;
	}
	
	public void  subir(int metros)
	{
		this.ligarMotor();
		super.subir(metros);
	}
	
	public void desce(int metros)
	{
		if(estaParado())
		{
			System.out.println("Aviao esta parado!");	
		}
		else
		{
			super.desce(metros);
		}
	}
	
	public void curvar(float angulo)
	{		
		if(angulo > 0 && angulo <= 180 )
			System.out.println("O aviao esta a fazendo uma curva de " + angulo );
		else
			System.out.println("Operacao rejeitada!");
	}
	
	public void abastecer(int numLitros)
	{
		
		if(numLitros<=0)
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
