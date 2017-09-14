package save.edit.listener.util.savegf;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;

import save.edit.data.BookNodeEnum;
import save.edit.data.NeiGongNodeEnum;
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
		JCheckBox[] zhiFaCheckBoxs = CheckBoxManager.getZhiFaCheckBoxs();
		
		for (int i = 0; i < zhiFaCheckBoxs.length; i++) {
			JCheckBox one = zhiFaCheckBoxs[i];
			if (one.isSelected()) {
				PlayerNeigongNode neigongNode = new PlayerNeigongNode();
				switch (i) {
				case CheckBoxManager.逍遥心法_idx:
					neigongNode.setM_iAccumulationExp(100000);
					neigongNode.setM_iExp(1);
					neigongNode.setM_iLV(10);
					neigongNode.setM_iNeigongID(NeiGongNodeEnum.逍遥心法.getM_iNeigongID());
					neigongNode.setM_strNeigongName(NeiGongNodeEnum.逍遥心法.getM_strNeigongName());
					neigongNode.setM_strSelectImage(NeiGongNodeEnum.逍遥心法.getM_strSelectImage());
					neigongNode.setM_strStatusImage(NeiGongNodeEnum.逍遥心法.getM_strStatusImage());
					neigongNodeList.add(neigongNode);
					break;
				case CheckBoxManager.东方宝典_idx:
					neigongNode.setM_iAccumulationExp(100000);
					neigongNode.setM_iExp(1);
					neigongNode.setM_iLV(10);
					neigongNode.setM_iNeigongID(NeiGongNodeEnum.东方宝典.getM_iNeigongID());
					neigongNode.setM_strNeigongName(NeiGongNodeEnum.东方宝典.getM_strNeigongName());
					neigongNode.setM_strSelectImage(NeiGongNodeEnum.东方宝典.getM_strSelectImage());
					neigongNode.setM_strStatusImage(NeiGongNodeEnum.东方宝典.getM_strStatusImage());
					neigongNodeList.add(neigongNode);
					neigongNodeList.add(neigongNode);
					break;
				case CheckBoxManager.天龙八部功_idx:
					neigongNode.setM_iAccumulationExp(100000);
					neigongNode.setM_iExp(1);
					neigongNode.setM_iLV(10);
					neigongNode.setM_iNeigongID(NeiGongNodeEnum.天龙八部功.getM_iNeigongID());
					neigongNode.setM_strNeigongName(NeiGongNodeEnum.天龙八部功.getM_strNeigongName());
					neigongNode.setM_strSelectImage(NeiGongNodeEnum.天龙八部功.getM_strSelectImage());
					neigongNode.setM_strStatusImage(NeiGongNodeEnum.天龙八部功.getM_strStatusImage());
					neigongNodeList.add(neigongNode);
					neigongNodeList.add(neigongNode);
					break;
				case CheckBoxManager.金雁功_idx:
					neigongNode.setM_iAccumulationExp(100000);
					neigongNode.setM_iExp(1);
					neigongNode.setM_iLV(10);
					neigongNode.setM_iNeigongID(NeiGongNodeEnum.金雁功.getM_iNeigongID());
					neigongNode.setM_strNeigongName(NeiGongNodeEnum.金雁功.getM_strNeigongName());
					neigongNode.setM_strSelectImage(NeiGongNodeEnum.金雁功.getM_strSelectImage());
					neigongNode.setM_strStatusImage(NeiGongNodeEnum.金雁功.getM_strStatusImage());
					neigongNodeList.add(neigongNode);
					neigongNodeList.add(neigongNode);
					break;
				case CheckBoxManager.虎啸功_idx:
					neigongNode.setM_iAccumulationExp(100000);
					neigongNode.setM_iExp(1);
					neigongNode.setM_iLV(10);
					neigongNode.setM_iNeigongID(NeiGongNodeEnum.虎啸功.getM_iNeigongID());
					neigongNode.setM_strNeigongName(NeiGongNodeEnum.虎啸功.getM_strNeigongName());
					neigongNode.setM_strSelectImage(NeiGongNodeEnum.虎啸功.getM_strSelectImage());
					neigongNode.setM_strStatusImage(NeiGongNodeEnum.虎啸功.getM_strStatusImage());
					neigongNodeList.add(neigongNode);
					neigongNodeList.add(neigongNode);
					break;
				case CheckBoxManager.五毒赤焰功_idx:
					neigongNode.setM_iAccumulationExp(100000);
					neigongNode.setM_iExp(1);
					neigongNode.setM_iLV(10);
					neigongNode.setM_iNeigongID(NeiGongNodeEnum.五毒赤焰功.getM_iNeigongID());
					neigongNode.setM_strNeigongName(NeiGongNodeEnum.五毒赤焰功.getM_strNeigongName());
					neigongNode.setM_strSelectImage(NeiGongNodeEnum.五毒赤焰功.getM_strSelectImage());
					neigongNode.setM_strStatusImage(NeiGongNodeEnum.五毒赤焰功.getM_strStatusImage());
					neigongNodeList.add(neigongNode);
					neigongNodeList.add(neigongNode);
					break;
				case CheckBoxManager.禅宗莲华功_idx:
					neigongNode.setM_iAccumulationExp(100000);
					neigongNode.setM_iExp(1);
					neigongNode.setM_iLV(10);
					neigongNode.setM_iNeigongID(NeiGongNodeEnum.禅宗莲华功.getM_iNeigongID());
					neigongNode.setM_strNeigongName(NeiGongNodeEnum.禅宗莲华功.getM_strNeigongName());
					neigongNode.setM_strSelectImage(NeiGongNodeEnum.禅宗莲华功.getM_strSelectImage());
					neigongNode.setM_strStatusImage(NeiGongNodeEnum.禅宗莲华功.getM_strStatusImage());
					neigongNodeList.add(neigongNode);
					neigongNodeList.add(neigongNode);
					break;
				case CheckBoxManager.小无相功_idx:
					neigongNode.setM_iAccumulationExp(100000);
					neigongNode.setM_iExp(1);
					neigongNode.setM_iLV(10);
					neigongNode.setM_iNeigongID(NeiGongNodeEnum.小无相功.getM_iNeigongID());
					neigongNode.setM_strNeigongName(NeiGongNodeEnum.小无相功.getM_strNeigongName());
					neigongNode.setM_strSelectImage(NeiGongNodeEnum.小无相功.getM_strSelectImage());
					neigongNode.setM_strStatusImage(NeiGongNodeEnum.小无相功.getM_strStatusImage());
					neigongNodeList.add(neigongNode);
					neigongNodeList.add(neigongNode);
					break;
				default:
					break;
				}
			}
		}
	}

	@Override
	public void saveMartialID(List<MartialID> martialIDList) {
		MartialID daofaMartialID = null;
		if (null != martialIDList && martialIDList.size() > 0) {
			for (MartialID one : martialIDList) {
				if (one.getM_iType() == neigongType) {
					daofaMartialID = one;
					break;
				}
			}
		}
		List<BookNode> m_BookNodeList = new ArrayList<BookNode>();
		if (daofaMartialID == null) {
			daofaMartialID = new MartialID();
			daofaMartialID.setM_IDList(new ArrayList<ID>());
			daofaMartialID.setM_iType(neigongType);
			daofaMartialID.setM_BookNodeList(m_BookNodeList);
			martialIDList.add(daofaMartialID);
		}

		JCheckBox[] daoFaCheckBoxs = CheckBoxManager.getDaoFaCheckBoxs();
		BookNode bookNode = null;
		for (int i = 0; i < daoFaCheckBoxs.length; i++) {
			JCheckBox one = daoFaCheckBoxs[i];
			if (one.isSelected()) {
				switch (i) {
				case CheckBoxManager.逍遥心法_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.逍遥心法.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.逍遥心法.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.逍遥心法.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.逍遥心法.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.逍遥心法.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.逍遥心法.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.东方宝典_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.东方宝典.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.东方宝典.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.东方宝典.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.东方宝典.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.东方宝典.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.东方宝典.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.天龙八部功_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.天龙八部功.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.天龙八部功.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.天龙八部功.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.天龙八部功.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.天龙八部功.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.天龙八部功.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.金雁功_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.金雁功.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.金雁功.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.金雁功.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.金雁功.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.金雁功.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.金雁功.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.虎啸功_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.虎啸功.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.虎啸功.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.虎啸功.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.虎啸功.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.虎啸功.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.虎啸功.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.五毒赤焰功_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.五毒赤焰功.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.五毒赤焰功.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.五毒赤焰功.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.五毒赤焰功.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.五毒赤焰功.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.五毒赤焰功.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.禅宗莲华功_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.禅宗莲华功.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.禅宗莲华功.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.禅宗莲华功.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.禅宗莲华功.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.禅宗莲华功.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.禅宗莲华功.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				case CheckBoxManager.小无相功_idx:
					bookNode = new BookNode();
					bookNode.setM_iAbilityType(BookNodeEnum.小无相功.getM_iAbilityType());
					bookNode.setM_iID(BookNodeEnum.小无相功.getM_iID());
					bookNode.setM_iSkillful(0);
					bookNode.setM_strAbilityID(BookNodeEnum.小无相功.getM_strAbilityID());
					bookNode.setM_strBookImage(BookNodeEnum.小无相功.getM_strBookImage());
					bookNode.setM_strBookMsg(BookNodeEnum.小无相功.getM_strBookMsg());
					bookNode.setM_sValueLink(BookNodeEnum.小无相功.getM_sValueLink());
					m_BookNodeList.add(bookNode);
					break;
				default:
					break;
				}
			}
		}
	}
}
