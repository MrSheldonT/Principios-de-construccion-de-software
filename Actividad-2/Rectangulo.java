public class Rectangulo extends Figura implements Redimensionable
{
	private double anchura ;
	private double altura ;
	Rectangulo(byte numeroLados, double anchura, double altura)
	{
		super(numeroLados) ;
		this.anchura = anchura ;
		this.altura	 = altura ;
	}
	
	@Override
	public double getPerimetro()
	{
		return this.anchura * 2 + this.altura * 2 ;
	}
	@Override
	public double getArea()
	{
		return this.anchura * this.altura ;
	}
	public void redimensionar(double factor)
    {
		this.anchura *= factor ;
		this.altura *= factor ;
	}
}
