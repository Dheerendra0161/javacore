package practiceCoreJAVA;

public class PrivateConstructor {

	private static PrivateConstructor instance;

	// Private constructor used to prevent object creation
	private PrivateConstructor() {
	}

	public static PrivateConstructor getInstance() {
		if (instance == null) {
			instance = new PrivateConstructor();
		}
		return instance;
	}

	public void someMethod() {
		System.out.println("Singleton method called.");
	}

	public static void main(String[] args) {
		// You can access the Singleton instance like this
		PrivateConstructor singleton = PrivateConstructor.getInstance();
		singleton.someMethod();
	}
}
