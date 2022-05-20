package zadania;

import java.awt.GridLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.TimerActionListener;
import threads.TimerThread;

public class Minutnik extends JFrame
{
	private JTextField poleOdliczania;
	
		
	public JTextField getPoleOdliczania() {
		return poleOdliczania;
	}
	public void setPoleOdliczania(JTextField poleOdliczania) {
		this.poleOdliczania = poleOdliczania;
	}

	public Minutnik()
	{
		super("Minutnik");
		setSize(300, 200);
		JPanel panelGlowny = new JPanel(new GridLayout(3, 1));
		panelGlowny.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		setContentPane(panelGlowny);
		
		poleOdliczania = new JTextField("0.0");
		poleOdliczania.setEditable(true);
		poleOdliczania.setFont(new Font("Calibri", Font.BOLD, 26));
		poleOdliczania.setHorizontalAlignment(JTextField.CENTER);
		JPanel panelDolny = new JPanel();
		JLabel polecenie = new JLabel("Wpisz czas w sekundach:");
		panelGlowny.add(polecenie);
		panelGlowny.add(poleOdliczania);
		panelGlowny.add(panelDolny);
		
		JButton start = new JButton("Start");
		JButton stop = new JButton("Stop");
		JButton zamknij = new JButton("Zamknij");
		panelDolny.add(start);
		panelDolny.add(stop);
		panelDolny.add(zamknij);
		
		TimerActionListener listener = new TimerActionListener(poleOdliczania, this);
		start.addActionListener(listener);
		stop.addActionListener(listener);
		zamknij.addActionListener(listener);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}	
	
}
