package practiceCoreJAVA;

public class MyClass {
	// calling non-static method from inside a static method

	public void nonStaticMethod() {
		System.out.println("Non-static method called.");
	}

	public static void staticMethod() {
		MyClass instance = new MyClass();
		instance.nonStaticMethod();
	}

	public static void main(String[] args) {
		staticMethod();
	}
}

//Non-Static methods are owned by objects of a class and have object level scope and in
//order to call the non-Static methods from a static block (like from a static main method), an
//object of the class needs to be created first. Then using object reference, these methods can be
//invoked.
