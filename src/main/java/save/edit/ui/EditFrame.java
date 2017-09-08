package save.edit.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import save.edit.LocationConstant;

public class EditFrame extends JFrame {
	public EditFrame() {
		super("侠客风云传存档修改器");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double height = screenSize.getHeight();
		double width = screenSize.getWidth();
		int x = ((int) width - LocationConstant.FRAME_SIZE_HEIGHT) / 2;
		int y = ((int) height - LocationConstant.FRAME_SIZE_WIDTH) / 2;
		this.setBounds(x, y, LocationConstant.FRAME_SIZE_WIDTH, LocationConstant.FRAME_SIZE_HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);

		JTextField fileChooserBar = new JTextField();
		fileChooserBar.setBounds(LocationConstant.FILE_CHOOSER_BAR_SIZE_X, LocationConstant.FILE_CHOOSER_BAR_SIZE_Y,
				LocationConstant.FILE_CHOOSER_BAR_SIZE_WIDTH, LocationConstant.FILE_CHOOSER_BAR_SIZE_HEIGHT);
		this.add(fileChooserBar);
		
		JFileChooser fileChoose = new JFileChooser();
		fileChoose.setBounds(LocationConstant.FILE_CHOOSER_SIZE_X, LocationConstant.FILE_CHOOSER_SIZE_Y,
				LocationConstant.FILE_CHOOSER_SIZE_WIDTH, LocationConstant.FILE_CHOOSER_SIZE_HEIGHT);
		fileChoose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fileChoose.showDialog(new JLabel(), "选择存档文件");
		File file = fileChoose.getSelectedFile();
		if (file.isDirectory()) {
			System.out.println("文件夹:" + file.getAbsolutePath());
		} else if (file.isFile()) {
			System.out.println("文件:" + file.getAbsolutePath());
		}
		fileChooserBar.setText(file.getAbsolutePath());
		
		
//		this.add(fileChoose);
		this.setResizable(false);

	}

	public static void main(String[] args) {
		new EditFrame();
	}
}
