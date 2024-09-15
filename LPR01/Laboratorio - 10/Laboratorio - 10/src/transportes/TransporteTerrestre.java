package transportes;

public abstract class TransporteTerrestre extends Transporte 
{
	private String tipo;
	
	
	
	public TransporteTerrestre(String nome, int passageiros, int velocidade,
			String tipo) 
	{
		super(nome, passageiros, 0);
		this.tipo = tipo;
	}



	public void estacionar()
	{
		super.setVelocidadeActual(0);
		System.out.println("Estacionado!");
	}
	
}
