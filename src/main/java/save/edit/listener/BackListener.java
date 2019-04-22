package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;

import save.edit.ui.EditPanel;
import save.edit.ui.GongFaPanel;
import save.edit.ui.HeadImagePanel;
import save.edit.ui.PanelManager;
import save.edit.ui.TalentPanel;

public class BackListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		EditPanel editPanel = PanelManager.getEditPanel();
		GongFaPanel gongFaPanel = PanelManager.getGongFaPanel();
		TalentPanel talentPanel = PanelManager.getTalentPanel();
		JScrollPane otherNpcPanel = PanelManager.getOtherNpcPanel();
		HeadImagePanel headImagePanel = PanelManager.getHeadImagePanel();
		gongFaPanel.setVisible(false);
		talentPanel.setVisible(false);
		headImagePanel.setVisible(false);
		otherNpcPanel.setVisible(false);
		editPanel.setVisible(true);
	}

}
