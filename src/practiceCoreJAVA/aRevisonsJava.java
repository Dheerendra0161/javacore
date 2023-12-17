package practiceCoreJAVA;

public class aRevisonsJava {

	public static void main(String[] args) {
		// fibonacci();
		// Palindrome1();
		// ReverseTheStrings();
		// OddNumber();
		PrimeInteger();

	}

	public static void fibonacci() {
		// Fibonacci series:0-1-1-2-3-5-8-13..

		int a = 0, b = 0, c = 1;

		for (int i = 0; i <= 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
	}

	public static void Palindrome1() {

		// To check racecar is palindrome or not
		String word = "";
		String p = "eye";

		for (int i = p.length() - 1; i >= 0; i--) {
			word = word + p.charAt(i);
		}
		System.out.println(word);

		if (word.equals(p)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	// Reversing the string
	public static void ReverseTheStrings() {
		String name = "Dheerendra is working";
		String newReverse = "";

		String[] name1 = name.split(" ");

		for (String s : name1) {
			String reverse = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}
			newReverse = newReverse.concat(reverse).concat(" ");

		}
		System.out.println(newReverse);
	}

	// Print first 10 odd number
	public static void OddNumber() {
		int n = 15;
		if (!((n % 2) == 0)) {
			System.out.println("Odd number");
		} else {
			System.out.println("Even number");
		}
	}

	public static void PrimeInteger() {
		int n = 23;
		if (n == 0 || n == 1) {
			System.out.println("Invalid Number");
		}

		for (int j = 2; j <= n; j++) {
			boolean prime = true;

			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				System.out.println(j + "No. is Prime ");
			}
		}
	}
}
