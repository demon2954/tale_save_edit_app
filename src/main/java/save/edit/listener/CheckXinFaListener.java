package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import save.edit.data.xinfa.OtherXinFaManager;
import save.edit.model.ext.NeiGongNodeExt;
import save.edit.ui.PanelManager;

public class CheckXinFaListener implements ActionListener {
	private int neiGongId;

	@Override
	public void actionPerformed(ActionEvent e) {
		NeiGongNodeExt neiGongNodeExt = OtherXinFaManager.getOtherXinFaIdMap().get(this.neiGongId);
		JOptionPane.showMessageDialog(PanelManager.getOtherNpcPanel(), neiGongNodeExt.getTips());
	}

	public CheckXinFaListener(int neiGongId) {
		super();
		this.neiGongId = neiGongId;
	}
}
