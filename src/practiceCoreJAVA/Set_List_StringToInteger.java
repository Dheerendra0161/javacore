package practiceCoreJAVA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set_List_StringToInteger {
	public static void main(String[] args) {

		Set_List_StringToInteger a = new Set_List_StringToInteger();
		// a.set();

		// a.list();
		// a.ReverseStrings();
		a.StringToInteger();
//		int b = a.returnType(4, 6.3);
//		System.out.println(b);

	}

	// Iterator
	public void set() {
		Set<String> carcolour = new HashSet<String>();
		carcolour.add("Black");
		carcolour.add("Blue");
		carcolour.add("Yellow");
		carcolour.add("Pink");
		carcolour.add("Black");
		
		Iterator<String> iter = carcolour.iterator();
		while (iter.hasNext()) {
			System.out.println("Car colour: " + iter.next());
		}
	}

// Console OutPut:
//	Car colour: Pink
//	Car colour: Blue
//	Car colour: Yellow
//	Car colour: Black

	public void list() {
		List<String> list = new ArrayList<>();
		list.add("Bag");
		list.add("Laptop");
		list.add("Mobile");
		list.add("Paper");
		list.add("Laptop");
		list.add("Fan");
//Using for-each Loop;
//		for (String l : list) {
//			System.out.println("Item: " + l);
//		}
		// using for loop;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

//Console OutPut:
//		Bag
//		Laptop
//		Mobile
//		Paper
//		Laptop
//		Fan

	}

	public int returnType(int x, double y) {
		int c = (int) ((x) * (y));
		return c;
	}

	public void ReverseStrings() {

		String original = "My Name Is Dheerendra";
		// original.split(" ");
		for (int i = original.length() - 1; i >= 0; i--) {
			char g = original.charAt(i);
			System.out.print(g);
		}

		// or
		StringBuilder reversed = new StringBuilder(original);
		reversed.reverse();
		String reversedString = reversed.toString();
		System.out.println(reversedString);
	}

	// Console Output:
	// ardnereehD sI emaN yMardnereehD sI emaN yM

	public void StringToInteger() {

		String str = "123";
		try {
			int intValue = Integer.parseInt(str);
			// or
			// int intValue1 = Integer.valueOf(str);
			System.out.println("The integer value is: " + intValue);
			// or
			// System.out.println("The integer value is: " + intValue1);
		} catch (NumberFormatException e) {
			System.out.println("The string is not a valid integer.");
			// Through NumberFormate Exception
		}
	}
//Console OutPut:
	// The integer value is: 123
}