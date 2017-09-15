package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MoneyListener implements ActionListener {
	private JTextField moneyTextField;

	public void actionPerformed(ActionEvent e) {
		moneyTextField.setText("999999");
	}

	public MoneyListener(JTextField moneyTextField) {
		super();
		this.moneyTextField = moneyTextField;
	}
}
