package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import save.edit.Global;
import save.edit.data.ItemData;
import save.edit.model.SaveModel;
import save.edit.model.backpack.Backpack;

public class ItemListener implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {

		SaveModel save = Global.getSave();
//		List<Backpack> m_BackpackList = save.getM_BackpackList();
		List<Backpack> allItem = ItemData.getAllItem();
		save.setM_BackpackList(allItem);

	}

	public ItemListener() {
		super();
	}
}
