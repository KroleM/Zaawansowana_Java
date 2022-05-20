package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import threads.TimerThread;
import zadania.Minutnik;

public class TimerActionListener implements ActionListener
{
	private JTextField poleOdliczania;
	private Minutnik minutnik;
	private TimerThread timerThread;
	
	public Minutnik getMinutnik() {
		return minutnik;
	}
	public void setMinutnik(Minutnik minutnik) {
		this.minutnik = minutnik;
	}
	public JTextField getPoleOdliczania() {
		return poleOdliczania;
	}
	public void setPoleOdliczania(JTextField poleOdliczania) {
		this.poleOdliczania = poleOdliczania;
	}
	
	public TimerActionListener(JTextField poleOdliczania, Minutnik minutnik)
	{
		super();
		this.poleOdliczania = poleOdliczania;
		this.minutnik = minutnik;
		timerThread = new TimerThread(this.poleOdliczania);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {	
			switch (e.getActionCommand()) {
			case "Start":
				System.out.println("Start");
				timerThread.setCzyOdlicza(false);					//dezaktywacja bie¿¹cego (starego) w¹tku
				timerThread = new TimerThread(getPoleOdliczania());	//stworzenie nowego w¹tku
				timerThread.setCzyOdlicza(true);					//aktywacja nowego w¹tku
				timerThread.start();								//rozpoczêcie nowego w¹tku
				break;
			case "Stop":
				System.out.println("Stop");
				timerThread.setCzyOdlicza(false);
				break;
			case "Zamknij":
				System.out.println("Zamknij");
				timerThread.setCzyOdlicza(false);
				getMinutnik().dispose();
				break;
			}
		} 
		catch (Exception ex) 
		{
			getPoleOdliczania().setText("ERROR");
		}
	}

}
