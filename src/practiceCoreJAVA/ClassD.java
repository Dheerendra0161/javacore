package practiceCoreJAVA;



//I have multiple constructors defined in a class. Is it possible to call a constructor
//from another constructor's body?
//Ans: If a class has multiple constructors, it's possible to call one constructor from the body of
//another one using this().

public class ClassD {
	private int value;

	public ClassD(int value) {
		this.value = value;
	}

	public ClassD() {
		this(30); // Calls the other constructor with an argument
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		ClassD obj1 = new ClassD();
		ClassD obj2 = new ClassD(42);

		System.out.println("Value of obj1: " + obj1.getValue()); // Value of obj1: 30
		System.out.println("Value of obj2: " + obj2.getValue()); // Value of obj2: 42
	}
}
