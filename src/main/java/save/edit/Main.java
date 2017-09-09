package save.edit;

import java.io.IOException;

import save.edit.model.SaveModel;
import save.edit.read.LoadSaveData;
import save.edit.ui.EditFrame;
import save.edit.write.WriteSaveData;

public class Main {
	
	public static void main(String[] args) {
		try {
			EditFrame frame = new EditFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void load() throws IOException {
		LoadSaveData load = new LoadSaveData();
		SaveModel save = load.loadDate("d:/Save2.Save");
	}

	private static void loadWirte() throws IOException {
		LoadSaveData load = new LoadSaveData();
		SaveModel save = load.loadDate("d:/Save2.Save");
		WriteSaveData write = new WriteSaveData();
		write.write(save);
	}

}
