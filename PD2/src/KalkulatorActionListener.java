import java.awt.event.ActionListener;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class KalkulatorActionListener implements ActionListener
{
	private JLabel wynik;
	private List<Double> liczby;
	private String liczba;
	private static int licznik;
	
	static {
		licznik = 0;
	}
	
	public JLabel getWynik() {
		return wynik;
	}
	public void setWynik(JLabel wynik) {
		this.wynik = wynik;
	}
	public List<Double> getLiczby() {
		return liczby;
	}
	public void setLiczby(List<Double> liczby) {
		this.liczby = liczby;
	}
	public String getLiczba() {
		return liczba;
	}
	public void setLiczba(String liczba) {
		this.liczba = liczba;
	}

	public KalkulatorActionListener(JLabel wynik)
	{
		super();
		this.wynik = wynik;
		liczby = new ArrayList<>();
		liczba = "";
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		switch(e.getActionCommand())
		{
		case "1":
			System.out.println("Cyfra 1");
			dodajCyfre("1");
			getWynik().setText(getLiczba());
			break;
		case "2":
			System.out.println("Cyfra 2");
			dodajCyfre("2");
			getWynik().setText(getLiczba());
			break;
		case "+":
			System.out.println("+");
			getWynik().setText("+");
			dodajDzialanie("+");
			break;
		case "-":
			System.out.println("-");
			getWynik().setText("-");
			dodajDzialanie("-");
			break;
		}
		
		
	}
	
	private void dodajCyfre(String liczba)
	{
		setLiczba(getLiczba() + liczba);
	}
	
	private void dodajDzialanie(String dzialanie)
	{
		if(getLiczba().length() > 0) 
		{
			System.out.println("dobrze");
			getLiczby().add(Double.parseDouble(getLiczba()));
			setLiczba("");
		}
		else System.out.println("èle");
	}
	
}
