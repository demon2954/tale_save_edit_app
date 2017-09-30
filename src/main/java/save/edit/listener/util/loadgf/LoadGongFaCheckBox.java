package save.edit.listener.util.loadgf;

import java.util.List;

import save.edit.model.martial.BookNode;
import save.edit.model.martial.MartialID;
import save.edit.ui.CheckBoxManager;

public class LoadGongFaCheckBox {
	public static final int neigongType = 18, quanzhangType = 19, zhifaType = 20, tuifaType = 21, jianfaType = 22, daofaType = 23;

	public void dealMartialIds(List<MartialID> martialIdList) {
		for (MartialID one : martialIdList) {
			if (one != null) {
				List<BookNode> nodeList = one.getM_BookNodeList();
				if (nodeList != null && nodeList.size() > 0) {
					for (BookNode node : nodeList) {
						CheckBoxManager.getBookNodeIdCheckBox().get(node.getM_iID()).setSelected(true);
					}
				}
			}
		}
	}

}
