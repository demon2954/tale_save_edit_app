package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

import save.edit.constant.Constant;
import save.edit.ui.CheckBoxManager;

public class AllCBListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		JCheckBox[] cbs = null;
		switch (CheckBoxManager.getCB_TYPE()) {
		case Constant.SKILL_TYPE_DAOFA:
			cbs = CheckBoxManager.getDaoFaCheckBoxs();
			break;
		case Constant.SKILL_TYPE_JIANFA:
			cbs = CheckBoxManager.getJianFaCheckBoxs();
			break;
		case Constant.SKILL_TYPE_QUANZHANG:
			cbs = CheckBoxManager.getQuanZhangCheckBoxs();
			break;
		case Constant.SKILL_TYPE_TUIFA:
			cbs = CheckBoxManager.getTuiFaCheckBoxs();
			break;
		case Constant.SKILL_TYPE_XINFA:
			cbs = CheckBoxManager.getXinFaCheckBoxs();
			break;
		case Constant.SKILL_TYPE_ZHIFA:
			cbs = CheckBoxManager.getZhiFaCheckBoxs();
			break;
		case Constant.SKILL_TYPE_GUNFA:
			cbs = CheckBoxManager.getGunFaCheckBoxs();
			break;
		case Constant.SKILL_TYPE_DUANBING:
			cbs = CheckBoxManager.getDuanBingCheckBoxs();
			break;
		case Constant.SKILL_TYPE_ANQI:
			cbs = CheckBoxManager.getAnQiCheckBoxs();
			break;
		case Constant.SKILL_TYPE_QINGONG:
			cbs = CheckBoxManager.getQinGongCheckBoxs();
			break;
		default:
			break;
		}
		if (cbs != null && cbs.length > 0) {
			for (JCheckBox one : cbs) {
				one.setSelected(true);
			}
		}
	}

}
