package save.edit.listener.util.loadgf;

import java.util.List;

import save.edit.constant.BookNodeIdConstant;
import save.edit.model.martial.BookNode;
import save.edit.model.martial.MartialID;
import save.edit.ui.CheckBoxManager;

public class LoadXinFaCB extends AbstractLoadGongFaCheckBox {
	@Override
	public void dealMartialId(MartialID martialID) {
		if (martialID != null) {
			List<BookNode> nodeList = martialID.getM_BookNodeList();
			if (nodeList != null && nodeList.size() > 0) {
				for (BookNode node : nodeList) {
					switch (node.getM_iID()) {
					case BookNodeIdConstant.逍遥心法:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.逍遥心法_idx].setSelected(true);
						break;
					case BookNodeIdConstant.东方宝典:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.东方宝典_idx].setSelected(true);
						break;
					case BookNodeIdConstant.残花宝鉴:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.残花宝鉴_idx].setSelected(true);
						break;
					case BookNodeIdConstant.天龙八部功:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.天龙八部功_idx].setSelected(true);
						break;
					case BookNodeIdConstant.金雁功:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.金雁功_idx].setSelected(true);
						break;
					case BookNodeIdConstant.虎啸功:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.虎啸功_idx].setSelected(true);
						break;
					case BookNodeIdConstant.五毒赤焰功:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.五毒赤焰功_idx].setSelected(true);
						break;
					case BookNodeIdConstant.禅宗莲华功:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.禅宗莲华功_idx].setSelected(true);
						break;
					case BookNodeIdConstant.小无相功:
						CheckBoxManager.getXinFaCheckBoxs()[CheckBoxManager.小无相功_idx].setSelected(true);
						break;
					default:
						break;
					}
				}
			}
		}
	}
}
