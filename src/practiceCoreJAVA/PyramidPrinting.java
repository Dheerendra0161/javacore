package practiceCoreJAVA;

public class PyramidPrinting {

	public static void main(String[] args) {
		InvertedPyramid();
		UpRightPyramid();
		PyramidRightAngle();
		Pyramid();
	}

	public static void UpRightPyramid() {
		int n = 10;
		for (int i = 1; i <= n; i++) {

			for (int k = n; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void InvertedPyramid() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void PyramidRightAngle() {

		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Pyramid() {
		int n = 10;
		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}































