package save.edit.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import save.edit.LocationConstant;
import save.edit.listener.BackListener;

public class GongFaPanel extends JPanel {
	JButton backBtn = new JButton("返回");

	public GongFaPanel() {
		setThisPanel();
		setBackBtn();
	}

	private void setBackBtn() {
		backBtn.setBounds(LocationConstant.BACK_BTN_X, LocationConstant.BACK_BTN_Y, LocationConstant.BACK_BTN_W, LocationConstant.BACK_BTN_H);
		backBtn.addActionListener(new BackListener());
		this.add(backBtn);
	}

	private void setThisPanel() {
		this.setBackground(Color.BLACK);
		this.setBounds(0, 0, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setLayout(null);
		this.setVisible(false);
	}
}
