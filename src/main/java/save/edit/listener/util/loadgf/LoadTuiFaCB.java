package save.edit.listener.util.loadgf;

import java.util.List;

import save.edit.constant.BookNodeIdConstant;
import save.edit.model.martial.BookNode;
import save.edit.model.martial.MartialID;
import save.edit.ui.CheckBoxManager;

public class LoadTuiFaCB extends AbstractLoadGongFaCheckBox {
	@Override
	public void dealMartialId(MartialID martialID) {
		if (martialID != null) {
			List<BookNode> nodeList = martialID.getM_BookNodeList();
			if (nodeList != null && nodeList.size() > 0) {
				for (BookNode node : nodeList) {
					switch (node.getM_iID()) {
					case BookNodeIdConstant.十二路镇魂腿:
						CheckBoxManager.getTuiFaCheckBoxs()[CheckBoxManager.十二路镇魂腿_idx].setSelected(true);
						break;
					case BookNodeIdConstant.逍遥迷踪腿:
						CheckBoxManager.getTuiFaCheckBoxs()[CheckBoxManager.逍遥迷踪腿_idx].setSelected(true);
						break;
					case BookNodeIdConstant.佛山无影脚:
						CheckBoxManager.getTuiFaCheckBoxs()[CheckBoxManager.佛山无影脚_idx].setSelected(true);
						break;
					default:
						break;
					}
				}
			}
		}
	}
}
