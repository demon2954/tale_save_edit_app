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

public class SaveQuanZhangCB extends AbstractSaveGongFaCheckBox {

	@Override
	public void saveGongFa(List<PlayerRoutineNode> routineNodeList) {
		JCheckBox[] quanZhangCheckBoxs = CheckBoxManager.getQuanZhangCheckBoxs();
		
		for (int i = 0; i < quanZhangCheckBoxs.length; i++) {
			JCheckBox one = quanZhangCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.逍遥拳法_idx:
					PlayerRoutineNode xiaoyao = new PlayerRoutineNode();
					xiaoyao.setM_iAccumulationExp(100000);
					xiaoyao.setM_iLV(10);
					xiaoyao.setM_iRoutineID(GongFaNode.逍遥拳法.getM_iRoutineID());
					xiaoyao.setM_iWearAmsType(GongFaNode.逍遥拳法.getM_iWearAmsType());
					xiaoyao.setM_strRoutineName(GongFaNode.逍遥拳法.getM_strRoutineName());
					routineNodeList.add(xiaoyao);
					break;
				case CheckBoxManager.野球拳_idx:
					PlayerRoutineNode yeqiu = new PlayerRoutineNode();
					yeqiu.setM_iAccumulationExp(100000);
					yeqiu.setM_iLV(10);
					yeqiu.setM_iRoutineID(GongFaNode.野球拳.getM_iRoutineID());
					yeqiu.setM_iWearAmsType(GongFaNode.野球拳.getM_iWearAmsType());
					yeqiu.setM_strRoutineName(GongFaNode.野球拳.getM_strRoutineName());
					routineNodeList.add(yeqiu);
					break;
				case CheckBoxManager.天山六阳掌_idx:
					PlayerRoutineNode tianshan = new PlayerRoutineNode();
					tianshan.setM_iAccumulationExp(100000);
					tianshan.setM_iLV(10);
					tianshan.setM_iRoutineID(GongFaNode.天山六阳掌.getM_iRoutineID());
					tianshan.setM_iWearAmsType(GongFaNode.天山六阳掌.getM_iWearAmsType());
					tianshan.setM_strRoutineName(GongFaNode.天山六阳掌.getM_strRoutineName());
					routineNodeList.add(tianshan);
					break;
				case CheckBoxManager.降龙十八掌_idx:
					PlayerRoutineNode xianglong = new PlayerRoutineNode();
					xianglong.setM_iAccumulationExp(100000);
					xianglong.setM_iLV(10);
					xianglong.setM_iRoutineID(GongFaNode.降龙十八掌.getM_iRoutineID());
					xianglong.setM_iWearAmsType(GongFaNode.降龙十八掌.getM_iWearAmsType());
					xianglong.setM_strRoutineName(GongFaNode.降龙十八掌.getM_strRoutineName());
					routineNodeList.add(xianglong);
					break;
				case CheckBoxManager.醉拳_idx:
					PlayerRoutineNode zuiquan = new PlayerRoutineNode();
					zuiquan.setM_iAccumulationExp(100000);
					zuiquan.setM_iLV(10);
					zuiquan.setM_iRoutineID(GongFaNode.醉拳.getM_iRoutineID());
					zuiquan.setM_iWearAmsType(GongFaNode.醉拳.getM_iWearAmsType());
					zuiquan.setM_strRoutineName(GongFaNode.醉拳.getM_strRoutineName());
					routineNodeList.add(zuiquan);
					break;
				case CheckBoxManager.摧魂腐心掌_idx:
					PlayerRoutineNode suihunfuxin = new PlayerRoutineNode();
					suihunfuxin.setM_iAccumulationExp(100000);
					suihunfuxin.setM_iLV(10);
					suihunfuxin.setM_iRoutineID(GongFaNode.摧魂腐心掌.getM_iRoutineID());
					suihunfuxin.setM_iWearAmsType(GongFaNode.摧魂腐心掌.getM_iWearAmsType());
					suihunfuxin.setM_strRoutineName(GongFaNode.摧魂腐心掌.getM_strRoutineName());
					routineNodeList.add(suihunfuxin);
					break;
				case CheckBoxManager.拜月七诀_idx:
					PlayerRoutineNode baiyue = new PlayerRoutineNode();
					baiyue.setM_iAccumulationExp(100000);
					baiyue.setM_iLV(10);
					baiyue.setM_iRoutineID(GongFaNode.拜月七诀.getM_iRoutineID());
					baiyue.setM_iWearAmsType(GongFaNode.拜月七诀.getM_iWearAmsType());
					baiyue.setM_strRoutineName(GongFaNode.拜月七诀.getM_strRoutineName());
					routineNodeList.add(baiyue);
					break;
				case CheckBoxManager.如来九印_idx:
					PlayerRoutineNode rulai = new PlayerRoutineNode();
					rulai.setM_iAccumulationExp(100000);
					rulai.setM_iLV(10);
					rulai.setM_iRoutineID(GongFaNode.如来九印.getM_iRoutineID());
					rulai.setM_iWearAmsType(GongFaNode.如来九印.getM_iWearAmsType());
					rulai.setM_strRoutineName(GongFaNode.如来九印.getM_strRoutineName());
					routineNodeList.add(rulai);
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
		MartialID quanzhangMartialID = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (MartialID one : martialIDList) {
				if (one.getM_iType() == quanzhangType) {
					quanzhangMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (quanzhangMartialID == null) {
			quanzhangMartialID = new MartialID();
			quanzhangMartialID.setM_IDList(new ArrayList<ID>());
			quanzhangMartialID.setM_iType(quanzhangType);
			quanzhangMartialID.setM_BookNodeList(m_BookNodeList);
		}

		JCheckBox[] quanZhangCheckBoxs = CheckBoxManager.getQuanZhangCheckBoxs();
		BookNode bookNode = null;
		for (int i = 0; i < quanZhangCheckBoxs.length; i++) {
			JCheckBox one = quanZhangCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.逍遥拳法_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.逍遥拳法.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.逍遥拳法.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.逍遥拳法.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.逍遥拳法.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.逍遥拳法.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.逍遥拳法.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.野球拳_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.野球拳.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.野球拳.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.野球拳.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.野球拳.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.野球拳.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.野球拳.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.天山六阳掌_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.天山六阳掌.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.天山六阳掌.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.天山六阳掌.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.天山六阳掌.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.天山六阳掌.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.天山六阳掌.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.降龙十八掌_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.降龙十八掌.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.降龙十八掌.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.降龙十八掌.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.降龙十八掌.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.降龙十八掌.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.降龙十八掌.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.醉拳_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.醉拳.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.醉拳.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.醉拳.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.醉拳.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.醉拳.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.醉拳.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.摧魂腐心掌_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.摧魂腐心掌.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.摧魂腐心掌.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.摧魂腐心掌.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.摧魂腐心掌.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.摧魂腐心掌.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.摧魂腐心掌.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.拜月七诀_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.拜月七诀.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.拜月七诀.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.拜月七诀.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.拜月七诀.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.拜月七诀.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.拜月七诀.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.如来九印_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.如来九印.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.如来九印.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.如来九印.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.如来九印.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.如来九印.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.如来九印.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				default:
					break;
				}
			}
		}
		if (m_BookNodeList != null && m_BookNodeList.size() > 0) {
			martialIDList.add(quanzhangMartialID);
		}
	}
}
