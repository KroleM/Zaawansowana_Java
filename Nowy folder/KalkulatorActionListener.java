import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KalkulatorActionListener implements ActionListener {
	private JTextField operand1;
	private JTextField operand2;
	private JLabel wynik;

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

	public JLabel getWynik() {
		return wynik;
	}

	public void setWynik(JLabel wynik) {
		this.wynik = wynik;
	}

	public KalkulatorActionListener(JTextField operand1, JTextField operand2, JLabel wynik) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.wynik = wynik;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			switch (e.getActionCommand()) {
			case "+":
				getWynik().setText(
						Double.parseDouble(getOperand1().getText()) + Double.parseDouble(getOperand2().getText()) + "");
				break;
			case "-":
				getWynik().setText(
						Double.parseDouble(getOperand1().getText()) - Double.parseDouble(getOperand2().getText()) + "");
				break;
			case "*":
				getWynik().setText(
						Double.parseDouble(getOperand1().getText()) * Double.parseDouble(getOperand2().getText()) + "");
				break;
			}
		} catch (Exception ex) {
			getWynik().setText("ERROR");
		}
	}
}
