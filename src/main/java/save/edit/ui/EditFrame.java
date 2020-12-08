package save.edit.ui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

import save.edit.constant.LocationConstant;

public class EditFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public EditFrame() {
		super("侠客风云传存档修改器");
		setThisFrame();
		setEditPanel();
		setGongFaPanel();
		setItemPanel();
		this.setResizable(false);
	}

	private void setGongFaPanel() {
		GongFaPanel gongFaPanel = PanelManager.getGongFaPanel();
		this.add(gongFaPanel);
	}

	private void setEditPanel() {
		EditPanel editPanel = PanelManager.getEditPanel();
		this.add(editPanel);
	}
	
	private void setItemPanel() {
		ItemPanel itemPanel = PanelManager.getItemPanel();
		this.add(itemPanel);
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
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
	}
}
