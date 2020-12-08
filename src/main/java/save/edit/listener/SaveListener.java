package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import save.edit.Global;
import save.edit.constant.Constant;
import save.edit.data.PropertyValueEnum;
import save.edit.listener.util.savegf.AbstractSaveGongFaCheckBox;
import save.edit.model.SaveModel;
import save.edit.model.constant.GroupsNodeEnum;
import save.edit.model.martial.MartialID;
import save.edit.model.routine.PlayerNeigongNode;
import save.edit.model.routine.PlayerRoutineNode;
import save.edit.write.WriteSaveData;

public class SaveListener implements ActionListener {
	private JTextField fileChooserBar;// 文件路径文本
	private JTextField hpTextField;// HP文本
	private JTextField mpTextField;// MP文本
	private JTextField attackTextField;// 攻击力文本
	private JTextField defendTextField;// 防御力文本
	private JTextField moneyTextField;// 金钱文本
	private JTextField[] propertyTextFields;// 属性文本数组

	private JTextField xingText;
	private JTextField mingText;

	public void actionPerformed(ActionEvent event) {
		int hp = Integer.parseInt(hpTextField.getText());
		int mp = Integer.parseInt(mpTextField.getText());
		int attack = Integer.parseInt(attackTextField.getText());
		int defend = Integer.parseInt(defendTextField.getText());
		int money = Integer.parseInt(moneyTextField.getText());
		Integer[] propertyValues = new Integer[propertyTextFields.length];
		for (int i = 0; i < propertyTextFields.length; i++) {
			propertyValues[i] = Integer.parseInt(propertyTextFields[i].getText());
		}
		
		SaveModel save = Global.getSave();
		save.setM_iAttack(attack);
		save.setM_iDefense(defend);
		save.setM_iMoney(money);
		
		save.getM_PropertyGroupsNodeList().get(GroupsNodeEnum.HP.getType()).getM_GroupsNodwList().get(GroupsNodeEnum.HP.getIndex()).setM_iValue(hp);
		if (hp > 9999) {
			save.getM_PropertyGroupsNodeList().get(GroupsNodeEnum.HP.getType()).getM_GroupsNodwList().get(GroupsNodeEnum.HP.getIndex()).setM_iMax(hp);
		} else {
			save.getM_PropertyGroupsNodeList().get(GroupsNodeEnum.HP.getType()).getM_GroupsNodwList().get(GroupsNodeEnum.HP.getIndex()).setM_iMax(9999);
		}
		
		save.getM_PropertyGroupsNodeList().get(GroupsNodeEnum.MP.getType()).getM_GroupsNodwList().get(GroupsNodeEnum.MP.getIndex()).setM_iValue(mp);
		if (mp > 9999) {
			save.getM_PropertyGroupsNodeList().get(GroupsNodeEnum.MP.getType()).getM_GroupsNodwList().get(GroupsNodeEnum.MP.getIndex()).setM_iMax(mp);
		} else {
			save.getM_PropertyGroupsNodeList().get(GroupsNodeEnum.MP.getType()).getM_GroupsNodwList().get(GroupsNodeEnum.MP.getIndex()).setM_iMax(9999);
		}

		for (PropertyValueEnum one : PropertyValueEnum.values()) {
			int iType = one.getM_iType();
			int iIdx = one.getM_iIndex();
			int propertyIdx = one.getPropertyIndex();
			int iMax = one.getM_iMax();
			
			int value = Integer.parseInt(propertyTextFields[propertyIdx].getText());

			save.getM_PropertyGroupsNodeList().get(iType).getM_GroupsNodwList().get(iIdx).setM_iValue(value);
			if (value > iMax) {
				save.getM_PropertyGroupsNodeList().get(iType).getM_GroupsNodwList().get(iIdx).setM_iMax(value);
			} else {
				save.getM_PropertyGroupsNodeList().get(iType).getM_GroupsNodwList().get(iIdx).setM_iMax(iMax);
			}
			save.getM_PropertyGroupsNodeList().get(iType).getM_GroupsNodwList().get(iIdx).setM_iExp(160000);
		}

		saveGongFa(save);
		
		WriteSaveData write = new WriteSaveData();
		try {
			String sourceFilePath = fileChooserBar.getText();
			write.write(save, sourceFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void saveGongFa(SaveModel save) {
		List<PlayerRoutineNode> routineNodeList = new ArrayList<PlayerRoutineNode>();// 功法列表
		List<PlayerNeigongNode> neigongNodeList = new ArrayList<PlayerNeigongNode>();// 内功列表
		List<MartialID> martialIDList = save.getM_MartialIDList();// 技艺书列表
		
		AbstractSaveGongFaCheckBox saveDaofaCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_DAOFA);
		saveDaofaCB.saveGongFa(routineNodeList);
		saveDaofaCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveJianfaCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_JIANFA);
		saveJianfaCB.saveGongFa(routineNodeList);
		saveJianfaCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveTuifaCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_TUIFA);
		saveTuifaCB.saveGongFa(routineNodeList);
		saveTuifaCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveQuanzhangCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_QUANZHANG);
		saveQuanzhangCB.saveGongFa(routineNodeList);
		saveQuanzhangCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveZhifaCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_ZHIFA);
		saveZhifaCB.saveGongFa(routineNodeList);
		saveZhifaCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveGunfaCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_GUNFA);
		saveGunfaCB.saveGongFa(routineNodeList);
		saveGunfaCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveDuanbingCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_DUANBING);
		saveDuanbingCB.saveGongFa(routineNodeList);
		saveDuanbingCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveAnqiCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_ANQI);
		saveAnqiCB.saveGongFa(routineNodeList);
		saveAnqiCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveQingongCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_QINGONG);
		saveQingongCB.saveGongFa(routineNodeList);
		saveQingongCB.saveMartialID(martialIDList);
		
		AbstractSaveGongFaCheckBox saveXinfaCB = AbstractSaveGongFaCheckBox.procuce(Constant.SKILL_TYPE_XINFA);
		saveXinfaCB.saveNeiGong(neigongNodeList);
		saveXinfaCB.saveMartialID(martialIDList);

		save.setM_PlayerRoutineNodeList(routineNodeList);
		save.setM_PlayerNeigongNodeList(neigongNodeList);
		
		save.setM_strPlayerName(mingText.getText());
		save.setM_strPlayerLastName(xingText.getText());
	}

	public SaveListener(JTextField hpTextField, JTextField mpTextField, JTextField attackTextField,
			JTextField defendTextField, JTextField moneyTextField, JTextField[] propertyTextFields, JTextField xingText,
			JTextField mingText, JTextField fileChooserBar) {
		super();
		this.hpTextField = hpTextField;
		this.mpTextField = mpTextField;
		this.attackTextField = attackTextField;
		this.defendTextField = defendTextField;
		this.moneyTextField = moneyTextField;
		this.propertyTextFields = propertyTextFields;
		this.xingText = xingText;
		this.mingText = mingText;
		this.fileChooserBar = fileChooserBar;
	}

}
