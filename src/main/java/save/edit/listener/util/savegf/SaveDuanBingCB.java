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

public class SaveDuanBingCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<PlayerRoutineNode> routineNodeList) {
		JCheckBox[] duanBingCheckBoxs = CheckBoxManager.getDuanBingCheckBoxs();
		
		for (int i = 0; i < duanBingCheckBoxs.length; i++) {
			JCheckBox one = duanBingCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_DUANBING);
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
		MartialID duanbingMartialID = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (MartialID one : martialIDList) {
				if (one.getM_iType() == Constant.SKILL_TYPE_DUANBING) {
					duanbingMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (duanbingMartialID == null) {
			duanbingMartialID = new MartialID();
			duanbingMartialID.setM_IDList(new ArrayList<ID>());
			duanbingMartialID.setM_iType(Constant.SKILL_TYPE_DUANBING);
			duanbingMartialID.setM_BookNodeList(m_BookNodeList);
		}

		JCheckBox[] duanBingCheckBoxs = CheckBoxManager.getDuanBingCheckBoxs();
		for (int i = 0; i < duanBingCheckBoxs.length; i++) {
			JCheckBox one = duanBingCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_DUANBING);
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
			duanbingMartialID.setM_BookNodeList(m_BookNodeList);
			int gunfaType = duanbingMartialID.getM_iType();

			for (int i = 0; i < martialIDList.size(); i++) {
				MartialID one = martialIDList.get(i);
				if (one.getM_iType() == gunfaType) {
					martialIDList.remove(i);
				}
			}

			martialIDList.add(duanbingMartialID);
		}
	}
}
