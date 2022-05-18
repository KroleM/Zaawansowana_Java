import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Kalkulator {
	private JFrame frame;
	private JPanel panel;
	private JPanel panelDolny;
	private JTextField operand1;
	private JTextField operand2;
	private JButton przyciskPlus;
	private JButton przyciskMinus;
	private JButton przyciskMnozenie;
	private JLabel wynik;
	private JTextField dataTekst;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JPanel getPanelDolny() {
		return panelDolny;
	}

	public void setPanelDolny(JPanel panelDolny) {
		this.panelDolny = panelDolny;
	}

	public JTextField getOperand1() {
		return operand1;
	}

	public void setOperand1(JTextField operand1) {
		this.operand1 = operand1;
	}

	public JTextField getOperand2() {
		return operand2;
	}

	public void setOperand2(JTextField operand2) {
		this.operand2 = operand2;
	}

	public JButton getPrzyciskPlus() {
		return przyciskPlus;
	}

	public void setPrzyciskPlus(JButton przyciskPlus) {
		this.przyciskPlus = przyciskPlus;
	}

	public JButton getPrzyciskMinus() {
		return przyciskMinus;
	}

	public void setPrzyciskMinus(JButton przyciskMinus) {
		this.przyciskMinus = przyciskMinus;
	}

	public JButton getPrzyciskMnozenie() {
		return przyciskMnozenie;
	}

	public void setPrzyciskMnozenie(JButton przyciskMnozenie) {
		this.przyciskMnozenie = przyciskMnozenie;
	}

	public JLabel getWynik() {
		return wynik;
	}

	public void setWynik(JLabel wynik) {
		this.wynik = wynik;
	}

	public JTextField getDataTekst() {
		return dataTekst;
	}

	public void setDataTekst(JTextField dataTekst) {
		this.dataTekst = dataTekst;
	}

	public Kalkulator() {
		frame = new JFrame("Prosty kalkulator");
		panel = new JPanel();
		panel.setBackground(null);
		panelDolny = new JPanel();
		panelDolny.setBackground(null);
		ustawLayout();
		frame.setSize(500, 150);
		frame.setContentPane(panel);

		operand1 = new JTextField(8);
		operand2 = new JTextField(8);
		przyciskPlus = new JButton("+");
		przyciskMinus = new JButton("-");
		przyciskMnozenie = new JButton("*");
		wynik = new JLabel("???");
		dataTekst = new JTextField("Tu bêdzie data");
		dataTekst.setBackground(new Color(255, 255, 0));
		KalkulatorActionListener listener = new KalkulatorActionListener(operand1, operand2, wynik);
		przyciskPlus.addActionListener(listener);
		przyciskMinus.addActionListener(listener);
		przyciskMnozenie.addActionListener(listener);

		dodajElementy();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	protected void ustawLayout() {
		getPanel().setLayout(new BorderLayout());
		getPanelDolny().setLayout(new GridLayout(3, 3));
		getPanel().add(getPanelDolny(), BorderLayout.CENTER);
	}

	protected void dodajElementy() {
		getPanelDolny().add(new JLabel("Operand 1:"));
		getPanelDolny().add(new JLabel("Operand 2:"));
		getPanelDolny().add(new JLabel("Wynik operacji:"));
		getPanelDolny().add(getOperand1());
		getPanelDolny().add(getOperand2());
		getPanelDolny().add(getWynik());
		getPanelDolny().add(getPrzyciskPlus());
		getPanelDolny().add(getPrzyciskMinus());
		getPanelDolny().add(getPrzyciskMnozenie());
		getPanel().add(getDataTekst(), BorderLayout.NORTH);

	}

}
