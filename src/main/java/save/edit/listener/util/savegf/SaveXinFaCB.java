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

public class SaveXinFaCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<M_PlayerRoutineNodeList> routineNodeList) {
	}

	@Override
	public void saveNeiGong(List<M_PlayerNeigongNodeList> neigongNodeList) {
		JCheckBox[] xinFaCheckBoxs = CheckBoxManager.getXinFaCheckBoxs();
		
		for (int i = 0; i < xinFaCheckBoxs.length; i++) {
			JCheckBox one = xinFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_XINFA);
				SkillDetail skillDetail = skillMap.get(one.getText());
				M_PlayerNeigongNodeList neigongNode = new M_PlayerNeigongNodeList();
				neigongNode.setM_iAccumulationExp(100000);
				neigongNode.setM_iExp(1);
				neigongNode.setM_iLV(10);
				neigongNode.setM_iNeigongID(skillDetail.getM_iNeigongID());
				neigongNode.setM_strNeigongName(skillDetail.getM_strNeigongName());
				neigongNode.setM_strSelectImage(skillDetail.getM_strSelectImage());
				neigongNode.setM_strStatusImage(skillDetail.getM_strStatusImage());
				neigongNodeList.add(neigongNode);

			}
		}
	}

	@Override
	public void saveM_MartialIDList(List<M_MartialIDList> martialIDList) {
		M_MartialIDList tuifaM_MartialIDList = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (M_MartialIDList one : martialIDList) {
				if (one.getM_iType() == Constant.SKILL_TYPE_XINFA) {
					tuifaM_MartialIDList = one;
					break;
				}
			}
		}
		List<M_BookNodeList> m_M_BookNodeListList = new ArrayList<M_BookNodeList>();
		if (tuifaM_MartialIDList == null) {
			tuifaM_MartialIDList = new M_MartialIDList();
			tuifaM_MartialIDList.setM_IDList(new ArrayList<String>());
			tuifaM_MartialIDList.setM_iType(Constant.SKILL_TYPE_XINFA);
			tuifaM_MartialIDList.setM_BookNodeList(m_M_BookNodeListList);
		}

		JCheckBox[] xinFaCheckBoxs = CheckBoxManager.getXinFaCheckBoxs();
		for (int i = 0; i < xinFaCheckBoxs.length; i++) {
			JCheckBox one = xinFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_XINFA);
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
			tuifaM_MartialIDList.setM_BookNodeList(m_M_BookNodeListList);
			int xinfaType = tuifaM_MartialIDList.getM_iType();

			for (int i = 0; i < martialIDList.size(); i++) {
				M_MartialIDList one = martialIDList.get(i);
				if (one.getM_iType() == xinfaType) {
					martialIDList.remove(i);
				}
			}

			martialIDList.add(tuifaM_MartialIDList);
		}
	}
}
