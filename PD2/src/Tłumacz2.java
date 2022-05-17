import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class T³umacz2 extends JFrame implements ActionListener
{
	//zadanie 2.2
	private JTextField pole1, pole2;
	private JButton przycisk;
	public static ArrayList<ParaSlow> paraSlow;
	static {
		paraSlow = new ArrayList<>(List.of(new ParaSlow("bread", "chleb"), new ParaSlow("armchair", "fotel"), new ParaSlow("couch", "trener")));
	}
	
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

	
	public T³umacz2()
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//zadanie 2.2
		przycisk.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try 
		{
			if(e.getActionCommand().equals("Poka¿ nastêpne s³ówko"))
			{
				if(getPole1().getText().length() > 0)
				{
					for(ParaSlow ps : paraSlow)
					{
						if(ps.getSlowoAngielskie().equals(getPole1().getText()))
						{
							getPole2().setText(ps.getSlowoPolskie());
							break;
						}
					}
				}
				else
				{
					for(ParaSlow ps : paraSlow)
					{
						if(ps.getSlowoPolskie().equals(getPole2().getText()))
						{
							getPole1().setText(ps.getSlowoAngielskie());
							break;
						}
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
