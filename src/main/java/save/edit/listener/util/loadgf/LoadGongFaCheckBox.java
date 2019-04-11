package save.edit.listener.util.loadgf;

import java.util.List;

import save.edit.model.M_BookNodeList;
import save.edit.model.M_MartialIDList;
import save.edit.ui.CheckBoxManager;

public class LoadGongFaCheckBox {
	public static final int neigongType = 18, quanzhangType = 19, zhifaType = 20, tuifaType = 21, jianfaType = 22, daofaType = 23;

	public void dealMartialIds(List<M_MartialIDList> martialIdList) {
		for (M_MartialIDList one : martialIdList) {
			if (one != null) {
				List<M_BookNodeList> nodeList = one.getM_BookNodeList();
				if (nodeList != null && nodeList.size() > 0) {
					for (M_BookNodeList node : nodeList) {
						try {
							CheckBoxManager.getBookNodeIdCheckBox().get(node.getM_iID()).setSelected(true);
						} catch (Exception e) {
							e.printStackTrace();
							System.out.println(node.getM_strBookMsg());
						}
					}
				}
			}
		}
	}

}
