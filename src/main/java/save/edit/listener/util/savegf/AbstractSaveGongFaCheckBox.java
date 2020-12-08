package save.edit.listener.util.savegf;

import java.util.List;

import save.edit.constant.Constant;
import save.edit.model.martial.MartialID;
import save.edit.model.routine.PlayerNeigongNode;
import save.edit.model.routine.PlayerRoutineNode;

public abstract class AbstractSaveGongFaCheckBox {

	public static AbstractSaveGongFaCheckBox procuce(int type) {
		switch (type) {
		case Constant.SKILL_TYPE_XINFA:
			return new SaveXinFaCB();
		case Constant.SKILL_TYPE_QUANZHANG:
			return new SaveQuanZhangCB();
		case Constant.SKILL_TYPE_ZHIFA:
			return new SaveZhiFaCB();
		case Constant.SKILL_TYPE_TUIFA:
			return new SaveTuiFaCB();
		case Constant.SKILL_TYPE_JIANFA:
			return new SaveJianFaCB();
		case Constant.SKILL_TYPE_DAOFA:
			return new SaveDaoFaCB();
		case Constant.SKILL_TYPE_GUNFA:
			return new SaveGunFaCB();
		case Constant.SKILL_TYPE_DUANBING:
			return new SaveDuanBingCB();
		case Constant.SKILL_TYPE_ANQI:
			return new SaveAnQiCB();
		case Constant.SKILL_TYPE_QINGONG:
			return new SaveQinGongCB();
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
