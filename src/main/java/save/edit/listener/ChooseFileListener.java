package save.edit.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import save.edit.ui.FileChooser;

public class ChooseFileListener implements ActionListener {
	private JTextField fileChooserBar;

	public ChooseFileListener(JTextField fileChooserBar) {
		this.fileChooserBar = fileChooserBar;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		new FileChooser(fileChooserBar);
	}

}
