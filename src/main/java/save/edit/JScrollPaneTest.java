package save.edit;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class JScrollPaneTest extends JFrame {
	public JScrollPaneTest() {
		this.setLayout(null);
		JPanel jp = new JPanel();
		jp.add(new JButton("ddddddd"));
		jp.setPreferredSize(new Dimension(200, 100));
		JScrollPane sp = new JScrollPane(jp);
		this.setBounds(100, 100, 300, 200);
		sp.setBounds(10, 10, 175, 70);
		this.getContentPane().add(sp);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new JScrollPaneTest();
	}
}