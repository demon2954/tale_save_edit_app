package save.edit.data.xinfa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import save.edit.model.M_PlayerNeigongNodeList;
import save.edit.model.ext.NeiGongNodeExt;

public class OtherXinFaManager {
	private static Properties otherXinFaPro = null;
	private static List<NeiGongNodeExt> otherXinFaExtList = new ArrayList<NeiGongNodeExt>();
	private static List<M_PlayerNeigongNodeList> otherXinFaList = null;
	private static Map<Integer, NeiGongNodeExt> otherXinFaIdMap = null;
	private static Map<String, M_PlayerNeigongNodeList> otherXinFaNameMap = null;
	static {
		loadProperty();
		init();
	}

	private static void loadProperty() {
		try {
			otherXinFaPro = new Properties();
			InputStream in = ClassLoader.class.getResourceAsStream("/properties/other_xinfa.properties");
			otherXinFaPro.load(new InputStreamReader(in, "utf-8"));
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void init() {
		Enumeration<Object> keys = otherXinFaPro.keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			if (key != null) {
				String m_iNeigongID = (String) key;
				String data = otherXinFaPro.getProperty(m_iNeigongID);
				String[] split = data.split(",");

				int idx = 0;
				String m_strNeigongName = split[idx++];
				String tips = split[idx++];
				String m_strStatusImage = "NeigongImage26";
				String m_strSelectImage = "NeigongImage06";

				NeiGongNodeExt one = new NeiGongNodeExt();
				one.setM_iAccumulationExp(100000);
				one.setM_iExp(1);
				one.setM_iLV(10);
				one.setM_iNeigongID(Integer.parseInt(m_iNeigongID));
				one.setM_strNeigongName(m_strNeigongName);
				one.setM_strSelectImage(m_strSelectImage);
				one.setM_strStatusImage(m_strStatusImage);
				one.setTips(tips);
				otherXinFaExtList.add(one);
			}
		}
	}

	public static List<M_PlayerNeigongNodeList> getOtherXinFaList() {
		if (otherXinFaList == null) {
			otherXinFaList = new ArrayList<M_PlayerNeigongNodeList>();
			for (NeiGongNodeExt one : otherXinFaExtList) {
				M_PlayerNeigongNodeList node = new M_PlayerNeigongNodeList();
				node.setM_iAccumulationExp(one.getM_iAccumulationExp());
				node.setM_iExp(one.getM_iExp());
				node.setM_iLV(one.getM_iLV());
				node.setM_iNeigongID(one.getM_iNeigongID());
				node.setM_strNeigongName(one.getM_strNeigongName());
				node.setM_strSelectImage(one.getM_strSelectImage());
				node.setM_strStatusImage(one.getM_strStatusImage());
				otherXinFaList.add(node);
			}
		}
		return otherXinFaList;
	}

	public static Map<Integer, NeiGongNodeExt> getOtherXinFaIdMap() {
		if (otherXinFaIdMap == null) {
			otherXinFaIdMap = otherXinFaExtList.stream().collect(Collectors.toMap(NeiGongNodeExt::getM_iNeigongID, otherXinFaList -> otherXinFaList));
		}
		return otherXinFaIdMap;
	}

	public static Map<String, M_PlayerNeigongNodeList> getOtherXinFaNameMap() {
		if (otherXinFaNameMap == null) {
			otherXinFaNameMap = otherXinFaExtList.stream().collect(Collectors.toMap(M_PlayerNeigongNodeList::getM_strNeigongName, otherXinFaList -> otherXinFaList));
		}
		return otherXinFaNameMap;
	}
}
