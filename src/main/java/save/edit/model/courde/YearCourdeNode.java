package save.edit.model.courde;

import java.util.List;

public class YearCourdeNode {
	private int m_iYear;
	private List<CourdeNode> m_CourdeNodeList;
	
	public int getM_iYear() {
		return m_iYear;
	}
	public void setM_iYear(int m_iYear) {
		this.m_iYear = m_iYear;
	}
	public List<CourdeNode> getM_CourdeNodeList() {
		return m_CourdeNodeList;
	}
	public void setM_CourdeNodeList(List<CourdeNode> m_CourdeNodeList) {
		this.m_CourdeNodeList = m_CourdeNodeList;
	}
}
