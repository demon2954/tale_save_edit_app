package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import save.edit.Global;
import save.edit.model.SaveModel;
import save.edit.model.M_NpcFriendlyNodeList;

public class FriendFullListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		SaveModel save = Global.getSave();
		List<M_NpcFriendlyNodeList> friendList = save.getM_NpcFriendlyNodeList();
		if (friendList != null && friendList.size() > 0) {
			for (M_NpcFriendlyNodeList one : friendList) {
				one.setM_iFriendly(100);
			}
		}
	}
}
