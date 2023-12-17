package practiceCoreJAVA;

import java.util.ArrayList;
public class List {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Dheerenda");
		list.add("Pranav");
		list.add("Jitendra");
		list.add("Gavendra");
		list.add("Gavendra");
		
		
		//To Remove Element
		list.remove(2);   //only by index
		list.addAll(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(0));
			list.remove(0);
			//Output:	  Dheerenda
			   			//Pranav
			   			//Jitendra

		}
	}
	
	
}
