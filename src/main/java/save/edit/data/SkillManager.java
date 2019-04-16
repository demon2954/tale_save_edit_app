package save.edit.data;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import save.edit.constant.Constant;

/**
 * @auth zone
 * @date 2017-09-29
 */
public class SkillManager {
	
	private static Properties namePro = null;
	private static Properties detailPro = null;
	private static Properties bookPro = null;
	
	private static Map<Integer, Map<String, SkillDetail>> skillMap = new HashMap<Integer, Map<String,SkillDetail>>();
	
	static {
		loadProperty();
		init();
	}
	
	private static void loadProperty() {
		try {
			namePro = new Properties();
			InputStream in = ClassLoader.class.getResourceAsStream("/properties/skill_name.properties");
			namePro.load(new InputStreamReader(in, "utf-8"));
			in.close();

			detailPro = new Properties();
			in = ClassLoader.class.getResourceAsStream("/properties/skill_detail.properties");
			detailPro.load(new InputStreamReader(in, "utf-8"));
			in.close();

			bookPro = new Properties();
			in = ClassLoader.class.getResourceAsStream("/properties/skill_book.properties");
			bookPro.load(new InputStreamReader(in, "utf-8"));
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private static void init() {
		String xinfaNames = namePro.getProperty("xinfa");
		Map<String, SkillDetail> xinfaMap = makeSkill(xinfaNames, true);
		skillMap.put(Constant.SKILL_TYPE_XINFA, xinfaMap);

		String quanzhangNames = namePro.getProperty("quanzhang");
		Map<String, SkillDetail> quanzhangMap = makeSkill(quanzhangNames, false);
		skillMap.put(Constant.SKILL_TYPE_QUANZHANG, quanzhangMap);

		String zhifaNames = namePro.getProperty("zhifa");
		Map<String, SkillDetail> zhifaMap = makeSkill(zhifaNames, false);
		skillMap.put(Constant.SKILL_TYPE_ZHIFA, zhifaMap);

		String jianfaNames = namePro.getProperty("jianfa");
		Map<String, SkillDetail> jianfaMap = makeSkill(jianfaNames, false);
		skillMap.put(Constant.SKILL_TYPE_JIANFA, jianfaMap);

		String daofaNames = namePro.getProperty("daofa");
		Map<String, SkillDetail> daofaMap = makeSkill(daofaNames, false);
		skillMap.put(Constant.SKILL_TYPE_DAOFA, daofaMap);

		String tuifaNames = namePro.getProperty("tuifa");
		Map<String, SkillDetail> tuifaMap = makeSkill(tuifaNames, false);
		skillMap.put(Constant.SKILL_TYPE_TUIFA, tuifaMap);

		String duanbingNames = namePro.getProperty("duanbing");
		Map<String, SkillDetail> duanbingMap = makeSkill(duanbingNames, false);
		skillMap.put(Constant.SKILL_TYPE_DUANBING, duanbingMap);

		String gunfaNames = namePro.getProperty("gunfa");
		Map<String, SkillDetail> gunfaMap = makeSkill(gunfaNames, false);
		skillMap.put(Constant.SKILL_TYPE_GUNFA, gunfaMap);

		String qingongNames = namePro.getProperty("qingong");
		Map<String, SkillDetail> qingongMap = makeSkill(qingongNames, false);
		skillMap.put(Constant.SKILL_TYPE_QINGONG, qingongMap);

		String anqiNames = namePro.getProperty("anqi");
		Map<String, SkillDetail> anqiMap = makeSkill(anqiNames, false);
		skillMap.put(Constant.SKILL_TYPE_ANQI, anqiMap);
	}
	
	private static Map<String, SkillDetail> makeSkill(String skillName, boolean isXinfa) {
		Map<String, SkillDetail> xinfaMap = new HashMap<String, SkillDetail>();

		String[] skillNames = skillName.split(",");
		for (String sill : skillNames) {
			SkillDetail skillDetail = new SkillDetail();
			String detail = detailPro.getProperty(sill);
			String[] details = detail.split(",");
			if (isXinfa) {
				skillDetail.setM_iNeigongID(Integer.parseInt(details[0]));
				skillDetail.setM_strNeigongName(details[1]);
				skillDetail.setM_strStatusImage(details[2]);
				skillDetail.setM_strSelectImage(details[3]);
			} else {
				skillDetail.setM_iRoutineID(Integer.parseInt(details[0]));
				skillDetail.setM_strRoutineName(details[1]);
				skillDetail.setM_iWearAmsType(Integer.parseInt(details[2]));
			}

			String book = bookPro.getProperty(sill);
			String[] books = book.split(",");
			skillDetail.setM_iType(Integer.parseInt(books[0]));
			skillDetail.setM_iID(Integer.parseInt(books[1]));
			skillDetail.setM_iAbilityType(Integer.parseInt(books[2]));
			skillDetail.setM_strAbilityID(books[3]);
			skillDetail.setM_strBookMsg(books[4]);
			skillDetail.setM_strBookImage(books[5]);
			skillDetail.setM_sValueLink(books[6]);
			xinfaMap.put(sill, skillDetail);
		}

		return xinfaMap;
	}

	public static Map<String, SkillDetail> getGongFaMap(int skillType) {
		return skillMap.get(skillType);
	}
}
