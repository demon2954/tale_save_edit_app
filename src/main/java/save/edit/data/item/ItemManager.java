package save.edit.data.item;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import save.edit.model.M_BackpackItem;
import save.edit.model.M_ItmeEffectNodeList;
import save.edit.model.M_UseLimitNode;
import save.edit.model.M_strNpcLike;
import save.edit.model._ItemDataNode;

public class ItemManager {
	private static Properties itemPro = null;
	private static List<M_BackpackItem> m_BackpackList = new ArrayList<M_BackpackItem>();

	static {
		loadProperty();
		init();
	}

	private static void loadProperty() {
		try {
			itemPro = new Properties();
			InputStream in = ClassLoader.class.getResourceAsStream("/properties/item.properties");
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
			Object key = keys.nextElement();
			if (key != null) {
				String talentName = (String) key;
				String talentStr = itemPro.get(talentName).toString();
				String[] split = talentStr.split("\t");

				int idx = 0;
				long iItemID = Long.parseLong(split[idx++].trim());
				String sItemName = split[idx++].trim();
				int iItemKind = Integer.parseInt(split[idx++].trim());
				int iTtemType = Integer.parseInt(split[idx++].trim());
				String sIcon = split[idx++].trim();
				String sTip = split[idx++].trim();
				int iItemBuy = Integer.parseInt(split[idx++].trim());
				int iItemSell = Integer.parseInt(split[idx++].trim());
				int iItemStack = Integer.parseInt(split[idx++].trim());
				int iMixStack = Integer.parseInt(split[idx++].trim());
				int iItemUse = Integer.parseInt(split[idx++].trim());
				int iUseTime = Integer.parseInt(split[idx++].trim());
				int iAddType = Integer.parseInt(split[idx++].trim());

				int m_iItemType1 = Integer.parseInt(split[idx++].trim());
				int m_iRecoverType1 = Integer.parseInt(split[idx++].trim());
				int m_iValue1 = Integer.parseInt(split[idx++].trim());
				int m_iMsgID1 = Integer.parseInt(split[idx++].trim());

				int m_iItemType2 = Integer.parseInt(split[idx++].trim());
				int m_iRecoverType2 = Integer.parseInt(split[idx++].trim());
				int m_iValue2 = Integer.parseInt(split[idx++].trim());
				int m_iMsgID2 = Integer.parseInt(split[idx++].trim());

				int m_iItemType3 = Integer.parseInt(split[idx++].trim());
				int m_iRecoverType3 = Integer.parseInt(split[idx++].trim());
				int m_iValue3 = Integer.parseInt(split[idx++].trim());
				int m_iMsgID3 = Integer.parseInt(split[idx++].trim());

				int iUseMsgID = Integer.parseInt(split[idx++].trim());
				int iArtistryID = Integer.parseInt(split[idx++].trim());
				int iAmsType = Integer.parseInt(split[idx++].trim());
				String sNpcLike = split[idx++].trim();
				String sUseLimit = split[idx++].trim();
				String strStatusTip = split[idx++].trim();
				int iLock = Integer.parseInt(split[idx++].trim());

				_ItemDataNode itemData = new _ItemDataNode();
				itemData.setM_iItemID(iItemID);
				itemData.setM_strItemName(sItemName);
				itemData.setM_iItemKind(iItemKind);
				itemData.setM_iItemType(iTtemType);
				itemData.setM_strIcon(sIcon);
				itemData.setM_strTip(sTip);
				itemData.setM_iItemBuy(iItemBuy);
				itemData.setM_iItemSell(iItemSell);
				itemData.setM_iItemStack(iItemStack);
				itemData.setM_iMixStack(iMixStack);
				itemData.setM_iItemUse(iItemUse);
				itemData.setM_iUseTime(iUseTime);
				itemData.setM_iAddType(iAddType);
				itemData.setM_iUseMsgID(iUseMsgID);
				itemData.setM_iArtistryID(iArtistryID);
				itemData.setM_iAmsType(iAmsType);
				itemData.setM_iLock(iLock);
				itemData.setM_strStatusTip(strStatusTip);

				List<M_strNpcLike> m_strNpcLikeList = new ArrayList<M_strNpcLike>();
				if (sNpcLike.length() > 2) {
					sNpcLike = sNpcLike.replaceAll("\\(", "");
					sNpcLike = sNpcLike.replaceAll("\\)", "");
					String[] split2 = sNpcLike.split("[*]");
					for (String oneNpcLike : split2) {
						String[] sNpcSplits = oneNpcLike.split(",");
						int m_iNpcID = Integer.parseInt(sNpcSplits[0].trim());
						int m_iValue = Integer.parseInt(sNpcSplits[1].trim());
						M_strNpcLike npc = new M_strNpcLike();
						npc.setM_iNpcID(m_iNpcID);
						npc.setM_iValue(m_iValue);
						m_strNpcLikeList.add(npc);
					}
				}
				itemData.setM_strNpcLikeList(m_strNpcLikeList);

				List<M_UseLimitNode> m_UseLimitNodeList = new ArrayList<M_UseLimitNode>();
				if (sUseLimit.length() > 2) {
					sUseLimit = sUseLimit.replaceAll("\\(", "");
					sUseLimit = sUseLimit.replaceAll("\\)", "");
					String[] split2 = sUseLimit.split("[*]");
					for (String oneUseLimit : split2) {
						String[] sUseLimitSplits = oneUseLimit.split(",");
						int m_iType = Integer.parseInt(sUseLimitSplits[0].trim());
						int m_iInde = Integer.parseInt(sUseLimitSplits[1].trim());
						int m_iValue = Integer.parseInt(sUseLimitSplits[2].trim());
						M_UseLimitNode node = new M_UseLimitNode();
						node.setM_iInde(m_iInde);
						node.setM_iType(m_iType);
						node.setM_iValue(m_iValue);
						m_UseLimitNodeList.add(node);
					}
				}
				itemData.setM_UseLimitNodeList(m_UseLimitNodeList);

				List<M_ItmeEffectNodeList> m_ItmeEffectNodeList = new ArrayList<M_ItmeEffectNodeList>();
				if (m_iItemType1 + m_iRecoverType1 + m_iValue1 + m_iMsgID1 > 0) {
					M_ItmeEffectNodeList node = new M_ItmeEffectNodeList();
					node.setM_iItemType(m_iItemType1);
					node.setM_iMsgID(m_iMsgID1);
					node.setM_iRecoverType(m_iRecoverType1);
					node.setM_iValue(m_iValue1);
					m_ItmeEffectNodeList.add(node);
				}
				if (m_iItemType2 + m_iRecoverType2 + m_iValue2 + m_iMsgID2 > 0) {
					M_ItmeEffectNodeList node = new M_ItmeEffectNodeList();
					node.setM_iItemType(m_iItemType2);
					node.setM_iMsgID(m_iMsgID2);
					node.setM_iRecoverType(m_iRecoverType2);
					node.setM_iValue(m_iValue2);
					m_ItmeEffectNodeList.add(node);
				}
				if (m_iItemType3 + m_iRecoverType3 + m_iValue3 + m_iMsgID3 > 0) {
					M_ItmeEffectNodeList node = new M_ItmeEffectNodeList();
					node.setM_iItemType(m_iItemType3);
					node.setM_iMsgID(m_iMsgID3);
					node.setM_iRecoverType(m_iRecoverType3);
					node.setM_iValue(m_iValue3);
					m_ItmeEffectNodeList.add(node);
				}
				itemData.setM_ItmeEffectNodeList(m_ItmeEffectNodeList);

				M_BackpackItem item = new M_BackpackItem();
				item.set_ItemDataNode(itemData);
				
				int m_iAmount = 1;
				if (iItemStack + iMixStack > 10) {
					m_iAmount = 999;
				}
				item.setM_iAmount(m_iAmount);
				
				m_BackpackList.add(item);
			}
		}
	}

	public static List<M_BackpackItem> getPackList() {
		return m_BackpackList;
	}
}
