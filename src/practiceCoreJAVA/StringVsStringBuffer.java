package practiceCoreJAVA;

//StringBuffer is a class used to create and manipulate strings( concatenation, insertion, or deletion) 
//that can be modified after they are created.
//public class StringBufferExample {
//    public static void main(String[] args) {
//        StringBuffer buffer = new StringBuffer();
//
//        buffer.append("Hello, ");
//        buffer.append("world!");
//        buffer.append(" Welcome to Java.");
//
//        String result = buffer.toString();
//        System.out.println(result);
//    }
//}

public class StringVsStringBuffer {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		StringBuffer buffer = new StringBuffer("Hello");

		// Comparing String objects
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false
		// str1 and str3 have the same contents but are different objects, so str1 ==
		// str3 is false
		System.out.println(str1.equals(str3)); // true

		// To compare a String with a StringBuffer, you can use
		// str1.equals(buffer.toString()):

//	        You cannot directly compare a String and a StringBuffer using equals. 
//	        To do so, you need to convert the StringBuffer to a String using the 
//	        toString method and then use equals.

		System.out.println(str1.equals(buffer.toString())); // true

		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java").intern();
		System.out.println((s1 == s2) + ", String are equal."); // true
		System.out.println((s1 == s3) + ", String are not equal."); // false
		System.out.println((s1 == s4) + ", String are equal."); // true

		// Reversing the String Builder
		// ******************************

		String originalString = "Dheerendra";

		// Convert the string to a StringBuilder for reversing.
		StringBuilder reversedStringBuilder = new StringBuilder(originalString);

		// Use the reverse method to reverse the StringBuilder.
		System.out.println(reversedStringBuilder.reverse());

		// Convert the reversed StringBuilder back to a string. To make this string
		// immutable and take it as return type
		String reversedString = reversedStringBuilder.toString();

		// Print the original and reversed strings.
		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String: " + reversedString);

	}

}
