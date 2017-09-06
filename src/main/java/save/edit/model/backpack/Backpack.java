package save.edit.model.backpack;

public class Backpack {
	private int m_iAmount;// 物品数量
	private ItemDataNode _ItemDataNode;
	
	public int getM_iAmount() {
		return m_iAmount;
	}
	public void setM_iAmount(int m_iAmount) {
		this.m_iAmount = m_iAmount;
	}
	public ItemDataNode get_ItemDataNode() {
		return _ItemDataNode;
	}
	public void set_ItemDataNode(ItemDataNode _ItemDataNode) {
		this._ItemDataNode = _ItemDataNode;
	}
}
