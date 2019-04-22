package save.edit.ui;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

import save.edit.constant.Constant;
import save.edit.constant.LocationConstant;

public class FileChooser extends JFileChooser {
	private static final long serialVersionUID = 1L;

	public FileChooser(JTextField fileChooserBar) {
		this.setBounds(LocationConstant.FILE_CHOOSER_X, LocationConstant.FILE_CHOOSER_Y,
				LocationConstant.FILE_CHOOSER_SIZE_WIDTH, LocationConstant.FILE_CHOOSER_SIZE_HEIGHT);
		this.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		this.setCurrentDirectory(new File("d:/"));
		this.showDialog(new JLabel(), "选择存档文件");
		this.setFont(Constant.GLOBAL_FONT);
		File file = this.getSelectedFile();
		if (file != null) {
			if (file.isFile()) {
				fileChooserBar.setText(file.getAbsolutePath());
			}
		}
	}

}
