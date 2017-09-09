package save.edit.model.constant;

public enum GroupsNodeEnum {
	SHI_ZHAN(0, 0), //
	WU_SHU(0, 1), //
	DAO_DE(0, 2), //
	MING_SHENG(0, 3), //
	WU_XING(0, 4), //
	HP(0, 5), //
	MP(0, 6), //

	YAN_GONG(1, 0), //
	ER_GONG(1, 1), //
	RUAN_GONG(1, 2), //
	YING_GONG(1, 3), //
	QING_GONG(1, 4), //
	ONE_5(1, 5), //

	TWO_0(2, 0), //
	TWO_1(2, 1), //
	TWO_2(2, 2), //
	TWO_3(2, 3), //
	TWO_4(2, 4), //
	GUN_FA(2, 5), //
	DUAN_BING(2, 6), //
	AN_QI(2, 7), //
	QIN_GONG(2, 8), //

	WA_KUANG(3, 0), //
	DA_LIE(3, 1), //
	DIAO_YU(3, 2), //
	CAI_YAO(3, 3), //
	LIAN_DAN(3, 4), //
	DA_TIE(3, 5), //
	JIAN_DING(3, 6), //
	THREE_7(3, 7), //
	CHU_YI(3, 8), //

	YUE_LI(4, 0), //
	FOUR_1(4, 1), //
	DU_SHU(4, 2), //
	YI_SHU(4, 3), //
	HUI_HUA(4, 4), //
	SHU_FA(4, 5), //
	JIU_YI(4, 6), //
	HUA_HUI(4, 7), //
	CHA_DAO(4, 8),//
	
	;
	private int type;
	private int index;

	private GroupsNodeEnum(int type, int index) {
		this.type = type;
		this.index = index;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
