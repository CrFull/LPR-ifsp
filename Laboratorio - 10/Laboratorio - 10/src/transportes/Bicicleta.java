package transportes;

public class Bicicleta extends TransporteTerrestre implements Conduzivel
{
	private int numeroRaios;

	public Bicicleta(String nome, int passageiros, int velocidade, String tipo,
			int numeroRaios) 
	{
		super(nome, passageiros, velocidade, tipo);
		this.numeroRaios = numeroRaios;
	}

	public int getNumeroRaios() {
		return numeroRaios;
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
	}
	
	public void curvar(float angulo)
	{		
		if(angulo > 0 && angulo <= 180 )
			System.out.println("A bicicleta esta a fazendo uma curva de " + angulo );
		else
			System.out.println("Operacao rejeitada! O MEU PAI?");
	}
	
	public void pedalar()
	{
		System.out.println("Voce esta pedalando!");
	}
	
}
