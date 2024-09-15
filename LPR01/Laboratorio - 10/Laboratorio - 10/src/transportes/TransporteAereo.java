package transportes;

public abstract class TransporteAereo extends Transporte 
{
	private int altitudeActual;
	
	
	public TransporteAereo(int altitudeActual, String nome, int passageiros, int velocidade) 
	{
		super(nome, passageiros, velocidade);
		this.altitudeActual = altitudeActual;
	}


	public int getAltitudeActual() 
	{
		return altitudeActual;
	}
	
	
	public void subir(int metro)
	{
		if(metro > 0)
		{
			this.altitudeActual += metro;
			System.out.println("Subiu:" + metro);
			System.out.println("Altitude actual: " + this.altitudeActual);
		}
		else
		{
			System.out.println("DA PRA SUBIR NAO FILHAO!");
		}
	}
	

	public void desce(int metro)
	{
		if(this.altitudeActual < 0 || metro <= 0 || metro > this.altitudeActual)
		{
			System.out.println("NAO DA PRA DESCER NAO!");
		}
		else
		{
			this.altitudeActual -= metro;
			if(this.altitudeActual == 0)
			{
				System.out.println("Aviao pousando!");
			}
			System.out.println("Desceu: "+ metro);
			System.out.println("Altitude atual: " + this.altitudeActual);
		}
	}
	
}
