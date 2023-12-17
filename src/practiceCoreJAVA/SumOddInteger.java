package practiceCoreJAVA;

public class SumOddInteger {

	public static void main(String[] args) {
		sumOdd();
		SumOddInt();
		NoOfPrint();
	}

	public static void sumOdd() {
		int OddSum = 0;
		for (int i = 1; i <= 5; i = i + 2) {
			OddSum = OddSum + i;
		}
		System.out.println(OddSum);
	}
	// OutPut:9 (1+3+5)

	public static void SumOddInt() {
		int n = 1, sum = 0;
		for (int j = 2; j <= 5; j++) {
			if (j % 2 != 0) {
				sum += j; // sum=sum+j;
			}
		}
		System.out.println(sum + n);
	}
	// OutPut:9 (3+5+1)

	public static void NoOfPrint() {
		for (int k = 100; k >= 0; k = k - 80) {
			System.out.println("India");
		}
	}
	// OutPut: India
	// India

}
