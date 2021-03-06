package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JTextField;

import save.edit.Global;
import save.edit.data.PropertyValueEnum;
import save.edit.listener.util.loadgf.LoadGongFaCheckBox;
import save.edit.model.SaveModel;
import save.edit.model.constant.GroupsNodeEnum;
import save.edit.model.martial.MartialID;
import save.edit.read.LoadSaveData;
import save.edit.util.UnicodeUtils;

public class LoadListener implements ActionListener {
	private JTextField fileChooserBar;
	private JTextField hpTextField;
	private JTextField mpTextField;
	private JTextField attackTextField;
	private JTextField defendTextField;
	private JTextField moneyTextField;
	private JTextField[] propertyTextFields;
	private JTextField xingText;
	private JTextField mingText;

	public void actionPerformed(ActionEvent arg0) {
		String filePath = fileChooserBar.getText();
		LoadSaveData load = new LoadSaveData();
		try {
			SaveModel save = load.loadDate(filePath);
			Global.setSave(save);

			String hp = save.getM_PropertyGroupsNodeList().get(GroupsNodeEnum.HP.getType()).getM_GroupsNodwList().get(GroupsNodeEnum.HP.getIndex()).getM_iValue() + "";
			String mp = save.getM_PropertyGroupsNodeList().get(GroupsNodeEnum.MP.getType()).getM_GroupsNodwList().get(GroupsNodeEnum.MP.getIndex()).getM_iValue() + "";
			hpTextField.setText(hp);
			mpTextField.setText(mp);

			String attack = save.getM_iAttack() + "";
			String defend = save.getM_iDefense() + "";
			String money = save.getM_iMoney() + "";
			attackTextField.setText(attack);
			defendTextField.setText(defend);
			moneyTextField.setText(money);

			for (PropertyValueEnum one : PropertyValueEnum.values()) {
				int propertyIdx = one.getPropertyIndex();
				int iType = one.getM_iType();
				int iIdx = one.getM_iIndex();
				
				String value = save.getM_PropertyGroupsNodeList().get(iType).getM_GroupsNodwList().get(iIdx).getM_iValue() + "";
				propertyTextFields[propertyIdx].setText(value);
			}
			
			loadGongFaCheckBox(save);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void loadGongFaCheckBox(SaveModel save) {
		List<MartialID> martialIdList = save.getM_MartialIDList();
		LoadGongFaCheckBox loadGongFaCheckBox = new LoadGongFaCheckBox();
		loadGongFaCheckBox.dealMartialIds(martialIdList);

		if (save.getM_strPlayerLastName().contains("\\u")) {
			xingText.setText(UnicodeUtils.unicode2String(save.getM_strPlayerLastName()));
		} else {
			xingText.setText(save.getM_strPlayerLastName());
		}
		if (save.getM_strPlayerName().contains("\\u")) {
			mingText.setText(UnicodeUtils.unicode2String(save.getM_strPlayerName()));
		} else {
			mingText.setText(save.getM_strPlayerName());
		}
	}

	public LoadListener(JTextField fileChooserBar, JTextField hpTextField, JTextField mpTextField,
			JTextField attackTextField, JTextField defendTextField, JTextField moneyTextField,
			JTextField[] propertyTextFields, JTextField xingText, JTextField mingText) {
		super();
		this.fileChooserBar = fileChooserBar;
		this.hpTextField = hpTextField;
		this.mpTextField = mpTextField;
		this.attackTextField = attackTextField;
		this.defendTextField = defendTextField;
		this.moneyTextField = moneyTextField;
		this.propertyTextFields = propertyTextFields;
		this.xingText = xingText;
		this.mingText = mingText;
	}
}
