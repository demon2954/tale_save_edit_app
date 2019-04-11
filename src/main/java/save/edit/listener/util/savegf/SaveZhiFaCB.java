package save.edit.listener.util.savegf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;

import save.edit.constant.Constant;
import save.edit.data.SkillDetail;
import save.edit.data.SkillManager;
import save.edit.model.M_BookNodeList;
//import save.edit.model.ID;
import save.edit.model.M_MartialIDList;
import save.edit.model.M_PlayerNeigongNodeList;
import save.edit.model.M_PlayerRoutineNodeList;
import save.edit.ui.CheckBoxManager;

public class SaveZhiFaCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<M_PlayerRoutineNodeList> routineNodeList) {
		JCheckBox[] zhiFaCheckBoxs = CheckBoxManager.getZhiFaCheckBoxs();
		
		for (int i = 0; i < zhiFaCheckBoxs.length; i++) {
			JCheckBox one = zhiFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_ZHIFA);
				SkillDetail skillDetail = skillMap.get(one.getText());
				M_PlayerRoutineNodeList routineNode = new M_PlayerRoutineNodeList();
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
	public void saveNeiGong(List<M_PlayerNeigongNodeList> neigongNodeList) {
	}

	@Override
	public void saveM_MartialIDList(List<M_MartialIDList> martialIDList) {
		M_MartialIDList zhifaM_MartialIDList = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (M_MartialIDList one : martialIDList) {
				if (one.getM_iType() == Constant.SKILL_TYPE_ZHIFA) {
					zhifaM_MartialIDList = one;
					break;
				}
			}
		}
		List<M_BookNodeList> m_M_BookNodeListList = new ArrayList<M_BookNodeList>();
		if (zhifaM_MartialIDList == null) {
			zhifaM_MartialIDList = new M_MartialIDList();
			zhifaM_MartialIDList.setM_IDList(new ArrayList<String>());
			zhifaM_MartialIDList.setM_iType(Constant.SKILL_TYPE_ZHIFA);
			zhifaM_MartialIDList.setM_BookNodeList(m_M_BookNodeListList);
		}

		JCheckBox[] zhiFaCheckBoxs = CheckBoxManager.getZhiFaCheckBoxs();
		
		for (int i = 0; i < zhiFaCheckBoxs.length; i++) {
			JCheckBox one = zhiFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_ZHIFA);
				SkillDetail skillDetail = skillMap.get(one.getText());
				M_BookNodeList bookNode = new M_BookNodeList();
				bookNode.setM_iAbilityType(skillDetail.getM_iAbilityType());
				bookNode.setM_iID(skillDetail.getM_iID());
				bookNode.setM_iSkillful(0);
				bookNode.setM_strAbilityID(skillDetail.getM_strAbilityID());
				bookNode.setM_strBookImage(skillDetail.getM_strBookImage());
				bookNode.setM_strBookMsg(skillDetail.getM_strBookMsg());
				bookNode.setM_sValueLink(skillDetail.getM_sValueLink());
				m_M_BookNodeListList.add(bookNode);
			}
		}
		if (m_M_BookNodeListList != null) {
			zhifaM_MartialIDList.setM_BookNodeList(m_M_BookNodeListList);
			int zhifaType = zhifaM_MartialIDList.getM_iType();

			for (int i = 0; i < martialIDList.size(); i++) {
				M_MartialIDList one = martialIDList.get(i);
				if (one.getM_iType() == zhifaType) {
					martialIDList.remove(i);
				}
			}

			martialIDList.add(zhifaM_MartialIDList);
		}
	}
}
