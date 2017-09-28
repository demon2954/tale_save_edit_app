package save.edit.write;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import save.edit.model.SaveModel;
import save.edit.util.UnicodeUtils;

public class WriteSaveData {
	public void write(SaveModel save, String sourceFilePath) throws IOException {
		Gson gson = new Gson();
		String newSaveData = gson.toJson(save);
		newSaveData = UnicodeUtils.toUnicode(newSaveData);
		FileUtils.write(new File(sourceFilePath), newSaveData, "UTF-8");
	}
}
