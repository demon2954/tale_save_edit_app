package save.edit.read;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import save.edit.model.SaveModel;

public class LoadSaveData {
	public SaveModel loadDate(String fileName) throws IOException {
		String jsonData = FileUtils.readFileToString(new File(fileName), "UTF-8");
		Gson gson = new Gson();
		SaveModel save = gson.fromJson(jsonData, SaveModel.class);
		return save;
	}
}
