package practiceCoreJAVA;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series:0,1,1,2,3,5,8,13,21………
		int a = 0, b = 0, c = 1;
		for (int i = 0; i <= 10; i++) {
			a = b;
			b = c;
			c = a + b;
			 System.out.print(a+" ");    //OutPut:0 1 1 2 3 5 8 13 21 34 55 
		}
	}

}
