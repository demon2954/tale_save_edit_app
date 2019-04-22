package save.edit.listener.util.savegf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;

import save.edit.data.SkillDetail;
import save.edit.data.SkillManager;
import save.edit.model.M_BookNodeList;
import save.edit.model.M_MartialIDList;
import save.edit.model.M_PlayerNeigongNodeList;
import save.edit.model.M_PlayerRoutineNodeList;
import save.edit.ui.CheckBoxManager;

public class SaveNoXinFaCB extends AbstractSaveGongFaCheckBox {
	private int SKILL_TYPE;

	public SaveNoXinFaCB(int SKILL_TYPE) {
		super();
		this.SKILL_TYPE = SKILL_TYPE;
	}

	@Override
	public void saveGongFa(List<M_PlayerRoutineNodeList> routineNodeList) {
		JCheckBox[] gongFaCheckBoxs = CheckBoxManager.getGongFaCheckBoxs(SKILL_TYPE);

		for (int i = 0; i < gongFaCheckBoxs.length; i++) {
			try {
				JCheckBox one = gongFaCheckBoxs[i];
				if (one.isSelected()) {
					Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(SKILL_TYPE);
					SkillDetail skillDetail = skillMap.get(one.getText());
					M_PlayerRoutineNodeList routineNode = new M_PlayerRoutineNodeList();
					routineNode.setM_iAccumulationExp(100000);
					routineNode.setM_iLV(10);
					routineNode.setM_iRoutineID(skillDetail.getM_iRoutineID());
					routineNode.setM_iWearAmsType(skillDetail.getM_iWearAmsType());
					routineNode.setM_strRoutineName(skillDetail.getM_strRoutineName());
					routineNodeList.add(routineNode);
				}
			} catch (Exception e) {
				JCheckBox one = gongFaCheckBoxs[i];
				System.out.println(one.getText());
				e.printStackTrace();
			}
		}
	}

	@Override
	public void saveNeiGong(List<M_PlayerNeigongNodeList> neigongNodeList) {

	}

	@Override
	public void saveM_MartialIDList(List<M_MartialIDList> martialIDList) {
		M_MartialIDList gongFaM_MartialIDList = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (M_MartialIDList one : martialIDList) {
				if (one.getM_iType() == SKILL_TYPE) {
					gongFaM_MartialIDList = one;
					break;
				}
			}
		}
		List<M_BookNodeList> m_M_BookNodeListList = new ArrayList<M_BookNodeList>();
		if (gongFaM_MartialIDList == null) {
			gongFaM_MartialIDList = new M_MartialIDList();
			gongFaM_MartialIDList.setM_IDList(new ArrayList<String>());
			gongFaM_MartialIDList.setM_iType(SKILL_TYPE);
			gongFaM_MartialIDList.setM_BookNodeList(m_M_BookNodeListList);
		}

		JCheckBox[] gongFaCheckBoxs = CheckBoxManager.getGongFaCheckBoxs(SKILL_TYPE);
		for (int i = 0; i < gongFaCheckBoxs.length; i++) {
			JCheckBox one = gongFaCheckBoxs[i];
			if (one.isSelected()) {
				Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(SKILL_TYPE);
				SkillDetail skillDetail = skillMap.get(one.getText());
				M_BookNodeList bookNode = new M_BookNodeList();
				bookNode.setM_iAbilityType(skillDetail.getM_iAbilityType());
				bookNode.setM_iID(skillDetail.getM_iID());
				bookNode.setM_iSkillful(0);
				bookNode.setM_strAbilityID(skillDetail.getM_strAbilityID());
				if (skillDetail.getM_iID() == 20802) {
					bookNode.setM_strAbilityID("霹雳雷火弹");
				}
				bookNode.setM_strBookImage(skillDetail.getM_strBookImage());
				bookNode.setM_strBookMsg(skillDetail.getM_strBookMsg());
				bookNode.setM_sValueLink(skillDetail.getM_sValueLink());
				m_M_BookNodeListList.add(bookNode);
			}
		}
		if (m_M_BookNodeListList != null) {
			gongFaM_MartialIDList.setM_BookNodeList(m_M_BookNodeListList);
			int gongFaType = gongFaM_MartialIDList.getM_iType();

			for (int i = 0; i < martialIDList.size(); i++) {
				M_MartialIDList one = martialIDList.get(i);
				if (one.getM_iType() == gongFaType) {
					martialIDList.remove(i);
				}
			}

			martialIDList.add(gongFaM_MartialIDList);
		}
	}

}
