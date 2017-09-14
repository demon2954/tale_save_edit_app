package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import save.edit.ui.CheckBoxManager;
import save.edit.ui.EditPanel;
import save.edit.ui.GongFaPanel;
import save.edit.ui.PanelManager;

public class ToGongFaListener implements ActionListener {
	private int checkBoxType;

	public void actionPerformed(ActionEvent arg0) {
		EditPanel editPanel = PanelManager.getEditPanel();
		GongFaPanel gongFaPanel = PanelManager.getGongFaPanel();
		editPanel.setVisible(false);
		gongFaPanel.setVisible(true);
		
		CheckBoxManager.setAllUnVisible();
		CheckBoxManager.setOneVisible(checkBoxType);
	}

	public ToGongFaListener(int checkBoxType) {
		super();
		this.checkBoxType = checkBoxType;
	}
}
