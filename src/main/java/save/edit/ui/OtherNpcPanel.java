package save.edit.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import save.edit.constant.LocationConstant;
import save.edit.data.xinfa.OtherXinFaManager;
import save.edit.listener.BackListener;
import save.edit.listener.CheckXinFaListener;
import save.edit.model.M_PlayerNeigongNodeList;

public class OtherNpcPanel {
	JButton backBtn = new JButton("返回");

	private static JPanel panel = null;
	private static JScrollPane jsp = null;

	public JScrollPane getScrollPane() {
		return jsp;
	}

	public OtherNpcPanel() {
		setPanel();
		setScrollPanel();
	}

	private void setPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.WHITE);
		panel.setPreferredSize(new Dimension(LocationConstant.FRAME_SIZE_WIDTH - 25, 1360));
		setBackBtn();
		setXinFaList();
	}

	private void setScrollPanel() {
		jsp = new JScrollPane(panel);
		jsp.setBackground(Color.BLACK);
		jsp.setForeground(Color.WHITE);
		jsp.setBounds(0, 0, LocationConstant.FRAME_SIZE_WIDTH - 5, LocationConstant.FRAME_SIZE_HEIGHT - 28);
		jsp.setVisible(false);
	}

	private void setBackBtn() {
		backBtn.setBounds(LocationConstant.BACK_BTN_X - 15, LocationConstant.BACK_BTN_Y, LocationConstant.BACK_BTN_W, LocationConstant.BACK_BTN_H);
		backBtn.addActionListener(new BackListener());
		panel.add(backBtn);
	}

	private void setXinFaList() {
		int column = 4;
		List<M_PlayerNeigongNodeList> otherXinFaList = OtherXinFaManager.getOtherXinFaList();
		int x = 1, y = 30, lw = 130, bw = 60, h = 30;
		int row = 1;
		int colIdx = 1;
		for (M_PlayerNeigongNodeList one : otherXinFaList) {
			int ix = x + (colIdx - 1) * (lw + bw);
			int iy = y + (row - 1) * h;

			int m_iNeigongID = one.getM_iNeigongID();
			JCheckBox xinFaCB = new JCheckBox(one.getM_strNeigongName());
			xinFaCB.setBounds(ix, iy, lw, h);
			xinFaCB.setBackground(Color.BLACK);
			xinFaCB.setForeground(Color.WHITE);
			panel.add(xinFaCB);
			NpcXinFaCheckBoxManager.add(xinFaCB);

			JButton browserBtn = new JButton("查看");
			browserBtn.setBounds(ix + lw, iy, bw, h);

			browserBtn.addActionListener(new CheckXinFaListener(m_iNeigongID));
			panel.add(browserBtn);

			colIdx++;
			if (colIdx >= column) {
				colIdx = 1;
				row++;
			}
		}
	}
}
