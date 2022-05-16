import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Kalkulator 
{
	private JFrame frame;
	private JPanel panel;
	private JPanel panelSrodek;
	private JPanel panelDol;
	private JLabel wynik;
	private JButton przycisk0;
	private JButton przycisk1;
	private JButton przycisk2;
	private JButton przycisk3;
	private JButton przycisk4;
	private JButton przycisk5;
	private JButton przycisk6;
	private JButton przycisk7;
	private JButton przycisk8;
	private JButton przycisk9;
	private JButton przyciskC;
	private JButton przyciskKropka;
	private JButton przyciskPlus;
	private JButton przyciskMinus;
	private JButton przyciskMnozenie;
	private JButton przyciskDzielenie;
	private JButton przyciskZnak;
	private JButton przyciskRowne;
	
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
	public JLabel getWynik() {
		return wynik;
	}
	public void setWynik(JLabel wynik) {
		this.wynik = wynik;
	}
	public JButton getPrzycisk0() {
		return przycisk0;
	}
	public void setPrzycisk0(JButton przycisk0) {
		this.przycisk0 = przycisk0;
	}
	public JButton getPrzycisk1() {
		return przycisk1;
	}
	public void setPrzycisk1(JButton przycisk1) {
		this.przycisk1 = przycisk1;
	}
	public JButton getPrzycisk2() {
		return przycisk2;
	}
	public void setPrzycisk2(JButton przycisk2) {
		this.przycisk2 = przycisk2;
	}
	public JButton getPrzycisk3() {
		return przycisk3;
	}
	public void setPrzycisk3(JButton przycisk3) {
		this.przycisk3 = przycisk3;
	}
	public JButton getPrzycisk4() {
		return przycisk4;
	}
	public void setPrzycisk4(JButton przycisk4) {
		this.przycisk4 = przycisk4;
	}
	public JButton getPrzycisk5() {
		return przycisk5;
	}
	public void setPrzycisk5(JButton przycisk5) {
		this.przycisk5 = przycisk5;
	}
	public JButton getPrzycisk6() {
		return przycisk6;
	}
	public void setPrzycisk6(JButton przycisk6) {
		this.przycisk6 = przycisk6;
	}
	public JButton getPrzycisk7() {
		return przycisk7;
	}
	public void setPrzycisk7(JButton przycisk7) {
		this.przycisk7 = przycisk7;
	}
	public JButton getPrzycisk8() {
		return przycisk8;
	}
	public void setPrzycisk8(JButton przycisk8) {
		this.przycisk8 = przycisk8;
	}
	public JButton getPrzycisk9() {
		return przycisk9;
	}
	public void setPrzycisk9(JButton przycisk9) {
		this.przycisk9 = przycisk9;
	}
	public JButton getPrzyciskC() {
		return przyciskC;
	}
	public void setPrzyciskC(JButton przyciskC) {
		this.przyciskC = przyciskC;
	}
	public JButton getPrzyciskKropka() {
		return przyciskKropka;
	}
	public void setPrzyciskKropka(JButton przyciskKropka) {
		this.przyciskKropka = przyciskKropka;
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
	public JButton getPrzyciskDzielenie() {
		return przyciskDzielenie;
	}
	public void setPrzyciskDzielenie(JButton przyciskDzielenie) {
		this.przyciskDzielenie = przyciskDzielenie;
	}
	public JButton getPrzyciskZnak() {
		return przyciskZnak;
	}
	public void setPrzyciskZnak(JButton przyciskZnak) {
		this.przyciskZnak = przyciskZnak;
	}
	public JButton getPrzyciskRowne() {
		return przyciskRowne;
	}
	public void setPrzyciskRowne(JButton przyciskRowne) {
		this.przyciskRowne = przyciskRowne;
	}
	public JPanel getPanelSrodek() {
		return panelSrodek;
	}
	public void setPanelSrodek(JPanel panelSrodek) {
		this.panelSrodek = panelSrodek;
	}
	public JPanel getPanelDol() {
		return panelDol;
	}
	public void setPanelDol(JPanel panelDol) {
		this.panelDol = panelDol;
	}

	public Kalkulator()
	{
		frame = new JFrame("Kalkulator");
		panel = new JPanel();
		panelSrodek = new JPanel();
		panelDol = new JPanel();
		frame.setSize(300, 400);
		frame.setContentPane(panel);
		ustawLayout();
		panel.setBackground(null);
		
		wynik = new JLabel("???", SwingConstants.RIGHT);
		//wynik.setHorizontalAlignment(RIGHT);
		przycisk0 = new JButton("0");
		przycisk1 = new JButton("1");
		przycisk2 = new JButton("2");
		przycisk3 = new JButton("3");
		przycisk4 = new JButton("4");
		przycisk5 = new JButton("5");
		przycisk6 = new JButton("6");
		przycisk7 = new JButton("7");
		przycisk8 = new JButton("8");
		przycisk9 = new JButton("9");
		przyciskC= new JButton("C");
		przyciskKropka= new JButton(".");
		przyciskPlus= new JButton("+");
		przyciskMinus= new JButton("-");
		przyciskMnozenie= new JButton("*");
		przyciskDzielenie= new JButton("/");
		przyciskZnak= new JButton("+/-");
		przyciskRowne= new JButton("=");
		
		KalkulatorActionListener listener = new KalkulatorActionListener(wynik);
		przycisk1.addActionListener(listener);
		przycisk2.addActionListener(listener);
		przycisk3.addActionListener(listener);
		przycisk4.addActionListener(listener);
		przycisk5.addActionListener(listener);
		przycisk6.addActionListener(listener);
		przycisk7.addActionListener(listener);
		przycisk8.addActionListener(listener);
		przycisk9.addActionListener(listener);
		przycisk0.addActionListener(listener);
		przyciskKropka.addActionListener(listener);
		przyciskPlus.addActionListener(listener);
		przyciskMinus.addActionListener(listener);
		przyciskMnozenie.addActionListener(listener);
		przyciskDzielenie.addActionListener(listener);
		przyciskC.addActionListener(listener);
		przyciskZnak.addActionListener(listener);
		przyciskRowne.addActionListener(listener);
		
		dodajElementy();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	private void ustawLayout()
	{
		getPanel().setLayout(new BorderLayout());
		getPanelSrodek().setLayout(new GridLayout(4,4));
		getPanel().add(getPanelSrodek(), BorderLayout.CENTER);
		getPanelDol().setLayout(new FlowLayout());
		getPanel().add(getPanelDol(), BorderLayout.SOUTH);
	}
	
	private void dodajElementy()
	{
		getPanel().add(getWynik(), BorderLayout.NORTH);
		getPanelSrodek().add(getPrzycisk1());
		getPanelSrodek().add(getPrzycisk2());
		getPanelSrodek().add(getPrzycisk3());
		getPanelSrodek().add(getPrzyciskPlus());
		getPanelSrodek().add(getPrzycisk4());
		getPanelSrodek().add(getPrzycisk5());
		getPanelSrodek().add(getPrzycisk6());
		getPanelSrodek().add(getPrzyciskMinus());
		getPanelSrodek().add(getPrzycisk7());
		getPanelSrodek().add(getPrzycisk8());
		getPanelSrodek().add(getPrzycisk9());
		getPanelSrodek().add(getPrzyciskMnozenie());
		getPanelSrodek().add(getPrzycisk0());
		getPanelSrodek().add(getPrzyciskC());
		getPanelSrodek().add(getPrzyciskKropka());
		getPanelSrodek().add(getPrzyciskDzielenie());
		getPanelDol().add(getPrzyciskZnak());
		getPanelDol().add(getPrzyciskRowne());
		
	}



	
	
}
