import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.*;


public class Tlumacz extends JFrame implements ActionListener
{
	
	
	public Tlumacz()
	{
		super("Prezentacja s³ówek angielskich");
		setSize(700,100);
		JPanel panel = new JPanel();
		setContentPane(panel);
		
		panel.add(new JLabel("Po angielsku:"));
		JTextField pole1 = new JTextField(20);
		panel.add(pole1);
		panel.add(new JLabel("Po polsku:"));
		JTextField pole2 = new JTextField(20);
		panel.add(pole2);
		JButton button = new JButton("Poka¿ nastêpne s³ówko");
		panel.add(button);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
