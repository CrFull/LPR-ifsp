package transportes;

public class Balao extends TransporteAereo 
{
	private int pesoLargada;

	public Balao(int altitudeActual, String nome, int passageiros,
			int velocidade, int pesoLargada) 
	{
		super(altitudeActual, nome, passageiros, velocidade);
		this.pesoLargada = pesoLargada;
	}

	public int getPesoLargada() 
	{
		return pesoLargada;
	}

	public void setPesoLargada(int pesoLargada) 
	{
		this.pesoLargada = pesoLargada;
		System.out.println("Peso actual: " + this.pesoLargada + "kg");
	}
	
	public void largarPeso(float peso)
	{
		if(peso > 0)
		{
			if(this.pesoLargada >= peso)
			{
				this.pesoLargada -= peso;
				System.out.println("Peso largado" + peso +"kg");
				System.out.println("Peso actual:"+ this.pesoLargada + "kg");
			}
			else
			{
				System.out.println("Ô ABENÇOADO, NAO DA PRA LARGAR ISSO!");
			}
		}
		else
		{
			System.out.println("Ô ABENÇOADO, NAO DA PRA LARGAR ISSO!");
		}
	}
	
	public void aquecerAr(float temperatura)
	{
		if(temperatura <= 0 )
		{
			System.out.println("NAO DA PRA AQUECER ASSIM!");
		}
		else
		{
			System.out.println("TA AQUECIDINHO!A: " + temperatura + "°C" );
		}
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
		super.subir(metros);
	}
	
	public void descer(int metros)
	{
		
		super.desce(metros);
	}
	
	
	
	
	
	
}
