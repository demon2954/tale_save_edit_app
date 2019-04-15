package save.edit.listener.util.loadgf;

import java.util.List;

import save.edit.model.M_BookNodeList;
import save.edit.model.M_MartialIDList;
import save.edit.ui.CheckBoxManager;

public class LoadGongFaCheckBox {
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
							
//							Gson gson = new Gson();
//							System.out.println(gson.toJson(node));
//							System.out.println(node.getM_strBookMsg());
						}
					}
				}
			}
		}
	}

}
