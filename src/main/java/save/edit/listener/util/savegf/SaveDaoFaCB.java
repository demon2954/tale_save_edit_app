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

public class SaveDaoFaCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<M_PlayerRoutineNodeList> routineNodeList) {
		JCheckBox[] daoFaCheckBoxs = CheckBoxManager.getDaoFaCheckBoxs();
		
		for (int i = 0; i < daoFaCheckBoxs.length; i++) {
			JCheckBox one = daoFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_DAOFA);
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
		M_MartialIDList daofaM_MartialIDList = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (M_MartialIDList one : martialIDList) {
				if (one.getM_iType() == Constant.SKILL_TYPE_DAOFA) {
					daofaM_MartialIDList = one;
					break;
				}
			}
		}
		List<M_BookNodeList> m_M_BookNodeListList = new ArrayList<M_BookNodeList>();
		if (daofaM_MartialIDList == null) {
			daofaM_MartialIDList = new M_MartialIDList();
			daofaM_MartialIDList.setM_IDList(new ArrayList<String>());
			daofaM_MartialIDList.setM_iType(Constant.SKILL_TYPE_DAOFA);
			daofaM_MartialIDList.setM_BookNodeList(m_M_BookNodeListList);
		}

		JCheckBox[] daoFaCheckBoxs = CheckBoxManager.getDaoFaCheckBoxs();
		for (int i = 0; i < daoFaCheckBoxs.length; i++) {
			JCheckBox one = daoFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_DAOFA);
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
			daofaM_MartialIDList.setM_BookNodeList(m_M_BookNodeListList);
			int daofaType = daofaM_MartialIDList.getM_iType();

			for (int i = 0; i < martialIDList.size(); i++) {
				M_MartialIDList one = martialIDList.get(i);
				if (one.getM_iType() == daofaType) {
					martialIDList.remove(i);
				}
			}

			martialIDList.add(daofaM_MartialIDList);
		}
	}
}
