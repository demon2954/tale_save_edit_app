package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import save.edit.Global;
import save.edit.model.SaveModel;
import save.edit.model.friendly.NpcFriendlyNode;

public class FriendFullListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		SaveModel save = Global.getSave();
		List<NpcFriendlyNode> friendList = save.getM_NpcFriendlyNodeList();
		if (friendList != null && friendList.size() > 0) {
			for (NpcFriendlyNode one : friendList) {
				one.setM_iFriendly(100);
			}
		}
	}
}
