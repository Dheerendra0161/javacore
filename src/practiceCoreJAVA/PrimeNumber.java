package practiceCoreJAVA;

public class PrimeNumber {

	public static void main(String[] args) {
		// checkIsPrimeNo(3);
		// printPrime(100);
		printPrimeNo(33);
	}

	// **************************************
	public static void printPrimeNo(int n) {
		if (n == 0 || n == 1) {
			System.out.println("Invalid Input");
		}

		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println(i + " is Prime");

			}
		}
	}

	private static void printPrime(int m) {
		boolean isPrime = false;
		for (int n = 2; n <= m; n++) {
			if (n == 2) {
				isPrime = true;
			} else if (n == 0 && n == 1) {
				System.out.println("Invalid");
			}
			for (int i = 2; i < n; i++) {
				if (n % i != 0) {
					isPrime = true;
				} else {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(n + " is Prime");
			}
		}
	}

	public static void checkIsPrimeNo(int n) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int n = scanner.nextInt();

		// int n=41;
		boolean isPrime = false;
		if (n == 2) {
			isPrime = true;
		} else if (n == 0 && n == 1) {
			System.out.println("Invalid");
		}
		for (int i = 2; i < n; i++) {
			if (n % i != 0) {
				isPrime = true;
			} else {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n + " is Prime");
		} else {
			// System.out.println(n +" is Not Prime");
		}
	}

}
