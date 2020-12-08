package save.edit.model.backpack;

import java.util.List;

import save.edit.util.UnicodeUtils;

public class ItemDataNode {
	private int m_iItemID;
	private String m_strItemName;
	private int m_iItemKind;
	private int m_iItemType;
	private String m_strIcon;
	private String m_strTip;
	private int m_iItemBuy;
	private int m_iItemSell;
	private int m_iItemStack;
	private int m_iMixStack;
	private int m_iItemUse;
	private int m_iUseTime;
	private int m_iAddType;
	private int m_iUseMsgID;
	private int m_iArtistryID;
	private int m_iAmsType;
	private List<StrNpcLike> m_strNpcLikeList;
	private List<UseLimitNode> m_UseLimitNodeList;
	private List<ItmeEffectNode> m_ItmeEffectNodeList;
	private String m_strStatusTip;
	private int m_iLock;
//	private int m_iQuality;
	private String m_strModelName;
	
	public int getM_iMixStack() {
		return m_iMixStack;
	}
	public void setM_iMixStack(int m_iMixStack) {
		this.m_iMixStack = m_iMixStack;
	}
	public int getM_iItemID() {
		return m_iItemID;
	}
	public void setM_iItemID(int m_iItemID) {
		this.m_iItemID = m_iItemID;
	}
	public String getM_strItemName() {
		return UnicodeUtils.toUnicode(m_strItemName);
	}
	public void setM_strItemName(String m_strItemName) {
		this.m_strItemName = m_strItemName;
	}
	public int getM_iItemKind() {
		return m_iItemKind;
	}
	public void setM_iItemKind(int m_iItemKind) {
		this.m_iItemKind = m_iItemKind;
	}
	public int getM_iItemType() {
		return m_iItemType;
	}
	public void setM_iItemType(int m_iItemType) {
		this.m_iItemType = m_iItemType;
	}
	public String getM_strIcon() {
		return m_strIcon;
	}
	public void setM_strIcon(String m_strIcon) {
		this.m_strIcon = m_strIcon;
	}
	public String getM_strTip() {
		return UnicodeUtils.toUnicode(m_strTip);
	}
	public void setM_strTip(String m_strTip) {
		this.m_strTip = m_strTip;
	}
	public int getM_iItemBuy() {
		return m_iItemBuy;
	}
	public void setM_iItemBuy(int m_iItemBuy) {
		this.m_iItemBuy = m_iItemBuy;
	}
	public int getM_iItemSell() {
		return m_iItemSell;
	}
	public void setM_iItemSell(int m_iItemSell) {
		this.m_iItemSell = m_iItemSell;
	}
	public int getM_iItemStack() {
		return m_iItemStack;
	}
	public void setM_iItemStack(int m_iItemStack) {
		this.m_iItemStack = m_iItemStack;
	}
	public int getM_iItemUse() {
		return m_iItemUse;
	}
	public void setM_iItemUse(int m_iItemUse) {
		this.m_iItemUse = m_iItemUse;
	}
	public int getM_iUseTime() {
		return m_iUseTime;
	}
	public void setM_iUseTime(int m_iUseTime) {
		this.m_iUseTime = m_iUseTime;
	}
	public int getM_iAddType() {
		return m_iAddType;
	}
	public void setM_iAddType(int m_iAddType) {
		this.m_iAddType = m_iAddType;
	}
	public int getM_iUseMsgID() {
		return m_iUseMsgID;
	}
	public void setM_iUseMsgID(int m_iUseMsgID) {
		this.m_iUseMsgID = m_iUseMsgID;
	}
	public int getM_iArtistryID() {
		return m_iArtistryID;
	}
	public void setM_iArtistryID(int m_iArtistryID) {
		this.m_iArtistryID = m_iArtistryID;
	}
	public int getM_iAmsType() {
		return m_iAmsType;
	}
	public void setM_iAmsType(int m_iAmsType) {
		this.m_iAmsType = m_iAmsType;
	}
	public List<StrNpcLike> getM_strNpcLikeList() {
		return m_strNpcLikeList;
	}
	public void setM_strNpcLikeList(List<StrNpcLike> m_strNpcLikeList) {
		this.m_strNpcLikeList = m_strNpcLikeList;
	}
	public List<UseLimitNode> getM_UseLimitNodeList() {
		return m_UseLimitNodeList;
	}
	public void setM_UseLimitNodeList(List<UseLimitNode> m_UseLimitNodeList) {
		this.m_UseLimitNodeList = m_UseLimitNodeList;
	}
	public List<ItmeEffectNode> getM_ItmeEffectNodeList() {
		return m_ItmeEffectNodeList;
	}
	public void setM_ItmeEffectNodeList(List<ItmeEffectNode> m_ItmeEffectNodeList) {
		this.m_ItmeEffectNodeList = m_ItmeEffectNodeList;
	}
	public String getM_strStatusTip() {
		return m_strStatusTip;
	}
	public void setM_strStatusTip(String m_strStatusTip) {
		this.m_strStatusTip = m_strStatusTip;
	}
	public int getM_iLock() {
		return m_iLock;
	}
	public void setM_iLock(int m_iLock) {
		this.m_iLock = m_iLock;
	}
//	public int getM_iQuality() {
//		return m_iQuality;
//	}
//	public void setM_iQuality(int m_iQuality) {
//		this.m_iQuality = m_iQuality;
//	}
	public String getM_strModelName() {
		return m_strModelName;
	}
	public void setM_strModelName(String m_strModelName) {
		this.m_strModelName = m_strModelName;
	}
}
