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

public class SaveXinFaCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<PlayerRoutineNode> routineNodeList) {
	}

	@Override
	public void saveNeiGong(List<PlayerNeigongNode> neigongNodeList) {
		JCheckBox[] xinFaCheckBoxs = CheckBoxManager.getXinFaCheckBoxs();
		
		for (int i = 0; i < xinFaCheckBoxs.length; i++) {
			JCheckBox one = xinFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_XINFA);
				SkillDetail skillDetail = skillMap.get(one.getText());
				PlayerNeigongNode neigongNode = new PlayerNeigongNode();
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
	public void saveMartialID(List<MartialID> martialIDList) {
		MartialID tuifaMartialID = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (MartialID one : martialIDList) {
				if (one.getM_iType() == Constant.SKILL_TYPE_XINFA) {
					tuifaMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (tuifaMartialID == null) {
			tuifaMartialID = new MartialID();
			tuifaMartialID.setM_IDList(new ArrayList<ID>());
			tuifaMartialID.setM_iType(Constant.SKILL_TYPE_XINFA);
			tuifaMartialID.setM_BookNodeList(m_BookNodeList);
		}

		JCheckBox[] xinFaCheckBoxs = CheckBoxManager.getXinFaCheckBoxs();
		for (int i = 0; i < xinFaCheckBoxs.length; i++) {
			JCheckBox one = xinFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_XINFA);
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
			tuifaMartialID.setM_BookNodeList(m_BookNodeList);
			int xinfaType = tuifaMartialID.getM_iType();

			for (int i = 0; i < martialIDList.size(); i++) {
				MartialID one = martialIDList.get(i);
				if (one.getM_iType() == xinfaType) {
					martialIDList.remove(i);
				}
			}

			martialIDList.add(tuifaMartialID);
		}
	}
}
