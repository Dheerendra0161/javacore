package practiceCoreJAVA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parsing {

	public static void main(String[] args) {

		// Parsing typically refers to the process of converting a string representation
		// of data into its corresponding data type.
		
		String Age = "32";
		String Price = "32.654";
		String dateString="1992-08-12";
		
		
		//Parsing the Integer
		int parseAge=Integer.parseInt(Age);
		System.out.println("parseAge:"+parseAge);
		
		//Parsing the Double
		double parsePrice=Double.parseDouble(Price);
		System.out.println("parsePrice:"+parsePrice);
		
		//Parsing the Date
		SimpleDateFormat date=new SimpleDateFormat("yyyy-mm-dd");
		Date parseDate;
		try {
			parseDate = date.parse(dateString);
			System.out.println("parseDate:"+parseDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		/*
		    Output:
		 	parseAge:32
			parsePrice:32.654
			parseDate:Sun Jan 12 00:08:00 IST 1992
		 */
		

	}

}
