package save.edit.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

import save.edit.LocationConstant;

public class EditFrame extends JFrame {
	public EditFrame() {
		super("侠客风云传存档修改器");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double height = screenSize.getHeight();
		double width = screenSize.getWidth();
		int x = ((int) width - LocationConstant.FRAME_SIZE_HEIGHT) / 2;
		int y = ((int) height - LocationConstant.FRAME_SIZE_WIDTH) / 2;
		this.setBounds(x, y, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);

		JButton btn = new JButton("确定");
		btn.setBounds(1, 0, 122, 111);
		this.add(btn);
	}

	public static void main(String[] args) {
		new EditFrame();
	}
}
