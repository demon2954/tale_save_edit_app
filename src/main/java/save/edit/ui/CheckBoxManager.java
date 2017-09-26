package save.edit.ui;

import javax.swing.JCheckBox;

public class CheckBoxManager {
	public static int CB_TYPE = 0;
	public final static int CB_JIANFA = 1, CB_DAOFA = 2, CB_XINFA = 3, CB_QUANZHANG = 4, CB_ZHIFA = 5, CB_TUIFA = 6;
	
	private static String[] jianFa = { "逍遥剑法", "诸子剑法", "独孤九剑", "太王四神剑" };
	private static String[] daoFa = { "逍遥刀法", "无极刀法", "胡家刀法" };
	private static String[] xinFa = { "逍遥心法", "东方宝典", "天龙八部功", "金雁功", "虎啸功", "五毒赤焰功", "禅宗莲华功", "小无相功", "残花宝鉴" };
	private static String[] quanZhang = { "逍遥拳法", "野球拳", "天山六阳掌", "醉拳", "摧魂腐心掌", "拜月七诀", "如来九印" };
	private static String[] zhiFa = { "一阳指", "九阴龙爪功", "飞瀑连环指", "六脉神剑", "逍遥指" };
	private static String[] tuiFa = { "佛山无影脚", "逍遥迷踪腿", "十二路镇魂腿" };

	public final static int 逍遥剑法_idx = 0, 诸子剑法_idx = 1, 独孤九剑_idx = 2, 太王四神剑_idx = 3, jianFaEndIdx = 4;
	public final static int 逍遥刀法_idx = 0, 无极刀法_idx = 1, 胡家刀法_idx = 2, daoFaEndIdx = 3;
	public final static int 逍遥心法_idx = 0, 东方宝典_idx = 1, 天龙八部功_idx = 2, 金雁功_idx = 3, 虎啸功_idx = 4, 五毒赤焰功_idx = 5, 禅宗莲华功_idx = 6, 小无相功_idx = 7, 残花宝鉴_idx = 8, xinFaEndIdx = 9;
	public final static int 逍遥拳法_idx = 0, 野球拳_idx = 1, 天山六阳掌_idx = 2, 醉拳_idx = 3, 摧魂腐心掌_idx = 4, 拜月七诀_idx = 5, 如来九印_idx = 6, quanZhangEndIdx = 7;
	public final static int 一阳指_idx = 0, 九阴龙爪功_idx = 1, 飞瀑连环指_idx = 2, 六脉神剑_idx = 3, 逍遥指_idx = 4, zhiFaEndIdx = 5;
	public final static int 佛山无影脚_idx = 0, 逍遥迷踪腿_idx = 1, 十二路镇魂腿_idx = 2, tuiFaEndIdx = 3;

	private static JCheckBox[] jianFaCheckBoxs = null;
	private static JCheckBox[] daoFaCheckBoxs = null;
	private static JCheckBox[] xinFaCheckBoxs = null;
	private static JCheckBox[] quanZhangCheckBoxs = null;
	private static JCheckBox[] zhiFaCheckBoxs = null;
	private static JCheckBox[] tuiFaCheckBoxs = null;

	public static JCheckBox[] getJianFaCheckBoxs() {
		if (null == jianFaCheckBoxs) {
			jianFaCheckBoxs = new JCheckBox[jianFa.length];
			for (int i = 0; i < jianFaEndIdx; i++) {
				jianFaCheckBoxs[i] = new JCheckBox(jianFa[i]);
			}
		}
		return jianFaCheckBoxs;
	}

	public static JCheckBox[] getDaoFaCheckBoxs() {
		if (null == daoFaCheckBoxs) {
			daoFaCheckBoxs = new JCheckBox[daoFa.length];
			for (int i = 0; i < daoFaEndIdx; i++) {
				daoFaCheckBoxs[i] = new JCheckBox(daoFa[i]);
			}
		}
		return daoFaCheckBoxs;
	}

	public static JCheckBox[] getXinFaCheckBoxs() {
		if (null == xinFaCheckBoxs) {
			xinFaCheckBoxs = new JCheckBox[xinFa.length];
			for (int i = 0; i < xinFaEndIdx; i++) {
				xinFaCheckBoxs[i] = new JCheckBox(xinFa[i]);
			}
		}
		return xinFaCheckBoxs;
	}

	public static JCheckBox[] getQuanZhangCheckBoxs() {
		if (null == quanZhangCheckBoxs) {
			quanZhangCheckBoxs = new JCheckBox[quanZhang.length];
			for (int i = 0; i < quanZhangEndIdx; i++) {
				quanZhangCheckBoxs[i] = new JCheckBox(quanZhang[i]);
			}
		}
		return quanZhangCheckBoxs;
	}

	public static JCheckBox[] getZhiFaCheckBoxs() {
		if (null == zhiFaCheckBoxs) {
			zhiFaCheckBoxs = new JCheckBox[zhiFa.length];
			for (int i = 0; i < zhiFaEndIdx; i++) {
				zhiFaCheckBoxs[i] = new JCheckBox(zhiFa[i]);
			}
		}
		return zhiFaCheckBoxs;
	}

	public static JCheckBox[] getTuiFaCheckBoxs() {
		if (null == tuiFaCheckBoxs) {
			tuiFaCheckBoxs = new JCheckBox[tuiFa.length];
			for (int i = 0; i < tuiFaEndIdx; i++) {
				tuiFaCheckBoxs[i] = new JCheckBox(tuiFa[i]);
			}
		}
		return tuiFaCheckBoxs;
	}
	
	public static void setAllUnVisible() {
		for (JCheckBox one : jianFaCheckBoxs) {
			one.setVisible(false);
		}
		for (JCheckBox one : daoFaCheckBoxs) {
			one.setVisible(false);
		}
		for (JCheckBox one : xinFaCheckBoxs) {
			one.setVisible(false);
		}
		for (JCheckBox one : quanZhangCheckBoxs) {
			one.setVisible(false);
		}
		for (JCheckBox one : zhiFaCheckBoxs) {
			one.setVisible(false);
		}
		for (JCheckBox one : tuiFaCheckBoxs) {
			one.setVisible(false);
		}
	}
	
	/**
	 * @param type
	 */
	public static void setOneVisible(int type) {
		switch (type) {
		case CB_JIANFA:
			for (JCheckBox one : jianFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case CB_DAOFA:
			for (JCheckBox one : daoFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case CB_QUANZHANG:
			for (JCheckBox one : quanZhangCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case CB_TUIFA:
			for (JCheckBox one : tuiFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case CB_XINFA:
			for (JCheckBox one : xinFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case CB_ZHIFA:
			for (JCheckBox one : zhiFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		default:
			break;
		}
	}

	public static int getCB_TYPE() {
		return CB_TYPE;
	}
	public static void setCB_TYPE(int cB_TYPE) {
		CB_TYPE = cB_TYPE;
	}
}
