package zadania;

import javax.swing.JTextArea;

public class Komunikator 
{
	private JTextArea poleTekstowe;	//zad. 3

	public JTextArea getTekst() {
		return poleTekstowe;
	}
	public void setTekst(JTextArea tekst) {
		this.poleTekstowe = tekst;
	}
	
	public Komunikator() {}
	public Komunikator(JTextArea tekst) 
	{
		this.poleTekstowe = tekst;
	}
	
	public synchronized void uzupelnijiWypiszTekst(String tekst)	//synchronized (!!)- tylko jeden w¹tek mo¿e wykonywaæ tê metodê naraz
	{
		getTekst().append(tekst);
	}
}
