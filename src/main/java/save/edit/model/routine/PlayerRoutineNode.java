package save.edit.model.routine;

/**
 * 功法
 * @author zone
 *
 */
public class PlayerRoutineNode {
	private int m_iRoutineID;//功法id
	private String m_strRoutineName;//功法名
	private int m_iWearAmsType;//功法类型
	private int m_iAccumulationExp;//功法经验
	private int m_iLV;//功法等级
	
	public int getM_iRoutineID() {
		return m_iRoutineID;
	}
	public void setM_iRoutineID(int m_iRoutineID) {
		this.m_iRoutineID = m_iRoutineID;
	}
	public String getM_strRoutineName() {
		return m_strRoutineName;
	}
	public void setM_strRoutineName(String m_strRoutineName) {
		this.m_strRoutineName = m_strRoutineName;
	}
	public int getM_iWearAmsType() {
		return m_iWearAmsType;
	}
	public void setM_iWearAmsType(int m_iWearAmsType) {
		this.m_iWearAmsType = m_iWearAmsType;
	}
	public int getM_iAccumulationExp() {
		return m_iAccumulationExp;
	}
	public void setM_iAccumulationExp(int m_iAccumulationExp) {
		this.m_iAccumulationExp = m_iAccumulationExp;
	}
	public int getM_iLV() {
		return m_iLV;
	}
	public void setM_iLV(int m_iLV) {
		this.m_iLV = m_iLV;
	}
}
