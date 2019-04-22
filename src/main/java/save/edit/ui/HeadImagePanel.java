package save.edit.ui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import save.edit.constant.LocationConstant;
import save.edit.listener.BackListener;

public class HeadImagePanel extends JPanel {
	private static final long serialVersionUID = -4153160000685803686L;

	JButton backBtn = new JButton("返回");

	private JRadioButton one = new JRadioButton();
	private JRadioButton two = new JRadioButton();
	private JRadioButton three = new JRadioButton();
	private JRadioButton four = new JRadioButton();
	private JRadioButton five = new JRadioButton();
	private JRadioButton six = new JRadioButton();

	public HeadImagePanel() {
		setThisPanel();
		setRadios();
		setBackBtn();
	}

	private void setBackBtn() {
		backBtn.setBounds(LocationConstant.BACK_BTN_X, LocationConstant.BACK_BTN_Y, LocationConstant.BACK_BTN_W, LocationConstant.BACK_BTN_H);
		backBtn.addActionListener(new BackListener());
		this.add(backBtn);
	}

	private void setRadios() {
		int size = 200;
		ImageIcon image1 = new ImageIcon(ClassLoader.class.getResource("/img/head/1.jpg"));
		image1.setImage(image1.getImage().getScaledInstance(size, size, Image.SCALE_DEFAULT));
		JLabel headOne = new JLabel(image1);
		headOne.setBounds(0, 30, size, size);
		this.add(headOne);

		ImageIcon image2 = new ImageIcon(ClassLoader.class.getResource("/img/head/2.jpg"));
		image2.setImage(image2.getImage().getScaledInstance(size, size, Image.SCALE_DEFAULT));
		JLabel headTwo = new JLabel(image2);
		headTwo.setBounds(220, 30, size, size);
		this.add(headTwo);

		ImageIcon image3 = new ImageIcon(ClassLoader.class.getResource("/img/head/3.jpg"));
		image3.setImage(image3.getImage().getScaledInstance(size, size, Image.SCALE_DEFAULT));
		JLabel headThree = new JLabel(image3);
		headThree.setBounds(440, 30, size, size);
		this.add(headThree);

		ImageIcon image4 = new ImageIcon(ClassLoader.class.getResource("/img/head/4.jpg"));
		image4.setImage(image4.getImage().getScaledInstance(size, size, Image.SCALE_DEFAULT));
		JLabel headFour = new JLabel(image4);
		headFour.setBounds(0, 260, size, size);
		this.add(headFour);

		ImageIcon image5 = new ImageIcon(ClassLoader.class.getResource("/img/head/5.jpg"));
		image5.setImage(image5.getImage().getScaledInstance(size, size, Image.SCALE_DEFAULT));
		JLabel headFive = new JLabel(image5);
		headFive.setBounds(220, 260, size, size);
		this.add(headFive);

		ImageIcon image6 = new ImageIcon(ClassLoader.class.getResource("/img/head/6.jpg"));
		image6.setImage(image6.getImage().getScaledInstance(size, size, Image.SCALE_DEFAULT));
		JLabel headSix = new JLabel(image6);
		headSix.setBounds(440, 260, size, size);
		this.add(headSix);

		one.setBounds(90, 230, 15, 15);
		one.setBackground(Color.BLACK);
		HeadImageBtnGroup.add(one);

		two.setBounds(310, 230, 15, 15);
		two.setBackground(Color.BLACK);
		HeadImageBtnGroup.add(two);

		three.setBounds(540, 230, 15, 15);
		three.setBackground(Color.BLACK);
		HeadImageBtnGroup.add(three);

		four.setBounds(90, 460, 15, 15);
		four.setBackground(Color.BLACK);
		HeadImageBtnGroup.add(four);

		five.setBounds(310, 460, 15, 15);
		five.setBackground(Color.BLACK);
		HeadImageBtnGroup.add(five);

		six.setBounds(540, 460, 15, 15);
		six.setBackground(Color.BLACK);
		HeadImageBtnGroup.add(six);
		this.add(one);
		this.add(two);
		this.add(three);
		this.add(four);
		this.add(five);
		this.add(six);
	}

	private void setThisPanel() {
		this.setBackground(Color.BLACK);
		this.setBounds(0, 0, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setLayout(null);
		this.setVisible(false);
	}
}
