package save.edit.model.property;

import java.util.List;

public class PropertyGroupsNode {
	private int m_iType;
	private List<GroupsNode> m_GroupsNodwList;
	
	public int getM_iType() {
		return m_iType;
	}
	public void setM_iType(int m_iType) {
		this.m_iType = m_iType;
	}
	public List<GroupsNode> getM_GroupsNodwList() {
		return m_GroupsNodwList;
	}
	public void setM_GroupsNodwList(List<GroupsNode> m_GroupsNodwList) {
		this.m_GroupsNodwList = m_GroupsNodwList;
	}
}
