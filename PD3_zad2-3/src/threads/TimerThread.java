package threads;

import javax.swing.JTextField;

public class TimerThread extends Thread
{
	private JTextField poleTekstowe;
	private int czas;
	private boolean czyOdlicza;

		public JTextField getPoleTekstowe() {
		return poleTekstowe;
	}
	public void setPoleTekstowe(JTextField poleTekstowe) {
		this.poleTekstowe = poleTekstowe;
	}
	public int getCzas() {
		return czas;
	}
	public void setCzas(int czas) {
		this.czas = czas;
	}
	public boolean isCzyOdlicza() {
		return czyOdlicza;
	}
	public void setCzyOdlicza(boolean czyOdlicza) {
		this.czyOdlicza = czyOdlicza;
	}
	
	public TimerThread(JTextField poleTekstowe)
	{
		this.poleTekstowe = poleTekstowe;
		//this.czas = 10000;		//10 sekund
		this.czas = (int)(Double.parseDouble(poleTekstowe.getText()) * 1000);
		setCzyOdlicza(false);
	}
	
	public void run()
	{
		while(getCzas() >= 0 && isCzyOdlicza())
		{
			getPoleTekstowe().setText((double)getCzas()/1000 + "");

			try 
			{
				Thread.sleep(100);
				setCzas(getCzas() - 100);
				System.out.println(isCzyOdlicza());
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
				return;
			}
		}
	}

	//public void stop()
	{
		
	}
	
}
