package Program_PD3;

import java.util.Date;

import javax.swing.JTextArea;

public class Zegar {
	private Date data;
	// private Calendar cDate;
	private JTextArea tekst;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public JTextArea getTekst() {
		return tekst;
	}

	public void setTekst(JTextArea tekst) {
		this.tekst = tekst;
	}

	public Zegar(JTextArea tekst) {
		data = new Date();
		this.tekst = tekst;
	}

	public synchronized void WypiszDate() {
		getTekst().append(getData().toString());
	}
}
