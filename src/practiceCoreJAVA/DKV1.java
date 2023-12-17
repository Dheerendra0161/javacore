package practiceCoreJAVA;

public class DKV1 {

	public static void main(String[] args) {
		int a=10,b=10;
		System.out.println(++a +a++);       //11+11=22
		System.out.println(b++ + ++b);		//10+12=22
		//++a is pre-increment
		//a++ is post-increment
		
//		String str1="Hello";
//		String str2="HelloWorld";
//		String str3=str1.concat("World");
//		String str4="HelloWorld";
//		System.out.println(str2==str3);  	//false
//		System.out.println(str2==str4);  	 //true
//		System.out.println(str2.equals(str3));  //true
		 
		
		
//		{ The output is different because == compares the references of string objects, 
//		while the equals method compares the content of the strings. When you compare 
//		two string literals with the same content using ==, they are usually interned, 
//		leading to true results. When you create strings dynamically, as in the case 
//		of str3, == will return false if they are not referencing the same object.}
		
	}

}
