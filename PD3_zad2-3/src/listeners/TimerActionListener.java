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
	//private TimerThread timerThread;
	private boolean poczatek;
	
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
	public boolean isPoczatek() {
		return poczatek;
	}
	public void setPoczatek(boolean poczatek) {
		this.poczatek = poczatek;
	}
	
	public TimerActionListener(JTextField poleOdliczania, Minutnik minutnik)
	{
		super();
		this.poleOdliczania = poleOdliczania;
		this.minutnik = minutnik;
		//timerThread = new TimerThread(this.poleOdliczania);
		this.poczatek = true;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {
			TimerThread timerThread = new TimerThread(getPoleOdliczania());
			System.out.println("Nowy w¹tek");
			
			switch (e.getActionCommand()) {
			case "Start":
				System.out.println("Start");
				//TimerThread timerThread = new TimerThread(getPoleOdliczania());
				timerThread.setCzyOdlicza(true);
				System.out.println(timerThread.isCzyOdlicza());
				timerThread.start();
				break;
			case "Stop":
				System.out.println("Stop");
				timerThread.setCzyOdlicza(false);
				System.out.println(timerThread.isCzyOdlicza());
				break;
			case "Zamknij":
				System.out.println("Zamknij");
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
