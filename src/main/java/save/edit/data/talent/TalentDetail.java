package save.edit.data.talent;

public class TalentDetail {
	private int talenID;
	private int talenType;
	private String talenName;
	private String talenTip;

	public int getTalenID() {
		return talenID;
	}

	public void setTalenID(int talenID) {
		this.talenID = talenID;
	}

	public int getTalenType() {
		return talenType;
	}

	public void setTalenType(int talenType) {
		this.talenType = talenType;
	}

	public String getTalenName() {
		return talenName;
	}

	public void setTalenName(String talenName) {
		this.talenName = talenName;
	}

	public String getTalenTip() {
		return talenTip;
	}

	public void setTalenTip(String talenTip) {
		this.talenTip = talenTip;
	}
	
	@Override
	public String toString() {
		return getTalenName();
	}
}
