package save.edit.model.store;

import java.util.List;

public class StoreDataNode {
	private int m_iStoreID;
	private int m_iStoreNamaID;
	private String m_strStroreIconID;
	private int m_iStoreType;
	private List<StoreItemNode> m_StoreItemNodeList;
	
	public int getM_iStoreID() {
		return m_iStoreID;
	}
	public void setM_iStoreID(int m_iStoreID) {
		this.m_iStoreID = m_iStoreID;
	}
	public int getM_iStoreNamaID() {
		return m_iStoreNamaID;
	}
	public void setM_iStoreNamaID(int m_iStoreNamaID) {
		this.m_iStoreNamaID = m_iStoreNamaID;
	}
	public String getM_strStroreIconID() {
		return m_strStroreIconID;
	}
	public void setM_strStroreIconID(String m_strStroreIconID) {
		this.m_strStroreIconID = m_strStroreIconID;
	}
	public int getM_iStoreType() {
		return m_iStoreType;
	}
	public void setM_iStoreType(int m_iStoreType) {
		this.m_iStoreType = m_iStoreType;
	}
	public List<StoreItemNode> getM_StoreItemNodeList() {
		return m_StoreItemNodeList;
	}
	public void setM_StoreItemNodeList(List<StoreItemNode> m_StoreItemNodeList) {
		this.m_StoreItemNodeList = m_StoreItemNodeList;
	}
}
