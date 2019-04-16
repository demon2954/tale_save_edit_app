package save.edit.ui;

import javax.swing.JComboBox;

import save.edit.data.talent.TalentDetail;

public class TalentComboBoxManager {
	private final static JComboBox<TalentDetail> talent1ComBox = new JComboBox<TalentDetail>();
	private final static JComboBox<TalentDetail> talent2ComBox = new JComboBox<TalentDetail>();
	private final static JComboBox<TalentDetail> talent3ComBox = new JComboBox<TalentDetail>();

	public static JComboBox<TalentDetail> getTalentComBoxByType(int talentType) {
		if (talentType == 1) {
			return talent1ComBox;
		}
		if (talentType == 2) {
			return talent2ComBox;
		}
		return talent3ComBox;
	}
}
