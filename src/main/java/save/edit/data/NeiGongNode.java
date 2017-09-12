package save.edit.data;

/**
 * 内功节点
 * @author zone
 *
 */
public enum NeiGongNode {
	逍遥心法(60001, "逍遥心法", "NeigongImage22", "NeigongImage02"), //
	东方宝典(60003, "东方宝典", "NeigongImage24", "NeigongImage04"), //
	天龙八部功(60005, "天龙八部功", "NeigongImage26", "NeigongImage06"), //
	金雁功(60006, "金雁功", "NeigongImage27", "NeigongImage07"), //
	虎啸功(60007, "虎啸功", "NeigongImage28", "NeigongImage08"), //
	五毒赤焰功(60008, "五毒赤焰功", "NeigongImage29", "NeigongImage09"), //
	禅宗莲华功(60009, "禅宗莲华功", "NeigongImage30", "NeigongImage10"), //
	小无相功(60010, "小无相功", "NeigongImage31", "NeigongImage11"),//
	;

	private int m_iNeigongID;
	private String m_strNeigongName;
	private String m_strStatusImage;
	private String m_strSelectImage;

	private NeiGongNode(int m_iNeigongID, String m_strNeigongName, String m_strStatusImage, String m_strSelectImage) {
		this.m_iNeigongID = m_iNeigongID;
		this.m_strNeigongName = m_strNeigongName;
		this.m_strStatusImage = m_strStatusImage;
		this.m_strSelectImage = m_strSelectImage;
	}

	public int getM_iNeigongID() {
		return m_iNeigongID;
	}

	public String getM_strNeigongName() {
		return m_strNeigongName;
	}

	public String getM_strStatusImage() {
		return m_strStatusImage;
	}

	public String getM_strSelectImage() {
		return m_strSelectImage;
	}
}
