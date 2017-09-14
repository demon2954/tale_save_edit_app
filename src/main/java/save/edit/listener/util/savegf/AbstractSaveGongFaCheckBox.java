package save.edit.listener.util.savegf;

import java.util.List;

import save.edit.model.martial.MartialID;
import save.edit.model.routine.PlayerNeigongNode;
import save.edit.model.routine.PlayerRoutineNode;

public abstract class AbstractSaveGongFaCheckBox {
	public static final int neigongType = 18, quanzhangType = 19, zhifaType = 20, tuifaType = 21, jianfaType = 22, daofaType = 23;

	public static AbstractSaveGongFaCheckBox procuce(int type) {
		switch (type) {
		case neigongType:
			return new SaveXinFaCB();
		case quanzhangType:
			return new SaveQuanZhangCB();
		case zhifaType:
			return new SaveZhiFaCB();
		case tuifaType:
			return new SaveTuiFaCB();
		case jianfaType:
			return new SaveJianFaCB();
		case daofaType:
			return new SaveDaoFaCB();
		default:
			break;
		}
		return null;
	}
	
	
	/**
	 * 保存功法
	 * @param routineNodeList
	 */
	public abstract void saveGongFa(List<PlayerRoutineNode> routineNodeList);// 功法列表

	/**
	 * 保存内功
	 * @param neigongNodeList
	 */
	public abstract void saveNeiGong(List<PlayerNeigongNode> neigongNodeList);// 内功列表

	/**
	 * 保存技艺书
	 * @param MartialIDList
	 */
	public abstract void saveMartialID(List<MartialID> martialIDList);// 技艺书列表
}
