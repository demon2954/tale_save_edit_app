package save.edit.listener.util.savegf;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;

import save.edit.data.BookNodeEnum;
import save.edit.data.GongFaNode;
import save.edit.model.martial.BookNode;
import save.edit.model.martial.ID;
import save.edit.model.martial.MartialID;
import save.edit.model.routine.PlayerNeigongNode;
import save.edit.model.routine.PlayerRoutineNode;
import save.edit.ui.CheckBoxManager;

public class SaveJianFaCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<PlayerRoutineNode> routineNodeList) {
		JCheckBox[] jianFaCheckBoxs = CheckBoxManager.getJianFaCheckBoxs();
		
		for (int i = 0; i < jianFaCheckBoxs.length; i++) {
			JCheckBox one = jianFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.逍遥剑法_idx:
					PlayerRoutineNode xiaoyao = new PlayerRoutineNode();
					xiaoyao.setM_iAccumulationExp(100000);
					xiaoyao.setM_iLV(10);
					xiaoyao.setM_iRoutineID(GongFaNode.逍遥剑法.getM_iRoutineID());
					xiaoyao.setM_iWearAmsType(GongFaNode.逍遥剑法.getM_iWearAmsType());
					xiaoyao.setM_strRoutineName(GongFaNode.逍遥剑法.getM_strRoutineName());
					routineNodeList.add(xiaoyao);
					break;
				case CheckBoxManager.诸子剑法_idx:
					PlayerRoutineNode zhuzi = new PlayerRoutineNode();
					zhuzi.setM_iAccumulationExp(100000);
					zhuzi.setM_iLV(10);
					zhuzi.setM_iRoutineID(GongFaNode.诸子剑法.getM_iRoutineID());
					zhuzi.setM_iWearAmsType(GongFaNode.诸子剑法.getM_iWearAmsType());
					zhuzi.setM_strRoutineName(GongFaNode.诸子剑法.getM_strRoutineName());
					routineNodeList.add(zhuzi);
					break;
				case CheckBoxManager.独孤九剑_idx:
					PlayerRoutineNode dugu = new PlayerRoutineNode();
					dugu.setM_iAccumulationExp(100000);
					dugu.setM_iLV(10);
					dugu.setM_iRoutineID(GongFaNode.独孤九剑.getM_iRoutineID());
					dugu.setM_iWearAmsType(GongFaNode.独孤九剑.getM_iWearAmsType());
					dugu.setM_strRoutineName(GongFaNode.独孤九剑.getM_strRoutineName());
					routineNodeList.add(dugu);
					break;
				case CheckBoxManager.太王四神剑_idx:
					PlayerRoutineNode taiwangsishen = new PlayerRoutineNode();
					taiwangsishen.setM_iAccumulationExp(100000);
					taiwangsishen.setM_iLV(10);
					taiwangsishen.setM_iRoutineID(GongFaNode.太王四神剑.getM_iRoutineID());
					taiwangsishen.setM_iWearAmsType(GongFaNode.太王四神剑.getM_iWearAmsType());
					taiwangsishen.setM_strRoutineName(GongFaNode.太王四神剑.getM_strRoutineName());
					routineNodeList.add(taiwangsishen);
					break;
				default:
					break;
				}
			}
		}
	}

	@Override
	public void saveNeiGong(List<PlayerNeigongNode> neigongNodeList) {
	}

	@Override
	public void saveMartialID(List<MartialID> martialIDList) {
		MartialID jianfaMartialID = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (MartialID one : martialIDList) {
				if (one.getM_iType() == jianfaType) {
					jianfaMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (jianfaMartialID == null) {
			jianfaMartialID = new MartialID();
			jianfaMartialID.setM_IDList(new ArrayList<ID>());
			jianfaMartialID.setM_iType(jianfaType);
			jianfaMartialID.setM_BookNodeList(m_BookNodeList);
		}

		JCheckBox[] jianFaCheckBoxs = CheckBoxManager.getJianFaCheckBoxs();
		BookNode bookNode = null;
		for (int i = 0; i < jianFaCheckBoxs.length; i++) {
			JCheckBox one = jianFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.逍遥剑法_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.逍遥剑法.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.逍遥剑法.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.逍遥剑法.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.逍遥剑法.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.逍遥剑法.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.逍遥剑法.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.诸子剑法_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.诸子剑法.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.诸子剑法.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.诸子剑法.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.诸子剑法.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.诸子剑法.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.诸子剑法.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.独孤九剑_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.独孤九剑.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.独孤九剑.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.独孤九剑.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.独孤九剑.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.独孤九剑.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.独孤九剑.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.太王四神剑_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.太王四神剑.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.太王四神剑.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.太王四神剑.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.太王四神剑.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.太王四神剑.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.太王四神剑.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				default:
					break;
				}
			}
		}
		if (m_BookNodeList != null && m_BookNodeList.size() > 0) {
			jianfaMartialID.setM_BookNodeList(m_BookNodeList);
			martialIDList.add(jianfaMartialID);
		}
	}
}
