package practiceCoreJAVA;

public class PracticeJava {

	public static void main(String arg[]) {
		// oddNumber();
		// oddNumber1();
		// fibonacciSeries();
		// primeNumber();
		// primeNumber();
		// isPrimeNumber();
		// Palindrome();
		// Pyramid();
		InvertedPyramid();
	}

	public static void oddNumber() {
		int sum = 0;
		int count = 1;
		for (int i = 0; i <= 10; i++) {
			sum = count + i;
			count++;
			System.out.println(sum);
		}
	}

	public static void oddNumber1() {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			sum = sum + i;
			i = i + 2;
		}
		System.out.println(sum);
	}

	// fibonacciSeries
	public static void fibonacciSeries() {
		int a = 0, b = 0, c = 1;
		for (int i = 0; i <= 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
	}

	public static void primeNumber() {
		// Prime NUmber: 2,3,5,7,11,13,17;
		int n = 15;
		if (n == 0 && n == 1) {
			System.out.println("Invalid Value");
		}
		for (int i = 2; i <= n; i++) {
			boolean isprime = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isprime = false;
					break;
				}

			}

			if (isprime == true) {
				System.out.println("Prime Number:" + i);
			}
		}
	}

	public static void isPrimeNumber() {
		int n = 37;
		boolean isPrime = true;
		for (int i = 1; i <= n; i++) {

			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % i + 6 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println(n + ":is Prime Number");

		} else {
			System.out.println(n + ":is not Prime Number");

		}
	}

	public static void Palindrome() {
		String name = "BaBaB", str = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			str = str + name.charAt(i);
		}
		System.out.println(str);

		if (name.equals(str)) {
			System.out.println("Name is Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

	public static void Pyramid() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void InvertedPyramid() {
		for (int i = 1; i <= 10; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 10; j > i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
