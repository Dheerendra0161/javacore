package practiceCoreJAVA;

public class StaticBlock {


	public static void main(String[] args) {
		System.out.println("Dheerendra");
	}
	
	//Static block run first before the main method
	static {
		System.out.println("Hello");
	}
}
		//OutPut: Hello
		//Dheerendra



// If we want to execute any statements before even creation of objects at load time of class,
//we can use a static block of code in the class. Any statements inside this static block of code
//will get executed once at the time of loading the class even before creation of objects in the
//main method.