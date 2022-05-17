import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.*;


public class Tlumacz extends JFrame implements ActionListener
{
	//zadanie 2.2
	private JTextField pole1, pole2;
	private JButton przycisk;
	public static String[] angielskie = {"bread", "leg", "field", "printer", "rectangle"};
	public static String[] polskie = {"chleb", "noga", "pole", "drukarka", "prostok¹t"};
	
	public JTextField getPole1() {
		return pole1;
	}
	public void setPole1(JTextField pole1) {
		this.pole1 = pole1;
	}
	public JTextField getPole2() {
		return pole2;
	}
	public void setPole2(JTextField pole2) {
		this.pole2 = pole2;
	}
	public JButton getPrzycisk() {
		return przycisk;
	}
	public void setPrzycisk(JButton przycisk) {
		this.przycisk = przycisk;
	}

	
	public Tlumacz()
	{
		//zadanie 2.1
		super("Prezentacja s³ówek angielskich");
		setSize(700,100);
		JPanel panel = new JPanel();
		setContentPane(panel);
		
		panel.add(new JLabel("Po angielsku:"));
		pole1 = new JTextField(20);
		panel.add(pole1);
		panel.add(new JLabel("Po polsku:"));
		pole2 = new JTextField(20);
		panel.add(pole2);
		przycisk = new JButton("Poka¿ nastêpne s³ówko");
		panel.add(przycisk);
		
		//zadanie 2.2
		pole1.addActionListener(this);
		pole2.addActionListener(this);
		przycisk.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try 
		{
			if(e.getActionCommand().equals("Poka¿ nastêpne s³ówko"))
			{
				System.out.println("tak");
				if(getPole1().getText().length() > 0)
					for(int i=0; i<5; i++)
					{
						if(getPole1().getText().equals(angielskie[i])) 
						{
							getPole2().setText(polskie[i]);
							break;
						}
					}
				else
				for(int i=0; i<5; i++)
				{
					if(getPole2().getText().equals(polskie[i])) 
					{
						getPole1().setText(angielskie[i]);
						break;
					}
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error");
		}
		
	}
}
