package save.edit.read;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import save.edit.model.SaveModel;
import save.edit.util.UnicodeUtils;

public class LoadSaveData {
	public SaveModel loadDate(String fileName) throws IOException {
		String speCode = "\\uFEFF";
		String jsonData = FileUtils.readFileToString(new File(fileName), "UTF-8");
//		System.out.println(jsonData);
		Gson gson = new Gson();
		SaveModel save = gson.fromJson(jsonData, SaveModel.class);
		String newSaveData = UnicodeUtils.toUnicode(jsonData);
		if (newSaveData.startsWith(speCode)) {
			newSaveData = newSaveData.substring(newSaveData.indexOf(speCode) + speCode.length());
		}
		FileUtils.write(new File(fileName+".bak"), newSaveData, "UTF-8");
		return save;
	}
}	
