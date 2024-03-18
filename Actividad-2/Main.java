public class Main
{
	public static void main(String[] args)
	{
		Triangulo triangulito = new Triangulo((byte)3, 4.4, 3) ;
		Rectangulo rectangulito = new Rectangulo((byte)4, 4, 3) ;
		imprimirInformacionFigura(triangulito) ;
		System.out.println("-----------------------------------") ;
		imprimirInformacionFigura(rectangulito) ;
	}
	public static void imprimirInformacionFigura(Figura figuraInteres)
	{
		System.out.println("Figura: " + figuraInteres.getClass() ) ;
		System.out.println("Area: " + figuraInteres.getArea()) ;
		System.out.println("Perimetro: " + figuraInteres.getPerimetro()) ;
		if (figuraInteres instanceof Redimensionable) //https://ifgeekthen.nttdata.com/es/que-es-y-como-utilizar-instanceof-en-java
		{
			Redimensionable redimensionable = (Redimensionable) figuraInteres;
			redimensionable.redimensionar(3);
			System.out.println("Redimensionamiento por 3.") ;
			System.out.println("Area: " + figuraInteres.getArea()) ;
			System.out.println("Perimetro " + figuraInteres.getPerimetro()) ;
		}
	}
}
