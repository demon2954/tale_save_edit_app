package save.edit.ui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import save.edit.constant.LocationConstant;

public class EditFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public EditFrame() {
		super("侠客风云传存档修改器");
		setThisFrame();
		setEditPanel();
		setGongFaPanel();
		setTalentPanel();
		setOtherNpcPanel();
		this.setResizable(false);
	}

	private void setOtherNpcPanel() {
		JScrollPane otherNpcPanel = PanelManager.getOtherNpcPanel();
		this.add(otherNpcPanel);
	}

	private void setTalentPanel() {
		TalentPanel talentPanel = PanelManager.getTalentPanel();
		this.add(talentPanel);
	}

	private void setGongFaPanel() {
		GongFaPanel gongFaPanel = PanelManager.getGongFaPanel();
		this.add(gongFaPanel);
	}

	private void setEditPanel() {
		EditPanel editPanel = PanelManager.getEditPanel();
		this.add(editPanel);
	}

	private void setThisFrame() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double height = screenSize.getHeight();
		double width = screenSize.getWidth();
		
		getClass().getResource("/resources/img/logo/icon.jpg");
		
		Image iconImage = null;
		try {
			iconImage = getToolkit().getImage(getClass().getResource("/resources/img/logo/icon.jpg"));
		} catch (Exception e) {
			iconImage = getToolkit().getImage(getClass().getResource("/img/logo/icon.jpg"));
		}
		this.setIconImage(iconImage);
		
		int x = ((int) width - LocationConstant.FRAME_SIZE_HEIGHT) / 2;
		int y = ((int) height - LocationConstant.FRAME_SIZE_WIDTH) / 2;
		this.setBounds(x, y, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int flag = JOptionPane.showConfirmDialog(PanelManager.getEditPanel(), "确认要关闭吗?", "关闭", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (JOptionPane.YES_OPTION == flag) {
					System.exit(0);
				} else {
					return;
				}
			}
		});
		this.setLayout(null);
	}
}
