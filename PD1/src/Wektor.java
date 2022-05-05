//Zadanie 2.1
public class Wektor implements IStatystyka
{
	private int rozmiar;
	private double[] wspolrzedne;
	
	public double[] getWspolrzedne() {
		return wspolrzedne;
	}
	//Zad 2.4 - obs³uga wyj¹tku
	public void setWspolrzedne(double[] wspolrzedne) {
		try
		{
			if(wspolrzedne.length != this.getWspolrzedne().length) throw new Exception("Rozmiar podanej tablicy nie zgadza siê.");
			this.wspolrzedne = wspolrzedne;
		}
		catch(Exception e)
		{
			System.out.println("Wyst¹pi³ b³¹d! Wspó³rzêdne nie zosta³y ustawione");
			e.printStackTrace();
		}
	}
	public int getRozmiar() {
		return rozmiar;
	}
	public void setRozmiar(int rozmiar) {
		this.rozmiar = rozmiar;
	}
	
	public Wektor(double[] wspolrzedne)
	{
		this.rozmiar = wspolrzedne.length;
		this.wspolrzedne = wspolrzedne;
	}
	
	public void show()
	{
		System.out.print("[");
		for(int i=0; i < this.rozmiar; i++)
		{
			System.out.print(getWspolrzedne()[i] + (i != getWspolrzedne().length-1 ? "; " : ""));
		}
		System.out.println("]");
	}
	
	@Override
	public double suma()
	{
		double suma = 0;
		for(var i : getWspolrzedne())
			suma += i;
		return suma;
	}
	
	//Dodawanie wektorów - za³o¿enie, ¿e obydwa wektory s¹ tej samej d³ugoœci~
	//Zad 2.4 Obs³uga wyj¹tku przy dodawaniu pustego obiektu
	public Wektor add(Wektor w)
	{
		try 
		{
			if(w == null) throw new Exception("Dodawany wektor jest pusty (null)!");
			if(getWspolrzedne().length != w.getWspolrzedne().length) throw new ZlaDlugoscException();
			for(int i=0; i<this.rozmiar; i++)
			{
				this.wspolrzedne[i] += w.getWspolrzedne()[i];
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return this;
	}
	@Override
	public double srednia() {
		return this.suma() / this.rozmiar;
	}
	@Override
	public double max() {
		double max = getWspolrzedne()[0];
		for(var elem : getWspolrzedne())
		{
			if(elem > max) max = elem;
		}
		return max;
	}
}
