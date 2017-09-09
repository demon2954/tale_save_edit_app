package save.edit.ui;

import java.awt.Color;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import save.edit.LocationConstant;
import save.edit.listener.ChooseFileListener;
import save.edit.listener.LoadListener;

public class EditPanel extends JPanel {
	private JTextField fileChooserBar = new JTextField();// 文件路径文本框
	private JFileChooser fileChoose = new JFileChooser();// 选择文件对话框
	private JButton fileChooseBtn = new JButton("选择");// 选择文件按钮
	private JButton fileLoadBtn = new JButton("载入");// 加载文件按钮
	private JLabel hpLabel = new JLabel("HP");// HP标签
	private JTextField hpTextField = new JTextField();// HP文本
	private JLabel mpLabel = new JLabel("MP");// MP标签
	private JTextField mpTextField = new JTextField();// MP文本
	private JLabel attackLabel = new JLabel("攻击力");// 攻击力标签
	private JTextField attackTextField = new JTextField();// 攻击力文本
	private JLabel defendLabel = new JLabel("防御力");// 防御力标签
	private JTextField defendTextField = new JTextField();// 防御力文本
	private JLabel moneyLabel = new JLabel("金钱");// 金钱标签
	private JTextField moneyTextField = new JTextField();// 金钱文本
	private JButton hpMpAttDefMaxBtn = new JButton("无敌");// 修改hp mp att def 按钮
	private JButton moneyMaxBtn = new JButton("富翁");// 修改金钱按钮

	public EditPanel() {
		setThisPanel();// 设置这个面板
		setFileChooserBar();// 设置文件路径文本框
		setFileChooseBtn();// 设置选择文件按钮
		setFileLoadBtn();// 设置加载文件按钮
		setHpLabel();// 设置hp
		setHpTextField();// 设置HP文本
		setMpLabel();// 设置Mp
		setMpTextField();// 设置MP文本
		setAttackLabel();// 设置攻击力
		setAttackTextField();// 设置攻击力文本
		setDefendLabel();// 设置防御力
		setDefendTextField();// 设置防御力文本
		setMoneyLabel();// 设置金钱
		setMoneyTextField();// 设置金钱文本
		setHpMpAttDefMaxBtn();// 修改hp mp 按钮
		setMoneyMaxBtn();// 修改金钱按钮

		setFileChoose();
	}

	private void setHpMpAttDefMaxBtn() {
//		hpMpMaxBtn.setFont(new Font("黑体", Font.PLAIN, 1));
		hpMpAttDefMaxBtn.setBounds(LocationConstant.HP_MP_ATT_DEF_MAX_BTN_X, LocationConstant.HP_MP_ATT_DEF_MAX_BTN_Y,
				LocationConstant.HP_MP_ATT_DEF_MAX_BTN_WIDTH, LocationConstant.HP_MP_ATT_DEF_MAX_BTN_HEIGHT);
		this.add(hpMpAttDefMaxBtn);
	}

	private void setMoneyMaxBtn() {
//		moneyMaxBtn.setFont(new Font("黑体", Font.PLAIN, 1));
		moneyMaxBtn.setBounds(LocationConstant.MONEY_MAX_BTN_X, LocationConstant.MONEY_MAX_BTN_Y,
				LocationConstant.MONEY_MAX_BTN_WIDTH, LocationConstant.MONEY_MAX_BTN_HEIGHT);
		this.add(moneyMaxBtn);
	}

	private void setMoneyTextField() {
		moneyTextField.setBounds(LocationConstant.MONEY_TEXT_X, LocationConstant.MONEY_TEXT_Y,
				LocationConstant.MONEY_TEXT_WIDTH, LocationConstant.MONEY_TEXT_HEIGHT);
		this.add(moneyTextField);
	}

	private void setMoneyLabel() {
		moneyLabel.setForeground(Color.WHITE);
		moneyLabel.setBounds(LocationConstant.MONEY_LABEL_X, LocationConstant.MONEY_LABEL_Y,
				LocationConstant.MONEY_LABEL_WIDTH, LocationConstant.MONEY_LABEL_HEIGHT);
		this.add(moneyLabel);
	}

	private void setDefendTextField() {
		defendTextField.setBounds(LocationConstant.DEFEND_TEXT_X, LocationConstant.DEFEND_TEXT_Y,
				LocationConstant.DEFEND_TEXT_WIDTH, LocationConstant.DEFEND_TEXT_HEIGHT);
		this.add(defendTextField);
	}

