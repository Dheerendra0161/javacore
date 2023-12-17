package practiceCoreJAVA;

public class ClassC extends ClassB {
	// Static methods can't be overridden in any class

	public static void staticMethod() {
		System.out.println("Subclass static method");
	}

	public static void main(String[] args) {
		ClassB a = new ClassC();
		a.staticMethod();
	}

}
