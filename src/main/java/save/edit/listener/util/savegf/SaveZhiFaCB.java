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

public class SaveZhiFaCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<PlayerRoutineNode> routineNodeList) {
		JCheckBox[] zhiFaCheckBoxs = CheckBoxManager.getZhiFaCheckBoxs();
		
		for (int i = 0; i < zhiFaCheckBoxs.length; i++) {
			JCheckBox one = zhiFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.一阳指_idx:
					PlayerRoutineNode yiyang = new PlayerRoutineNode();
					yiyang.setM_iAccumulationExp(100000);
					yiyang.setM_iLV(10);
					yiyang.setM_iRoutineID(GongFaNode.一阳指.getM_iRoutineID());
					yiyang.setM_iWearAmsType(GongFaNode.一阳指.getM_iWearAmsType());
					yiyang.setM_strRoutineName(GongFaNode.一阳指.getM_strRoutineName());
					routineNodeList.add(yiyang);
					break;
				case CheckBoxManager.九阴龙爪功_idx:
					PlayerRoutineNode jiuyin = new PlayerRoutineNode();
					jiuyin.setM_iAccumulationExp(100000);
					jiuyin.setM_iLV(10);
					jiuyin.setM_iRoutineID(GongFaNode.九阴龙爪功.getM_iRoutineID());
					jiuyin.setM_iWearAmsType(GongFaNode.九阴龙爪功.getM_iWearAmsType());
					jiuyin.setM_strRoutineName(GongFaNode.九阴龙爪功.getM_strRoutineName());
					routineNodeList.add(jiuyin);
					break;
				case CheckBoxManager.飞瀑连环指_idx:
					PlayerRoutineNode feipulianhuan = new PlayerRoutineNode();
					feipulianhuan.setM_iAccumulationExp(100000);
					feipulianhuan.setM_iLV(10);
					feipulianhuan.setM_iRoutineID(GongFaNode.飞瀑连环指.getM_iRoutineID());
					feipulianhuan.setM_iWearAmsType(GongFaNode.飞瀑连环指.getM_iWearAmsType());
					feipulianhuan.setM_strRoutineName(GongFaNode.飞瀑连环指.getM_strRoutineName());
					routineNodeList.add(feipulianhuan);
					break;
				case CheckBoxManager.六脉神剑_idx:
					PlayerRoutineNode liumai = new PlayerRoutineNode();
					liumai.setM_iAccumulationExp(100000);
					liumai.setM_iLV(10);
					liumai.setM_iRoutineID(GongFaNode.六脉神剑.getM_iRoutineID());
					liumai.setM_iWearAmsType(GongFaNode.六脉神剑.getM_iWearAmsType());
					liumai.setM_strRoutineName(GongFaNode.六脉神剑.getM_strRoutineName());
					routineNodeList.add(liumai);
					break;
				case CheckBoxManager.逍遥指_idx:
					PlayerRoutineNode xiaoyao = new PlayerRoutineNode();
					xiaoyao.setM_iAccumulationExp(100000);
					xiaoyao.setM_iLV(10);
					xiaoyao.setM_iRoutineID(GongFaNode.逍遥指.getM_iRoutineID());
					xiaoyao.setM_iWearAmsType(GongFaNode.逍遥指.getM_iWearAmsType());
					xiaoyao.setM_strRoutineName(GongFaNode.逍遥指.getM_strRoutineName());
					routineNodeList.add(xiaoyao);
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
				if (one.getM_iType() == zhifaType) {
					daofaMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (daofaMartialID == null) {
			daofaMartialID = new MartialID();
			daofaMartialID.setM_IDList(new ArrayList<ID>());
			daofaMartialID.setM_iType(zhifaType);
			daofaMartialID.setM_BookNodeList(m_BookNodeList);
			martialIDList.add(daofaMartialID);
		}

		JCheckBox[] zhiFaCheckBoxs = CheckBoxManager.getZhiFaCheckBoxs();
		BookNode bookNode = null;
		for (int i = 0; i < zhiFaCheckBoxs.length; i++) {
			JCheckBox one = zhiFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.一阳指_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.一阳指.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.一阳指.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.一阳指.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.一阳指.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.一阳指.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.一阳指.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.九阴龙爪功_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.九阴龙爪功.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.九阴龙爪功.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.九阴龙爪功.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.九阴龙爪功.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.九阴龙爪功.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.九阴龙爪功.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.飞瀑连环指_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.飞瀑连环指.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.飞瀑连环指.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.飞瀑连环指.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.飞瀑连环指.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.飞瀑连环指.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.飞瀑连环指.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.六脉神剑_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.六脉神剑.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.六脉神剑.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.六脉神剑.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.六脉神剑.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.六脉神剑.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.六脉神剑.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.逍遥指_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.逍遥指.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.逍遥指.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.逍遥指.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.逍遥指.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.逍遥指.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.逍遥指.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				default:
					break;
				}
			}
		}
	}
}
