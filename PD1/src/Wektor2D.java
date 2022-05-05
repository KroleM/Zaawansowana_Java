//Zadanie nr 2.2
public class Wektor2D extends Wektor
{
	public Wektor2D(double dane[])
	{
		super(dane);
	}
	public double dlugosc()
	{
		double dlugosc = 0;
		for(var element : super.getWspolrzedne())
		{
			dlugosc += Math.pow(element, 2);
		}
		return Math.sqrt(dlugosc);
	}
	
}
