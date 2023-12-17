package practiceCoreJAVA;

public class ReverseTheString {

	public static void main(String[] args) {

		// ReverseString1();
		// ReverseString2();
		// ReverseString3();
		//ReverseString4();
	
	}

	//*****************
	public static void ReverseString1() {
		String s = "My Name Is Dheerendra";
		String ConvertedStr = "";
		String[] Str = s.split(" ");
		for (String word : Str) {
			String words = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				words = words + word.charAt(j);
			}
			ConvertedStr = ConvertedStr.concat(words).concat(" ");
		}
		System.out.print(ConvertedStr);
		// OutPut:yM emaN sI ardnereehD
	}
	
	

	public static void ReverseString2() {
		String s = "My Name Is Dheerendra";
		String[] Str = s.split(" ");
		for (String word : Str) {
			String words = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				words = words + word.charAt(j);
			}
			System.out.print(words);
			System.out.print(" ");
			// OutPut:yM emaN sI ardnereehD
		}
	}

	public static void ReverseString3() {
		String s = "My Name Is Dheerendra";
		for (int k = s.length() - 1; k >= 0; k--) {
			System.out.print(s.charAt(k));
			// OutPut:ardnereehD sI emaN yM
		}
	}

	public static void ReverseString4() {
		String str = "My Name Is Dheerendra";
		char chars[] = str.toCharArray(); // converted to character array and printed in reverse order
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
			// OutPut:ardnereehD sI emaN yM
		}
	}
	
	

	}
	
	
	


