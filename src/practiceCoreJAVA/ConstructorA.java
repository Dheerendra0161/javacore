package practiceCoreJAVA;


//What's the order of call of constructors in inheritiance?
//when a new object of a derived class is created, first the constructor
//of the super class is invoked and then the constructor of the derived class is involved.
public class ConstructorA {
	ConstructorA(){
		 System.out.println("Superclass constructor");
	}
}
