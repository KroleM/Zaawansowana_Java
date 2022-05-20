package Program_PD3;

import java.util.Date;

import javax.swing.JTextField;

public class Zegar {
	private Date data;
	// private Calendar cDate;
	private JTextField tekst;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public JTextField getTekst() {
		return tekst;
	}

	public void setTekst(JTextField tekst) {
		this.tekst = tekst;
	}

	public Zegar(JTextField tekst) {
		data = new Date();
		this.tekst = tekst;
	}
	
	public void AktualizujDate()
	{
		setData(new Date());
	}

	public synchronized void WypiszDate() {
		//getTekst().append(getData().toString());
		getTekst().setText(getData().toString());
	}
}
