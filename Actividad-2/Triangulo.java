public class Triangulo extends Figura implements Redimensionable
{
	private double anchura ;
	private double altura ;

	Triangulo(byte numeroLados, double anchura, double altura)
	{
		super(numeroLados) ;
		this.anchura = anchura ;
		this.altura = altura ;	
	}

	@Override
	public double getArea()
	{
		return this.anchura * this.altura / 2 ;
	}

	@Override
	public double getPerimetro()
	{
		return this.anchura + this.altura + Math.sqrt(Math.pow(this.anchura, 2) + Math.pow(this.altura, 2));
	}

	public void redimensionar(double factor)
	{
		this.anchura *= factor ;
		this.altura *= factor ;
	}
}
