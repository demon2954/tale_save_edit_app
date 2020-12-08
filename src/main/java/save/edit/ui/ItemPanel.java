package save.edit.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import save.edit.constant.LocationConstant;
import save.edit.listener.BackListener;

public class ItemPanel extends JPanel {
	JButton backBtn = new JButton("返回");
	JButton allBtn = new JButton("全选");

	public ItemPanel() {
		setThisPanel();
		setBackBtn();
		setAllBtn();
	}

	private void setBackBtn() {
		backBtn.setBounds(LocationConstant.BACK_BTN_X, LocationConstant.BACK_BTN_Y, LocationConstant.BACK_BTN_W, LocationConstant.BACK_BTN_H);
		backBtn.addActionListener(new BackListener());
		this.add(backBtn);
	}

	private void setAllBtn() {
		allBtn.setBounds(LocationConstant.ALL_BTN_X, LocationConstant.ALL_BTN_Y, LocationConstant.ALL_BTN_W, LocationConstant.ALL_BTN_H);
//		allBtn.addActionListener(new AllCBListener());
		this.add(allBtn);
	}

	private void setThisPanel() {
		this.setBackground(Color.BLACK);
		this.setBounds(0, 0, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setLayout(null);
		this.setVisible(false);
	}
}
