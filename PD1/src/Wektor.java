import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Zadanie 2.1
public class Wektor implements IStatystyka
{
	private int rozmiar;
	private double[] wspolrzedne;
	private String nazwa;	//zad. 2.5
	
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
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
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
	
	public void ZapiszDoPliku()
	{
		try
		{
			File plik = new File(getNazwa() + ".txt");
			if(!plik.exists())
				plik.createNewFile();
			if(!plik.canWrite())
				throw new Exception("Nie mo¿na zapisaæ do pliku.");
			FileWriter writer = new FileWriter(plik);
			for(var liczba : getWspolrzedne())
			{
					writer.append(liczba + " ");
			}
			writer.close();
		}
		catch (IOException ex)
		{
			Logger.getLogger(Wektor.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void WczytajPlik()
	{
		//File file = new File("E:\\Uczelnia\\WSB-NLU Informatyka\\Zaawansowana_Java\\PD1\\File.txt");
		File file = new File("File.txt");
		Scanner skaner;
		try 
		{
			skaner = new Scanner(file);//.useDelimiter(" ");
			int j = 0;
			List<Double> wczytywane = new ArrayList<>();
			while(skaner.hasNextDouble())
			{
				wczytywane.add(skaner.nextDouble());
				//System.out.print(wczytywane.get(j) + " ");
				j++;
			}

			double[] tab = new double[j];
			j = 0;
			for(var k : wczytywane)
			{
				tab[j] = k;
				j++;
			}
			setWspolrzedne(tab);
			skaner.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
