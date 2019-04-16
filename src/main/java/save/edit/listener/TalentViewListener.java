package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import save.edit.data.talent.TalentDetail;
import save.edit.data.talent.TalentManager;
import save.edit.ui.EditPanel;
import save.edit.ui.PanelManager;
import save.edit.ui.TalentPanel;

public class TalentViewListener implements ActionListener {
	private int talentType;

	public TalentViewListener(int talentType) {
		this.talentType = talentType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		EditPanel editPanel = PanelManager.getEditPanel();
		TalentPanel talentPanel = PanelManager.getTalentPanel();

		TalentDetail[] talentByType = TalentManager.getTalentByType(talentType);

		StringBuffer sb = new StringBuffer();
		for (TalentDetail one : talentByType) {
			sb.append(" ").append(one.getTalenName()).append(":\n   ").append(one.getTalenTip()).append("\n\n");
		}
		JTextArea textArea = TalentPanel.getJTextArea();
		textArea.setText(sb.toString());
		textArea.setEditable(false);
		editPanel.setVisible(false);
		talentPanel.setVisible(true);
	}

}
