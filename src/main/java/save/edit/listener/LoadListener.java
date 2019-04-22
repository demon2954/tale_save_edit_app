package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import save.edit.Global;
import save.edit.data.PropertyValueEnum;
import save.edit.data.talent.TalentManager;
import save.edit.listener.util.loadgf.LoadGongFaCheckBox;
import save.edit.model.M_MartialIDList;
import save.edit.model.M_PlayerNeigongNodeList;
import save.edit.model.SaveModel;
import save.edit.model.constant.GroupsNodeEnum;
import save.edit.read.LoadSaveData;
import save.edit.ui.HeadImageBtnGroup;
import save.edit.ui.NpcXinFaCheckBoxManager;
import save.edit.ui.TalentComboBoxManager;
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
			loadTalent(save);
			loadOtherXinFa(save);
			loadHeadImage(save);
//			FileUtils.write(new File("d://save.json"), new Gson().toJson(save), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadHeadImage(SaveModel save) {
		String m_PlayerIconID = save.getM_PlayerIconID();
		int iconId = Integer.parseInt(m_PlayerIconID);
		ButtonGroup group = HeadImageBtnGroup.getGroup();
		iconId = iconId - 900001;
		Enumeration<AbstractButton> elements = group.getElements();
		int idx = 0;
		while (elements.hasMoreElements()) {
			AbstractButton nextElement = elements.nextElement();
			if (iconId == idx++) {
				nextElement.setSelected(true);
				break;
			}
		}
	}

	private void loadOtherXinFa(SaveModel save) {
		List<M_PlayerNeigongNodeList> otherXinFa = new ArrayList<M_PlayerNeigongNodeList>();
		List<M_PlayerNeigongNodeList> m_PlayerNeigongNodeList = save.getM_PlayerNeigongNodeList();
		for (M_PlayerNeigongNodeList one : m_PlayerNeigongNodeList) {
			if (one.getM_iNeigongID() < 60000) {
				otherXinFa.add(one);
			}
		}
		Set<JCheckBox> set = NpcXinFaCheckBoxManager.get();
		for (JCheckBox one : set) {
			for (M_PlayerNeigongNodeList node : otherXinFa) {
				if (node.getM_strNeigongName().equals(one.getText())) {
					one.setSelected(true);
					break;
				}
			}
		}
	}

	private void loadTalent(SaveModel save) {
		int m_iTalent1ID = save.getM_iTalent1ID();
		int m_iTalent2ID = save.getM_iTalent2ID();
		int m_iTalent3ID = save.getM_iTalent3ID();

		int talent1Idx = TalentManager.getTalentIdx(1, m_iTalent1ID);
		int talent2Idx = TalentManager.getTalentIdx(2, m_iTalent2ID);
		int talent3Idx = TalentManager.getTalentIdx(3, m_iTalent3ID);

		TalentComboBoxManager.getTalentComBoxByType(1).setSelectedIndex(talent1Idx);
		TalentComboBoxManager.getTalentComBoxByType(2).setSelectedIndex(talent2Idx);
		TalentComboBoxManager.getTalentComBoxByType(3).setSelectedIndex(talent3Idx);
	}

	private void loadGongFaCheckBox(SaveModel save) {
		List<M_MartialIDList> martialIdList = save.getM_MartialIDList();
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

	public LoadListener(JTextField fileChooserBar, JTextField hpTextField, JTextField mpTextField, JTextField attackTextField, JTextField defendTextField, JTextField moneyTextField,
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
