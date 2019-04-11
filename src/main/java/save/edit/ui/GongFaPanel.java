package save.edit.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import save.edit.constant.LocationConstant;
import save.edit.listener.AllCBListener;
import save.edit.listener.BackListener;

public class GongFaPanel extends JPanel {
	public static int gongfaType = 0;
	JButton backBtn = new JButton("返回");
	JButton allBtn = new JButton("全选");

	public GongFaPanel() {
		setThisPanel();
		setBackBtn();
		setAllBtn();
		setCheckBox();
	}

	private void setCheckBox() {
		JCheckBox[] jianFaCB = CheckBoxManager.getJianFaCheckBoxs();
		JCheckBox[] daoFaCB = CheckBoxManager.getDaoFaCheckBoxs();
		JCheckBox[] quanZhangCB = CheckBoxManager.getQuanZhangCheckBoxs();
		JCheckBox[] tuiFaCB = CheckBoxManager.getTuiFaCheckBoxs();
		JCheckBox[] xinFaCB = CheckBoxManager.getXinFaCheckBoxs();
		JCheckBox[] zhiFaCB = CheckBoxManager.getZhiFaCheckBoxs();
		JCheckBox[] duanBingCB = CheckBoxManager.getDuanBingCheckBoxs();
		JCheckBox[] gunFaCB = CheckBoxManager.getGunFaCheckBoxs();

		int rowIdx = 1;
		int colIdx = 0;
		for (int i = 0; i < jianFaCB.length; i++) {
			JCheckBox one = jianFaCB[i];
			if (i % 5 == 0) {
				rowIdx++;
				colIdx = 1;
			}
			int x = (colIdx - 1) * LocationConstant.CHECK_BOX_W;
			int y = (rowIdx - 1) * LocationConstant.CHECK_BOX_H;
			one.setBounds(x, y, LocationConstant.CHECK_BOX_W, LocationConstant.CHECK_BOX_H);
			one.setBackground(Color.BLACK);
			one.setForeground(Color.WHITE);
			this.add(one);
			colIdx++;
		}

		rowIdx = 1;
		colIdx = 0;
		for (int i = 0; i < daoFaCB.length; i++) {
			JCheckBox one = daoFaCB[i];
			if (i % 5 == 0) {
				rowIdx++;
				colIdx = 1;
			}
			int x = (colIdx - 1) * LocationConstant.CHECK_BOX_W;
			int y = (rowIdx - 1) * LocationConstant.CHECK_BOX_H;
			one.setBounds(x, y, LocationConstant.CHECK_BOX_W, LocationConstant.CHECK_BOX_H);
			one.setBackground(Color.BLACK);
			one.setForeground(Color.WHITE);
			this.add(one);
			colIdx++;
		}

		rowIdx = 1;
		colIdx = 0;
		for (int i = 0; i < quanZhangCB.length; i++) {
			JCheckBox one = quanZhangCB[i];
			if (i % 5 == 0) {
				rowIdx++;
				colIdx = 1;
			}
			int x = (colIdx - 1) * LocationConstant.CHECK_BOX_W;
			int y = (rowIdx - 1) * LocationConstant.CHECK_BOX_H;
			one.setBounds(x, y, LocationConstant.CHECK_BOX_W, LocationConstant.CHECK_BOX_H);
			one.setBackground(Color.BLACK);
			one.setForeground(Color.WHITE);
			this.add(one);
			colIdx++;
		}

		rowIdx = 1;
		colIdx = 0;
		for (int i = 0; i < tuiFaCB.length; i++) {
			JCheckBox one = tuiFaCB[i];
			if (i % 5 == 0) {
				rowIdx++;
				colIdx = 1;
			}
			int x = (colIdx - 1) * LocationConstant.CHECK_BOX_W;
			int y = (rowIdx - 1) * LocationConstant.CHECK_BOX_H;
			one.setBounds(x, y, LocationConstant.CHECK_BOX_W, LocationConstant.CHECK_BOX_H);
			one.setBackground(Color.BLACK);
			one.setForeground(Color.WHITE);
			this.add(one);
			colIdx++;
		}

		rowIdx = 1;
		colIdx = 0;
		for (int i = 0; i < xinFaCB.length; i++) {
			JCheckBox one = xinFaCB[i];
			if (i % 5 == 0) {
				rowIdx++;
				colIdx = 1;
			}
			int x = (colIdx - 1) * LocationConstant.CHECK_BOX_W;
			int y = (rowIdx - 1) * LocationConstant.CHECK_BOX_H;
			one.setBounds(x, y, LocationConstant.CHECK_BOX_W, LocationConstant.CHECK_BOX_H);
			one.setBackground(Color.BLACK);
			one.setForeground(Color.WHITE);
			this.add(one);
			colIdx++;
		}

		rowIdx = 1;
		colIdx = 0;
		for (int i = 0; i < zhiFaCB.length; i++) {
			JCheckBox one = zhiFaCB[i];
			if (i % 5 == 0) {
				rowIdx++;
				colIdx = 1;
			}
			int x = (colIdx - 1) * LocationConstant.CHECK_BOX_W;
			int y = (rowIdx - 1) * LocationConstant.CHECK_BOX_H;
			one.setBounds(x, y, LocationConstant.CHECK_BOX_W, LocationConstant.CHECK_BOX_H);
			one.setBackground(Color.BLACK);
			one.setForeground(Color.WHITE);
			this.add(one);
			colIdx++;
		}
		
		rowIdx = 1;
		colIdx = 0;
		for (int i = 0; i < duanBingCB.length; i++) {
			JCheckBox one = duanBingCB[i];
			if (i % 5 == 0) {
				rowIdx++;
				colIdx = 1;
			}
			int x = (colIdx - 1) * LocationConstant.CHECK_BOX_W;
			int y = (rowIdx - 1) * LocationConstant.CHECK_BOX_H;
			one.setBounds(x, y, LocationConstant.CHECK_BOX_W, LocationConstant.CHECK_BOX_H);
			one.setBackground(Color.BLACK);
			one.setForeground(Color.WHITE);
			this.add(one);
			colIdx++;
		}
		
		rowIdx = 1;
		colIdx = 0;
		for (int i = 0; i < gunFaCB.length; i++) {
			JCheckBox one = gunFaCB[i];
			if (i % 5 == 0) {
				rowIdx++;
				colIdx = 1;
			}
			int x = (colIdx - 1) * LocationConstant.CHECK_BOX_W;
			int y = (rowIdx - 1) * LocationConstant.CHECK_BOX_H;
			one.setBounds(x, y, LocationConstant.CHECK_BOX_W, LocationConstant.CHECK_BOX_H);
			one.setBackground(Color.BLACK);
			one.setForeground(Color.WHITE);
			this.add(one);
			colIdx++;
		}
	}

	private void setBackBtn() {
		backBtn.setBounds(LocationConstant.BACK_BTN_X, LocationConstant.BACK_BTN_Y, LocationConstant.BACK_BTN_W, LocationConstant.BACK_BTN_H);
		backBtn.addActionListener(new BackListener());
		this.add(backBtn);
	}

	private void setAllBtn() {
		allBtn.setBounds(LocationConstant.ALL_BTN_X, LocationConstant.ALL_BTN_Y, LocationConstant.ALL_BTN_W, LocationConstant.ALL_BTN_H);
		allBtn.addActionListener(new AllCBListener());
		this.add(allBtn);
	}

	private void setThisPanel() {
		this.setBackground(Color.BLACK);
		this.setBounds(0, 0, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setLayout(null);
		this.setVisible(false);
	}
}
