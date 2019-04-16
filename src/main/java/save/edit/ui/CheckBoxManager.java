package save.edit.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JCheckBox;

import save.edit.constant.Constant;
import save.edit.data.SkillDetail;
import save.edit.data.SkillManager;

public class CheckBoxManager {
	public static int CB_TYPE = 0;
	
	// 所有技能id对应的checkbox
	private static Map<Integer, JCheckBox> bookNodeIdCheckBoxMap = null;

	private static JCheckBox[] jianFaCheckBoxs = null;
	private static JCheckBox[] daoFaCheckBoxs = null;
	private static JCheckBox[] xinFaCheckBoxs = null;
	private static JCheckBox[] quanZhangCheckBoxs = null;
	private static JCheckBox[] zhiFaCheckBoxs = null;
	private static JCheckBox[] tuiFaCheckBoxs = null;
	private static JCheckBox[] duanBingCheckBoxs = null;
	private static JCheckBox[] gunFaCheckBoxs = null;
	private static JCheckBox[] qinGongCheckBoxs = null;
	private static JCheckBox[] anQiCheckBoxs = null;

	public static JCheckBox[] getJianFaCheckBoxs() {
		if (null == jianFaCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_JIANFA);
			jianFaCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				jianFaCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return jianFaCheckBoxs;
	}

	public static JCheckBox[] getDaoFaCheckBoxs() {
		if (null == daoFaCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_DAOFA);
			daoFaCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				daoFaCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return daoFaCheckBoxs;
	}

	public static JCheckBox[] getXinFaCheckBoxs() {
		if (null == xinFaCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_XINFA);
			xinFaCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				xinFaCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return xinFaCheckBoxs;
	}

	public static JCheckBox[] getQuanZhangCheckBoxs() {
		if (null == quanZhangCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_QUANZHANG);
			quanZhangCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				quanZhangCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return quanZhangCheckBoxs;
	}

	public static JCheckBox[] getZhiFaCheckBoxs() {
		if (null == zhiFaCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_ZHIFA);
			zhiFaCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				zhiFaCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return zhiFaCheckBoxs;
	}

	public static JCheckBox[] getTuiFaCheckBoxs() {
		if (null == tuiFaCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_TUIFA);
			tuiFaCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				tuiFaCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return tuiFaCheckBoxs;	
	}
	
	public static JCheckBox[] getDuanBingCheckBoxs() {
		if (null == duanBingCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_DUANBING);
			duanBingCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				duanBingCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return duanBingCheckBoxs;
	}
	
	public static JCheckBox[] getGunFaCheckBoxs() {
		if (null == gunFaCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_GUNFA);
			gunFaCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				gunFaCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return gunFaCheckBoxs;
	}
	
	public static JCheckBox[] getQinGongCheckBoxs() {
		if (null == qinGongCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_QINGONG);
			qinGongCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				qinGongCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return qinGongCheckBoxs;
	}
	
	public static JCheckBox[] getAnQiCheckBoxs() {
		if (null == anQiCheckBoxs) {
			Map<String, SkillDetail> skillMap = SkillManager.getGongFaMap(Constant.SKILL_TYPE_ANQI);
			anQiCheckBoxs = new JCheckBox[skillMap.size()];
			Set<String> keySet = skillMap.keySet();
			List<String> nameList = new ArrayList<String>(keySet);
			for (int i = 0; i < nameList.size(); i++) {
				anQiCheckBoxs[i] = new JCheckBox(nameList.get(i));
			}
		}
		return anQiCheckBoxs;
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
		for (JCheckBox one : duanBingCheckBoxs) {
			one.setVisible(false);
		}
		for (JCheckBox one : gunFaCheckBoxs) {
			one.setVisible(false);
		}
		for (JCheckBox one : qinGongCheckBoxs) {
			one.setVisible(false);
		}
		for (JCheckBox one : anQiCheckBoxs) {
			one.setVisible(false);
		}
	}
	
	/**
	 * @param type
	 */
	public static void setOneVisible(int type) {
		switch (type) {
		case Constant.SKILL_TYPE_JIANFA:
			for (JCheckBox one : jianFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_DAOFA:
			for (JCheckBox one : daoFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_QUANZHANG:
			for (JCheckBox one : quanZhangCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_TUIFA:
			for (JCheckBox one : tuiFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_XINFA:
			for (JCheckBox one : xinFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_ZHIFA:
			for (JCheckBox one : zhiFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_GUNFA:
			for (JCheckBox one : gunFaCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_DUANBING:
			for (JCheckBox one : duanBingCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_QINGONG:
			for (JCheckBox one : qinGongCheckBoxs) {
				one.setVisible(true);
			}
			break;
		case Constant.SKILL_TYPE_ANQI:
			for (JCheckBox one : anQiCheckBoxs) {
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
	
	public static Map<Integer, JCheckBox> getBookNodeIdCheckBox() {
		if (bookNodeIdCheckBoxMap == null) {
			bookNodeIdCheckBoxMap = new HashMap<Integer, JCheckBox>();
			initAllCheckBoxMap();
		}
		return bookNodeIdCheckBoxMap;
	}
	
	private static void initAllCheckBoxMap() {
		addAllCheckBoxMap(getJianFaCheckBoxs(), Constant.SKILL_TYPE_JIANFA);
		addAllCheckBoxMap(getDaoFaCheckBoxs(), Constant.SKILL_TYPE_DAOFA);
		addAllCheckBoxMap(getXinFaCheckBoxs(), Constant.SKILL_TYPE_XINFA);
		addAllCheckBoxMap(getQuanZhangCheckBoxs(), Constant.SKILL_TYPE_QUANZHANG);
		addAllCheckBoxMap(getZhiFaCheckBoxs(), Constant.SKILL_TYPE_ZHIFA);
		addAllCheckBoxMap(getTuiFaCheckBoxs(), Constant.SKILL_TYPE_TUIFA);
		addAllCheckBoxMap(getDuanBingCheckBoxs(), Constant.SKILL_TYPE_DUANBING);
		addAllCheckBoxMap(getGunFaCheckBoxs(), Constant.SKILL_TYPE_GUNFA);
		addAllCheckBoxMap(getQinGongCheckBoxs(), Constant.SKILL_TYPE_QINGONG);
		addAllCheckBoxMap(getAnQiCheckBoxs(), Constant.SKILL_TYPE_ANQI);
	}
	
	private static void addAllCheckBoxMap(JCheckBox[] boxs, int type) {
		Map<String, SkillDetail> gongFaMap = SkillManager.getGongFaMap(type);
		for (JCheckBox box : boxs) {
			String name = box.getText();
			SkillDetail skillDetail = gongFaMap.get(name);
			bookNodeIdCheckBoxMap.put(skillDetail.getM_iID(), box);
		}
	}
	
}