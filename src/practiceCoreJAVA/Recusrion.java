package practiceCoreJAVA;

public class Recusrion {
	static long a = 1;

	public static void main(String[] args) {
		long factorial = calculateFactorial(4);
		System.out.println("Factorial of " + 4 + " = " + factorial);     //OutPut:  Factorial of 4 = 24

		//factorialOfNumber(4);

	}

	static long calculateFactorial(int n) {
		// Base case: factorial of 0 or 1 is 1
		if (n == 0 || n == 1) {
			return 1;
		}
		// Recursive case: n! = n * (n-1)!
		return n * calculateFactorial(n - 1);
	}

	
	
	
	
	
	
	
	
	
	
	public static void factorialOfNumber(int num) {

		if (num == 0 || num == 1) {
			System.out.println(1);
		} else {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println(fact);

		}
	}

}
