package save.edit.listener.util.loadgf;

import java.util.List;

import save.edit.constant.BookNodeIdConstant;
import save.edit.model.martial.BookNode;
import save.edit.model.martial.MartialID;
import save.edit.ui.CheckBoxManager;

public class LoadDaoFaCB extends AbstractLoadGongFaCheckBox {
	@Override
	public void dealMartialId(MartialID martialID) {
		if (martialID != null) {
			List<BookNode> nodeList = martialID.getM_BookNodeList();
			if (nodeList != null && nodeList.size() > 0) {
				for (BookNode node : nodeList) {
					switch (node.getM_iID()) {
					case BookNodeIdConstant.逍遥刀法:
						CheckBoxManager.getDaoFaCheckBoxs()[CheckBoxManager.逍遥刀法_idx].setSelected(true);
						break;
					case BookNodeIdConstant.无极刀法:
						CheckBoxManager.getDaoFaCheckBoxs()[CheckBoxManager.无极刀法_idx].setSelected(true);
						break;
					case BookNodeIdConstant.胡家刀法:
						CheckBoxManager.getDaoFaCheckBoxs()[CheckBoxManager.胡家刀法_idx].setSelected(true);
						break;
					default:
						break;
					}
				}
			}
		}
	}
}
