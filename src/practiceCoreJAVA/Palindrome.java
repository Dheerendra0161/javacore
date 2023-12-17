package practiceCoreJAVA;

public class Palindrome {

	public static void main(String[] args) {
		// To find whether a string or number is Palindrome or not.[123:321 or
		// PAPAP:PAPAP}
		String str = "PaPaP", reverse = ""; //reverse is blank now
		System.out.println(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse is:" + "\n" + reverse);

		if (str.equals(reverse))
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not a palindrome");
	}
}


