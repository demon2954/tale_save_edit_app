package save.edit.util;

public class UnicodeUtils {
	public static String toUnicode(String resources) {
		StringBuffer str = new StringBuffer();
		char[] chars = resources.toCharArray();
		for (char one : chars) {
			if (0 < one && one < 127) {
				str.append(one);
			} else {
				str.append("\\u").append(("" + Integer.toHexString(one)).toUpperCase());
			}
		}
		return str.toString();
	}

	public static String unicode2String(String dataStr) {
		int start = 0;
		int end = 0;
		final StringBuffer buffer = new StringBuffer();
		while (start > -1) {
			end = dataStr.indexOf("\\u", start + 2);
			String charStr = "";
			if (end == -1) {
				charStr = dataStr.substring(start + 2, dataStr.length());
			} else {
				charStr = dataStr.substring(start + 2, end);
			}
			char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
			buffer.append(new Character(letter).toString());
			start = end;
		}
		return buffer.toString();
	}
}