	private void setDefendLabel() {
		defendLabel.setForeground(Color.WHITE);
		defendLabel.setBounds(LocationConstant.DEFEND_LABEL_X, LocationConstant.DEFEND_LABEL_Y,
				LocationConstant.DEFEND_LABEL_WIDTH, LocationConstant.DEFEND_LABEL_HEIGHT);
		this.add(defendLabel);
	}

	private void setAttackTextField() {
		attackTextField.setBounds(LocationConstant.ATTACK_TEXT_X, LocationConstant.ATTACK_TEXT_Y,
				LocationConstant.ATTACK_TEXT_WIDTH, LocationConstant.ATTACK_TEXT_HEIGHT);
		this.add(attackTextField);
	}

	private void setAttackLabel() {
		attackLabel.setForeground(Color.WHITE);
		attackLabel.setBounds(LocationConstant.ATTACK_LABEL_X, LocationConstant.ATTACK_LABEL_Y,
				LocationConstant.ATTACK_LABEL_WIDTH, LocationConstant.ATTACK_LABEL_HEIGHT);
		this.add(attackLabel);
	}

	private void setMpTextField() {
		mpTextField.setBounds(LocationConstant.MP_TEXT_X, LocationConstant.MP_TEXT_Y, LocationConstant.MP_TEXT_WIDTH,
				LocationConstant.MP_TEXT_HEIGHT);
		this.add(mpTextField);
	}

	private void setMpLabel() {
		mpLabel.setForeground(Color.WHITE);
		mpLabel.setBounds(LocationConstant.MP_LABEL_X, LocationConstant.MP_LABEL_Y, LocationConstant.MP_LABEL_WIDTH,
				LocationConstant.MP_LABEL_HEIGHT);
		this.add(mpLabel);
	}

	private void setHpTextField() {
		hpTextField.setBounds(LocationConstant.HP_TEXT_X, LocationConstant.HP_TEXT_Y, LocationConstant.HP_TEXT_WIDTH,
				LocationConstant.HP_TEXT_HEIGHT);
		this.add(hpTextField);
	}

	private void setHpLabel() {
		hpLabel.setForeground(Color.WHITE);
		hpLabel.setBounds(LocationConstant.HP_LABEL_X, LocationConstant.HP_LABEL_Y, LocationConstant.HP_LABEL_WIDTH,
				LocationConstant.HP_LABEL_HEIGHT);
		this.add(hpLabel);
	}

	private void setFileLoadBtn() {
		fileLoadBtn.setBounds(LocationConstant.FILE_LOAD_BTN_SIZE_X, LocationConstant.FILE_LOAD_BTN_SIZE_Y,
				LocationConstant.FILE_LOAD_BTN_SIZE_WIDTH, LocationConstant.FILE_LOAD_BTN_SIZE_HEIGHT);
		fileLoadBtn.addActionListener(new LoadListener(fileChooserBar, hpTextField, mpTextField, attackTextField, defendTextField, moneyTextField));
		this.add(fileLoadBtn);
	}

	private void setFileChooseBtn() {
		fileChooseBtn.setBounds(LocationConstant.FILE_CHOOSER_BTN_SIZE_X, LocationConstant.FILE_CHOOSER_BTN_SIZE_Y,
				LocationConstant.FILE_CHOOSER_BTN_SIZE_WIDTH, LocationConstant.FILE_CHOOSER_BTN_SIZE_HEIGHT);
		fileChooseBtn.addActionListener(new ChooseFileListener(fileChooserBar));
		this.add(fileChooseBtn);
	}

	private void setFileChooserBar() {
		fileChooserBar.setEditable(false);
		fileChooserBar.setBounds(LocationConstant.FILE_CHOOSER_BAR_SIZE_X, LocationConstant.FILE_CHOOSER_BAR_SIZE_Y,
				LocationConstant.FILE_CHOOSER_BAR_SIZE_WIDTH, LocationConstant.FILE_CHOOSER_BAR_SIZE_HEIGHT);
		this.add(fileChooserBar);
	}

	private void setFileChoose() {
		new FileChooser(fileChooserBar);
	}

	private void setThisPanel() {
		this.setBackground(Color.BLACK);
		this.setBounds(0, 0, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setLayout(null);
	}
}
