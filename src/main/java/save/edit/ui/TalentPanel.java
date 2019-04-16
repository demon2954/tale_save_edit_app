package save.edit.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import save.edit.constant.LocationConstant;
import save.edit.listener.BackListener;

public class TalentPanel extends JPanel {
	JButton backBtn = new JButton("返回");
	private static JTextArea jta = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(jta);

	public TalentPanel() {
		setThisPanel();
		setBackBtn();
		setTextArea();
	}

	private void setThisPanel() {
		this.setBackground(Color.BLACK);
		this.setBounds(0, 0, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setLayout(null);
		this.setVisible(false);
	}

	private void setBackBtn() {
		backBtn.setBounds(LocationConstant.BACK_BTN_X, LocationConstant.BACK_BTN_Y, LocationConstant.BACK_BTN_W, LocationConstant.BACK_BTN_H);
		backBtn.addActionListener(new BackListener());
		this.add(backBtn);
	}

	private void setTextArea() {
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(1, LocationConstant.BACK_BTN_H, LocationConstant.FRAME_SIZE_WIDTH - LocationConstant.BACK_BTN_W, LocationConstant.FRAME_SIZE_HEIGHT - LocationConstant.BACK_BTN_H - 50);
		scrollPane.setBackground(Color.BLACK);
		scrollPane.setForeground(Color.WHITE);
		this.add(scrollPane);
	}

	public static JTextArea getJTextArea() {
		return jta;
	}
}
