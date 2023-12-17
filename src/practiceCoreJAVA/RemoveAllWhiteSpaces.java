package practiceCoreJAVA;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		RemoveWhiteSpacesWithReplace();
		RemoveWhiteSpacesWithoutReplace();
	}

	
	
	public static void RemoveWhiteSpacesWithReplace() {
		String str1 = "Its Par    adigm to   Unders tand Value";
		String str2 = str1.replaceAll("\\s", "");   //     "\\s" will match any whitespace character
		System.out.println(str2);

	}

	
	public static void RemoveWhiteSpacesWithoutReplace() {

		String str1 = "Dheerendra Vishwa        Is An Autom ation Engi ne      er";
		char[] chars = str1.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < chars.length; i++) {
			if ((chars[i] != ' ') && (chars[i] != '\t')) {
				sb.append(chars[i]);
			}
		}
		System.out.println(sb);
	}
}
