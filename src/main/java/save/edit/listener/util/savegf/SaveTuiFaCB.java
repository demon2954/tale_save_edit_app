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

public class SaveTuiFaCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<PlayerRoutineNode> routineNodeList) {
		JCheckBox[] tuiFaCheckBoxs = CheckBoxManager.getTuiFaCheckBoxs();
		
		for (int i = 0; i < tuiFaCheckBoxs.length; i++) {
			JCheckBox one = tuiFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.佛山无影脚_idx:
					PlayerRoutineNode foshan = new PlayerRoutineNode();
					foshan.setM_iAccumulationExp(100000);
					foshan.setM_iLV(10);
					foshan.setM_iRoutineID(GongFaNode.佛山无影脚.getM_iRoutineID());
					foshan.setM_iWearAmsType(GongFaNode.佛山无影脚.getM_iWearAmsType());
					foshan.setM_strRoutineName(GongFaNode.佛山无影脚.getM_strRoutineName());
					routineNodeList.add(foshan);
					break;
				case CheckBoxManager.逍遥迷踪腿_idx:
					PlayerRoutineNode xiaoyao = new PlayerRoutineNode();
					xiaoyao.setM_iAccumulationExp(100000);
					xiaoyao.setM_iLV(10);
					xiaoyao.setM_iRoutineID(GongFaNode.逍遥迷踪腿.getM_iRoutineID());
					xiaoyao.setM_iWearAmsType(GongFaNode.逍遥迷踪腿.getM_iWearAmsType());
					xiaoyao.setM_strRoutineName(GongFaNode.逍遥迷踪腿.getM_strRoutineName());
					routineNodeList.add(xiaoyao);
					break;
				case CheckBoxManager.十二路镇魂腿_idx:
					PlayerRoutineNode shier = new PlayerRoutineNode();
					shier.setM_iAccumulationExp(100000);
					shier.setM_iLV(10);
					shier.setM_iRoutineID(GongFaNode.十二路镇魂腿.getM_iRoutineID());
					shier.setM_iWearAmsType(GongFaNode.十二路镇魂腿.getM_iWearAmsType());
					shier.setM_strRoutineName(GongFaNode.十二路镇魂腿.getM_strRoutineName());
					routineNodeList.add(shier);
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
		MartialID tuifaMartialID = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (MartialID one : martialIDList) {
				if (one.getM_iType() == tuifaType) {
					tuifaMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (tuifaMartialID == null) {
			tuifaMartialID = new MartialID();
			tuifaMartialID.setM_IDList(new ArrayList<ID>());
			tuifaMartialID.setM_iType(tuifaType);
			tuifaMartialID.setM_BookNodeList(m_BookNodeList);
		}

		JCheckBox[] tuiFaCheckBoxs = CheckBoxManager.getTuiFaCheckBoxs();
		BookNode bookNode = null;
		for (int i = 0; i < tuiFaCheckBoxs.length; i++) {
			JCheckBox one = tuiFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.佛山无影脚_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.佛山无影脚.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.佛山无影脚.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.佛山无影脚.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.佛山无影脚.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.佛山无影脚.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.佛山无影脚.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.逍遥迷踪腿_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.逍遥迷踪腿.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.逍遥迷踪腿.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.逍遥迷踪腿.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.逍遥迷踪腿.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.逍遥迷踪腿.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.逍遥迷踪腿.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.十二路镇魂腿_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.十二路镇魂腿.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.十二路镇魂腿.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.十二路镇魂腿.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.十二路镇魂腿.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.十二路镇魂腿.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.十二路镇魂腿.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				default:
					break;
				}
			}
		}
		if (m_BookNodeList != null && m_BookNodeList.size() > 0) {
			tuifaMartialID.setM_BookNodeList(m_BookNodeList);
			martialIDList.add(tuifaMartialID);
		}
	}
}
