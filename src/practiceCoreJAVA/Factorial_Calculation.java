package practiceCoreJAVA;

public class Factorial_Calculation {

	
	
	public static void main(String[] args) {
		factorialOfNumber(4);
	}

	
	
	
	public static void factorialOfNumber(int num) {

		if (num == 0 || num == 1) {
			System.out.println(1);
		} else {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println(fact);       //OutPut:24
		}
	}
}
