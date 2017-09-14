package save.edit.listener.util;

import java.util.List;

import save.edit.constant.BookNodeIdConstant;
import save.edit.model.martial.BookNode;
import save.edit.model.martial.MartialID;
import save.edit.ui.CheckBoxManager;

public class LoadZhiFaCB extends AbstractLoadGongFaCheckBox {
	@Override
	public void dealMartialId(MartialID martialID) {
		if (martialID != null) {
			List<BookNode> nodeList = martialID.getM_BookNodeList();
			if (nodeList != null && nodeList.size() > 0) {
				for (BookNode node : nodeList) {
					switch (node.getM_iID()) {
					case BookNodeIdConstant.一阳指:
						CheckBoxManager.getZhiFaCheckBoxs()[CheckBoxManager.一阳指_idx].setSelected(true);
						break;
					case BookNodeIdConstant.九阴龙爪功:
						CheckBoxManager.getZhiFaCheckBoxs()[CheckBoxManager.九阴龙爪功_idx].setSelected(true);
						break;
					case BookNodeIdConstant.飞瀑连环指:
						CheckBoxManager.getZhiFaCheckBoxs()[CheckBoxManager.飞瀑连环指_idx].setSelected(true);
						break;
					case BookNodeIdConstant.六脉神剑:
						CheckBoxManager.getZhiFaCheckBoxs()[CheckBoxManager.六脉神剑_idx].setSelected(true);
						break;
					case BookNodeIdConstant.逍遥指:
						CheckBoxManager.getZhiFaCheckBoxs()[CheckBoxManager.逍遥指_idx].setSelected(true);
						break;
					default:
						break;
					}
				}
			}
		}
	}
}
