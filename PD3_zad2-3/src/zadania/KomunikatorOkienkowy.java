package zadania;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import listeners.KomunikatorActionListener;
import threads.PrzeszkadzaczThread;

public class KomunikatorOkienkowy extends JFrame
{
	private JTextArea poleTekstowe;
	private JTextField poleDoWyslania;
	
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
	
	public KomunikatorOkienkowy()
	{
		super("Komunikator");
		setSize(500, 400);
		JPanel panelGlowny = new JPanel(new BorderLayout());
		panelGlowny.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setContentPane(panelGlowny);
		
		JPanel panelDolny = new JPanel();
		JButton wyslij = new JButton("Wyœlij");
		poleTekstowe = new JTextArea(10, 40);
		poleTekstowe.setEditable(false);
		poleDoWyslania = new JTextField(30);
		JScrollPane scroll = new JScrollPane(poleTekstowe);		//przewijanie JTextArea
		panelGlowny.add(scroll, BorderLayout.CENTER);	//panelGlowny.add(poleTekstowe, BorderLayout.CENTER);
		panelDolny.add(poleDoWyslania);
		panelDolny.add(wyslij);
		panelGlowny.add(panelDolny, BorderLayout.SOUTH);
		
		Komunikator komunikator = new Komunikator(poleTekstowe);
		PrzeszkadzaczThread przeszkadzaczThread = new PrzeszkadzaczThread(komunikator);
		przeszkadzaczThread.start();
		
		KomunikatorActionListener listener = new KomunikatorActionListener(poleTekstowe, poleDoWyslania, przeszkadzaczThread, komunikator);
		wyslij.addActionListener(listener);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
