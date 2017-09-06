package save.edit.ui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EditFrame extends JFrame {
	public EditFrame(){
		this.setBounds(100, 100, 640, 480);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		JButton btn = new JButton("╪сть");
		btn.setBounds(1, 0, 122, 111);
		this.add(btn);
	}
	
	public static void main(String[] args) {
		new EditFrame();
	}
}
