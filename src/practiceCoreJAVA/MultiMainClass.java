package practiceCoreJAVA;

public class MultiMainClass {

	public static void main(String[] args) {
		new MultiClass().printName();
		new singleClass().printAge();
	}

}
//	What's the order of call of constructors in inheritiance?
//	Ans: In case of inheritance, when a new object of a derived class is created, first the constructor
//	of the super class is invoked and then the constructor of the derived class is involved.

