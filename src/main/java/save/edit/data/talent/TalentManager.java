package save.edit.data.talent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class TalentManager {
	private static Properties talent = null;

	private static Map<Integer, TalentDetail> talentMap = new HashMap<Integer, TalentDetail>();
	
	private static TalentDetail[] talents1 = null;
	private static TalentDetail[] talents2 = null;
	private static TalentDetail[] talents3 = null;

	static {
		loadProperty();
		init();
	}

	private static void loadProperty() {
		try {
			talent = new Properties();
			InputStream in = ClassLoader.class.getResourceAsStream("/properties/talnet.properties");
			talent.load(new InputStreamReader(in, "utf-8"));
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void init() {
		List<TalentDetail> talentList = new ArrayList<TalentDetail>();
		Enumeration<Object> keys = talent.keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			if (key != null) {
				String talentName = (String) key;
				String talentStr = talent.get(talentName).toString();
				String[] split = talentStr.split(",");

				TalentDetail detail = new TalentDetail();
				detail.setTalenID(Integer.parseInt(split[0]));
				detail.setTalenType(Integer.parseInt(split[1]));
				detail.setTalenTip(split[2]);
				detail.setTalenName(talentName);
				talentList.add(detail);
				talentMap.put(detail.getTalenID(), detail);
			}
		}

		List<TalentDetail> talent1List = talentList.stream().filter(one -> one.getTalenType() == 1).collect(Collectors.toList());
		List<TalentDetail> talent2List = talentList.stream().filter(one -> one.getTalenType() == 2).collect(Collectors.toList());
		List<TalentDetail> talent3List = talentList.stream().filter(one -> one.getTalenType() == 3).collect(Collectors.toList());

		talents1 = new TalentDetail[talent1List.size()];
		talents2 = new TalentDetail[talent2List.size()];
		talents3 = new TalentDetail[talent3List.size()];

		talent1List.toArray(talents1);
		talent2List.toArray(talents2);
		talent3List.toArray(talents3);
	}
	
	public static TalentDetail getTalent(int talentId) {
		return talentMap.get(talentId);
	}
	
	public static TalentDetail[] getTalentByType(int talentType) {
		if (talentType == 1) {
			return talents1;
		}
		if (talentType == 2) {
			return talents2;
		}
		if (talentType == 3) {
			return talents3;
		}
		return null;
	}

	public static int getTalentIdx(int talentType, int talentId) {
		int idx = 0;
		if (talentType == 1) {
			for (TalentDetail one : talents1) {
				if (one.getTalenID() == talentId) {
					return idx;
				}
				idx++;
			}
		}
		if (talentType == 2) {
			for (TalentDetail one : talents2) {
				if (one.getTalenID() == talentId) {
					return idx;
				}
				idx++;
			}
		}
		if (talentType == 3) {
			for (TalentDetail one : talents3) {
				if (one.getTalenID() == talentId) {
					return idx;
				}
				idx++;
			}
		}
		return 0;
	}
	
	public static TalentDetail getTalentByIdx(int talentType, int idx) {
		TalentDetail[] talents = null;

		if (talentType == 1) {
			talents = talents1;
		}
		if (talentType == 2) {
			talents = talents2;
		}
		if (talentType == 3) {
			talents = talents3;
		}

		return talents[idx];
	}
}
