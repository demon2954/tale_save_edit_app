package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import save.edit.Global;
import save.edit.data.item.ItemManager;
import save.edit.model.M_BackpackItem;
import save.edit.model.SaveModel;
import save.edit.model._ItemDataNode;
import save.edit.ui.PanelManager;

public class AllItemListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		SaveModel save = Global.getSave();

		List<M_BackpackItem> m_BackpackList = save.getM_BackpackList();

		List<M_BackpackItem> packList = ItemManager.getPackList();

		List<M_BackpackItem> trueBackPackList = new ArrayList<M_BackpackItem>();

		Set<Long> packIdSet = packList.stream().map(one -> {
			_ItemDataNode get_ItemDataNode = one.get_ItemDataNode();
			return get_ItemDataNode.getM_iItemID();
		}).collect(Collectors.toSet());

		for (M_BackpackItem existedItem : m_BackpackList) {
			if (!packIdSet.contains(existedItem.get_ItemDataNode().getM_iItemID())) {
				_ItemDataNode item = existedItem.get_ItemDataNode();

				if (item.getM_iItemStack() + item.getM_iMixStack() > 10) {
					existedItem.setM_iAmount(999);
				}
				trueBackPackList.add(existedItem);
			}
		}
		trueBackPackList.addAll(packList);

		List<M_BackpackItem> sortedList = trueBackPackList.stream().sorted((a, b) -> {
			return a.get_ItemDataNode().getM_iItemID().compareTo(b.get_ItemDataNode().getM_iItemID());
		}).collect(Collectors.toList());

		save.setM_BackpackList(sortedList);
		JOptionPane.showMessageDialog(PanelManager.getEditPanel(), "设置成功!");
	}
}
