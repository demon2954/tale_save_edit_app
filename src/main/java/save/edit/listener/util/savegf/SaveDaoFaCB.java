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

public class SaveDaoFaCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<PlayerRoutineNode> routineNodeList) {
		JCheckBox[] daoFaCheckBoxs = CheckBoxManager.getDaoFaCheckBoxs();
		
		for (int i = 0; i < daoFaCheckBoxs.length; i++) {
			JCheckBox one = daoFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.逍遥刀法_idx:
					PlayerRoutineNode xiaoyao = new PlayerRoutineNode();
					xiaoyao.setM_iAccumulationExp(100000);
					xiaoyao.setM_iLV(10);
					xiaoyao.setM_iRoutineID(GongFaNode.逍遥刀法.getM_iRoutineID());
					xiaoyao.setM_iWearAmsType(GongFaNode.逍遥刀法.getM_iWearAmsType());
					xiaoyao.setM_strRoutineName(GongFaNode.逍遥刀法.getM_strRoutineName());
					routineNodeList.add(xiaoyao);
					break;
				case CheckBoxManager.无极刀法_idx:
					PlayerRoutineNode wuji = new PlayerRoutineNode();
					wuji.setM_iAccumulationExp(100000);
					wuji.setM_iLV(10);
					wuji.setM_iRoutineID(GongFaNode.无极刀法.getM_iRoutineID());
					wuji.setM_iWearAmsType(GongFaNode.无极刀法.getM_iWearAmsType());
					wuji.setM_strRoutineName(GongFaNode.无极刀法.getM_strRoutineName());
					routineNodeList.add(wuji);
					break;
				case CheckBoxManager.胡家刀法_idx:
					PlayerRoutineNode hujia = new PlayerRoutineNode();
					hujia.setM_iAccumulationExp(100000);
					hujia.setM_iLV(10);
					hujia.setM_iRoutineID(GongFaNode.胡家刀法.getM_iRoutineID());
					hujia.setM_iWearAmsType(GongFaNode.胡家刀法.getM_iWearAmsType());
					hujia.setM_strRoutineName(GongFaNode.胡家刀法.getM_strRoutineName());
					routineNodeList.add(hujia);
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
		MartialID daofaMartialID = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (MartialID one : martialIDList) {
				if (one.getM_iType() == daofaType) {
					daofaMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (daofaMartialID == null) {
			daofaMartialID = new MartialID();
			daofaMartialID.setM_IDList(new ArrayList<ID>());
			daofaMartialID.setM_iType(daofaType);
			daofaMartialID.setM_BookNodeList(m_BookNodeList);
		}

		JCheckBox[] daoFaCheckBoxs = CheckBoxManager.getDaoFaCheckBoxs();
		BookNode bookNode = null;
		for (int i = 0; i < daoFaCheckBoxs.length; i++) {
			JCheckBox one = daoFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.逍遥刀法_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.逍遥刀法.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.逍遥刀法.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.逍遥刀法.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.逍遥刀法.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.逍遥刀法.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.逍遥刀法.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.无极刀法_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.无极刀法.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.无极刀法.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.无极刀法.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.无极刀法.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.无极刀法.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.无极刀法.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.胡家刀法_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.胡家刀法.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.胡家刀法.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.胡家刀法.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.胡家刀法.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.胡家刀法.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.胡家刀法.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				default:
					break;
				}
			}
		}
		if (m_BookNodeList != null && m_BookNodeList.size() > 0) {
			martialIDList.add(daofaMartialID);
		}
	}
}
