package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;

import save.edit.ui.EditPanel;
import save.edit.ui.PanelManager;

public class OtherNpcListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		EditPanel editPanel = PanelManager.getEditPanel();
		JScrollPane otherNpcPanel = PanelManager.getOtherNpcPanel();
		editPanel.setVisible(false);
		otherNpcPanel.setVisible(true);
	}

}
