//Zadanie 2.1
public class Wektor 
{
	private int rozmiar;
	private double[] wspolrzedne;
	
	public double[] getWspolrzedne() {
		return wspolrzedne;
	}
	public void setWspolrzedne(double[] wspolrzedne) {
		this.wspolrzedne = wspolrzedne;
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
		//System.out.println("");
	}
	
	public double suma()
	{
		double suma = 0;
		for(var i : getWspolrzedne())
			suma += i;
		return suma;
	}
	
	//Dodawanie wektorów - za³o¿enie, ¿e obydwa wektory s¹ tej samej d³ugoœci
	public Wektor add(Wektor w)
	{
		for(int i=0; i<this.rozmiar; i++)
		{
			this.wspolrzedne[i] += w.getWspolrzedne()[i];
		}
		return this;
	}
	
	
}
