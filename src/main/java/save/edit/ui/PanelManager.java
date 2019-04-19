package save.edit.ui;

import javax.swing.JScrollPane;

public class PanelManager {

	private static EditPanel editPanel = null;
	private static GongFaPanel gongFaPanel = null;
	private static TalentPanel talentPanel = null;
	private static JScrollPane otherNpcPanel = null;

	public static EditPanel getEditPanel() {
		if (editPanel == null) {
			editPanel = new EditPanel();
		}
		return editPanel;
	}

	public static GongFaPanel getGongFaPanel() {
		if (gongFaPanel == null) {
			gongFaPanel = new GongFaPanel();
		}
		return gongFaPanel;
	}

	public static TalentPanel getTalentPanel() {
		if (talentPanel == null) {
			talentPanel = new TalentPanel();
		}
		return talentPanel;
	}
	
	public static JScrollPane getOtherNpcPanel() {
		if (otherNpcPanel == null) {
			otherNpcPanel = new OtherNpcPanel().getScrollPane();
		}
		return otherNpcPanel;
	}
}
