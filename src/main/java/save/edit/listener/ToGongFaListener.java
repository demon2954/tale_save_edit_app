package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import save.edit.ui.EditPanel;
import save.edit.ui.GongFaPanel;
import save.edit.ui.PanelManager;

public class ToGongFaListener implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {
		EditPanel editPanel = PanelManager.getEditPanel();
		GongFaPanel gongFaPanel = PanelManager.getGongFaPanel();
		editPanel.setVisible(false);
		gongFaPanel.setVisible(true);
	}

}
