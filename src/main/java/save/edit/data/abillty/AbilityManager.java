package save.edit.data.abillty;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import save.edit.model.M_BookNodeList;

public class AbilityManager {
	private static Properties abilityPro = null;
	private static List<M_BookNodeList> m_BookNodeList = new ArrayList<M_BookNodeList>();

	static {
		loadProperty();
		init();
	}

	private static void loadProperty() {
		try {
			abilityPro = new Properties();
			InputStream in = ClassLoader.class.getResourceAsStream("/properties/ability.properties");
			abilityPro.load(new InputStreamReader(in, "utf-8"));
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void init() {
		Enumeration<Object> keys = abilityPro.keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			if (key != null) {
				String abilityId = (String) key;
				String talentStr = abilityPro.get(abilityId).toString();
				String[] split = talentStr.split("\t");

				int idx = 0;
				String m_iID = split[idx++];
				String m_strAbilityID = split[idx++];
				String m_strBookMsg = split[idx++];
				String m_strBookImage = split[idx++];
				String m_sValueLink = split[idx++];

				M_BookNodeList one = new M_BookNodeList();
				one.setM_iID(Integer.parseInt(abilityId));
				one.setM_iAbilityType(Integer.parseInt(m_iID));
				one.setM_strAbilityID(m_strAbilityID);
				one.setM_strBookImage(m_strBookImage);
				one.setM_strBookMsg(m_strBookMsg);
				one.setM_sValueLink(m_sValueLink);
				one.setM_iSkillful(0);

				m_BookNodeList.add(one);
			}
		}
	}

	public static List<M_BookNodeList> getAbilityList() {
		return m_BookNodeList;
	}
}
