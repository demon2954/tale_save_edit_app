package save.edit;

import save.edit.ui.EditFrame;

public class Main {

	public static void main(String[] args) {
		try {
			new EditFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
