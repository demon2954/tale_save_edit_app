package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

import save.edit.ui.CheckBoxManager;

public class AllCBListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		JCheckBox[] cbs = null;
		switch (CheckBoxManager.getCB_TYPE()) {
		case CheckBoxManager.CB_DAOFA:
			cbs = CheckBoxManager.getDaoFaCheckBoxs();
			break;
		case CheckBoxManager.CB_JIANFA:
			cbs = CheckBoxManager.getJianFaCheckBoxs();
			break;
		case CheckBoxManager.CB_QUANZHANG:
			cbs = CheckBoxManager.getQuanZhangCheckBoxs();
			break;
		case CheckBoxManager.CB_TUIFA:
			cbs = CheckBoxManager.getTuiFaCheckBoxs();
			break;
		case CheckBoxManager.CB_XINFA:
			cbs = CheckBoxManager.getXinFaCheckBoxs();
			break;
		case CheckBoxManager.CB_ZHIFA:
			cbs = CheckBoxManager.getZhiFaCheckBoxs();
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
