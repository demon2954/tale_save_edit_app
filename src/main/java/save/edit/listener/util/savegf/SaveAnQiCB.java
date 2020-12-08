package save.edit.listener.util.savegf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;

import save.edit.constant.Constant;
import save.edit.data.SkillDetail;
import save.edit.data.SkillManager;
import save.edit.model.martial.BookNode;
import save.edit.model.martial.ID;
import save.edit.model.martial.MartialID;
import save.edit.model.routine.PlayerNeigongNode;
import save.edit.model.routine.PlayerRoutineNode;
import save.edit.ui.CheckBoxManager;

public class SaveAnQiCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<PlayerRoutineNode> routineNodeList) {
		JCheckBox[] anQiCheckBoxs = CheckBoxManager.getAnQiCheckBoxs();
		
		for (int i = 0; i < anQiCheckBoxs.length; i++) {
			JCheckBox one = anQiCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_ANQI);
				SkillDetail skillDetail = skillMap.get(one.getText());
				PlayerRoutineNode routineNode = new PlayerRoutineNode();
				routineNode.setM_iAccumulationExp(100000);
				routineNode.setM_iLV(10);
				routineNode.setM_iRoutineID(skillDetail.getM_iRoutineID());
				routineNode.setM_iWearAmsType(skillDetail.getM_iWearAmsType());
				routineNode.setM_strRoutineName(skillDetail.getM_strRoutineName());
				routineNodeList.add(routineNode);
			}
		}
	}

	@Override
	public void saveNeiGong(List<PlayerNeigongNode> neigongNodeList) {
	}

	@Override
	public void saveMartialID(List<MartialID> martialIDList) {
		MartialID anqiMartialID = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (MartialID one : martialIDList) {
				if (one.getM_iType() == Constant.SKILL_TYPE_ANQI) {
					anqiMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (anqiMartialID == null) {
			anqiMartialID = new MartialID();
			anqiMartialID.setM_IDList(new ArrayList<ID>());
			anqiMartialID.setM_iType(Constant.SKILL_TYPE_ANQI);
			anqiMartialID.setM_BookNodeList(m_BookNodeList);
		}

		JCheckBox[] anQiCheckBoxs = CheckBoxManager.getAnQiCheckBoxs();
		for (int i = 0; i < anQiCheckBoxs.length; i++) {
			JCheckBox one = anQiCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_ANQI);
				SkillDetail skillDetail = skillMap.get(one.getText());
				BookNode bookNode = new BookNode();
				bookNode.setM_iAbilityType(skillDetail.getM_iAbilityType());
				bookNode.setM_iID(skillDetail.getM_iID());
				bookNode.setM_iSkillful(0);
				bookNode.setM_strAbilityID(skillDetail.getM_strAbilityID());
				bookNode.setM_strBookImage(skillDetail.getM_strBookImage());
				bookNode.setM_strBookMsg(skillDetail.getM_strBookMsg());
				bookNode.setM_sValueLink(skillDetail.getM_sValueLink());
				m_BookNodeList.add(bookNode);
			}
		}
		if (m_BookNodeList != null) {
			anqiMartialID.setM_BookNodeList(m_BookNodeList);
			int gunfaType = anqiMartialID.getM_iType();

			for (int i = 0; i < martialIDList.size(); i++) {
				MartialID one = martialIDList.get(i);
				if (one.getM_iType() == gunfaType) {
					martialIDList.remove(i);
				}
			}

			martialIDList.add(anqiMartialID);
		}
	}
}
