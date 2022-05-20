package threads;

import Program_PD3.Zegar;

public class ZegarThread extends Thread
{
	private Zegar zegar;

	public Zegar getZegar() {
		return zegar;
	}
	public void setZegar(Zegar zegar) {
		this.zegar = zegar;
	}
	
	public ZegarThread(Zegar zegar)
	{
		this.zegar = zegar;
	}
	
	public void run()
	{
		while(true)
		{
			getZegar().AktualizujDate(); 		//aktualizacja daty
			getZegar().WypiszDate();
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
				return;
			}
		}
	}
}
