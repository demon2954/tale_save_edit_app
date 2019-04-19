package save.edit.ui;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JCheckBox;

public class NpcXinFaCheckBoxManager {
	private static final Set<JCheckBox> npcXinFaChBoxSet = new HashSet<JCheckBox>();

	public static void add(JCheckBox checkBox) {
		npcXinFaChBoxSet.add(checkBox);
	}

	public static Set<JCheckBox> get() {
		return npcXinFaChBoxSet;
	}

}
