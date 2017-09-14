package save.edit.listener.util.loadgf;

import save.edit.model.martial.MartialID;

public abstract class AbstractLoadGongFaCheckBox {
	public static final int neigongType = 18, quanzhangType = 19, zhifaType = 20, tuifaType = 21, jianfaType = 22, daofaType = 23;

	abstract public void dealMartialId(MartialID martialID);

	public static AbstractLoadGongFaCheckBox produce(int type) {
		switch (type) {
		case neigongType:
			return new LoadXinFaCB();
		case quanzhangType:
			return new LoadQuanZhangCB();
		case zhifaType:
			return new LoadZhiFaCB();
		case tuifaType:
			return new LoadTuiFaCB();
		case jianfaType:
			return new LoadJianFaCB();
		case daofaType:
			return new LoadDaoFaCB();
		default:
			break;
		}
		return null;
	}

}
