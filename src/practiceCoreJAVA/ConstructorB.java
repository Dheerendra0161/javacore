package practiceCoreJAVA;

public class ConstructorB extends ConstructorA {
	ConstructorB(){
		System.out.println("Subclass constructor B");
	}
	public static void main(String[] args) {
		ConstructorB b = new ConstructorB();
	}
}
