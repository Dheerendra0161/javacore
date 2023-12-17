package practiceCoreJAVA;

import java.util.Scanner;

public class WrapperClassObject {

	// PrimitiveToObject
	public static void main(String[] args) {
		int primitiveInt = 5;
		System.out.println("Primitive int: " + primitiveInt);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Integer integerObject = Integer.valueOf(str.toString());
		System.out.println("Integer object: " + integerObject);

		primitiveInt = integerObject;
		System.out.println("New Value:" + primitiveInt);
	}
}

//Que. How can we use primitive data types as objects?
//Ans: Primitive data types like int can be handled as objects by the use of their respective
//wrapper classes. For example, Integer is a wrapper class for primitive data type int. We can
//apply different methods to a wrapper class, just like any other object.
//1.Integer for int
//2.Double for double
//3.Boolean for boolean
//4.Character for char
//5.Long for long
//6.Float for float
//7.Short for short
//8.Byte for byte