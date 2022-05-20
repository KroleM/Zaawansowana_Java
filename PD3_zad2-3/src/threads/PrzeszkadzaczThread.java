package threads;

import zadania.Komunikator;

public class PrzeszkadzaczThread extends Thread
{
	private Komunikator komunikator;
	private volatile boolean obrazony;

	public Komunikator getKomunikator() {
		return komunikator;
	}
	public void setKomunikator(Komunikator komunikator) {
		this.komunikator = komunikator;
	}
	public boolean isObrazony() {
		return obrazony;
	}
	public void setObrazony(boolean obrazony) {
		this.obrazony = obrazony;
	}

	public PrzeszkadzaczThread(Komunikator komunikator) 
	{
		this.komunikator = komunikator;
		this.obrazony = false;
	}
	

	@Override
	public void run()
	{
		while(!isObrazony())
		{
			getKomunikator().uzupelnijiWypiszTekst("Tu Przeszkadzacz. Jak siê masz?\n");
			//getKomunikator().uzupelnijiWypiszTekst(isObrazony() + "\n");
			try 
			{
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
				return;
			}
		}
	}
	
}
