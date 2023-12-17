package practiceCoreJAVA;

public class OuterClass {
	
	public  OuterClass() {
		 class LocalClass {
			void displayMessage() {
				System.out.println("Hello from the local class!");
			}
		}

		LocalClass local = new LocalClass();
		local.displayMessage();
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
	}
}

//A local class is a class that is defined within a specific block,
//such as a method, constructor, or even another class, and it has local scope, 
//meaning it's only accessible within the block where it's defined. 
//Local classes are not visible or usable outside the block in which they are declared.