package save.edit.ui;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class HeadImageBtnGroup {
	private static final ButtonGroup headImageBtnGroup = new ButtonGroup();

	public static void add(JRadioButton btn) {
		headImageBtnGroup.add(btn);
	}

	public static ButtonGroup getGroup() {
		return headImageBtnGroup;
	}
}
