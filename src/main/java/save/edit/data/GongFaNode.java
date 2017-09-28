package save.edit.data;

/**
 * 功法节点
 * @author zone
 *
 */
public enum GongFaNode {
	逍遥拳法(70001, "逍遥拳法", 1), //
	野球拳(70002, "野球拳", 1), //
	天山六阳掌(70003, "天山六阳掌", 1), //
	醉拳(70004, "醉拳", 1), //
	摧魂腐心掌(70005, "摧魂腐心掌", 1), //
	拜月七诀(70006, "拜月七诀", 1), //
	降龙十八掌(70007, "降龙十八掌", 1), //
	如来九印(70008, "如来九印", 1), //
	一阳指(70009, "一阳指", 2), //
	九阴龙爪功(70010, "九阴龙爪功", 2), //
	飞瀑连环指(70011, "飞瀑连环指", 2), //
	六脉神剑(70012, "六脉神剑", 2), //
	逍遥剑法(70014, "逍遥剑法", 4), //
	诸子剑法(70015, "诸子剑法", 4), //
	独孤九剑(70016, "独孤九剑", 4), //
	太王四神剑(70017, "太王四神剑", 4), //
	逍遥刀法(70019, "逍遥刀法", 5), //
	无极刀法(70020, "无极刀法", 5), //
	佛山无影脚(70032, "佛山无影脚", 3), //
	逍遥迷踪腿(70038, "逍遥迷踪腿", 3), //
	逍遥指(70039, "逍遥指", 2), //
	十二路镇魂腿(70043, "十二路镇魂腿", 3), //
	胡家刀法(70046, "胡家刀法", 5),//

	;
	private int m_iRoutineID;
	private String m_strRoutineName;
	private int m_iWearAmsType;

	private GongFaNode(int m_iRoutineID, String m_strRoutineName, int m_iWearAmsType) {
		this.m_iRoutineID = m_iRoutineID;
		this.m_strRoutineName = m_strRoutineName;
		this.m_iWearAmsType = m_iWearAmsType;
	}

	public int getM_iRoutineID() {
		return m_iRoutineID;
	}

	public String getM_strRoutineName() {
		return m_strRoutineName;
	}

	public int getM_iWearAmsType() {
		return m_iWearAmsType;
	}
}
