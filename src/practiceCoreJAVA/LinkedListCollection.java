package practiceCoreJAVA;

import java.util.LinkedList;

public class LinkedListCollection {

	int BookId;
	int BookQuantity;

	public static void LinkListDifferentMethod() {
		LinkedList<String> L1 = new LinkedList<String>();
		L1.add(0, "SK");
		L1.add("Dheerendra");
		L1.add("Vijay");
		L1.add("Vikas");
		L1.add("Anuj");
		System.out.println(L1);

		LinkedList<String> L2 = new LinkedList<String>();
		L2.add("Pranav");
		L2.add("Harsh");
		L2.add("Virat");
		L2.add("Vivek");
		L2.add("Amit");

		// Removing specific element from arraylist
		L1.remove("Anuj");
		System.out.println("After Removing the Anuj" + L1);

		// System.out.println( L1.removeFirst());

		System.out.println(L1.addAll(L2)); // True(Boolean)

		System.out.println("After Adding addAll L2" + L1);

		System.out.println(L1.addAll(1, L2));

		System.out.println("After adding index 1" + L1);

		// Removing All the new elements from Arraylist
		L1.removeAll(L2);
		System.out.println("After invoking removeAll() method: " + L1);

		// Removing first element from the list
		L1.removeLast();
		System.out.println("After invoking removeLast() method: " + L1);

		// Removing first occurrence of element from the list
		L1.removeFirstOccurrence("Vikas");
		
		System.out.println("After invoking removeFirstOccurrence() method: " + L1);
		for (int i = 0; i < L1.size(); i++) {
			System.out.println(L1.get(0));
			L1.remove(0);
		}
		System.out.println();
	}
	
	

	public static void main(String args[]) {
		LinkListDifferentMethod();
	}
	
	
}
