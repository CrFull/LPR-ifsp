package transportes;

public abstract class Transporte 
{
	private String nome;
	private int numeroPassageiros;
	private int velocidadeActual;
	
	public Transporte(String nome, int passageiros, int velocidade)
	{
		this.nome = nome;
		this.numeroPassageiros = passageiros;
		this.velocidadeActual = velocidade;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public int getNumeroPassageiros() 
	{
		return numeroPassageiros;
	}

	public int getVelocidadeActual() 
	{
		return velocidadeActual;
	}
	
	public void setVelocidadeActual(int velocidadeActual) 
	{
		this.velocidadeActual = velocidadeActual;
		System.out.println("Velocidade atual: " + this.velocidadeActual);
	}

	public boolean estaParado()
	{
		if(this.velocidadeActual == 0)
		{
			return true;
		}
		return false;
	}
	
}
