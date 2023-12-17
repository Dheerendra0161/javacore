package practiceCoreJAVA;

public class Vowel {
	private String name = "Dheerendra Ayansh My Name Is Ayansh";
	String l = name.toLowerCase();

	public static void main(String[] args) {
		Vowel v = new Vowel();
//		v.FindVowel();
		v.ReveseOrder();
//		v.ReverseString();
//		v.FindLargestWithoutIf();
//		v.CountUppercaseLowercase();
	}

	// Find out Vowel In given Sentence
	public void FindVowel() {
		int count = 0;

		String[] d = name.split(" ");

		// TO write Words in next line
		for (String h : d) {
			System.out.println(h.toString());
		}

		// write vowel and total vowel
		for (int k = 0; k < name.length(); k++) {

			char m = l.charAt(k);
			if (m == 'a' || m == 'i' || m == 'o' || m == 'u' || m == 'e') {

				System.out.println(name.charAt(k));
				count++;
			}
		}
		System.out.println("Count Vowel: " + count);
	}

	// print All Word in sentence in Reverse order
	public void ReveseOrder() {

		String[] d = name.split(" ");

		String w = d.toString();

		for (int j = w.length() + 6; j >= 0; j--) {

			System.out.print(name.charAt(j));
		}
	}

	// How to Reverse the String
	public void ReverseString() {
		String input = "Dheerendra, Ayansh My Name Is Ayansh";
		StringBuilder reversed = new StringBuilder(input).reverse();
		System.out.println(reversed.toString());
	}

	public void FindLargestWithoutIf() {
		int num1 = 10;
		int num2 = 25;
		int num3 = 15;

		int largest = Math.max(num1, Math.max(num2, num3));
		System.out.println("The largest number is: " + largest);
	}

	public void CountUppercaseLowercase() {

		String input = "My Name Is Khan";
		int uppercaseCount = 0;
		int lowercaseCount = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.print(c);
				uppercaseCount++;

			}

		}
		System.out.println("  Uppercase characters: " + uppercaseCount);

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLowerCase(c)) {
				System.out.print(c);
				lowercaseCount++;
			}
		}

		System.out.println("  Lowercase characters: " + lowercaseCount);
	}
}






