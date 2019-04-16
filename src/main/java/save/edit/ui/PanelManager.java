package save.edit.ui;

public class PanelManager {

	private static EditPanel editPanel = null;
	private static GongFaPanel gongFaPanel = null;
	private static TalentPanel talentPanel = null;

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
}
