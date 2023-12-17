package practiceCoreJAVA;

public class DigitValueFromString {

	public static void main(String[] args) {

		String s="Dheerendra6691";
		
	
		//for replacing the Alphabate and getting Number
//		String digit=s.replaceAll("[a-z]","");
//		String digits=digit.replaceAll("[A-Z]","");
		//System.out.println(digits);
		
		String s1 = s.replaceAll("[0-9]", "");     
		System.out.println(s1);			// OutPut:Dheerendra
		
		
	}

}
