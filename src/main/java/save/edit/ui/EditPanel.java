package save.edit.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import save.edit.constant.LocationConstant;
import save.edit.listener.ChooseFileListener;
import save.edit.listener.FriendFullListener;
import save.edit.listener.LoadListener;
import save.edit.listener.MaxListener;
import save.edit.listener.MoneyListener;
import save.edit.listener.SaveListener;
import save.edit.listener.ToGongFaListener;

public class EditPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTextField fileChooserBar = new JTextField();// 文件路径文本框
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
	private JButton maxBtn = new JButton("无敌");// 修改hp mp att def 按钮
	private JButton moneyMaxBtn = new JButton("富翁");// 修改金钱按钮

	private JLabel[] propertyLabels = new JLabel[LocationConstant.PROPERTIES_COUNT];
	private JTextField[] propertyTextFields = new JTextField[LocationConstant.PROPERTIES_COUNT];

	private JButton jianfaBtn = new JButton("剑法");// 剑法
	private JButton daofaBtn = new JButton("刀法");// 刀法
	private JButton quanzhangBtn = new JButton("拳掌");// 拳掌
	private JButton zhifaBtn = new JButton("指法");// 指法
	private JButton tuifaBtn = new JButton("腿法");// 腿法
	private JButton xinfaBtn = new JButton("心法");// 心法
	private JButton friendBtn = new JButton("魅力四射");// 友好度
	private JButton saveBtn = new JButton("保存");// 保存

	private JButton gunfaBtn = new JButton("棍法");// 棍法
	private JButton anqiBtn = new JButton("暗器");// 暗器
	private JButton duanbingBtn = new JButton("短柄");// 短柄
	private JButton qingongBtn = new JButton("琴功");// 琴功

	private JLabel signLable = new JLabel();// 签名

	private JLabel xingLibel = new JLabel("姓");
	private JTextField xingText= new JTextField();
	private JLabel mingLibel = new JLabel("名");
	private JTextField mingText= new JTextField();

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
		setProperties();// 设置属性列表
		setEditButton();// 设置按钮
		setName();
		setSignLable();// 设置签名

		// setFileChoose();
	}

	private void setName() {
		xingLibel.setForeground(Color.WHITE);
		xingLibel.setBounds(LocationConstant.XING_LABEL_X, LocationConstant.XING_LABEL_Y, LocationConstant.XING_LABEL_W,
				LocationConstant.XING_LABEL_H);
		xingText.setBounds(LocationConstant.XING_TEXT_X, LocationConstant.XING_TEXT_Y, LocationConstant.XING_TEXT_W,
				LocationConstant.XING_TEXT_H);
		mingLibel.setForeground(Color.WHITE);
		mingLibel.setBounds(LocationConstant.MING_LABEL_X, LocationConstant.MING_LABEL_Y, LocationConstant.MING_LABEL_W,
				LocationConstant.MING_LABEL_H);
		mingText.setBounds(LocationConstant.MING_TEXT_X, LocationConstant.MING_TEXT_Y, LocationConstant.MING_TEXT_W,
				LocationConstant.MING_TEXT_H);
		this.add(xingLibel);
		this.add(xingText);
		this.add(mingLibel);
		this.add(mingText);
	}

	private void setSignLable() {
		signLable.setForeground(Color.red);
		signLable.setText("Create by Zone. Version 1.0.1");
		signLable.setBounds(LocationConstant.SIGN_LABEL_X, LocationConstant.SIGN_LABEL_Y, LocationConstant.SIGN_LABEL_W,
				LocationConstant.SIGN_LABEL_H);
		this.add(signLable);
	}

	private void setHpMpAttDefMaxBtn() {
		maxBtn.setBounds(LocationConstant.HP_MP_ATT_DEF_MAX_BTN_X, LocationConstant.HP_MP_ATT_DEF_MAX_BTN_Y,
				LocationConstant.HP_MP_ATT_DEF_MAX_BTN_WIDTH, LocationConstant.HP_MP_ATT_DEF_MAX_BTN_HEIGHT);
		maxBtn.addActionListener(new MaxListener(propertyTextFields, hpTextField, mpTextField, attackTextField, defendTextField));
		this.add(maxBtn);
	}

	private void setMoneyMaxBtn() {
		moneyMaxBtn.setBounds(LocationConstant.MONEY_MAX_BTN_X, LocationConstant.MONEY_MAX_BTN_Y,
				LocationConstant.MONEY_MAX_BTN_WIDTH, LocationConstant.MONEY_MAX_BTN_HEIGHT);
		moneyMaxBtn.addActionListener(new MoneyListener(moneyTextField));
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
		fileLoadBtn.setBounds(LocationConstant.FILE_LOAD_BTN_X, LocationConstant.FILE_LOAD_BTN_Y,
				LocationConstant.FILE_LOAD_BTN_SIZE_WIDTH, LocationConstant.FILE_LOAD_BTN_SIZE_HEIGHT);
		fileLoadBtn.addActionListener(new LoadListener(fileChooserBar, hpTextField, mpTextField, attackTextField,
				defendTextField, moneyTextField, propertyTextFields, xingText, mingText));
		this.add(fileLoadBtn);
	}

	private void setFileChooseBtn() {
		fileChooseBtn.setBounds(LocationConstant.FILE_CHOOSER_BTN_X, LocationConstant.FILE_CHOOSER_BTN_Y,
				LocationConstant.FILE_CHOOSER_BTN_SIZE_WIDTH, LocationConstant.FILE_CHOOSER_BTN_SIZE_HEIGHT);
		fileChooseBtn.addActionListener(new ChooseFileListener(fileChooserBar));
		this.add(fileChooseBtn);
	}

	private void setFileChooserBar() {
		fileChooserBar.setEditable(false);
		fileChooserBar.setBounds(LocationConstant.FILE_CHOOSER_BAR_X, LocationConstant.FILE_CHOOSER_BAR_Y,
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

	private void setProperties() {
		int columnSize = LocationConstant.PROPERTIES_COUNT % 3 == 0 ? LocationConstant.PROPERTIES_COUNT / 3
				: LocationConstant.PROPERTIES_COUNT / 3 + 1;
		int propertyIdx = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < columnSize; j++) {
				if (propertyIdx >= LocationConstant.PROPERTIES_COUNT) {
					break;
				}
				int x = i * (LocationConstant.PROPERTIES_LABEL_W + LocationConstant.PROPERTIES_TEXT_W + 5)
						+ LocationConstant.PROPERTIES_LABEL_START_X;
				int y = j * (LocationConstant.PROPERTIES_LABEL_H + 2) + LocationConstant.PROPERTIES_LABEL_START_Y;
				int w = LocationConstant.PROPERTIES_LABEL_W;
				int h = LocationConstant.PROPERTIES_LABEL_H;
				propertyLabels[propertyIdx] = new JLabel(LocationConstant.PROPERTIES_NAME[propertyIdx]);
				propertyLabels[propertyIdx].setForeground(Color.WHITE);
				propertyLabels[propertyIdx].setBounds(x, y, w, h);
				this.add(propertyLabels[propertyIdx]);

				x = i * (LocationConstant.PROPERTIES_LABEL_W + LocationConstant.PROPERTIES_TEXT_W + 5)
						+ LocationConstant.PROPERTIES_LABEL_W;
				y = j * (LocationConstant.PROPERTIES_TEXT_H + 2) + LocationConstant.PROPERTIES_LABEL_START_Y;
				w = LocationConstant.PROPERTIES_TEXT_W;
				h = LocationConstant.PROPERTIES_TEXT_H;
				propertyTextFields[propertyIdx] = new JTextField();
				propertyTextFields[propertyIdx].setBounds(x, y, w, h);
				this.add(propertyTextFields[propertyIdx]);
				propertyIdx++;
			}
		}
	}

	private void setEditButton() {
		jianfaBtn.setBounds(LocationConstant.JIANFA_BTN_X, LocationConstant.JIANFA_BTN_Y, LocationConstant.JIANFA_BTN_W,
				LocationConstant.JIANFA_BTN_H);
		jianfaBtn.addActionListener(new ToGongFaListener(CheckBoxManager.CB_JIANFA));
		this.add(jianfaBtn);
		daofaBtn.setBounds(LocationConstant.DAOFA_BTN_X, LocationConstant.DAOFA_BTN_Y, LocationConstant.DAOFA_BTN_W,
				LocationConstant.DAOFA_BTN_H);
		daofaBtn.addActionListener(new ToGongFaListener(CheckBoxManager.CB_DAOFA));
		this.add(daofaBtn);
		quanzhangBtn.setBounds(LocationConstant.QUANZHANG_BTN_X, LocationConstant.QUANZHANG_BTN_Y,
				LocationConstant.QUANZHANG_BTN_W, LocationConstant.QUANZHANG_BTN_H);
		quanzhangBtn.addActionListener(new ToGongFaListener(CheckBoxManager.CB_QUANZHANG));
		this.add(quanzhangBtn);
		zhifaBtn.setBounds(LocationConstant.ZHIFA_BTN_X, LocationConstant.ZHIFA_BTN_Y, LocationConstant.ZHIFA_BTN_W,
				LocationConstant.ZHIFA_BTN_H);
		zhifaBtn.addActionListener(new ToGongFaListener(CheckBoxManager.CB_ZHIFA));
		this.add(zhifaBtn);
		tuifaBtn.setBounds(LocationConstant.TUIFA_BTN_X, LocationConstant.TUIFA_BTN_Y, LocationConstant.TUIFA_BTN_W,
				LocationConstant.TUIFA_BTN_H);
		tuifaBtn.addActionListener(new ToGongFaListener(CheckBoxManager.CB_TUIFA));
		this.add(tuifaBtn);
		xinfaBtn.setBounds(LocationConstant.XINFA_BTN_X, LocationConstant.XINFA_BTN_Y, LocationConstant.XINFA_BTN_W,
				LocationConstant.XINFA_BTN_H);
		xinfaBtn.addActionListener(new ToGongFaListener(CheckBoxManager.CB_XINFA));
		this.add(xinfaBtn);
		friendBtn.setBounds(LocationConstant.FRIEND_BTN_X, LocationConstant.FRIEND_BTN_Y, LocationConstant.FRIEND_BTN_W,
				LocationConstant.FRIEND_BTN_H);
		friendBtn.addActionListener(new FriendFullListener());
		this.add(friendBtn);
		saveBtn.setBounds(LocationConstant.SAVE_BTN_X, LocationConstant.SAVE_BTN_Y, LocationConstant.SAVE_BTN_W,
				LocationConstant.SAVE_BTN_H);
		saveBtn.addActionListener(new SaveListener(hpTextField, mpTextField, attackTextField, defendTextField,
				moneyTextField, propertyTextFields, xingText, mingText));
		this.add(saveBtn);

		gunfaBtn.setBounds(LocationConstant.GUNFA_BTN_X, LocationConstant.GUNFA_BTN_Y, LocationConstant.GUNFA_BTN_W,
				LocationConstant.GUNFA_BTN_H);
		gunfaBtn.setEnabled(false);
		this.add(gunfaBtn);
		anqiBtn.setBounds(LocationConstant.ANQI_BTN_X, LocationConstant.ANQI_BTN_Y, LocationConstant.ANQI_BTN_W,
				LocationConstant.ANQI_BTN_H);
		anqiBtn.setEnabled(false);
		this.add(anqiBtn);
		duanbingBtn.setBounds(LocationConstant.DUANBING_BTN_X, LocationConstant.DUANBING_BTN_Y,
				LocationConstant.DUANBING_BTN_W, LocationConstant.DUANBING_BTN_H);
		duanbingBtn.setEnabled(false);
		this.add(duanbingBtn);
		qingongBtn.setBounds(LocationConstant.QINGONG_BTN_X, LocationConstant.QINGONG_BTN_Y,
				LocationConstant.QINGONG_BTN_W, LocationConstant.QINGONG_BTN_H);
		qingongBtn.setEnabled(false);
		this.add(qingongBtn);
	}
}
