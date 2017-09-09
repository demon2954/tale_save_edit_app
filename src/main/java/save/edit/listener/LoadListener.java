package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;

import save.edit.Global;
import save.edit.model.SaveModel;
import save.edit.read.LoadSaveData;

public class LoadListener implements ActionListener {
	private JTextField fileChooserBar = new JTextField();// 文件路径文本框
	private JTextField hpTextField = new JTextField();// HP文本
	private JTextField mpTextField = new JTextField();// MP文本
	private JTextField attackTextField = new JTextField();// 攻击力文本
	private JTextField defendTextField = new JTextField();// 防御力文本
	private JTextField moneyTextField = new JTextField();// 金钱文本

	public void actionPerformed(ActionEvent arg0) {
		String filePath = fileChooserBar.getText();
		LoadSaveData load = new LoadSaveData();
		try {
			SaveModel save = load.loadDate(filePath);
			Global.setSave(save);

			String hp = save.getM_PropertyGroupsNodeList().get(0).getM_GroupsNodwList().get(5).getM_iValue() + "";
			String mp = save.getM_PropertyGroupsNodeList().get(0).getM_GroupsNodwList().get(6).getM_iValue() + "";
			hpTextField.setText(hp);
			mpTextField.setText(mp);
			
			String attack = save.getM_iAttack()+"";
			String defend = save.getM_iDefense()+"";
			String money = save.getM_iMoney()+"";
			attackTextField.setText(attack);
			defendTextField.setText(defend);
			moneyTextField.setText(money);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public LoadListener(JTextField fileChooserBar, JTextField hpTextField, JTextField mpTextField, JTextField attackTextField,
			JTextField defendTextField, JTextField moneyTextField) {
		super();
		this.fileChooserBar = fileChooserBar;
		this.hpTextField = hpTextField;
		this.mpTextField = mpTextField;
		this.attackTextField = attackTextField;
		this.defendTextField = defendTextField;
		this.moneyTextField = moneyTextField;
	}

}
