package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import save.edit.ui.EditPanel;
import save.edit.ui.GongFaPanel;
import save.edit.ui.PanelManager;
import save.edit.ui.TalentPanel;

public class BackListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		EditPanel editPanel = PanelManager.getEditPanel();
		GongFaPanel gongFaPanel = PanelManager.getGongFaPanel();
		TalentPanel talentPanel = PanelManager.getTalentPanel();
		gongFaPanel.setVisible(false);
		talentPanel.setVisible(false);
		editPanel.setVisible(true);
	}

}
