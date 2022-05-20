package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import threads.PrzeszkadzaczThread;
import zadania.Komunikator;

public class KomunikatorActionListener implements ActionListener
{
	private Komunikator komunikator;
	private JTextArea poleTekstowe;
	private JTextField poleDoWyslania;
	private PrzeszkadzaczThread przeszkadzaczThread;


	public PrzeszkadzaczThread getPrzeszkadzaczThread() {
		return przeszkadzaczThread;
	}
	public void setPrzeszkadzaczThread(PrzeszkadzaczThread przeszkadzaczThread) {
		this.przeszkadzaczThread = przeszkadzaczThread;
	}
	public JTextField getPoleDoWyslania() {
		return poleDoWyslania;
	}
	public void setPoleDoWyslania(JTextField poleDoWyslania) {
		this.poleDoWyslania = poleDoWyslania;
	}
	public JTextArea getPoleTekstowe() {
		return poleTekstowe;
	}
	public void setPoleTekstowe(JTextArea poleTekstowe) {
		this.poleTekstowe = poleTekstowe;
	}
		public Komunikator getKomunikator() {
		return komunikator;
	}
	public void setKomunikator(Komunikator komunikator) {
		this.komunikator = komunikator;
	}
	
	public KomunikatorActionListener(JTextArea poleTekstowe, JTextField poleDoWyslania, PrzeszkadzaczThread przeszkadzaczThread, Komunikator komunikator)
	{
		super();
		this.poleTekstowe = poleTekstowe;
		this.poleDoWyslania = poleDoWyslania;
		this.przeszkadzaczThread = przeszkadzaczThread;
		this.komunikator = komunikator;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//if(!e.getActionCommand().isEmpty())
		{
		try
		{
			if(!getPoleDoWyslania().getText().isEmpty())
				getPoleTekstowe().append(getPoleDoWyslania().getText() + "\n");
			if(getPoleDoWyslania().getText().equals("JAVA to kiepski jêzyk!")) 
			{
				getPoleTekstowe().append("Nieprawda!\n");
				getPrzeszkadzaczThread().setObrazony(true);
			}
			if(getPoleDoWyslania().getText().equals("Przepraszam, JAVA jest super!")) 
			{
				if(getPrzeszkadzaczThread().isObrazony()) 	//zabezpieczenie, aby nie w³¹czy³y siê 2 w¹tki Przeszkadzacza naraz
				{
					getPoleTekstowe().append("Ok, wybaczam Ci!\n");
					getPrzeszkadzaczThread().setObrazony(false);
					setPrzeszkadzaczThread(new PrzeszkadzaczThread(getKomunikator()));
					getPrzeszkadzaczThread().start();
				}
			}
			getPoleDoWyslania().setText("");
		}
		catch(Exception ex)
		{
			getPoleTekstowe().append("ERROR");
		}
		}
	}
	
}
