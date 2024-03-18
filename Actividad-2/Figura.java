public abstract class Figura
{
 	private byte numeroLados ;

 	Figura( byte numeroLados ) 
 	{
 		this.numeroLados = numeroLados ;
 	} 
 	
	public byte getNumeroLados()
	{
		return this.numeroLados ;
	}
	public abstract double getArea();
	public abstract double getPerimetro() ;

	
 	
}
