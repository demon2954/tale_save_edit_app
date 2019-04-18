package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import save.edit.Global;
import save.edit.data.abillty.AbilityManager;
import save.edit.model.M_AbilityIDList;
import save.edit.model.SaveModel;
import save.edit.ui.PanelManager;

public class AbilityListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		SaveModel save = Global.getSave();
		
		List<M_AbilityIDList> m_AbilityIDList = save.getM_AbilityIDList();
		for (M_AbilityIDList one : m_AbilityIDList) {
			if (one.getM_iType() == 28) {
				one.setM_BookNodeList(AbilityManager.getAbilityList());
			}
		}
		JOptionPane.showMessageDialog(PanelManager.getEditPanel(), "设置成功!");
	}
}
