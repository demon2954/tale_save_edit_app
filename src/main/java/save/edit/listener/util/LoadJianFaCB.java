package save.edit.listener.util;

import java.util.List;

import save.edit.constant.BookNodeIdConstant;
import save.edit.model.martial.BookNode;
import save.edit.model.martial.MartialID;
import save.edit.ui.CheckBoxManager;

public class LoadJianFaCB extends AbstractLoadGongFaCheckBox {
	@Override
	public void dealMartialId(MartialID martialID) {
		if (martialID != null) {
			List<BookNode> nodeList = martialID.getM_BookNodeList();
			if (nodeList != null && nodeList.size() > 0) {
				for (BookNode node : nodeList) {
					switch (node.getM_iID()) {
					case BookNodeIdConstant.逍遥剑法:
						CheckBoxManager.getJianFaCheckBoxs()[CheckBoxManager.逍遥剑法_idx].setSelected(true);
						break;
					case BookNodeIdConstant.诸子剑法:
						CheckBoxManager.getJianFaCheckBoxs()[CheckBoxManager.诸子剑法_idx].setSelected(true);
						break;
					case BookNodeIdConstant.独孤九剑:
						CheckBoxManager.getJianFaCheckBoxs()[CheckBoxManager.独孤九剑_idx].setSelected(true);
						break;
					case BookNodeIdConstant.太王四神剑:
						CheckBoxManager.getJianFaCheckBoxs()[CheckBoxManager.太王四神剑_idx].setSelected(true);
						break;
					default:
						break;
					}
				}
			}
		}
	}
}
