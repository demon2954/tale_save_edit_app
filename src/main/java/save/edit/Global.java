package save.edit;

import save.edit.model.SaveModel;

public class Global {
	private static SaveModel save = null;

	public static SaveModel getSave() {
		return save;
	}

	public static void setSave(SaveModel save) {
		Global.save = save;
	}

}
