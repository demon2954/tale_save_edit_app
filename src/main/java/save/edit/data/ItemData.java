package save.edit.data;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import save.edit.model.backpack.Backpack;
import save.edit.model.backpack.ItemDataNode;
import save.edit.model.backpack.ItmeEffectNode;
import save.edit.model.backpack.StrNpcLike;
import save.edit.model.backpack.UseLimitNode;

public class ItemData {
	private static Properties itemPro = null;
	private static List<Backpack> newBackpackList = new ArrayList<Backpack>();

	static {
		try {
			loadProperty();
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Backpack> getAllItem() {
		return newBackpackList;
	}

	private static void loadProperty() {
		try {
			itemPro = new Properties();
			InputStream in = ClassLoader.class.getResourceAsStream("/properties/item_list.properties");
			itemPro.load(new InputStreamReader(in, "utf-8"));
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void init() {
		Enumeration<Object> keys = itemPro.keys();
		while (keys.hasMoreElements()) {
			Object iItemID = (Object) keys.nextElement();
			String detail = (String) itemPro.get(iItemID);
			String[] split = detail.split("--");

			int i = 0;
			String sItemName = split[i++];// 1
			String iItemKint = split[i++];// 2
			String iTtemType = split[i++];// 3
			String sIcon = split[i++];// 4
			String sTip = split[i++];// 5
			String iItemBuy = split[i++];// 6
			String iItemSell = split[i++];// 7
			String iItemStack = split[i++];// 8
			String iMixStack = split[i++];// 9
			String iItemUse = split[i++];// 10
			String iUseTime = split[i++];// 11
			String iAddType = split[i++];// 12
			String iRecover1 = split[i++];// 13
			String iArg1 = split[i++];// 14
			String iValue1 = split[i++];// 15
			String iString = split[i++];// 16
			String iRecover2 = split[i++];// 17
			String iArg2 = split[i++];// 18
			String iValue2 = split[i++];// 19
			String iString1 = split[i++];// 20
			String iRecover3 = split[i++];// 21
			String iArg3 = split[i++];// 22
			String iValue3 = split[i++];// 23
			String iString2 = split[i++];// 24
			String iString3 = split[i++];// 25
			String iLocking = split[i++];// 26
			String iAmsType = split[i++];// 27
			String sNpcLike = split[i++];// 28
			String sUseLimit = split[i++];// 29
			String tip = split[i++];// 30
			String sell = split[i++];// 31

			Backpack onePack = new Backpack();

			if (Integer.parseInt(iMixStack) > 0) {
				onePack.setM_iAmount(999);
			}
			if (Integer.parseInt(iMixStack) == 0) {
				onePack.setM_iAmount(1);
			}
			if (iAmsType.equals("4") || iAmsType.equals("5") || iAmsType.equals("6") || iAmsType.equals("7") || iAmsType.equals("8") || iAmsType.equals("9")) {
				onePack.setM_iAmount(1);
			}
			if (Integer.parseInt(iItemKint) == 2) {
				onePack.setM_iAmount(999);
			}

			List<ItmeEffectNode> m_ItmeEffectNodeList = new ArrayList<ItmeEffectNode>();
			ItmeEffectNode effectNode = new ItmeEffectNode();
			effectNode.setM_iRecoverType(Integer.parseInt(iArg1));
			effectNode.setM_iItemType(Integer.parseInt(iRecover1));
			effectNode.setM_iMsgID(Integer.parseInt(iString));
			effectNode.setM_iValue(Integer.parseInt(iValue1));
			m_ItmeEffectNodeList.add(effectNode);

			List<StrNpcLike> m_strNpcLikeList = new ArrayList<StrNpcLike>();
			if (sNpcLike.equals("")) {
				String[] split2 = sNpcLike.split("[*]");
				for (String one : split2) {
					String[] split3 = one.replaceAll("[(]", "").replaceAll("[)]", "").split(",");
					StrNpcLike npcLike = new StrNpcLike();
					npcLike.setM_iNpcID(Integer.parseInt(split3[0]));
					npcLike.setM_iValue(Integer.parseInt(split3[1]));
					m_strNpcLikeList.add(npcLike);
				}
			}

			List<UseLimitNode> m_UseLimitNodeList = new ArrayList<UseLimitNode>();

			String strStatusTip = "";
			if (sTip.contains("\n")) {
				int indexOf = sTip.indexOf("\n");
				int indexOf2 = sTip.lastIndexOf("\n");
				strStatusTip = sTip.substring(indexOf, indexOf2);
			}

			ItemDataNode itemDataNode = new ItemDataNode();
			itemDataNode.setM_iAddType(Integer.parseInt(iAddType));
			itemDataNode.setM_iAmsType(Integer.parseInt(iAmsType));
			itemDataNode.setM_iArtistryID(0);
			itemDataNode.setM_iItemBuy(Integer.parseInt(iItemBuy.trim()));
			itemDataNode.setM_iItemID(Integer.parseInt(iItemID.toString()));
			itemDataNode.setM_iItemKind(Integer.parseInt(iItemKint));
			itemDataNode.setM_iItemSell(Integer.parseInt(iItemSell));
			itemDataNode.setM_iItemStack(Integer.parseInt(iItemStack));
			itemDataNode.setM_iItemType(Integer.parseInt(iTtemType));
			itemDataNode.setM_iItemUse(Integer.parseInt(iItemUse));
			itemDataNode.setM_iLock(0);
			itemDataNode.setM_iMixStack(Integer.parseInt(iMixStack));
//			itemDataNode.setM_iQuality(iQuality);
			itemDataNode.setM_ItmeEffectNodeList(m_ItmeEffectNodeList);
			itemDataNode.setM_iUseMsgID(Integer.parseInt(iString3));
			itemDataNode.setM_iUseTime(Integer.parseInt(iUseTime));
			itemDataNode.setM_strIcon(sIcon);
			itemDataNode.setM_strItemName(sItemName);
//			itemDataNode.setM_strModelName(strModelName);
			itemDataNode.setM_strNpcLikeList(m_strNpcLikeList);
			itemDataNode.setM_strStatusTip(strStatusTip);
			itemDataNode.setM_strTip(sTip);
			itemDataNode.setM_UseLimitNodeList(m_UseLimitNodeList);

			onePack.set_ItemDataNode(itemDataNode);
			newBackpackList.add(onePack);

		}
	}
}
