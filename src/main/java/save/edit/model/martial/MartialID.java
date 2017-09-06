package save.edit.model.martial;

import java.util.List;

public class MartialID {
	private int m_iType;
	private List<ID> m_IDList;
	private List<BookNode> m_BookNodeList;
	
	public int getM_iType() {
		return m_iType;
	}
	public void setM_iType(int m_iType) {
		this.m_iType = m_iType;
	}
	public List<ID> getM_IDList() {
		return m_IDList;
	}
	public void setM_IDList(List<ID> m_IDList) {
		this.m_IDList = m_IDList;
	}
	public List<BookNode> getM_BookNodeList() {
		return m_BookNodeList;
	}
	public void setM_BookNodeList(List<BookNode> m_BookNodeList) {
		this.m_BookNodeList = m_BookNodeList;
	}
}
