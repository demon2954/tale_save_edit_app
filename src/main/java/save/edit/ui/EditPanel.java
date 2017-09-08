package save.edit.ui;

import javax.swing.JButton;
import javax.swing.JPanel;

public class EditPanel extends JPanel {
	public EditPanel() {
		this.setBounds(100, 100, 640, 480);
		this.setVisible(true);
		
		JButton btn = new JButton("确定");
		btn.setBounds(1, 0, 122, 111);
		this.add(btn);
	}
}
