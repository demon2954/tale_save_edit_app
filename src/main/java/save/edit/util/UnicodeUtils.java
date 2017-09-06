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
}
