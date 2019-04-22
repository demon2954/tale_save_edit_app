package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import save.edit.ui.EditPanel;
import save.edit.ui.HeadImagePanel;
import save.edit.ui.PanelManager;

public class ToHeadImageListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		EditPanel editPanel = PanelManager.getEditPanel();
		HeadImagePanel headImagePanel = PanelManager.getHeadImagePanel();
		editPanel.setVisible(false);
		headImagePanel.setVisible(true);
	}

}
