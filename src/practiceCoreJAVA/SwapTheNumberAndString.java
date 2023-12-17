package practiceCoreJAVA;

public class SwapTheNumberAndString {
	public static void main(String[] args) {

		// SwapTwoNumberWithoutThirdVariable();
		// SwappingNumber();
		SwappingStringWithThirdVariable();
		SwappingStringWithoutThirdVariable();

	}

	public static void SwappingNumber() {
		int num1 = 5;
		int num2 = 10;
		// Swap the numbers using the third variable
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1 + "\n" + "num2 = " + num2);

	}

	public static void SwapTwoNumberWithoutThirdVariable() {
		int x = 2, y = 3;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x = " + x + "\n" + "y = " + y);
	}

	public static void SwappingStringWithThirdVariable() {
		String s1 = "Dheerendra";
		String s2 = "Vivek";
		System.out.println("Without Swap=" + s1 + ":" + s2);

		String s3 = "";
		s3 = s1;
		s1 = s2;
		s2 = s3;
		System.out.println("With Swap=" + s1 + ":" + s2);

	}

	public static void SwappingStringWithoutThirdVariable() {
		String s = "Dheerendra", s1 = "Vivek";

		System.out.println("Without Swap=" + s + ":" + s1);
		s = s.concat(s1);
		s1 = s.substring(0, s.length() - s1.length());
		s = s.substring(0, s1.length());
		System.out.println("With Swap=" + s + ":" + s1);

	}

}
