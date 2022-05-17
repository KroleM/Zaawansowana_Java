import java.awt.event.ActionListener;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;

public class KalkulatorActionListener implements ActionListener
{
	private JLabel wynik;
	private double[] liczby;
	private String liczba;
	private int licznik;
	private String dzialanie;
	private boolean zmianaZnaku;	//zmienna sprawdzaj¹ca, czy przed chwil¹ zlecono zmianê znaku
	
	
	public JLabel getWynik() {
		return wynik;
	}
	public void setWynik(JLabel wynik) {
		this.wynik = wynik;
	}
	public double[] getLiczby() {
		return liczby;
	}
	public void setLiczby(double[] liczby) {
		this.liczby = liczby;
	}
	public int getLicznik() {
		return licznik;
	}
	public void setLicznik(int licznik) {
		this.licznik = licznik;
	}
	public String getLiczba() {
		return liczba;
	}
	public void setLiczba(String liczba) {
		this.liczba = liczba;
	}
	public String getDzialanie() {
		return dzialanie;
	}
	public void setDzialanie(String dzialanie) {
		this.dzialanie = dzialanie;
	}
	public boolean isZmianaZnaku() {
		return zmianaZnaku;
	}
	public void setZmianaZnaku(boolean zmianaZnaku) {
		this.zmianaZnaku = zmianaZnaku;
	}
	
	public KalkulatorActionListener(JLabel wynik)
	{
		super();
		this.wynik = wynik;
		liczby = new double[2];
		liczba = "";
		licznik = 0;
		System.out.println(liczby[0] + " " + liczby[1]);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try 
		{
			switch(e.getActionCommand())
			{
			case "0":
				dodajCyfre("0");
				getWynik().setText(getLiczba());
				//getWynik().setText(getDzialanie().length() == 0 ? getLiczba() : getWynik().getText() + getLiczba());
				break;
			case "1":
				dodajCyfre("1");
				getWynik().setText(getLiczba());
				break;
			case "2":
				dodajCyfre("2");
				getWynik().setText(getLiczba());
				break;
			case "3":
				dodajCyfre("3");
				getWynik().setText(getLiczba());
				break;
			case "4":
				dodajCyfre("4");
				getWynik().setText(getLiczba());
				break;
			case "5":
				dodajCyfre("5");
				getWynik().setText(getLiczba());
				break;
			case "6":
				dodajCyfre("6");
				getWynik().setText(getLiczba());
				break;
			case "7":
				dodajCyfre("7");
				getWynik().setText(getLiczba());
				break;
			case "8":
				dodajCyfre("8");
				getWynik().setText(getLiczba());
				break;
			case "9":
				dodajCyfre("9");
				getWynik().setText(getLiczba());
				break;
			case ".":
				dodajCyfre(".");
				getWynik().setText(getLiczba());
				break;
			case "+":
				//getWynik().setText("+");
				dodajDzialanie("+");
				wyswietlDzialanie("+");
				break;
			case "-":
				dodajDzialanie("-");
				wyswietlDzialanie("-");
				break;
			case "*":
				dodajDzialanie("*");
				wyswietlDzialanie("*");
				break;
			case "/":
				dodajDzialanie("/");
				wyswietlDzialanie("/");
				break;
			case "=":
				dodajDzialanie("=");
				break;
			case "C":
				getWynik().setText("C");
				dodajDzialanie("C");
				break;
			case "+/-":
				getWynik().setText("+/-");
				dodajDzialanie("+/-");
				break;
			}
		}
		catch(Exception ex)
		{
			getWynik().setText("ERROR");
		}		
	}
	
	//obs³uga wprowadzanej liczby - sprawdzenie, czy nie zaczyna siê od kropki, albo czy nie zawiera >2 kropek
	private void dodajCyfre(String cyfra)
	{
		if(cyfra != "." || (cyfra == "." && !getLiczba().contains("."))) 
			setLiczba(getLiczba() + cyfra);
	}
	private void wyswietlDzialanie(String dzialanie)
	{
		getWynik().setText(getLiczby()[0] + dzialanie);
	}
	
	private void dodajDzialanie(String dzialanie)
	{
		//jeœli jest zerowanie, to reszta funkcji siê nie wykona
		if(dzialanie.equals("C"))
		{
			setLicznik(0);
			setLiczby(new double[]{0,0});
			setLiczba("");
			setDzialanie("");
			setZmianaZnaku(false);
		}
		//akcja gdy zosta³a podana nowa liczba
		else if(getLiczba().length() > 0) 
		{
			//zmiana znaku liczby
			if(dzialanie.equals("+/-")) 
			{
				setLiczba((getLiczba().charAt(0) == '-') ? (getLiczba().substring(1)) : ("-" + getLiczba()));
				setZmianaZnaku(true);
				getWynik().setText(getLiczba());
			}
			//zapisanie liczby do tablicy i jeœli mamy dwie liczby wykonanie dzia³ania
			else
			{
				getLiczby()[1] = Double.parseDouble(getLiczba());
				setLiczba("");
				if(getLicznik() == 1) obliczWynik();
				else 
				{
					setLicznik(1);
					getLiczby()[0] = getLiczby()[1];
				}
				setDzialanie(dzialanie);
				setZmianaZnaku(false);
			}
		}
		//wyswietlenie aktualnej liczby (liczby bêd¹cej wynikiem dzia³ania i której znak w³aœnie zmieniono)
		else if(dzialanie.equals("=") && isZmianaZnaku()) getWynik().setText(getLiczby()[0]+"");
		//zmiana znaku liczby uprzednio wprowadzonej
		else if(dzialanie.equals("+/-"))
		{
			getLiczby()[0] *= (-1); 
			setZmianaZnaku(true);
		}
		//przypadek, gdy drugi raz z rzêdu zostanie wybrany znak dzia³ania (zastêpuje poprzedni)
		else if(getLicznik() == 1) 
		{
			setDzialanie(dzialanie);
			setZmianaZnaku(false);
		}
	}
	
	private void obliczWynik()
	{
		switch(getDzialanie())
		{
			case "+":
				getLiczby()[0] = getLiczby()[0] + getLiczby()[1];
				getWynik().setText(getLiczby()[0] + "");
				break;
			case "-":
				getLiczby()[0] = getLiczby()[0] - getLiczby()[1];
				getWynik().setText(getLiczby()[0] + "");
				break;
			case "*":
				getLiczby()[0] = getLiczby()[0] * getLiczby()[1];
				getWynik().setText(getLiczby()[0] + "");
				break;
			case "/":
				if(getLiczby()[1] == 0) getWynik().setText("B³¹d: próba dzielenia przez 0");
				else
				{
					getLiczby()[0] = getLiczby()[0] / getLiczby()[1];
					getWynik().setText(getLiczby()[0] + "");
				}
				break;
			//case "=":
				//getWynik().setText(getLiczby()[0] + "");
				//break;
		}
	}
}
