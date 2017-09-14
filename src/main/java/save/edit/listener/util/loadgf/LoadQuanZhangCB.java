package save.edit.listener.util.loadgf;

import java.util.List;

import save.edit.constant.BookNodeIdConstant;
import save.edit.model.martial.BookNode;
import save.edit.model.martial.MartialID;
import save.edit.ui.CheckBoxManager;

public class LoadQuanZhangCB extends AbstractLoadGongFaCheckBox {
	@Override
	public void dealMartialId(MartialID martialID) {
		if (martialID != null) {
			List<BookNode> nodeList = martialID.getM_BookNodeList();
			if (nodeList != null && nodeList.size() > 0) {
				for (BookNode node : nodeList) {
					switch (node.getM_iID()) {
					case BookNodeIdConstant.逍遥拳法:
						CheckBoxManager.getQuanZhangCheckBoxs()[CheckBoxManager.逍遥拳法_idx].setSelected(true);
						break;
					case BookNodeIdConstant.野球拳:
						CheckBoxManager.getQuanZhangCheckBoxs()[CheckBoxManager.野球拳_idx].setSelected(true);
						break;
					case BookNodeIdConstant.天山六阳掌:
						CheckBoxManager.getQuanZhangCheckBoxs()[CheckBoxManager.天山六阳掌_idx].setSelected(true);
						break;
					case BookNodeIdConstant.醉拳:
						CheckBoxManager.getQuanZhangCheckBoxs()[CheckBoxManager.醉拳_idx].setSelected(true);
						break;
					case BookNodeIdConstant.摧魂腐心掌:
						CheckBoxManager.getQuanZhangCheckBoxs()[CheckBoxManager.摧魂腐心掌_idx].setSelected(true);
						break;
					case BookNodeIdConstant.拜月七诀:
						CheckBoxManager.getQuanZhangCheckBoxs()[CheckBoxManager.拜月七诀_idx].setSelected(true);
						break;
					case BookNodeIdConstant.如来九印:
						CheckBoxManager.getQuanZhangCheckBoxs()[CheckBoxManager.如来九印_idx].setSelected(true);
						break;
					default:
						break;
					}
				}
			}
		}
	}
}
