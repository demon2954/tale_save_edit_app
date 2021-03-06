package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import save.edit.ui.EditPanel;
import save.edit.ui.GongFaPanel;
import save.edit.ui.ItemPanel;
import save.edit.ui.PanelManager;

public class BackListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		EditPanel editPanel = PanelManager.getEditPanel();
		GongFaPanel gongFaPanel = PanelManager.getGongFaPanel();
		ItemPanel itemPanel = PanelManager.getItemPanel();
		editPanel.setVisible(true);
		itemPanel.setVisible(false);
		gongFaPanel.setVisible(false);
	}

}
