package practiceCoreJAVA;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CountDigit {

	public static void main(String[] args) {

		timeStamp();

	}
	public static void method1() {
		// int cnt=String.valueOf(100).length();
		// System.out.println(cnt);
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			int cnt = String.valueOf(i).length();
			for (int j = 0; j < cnt; j++) {
				// System.out.println(i);
				char c = Integer.toString(i).charAt(j);
				int x = Integer.parseInt(Character.toString(c));
				if (x == 7) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static int countDigit(int n) {
		int cnt=(int) Math.floor(Math.log10(n)+1);
		System.out.println(cnt);
		return cnt;
	}
	
	public static void method2() {
		Random rand = new Random();
		int cnt =rand.nextInt(1, 100);
			//cnt=ThreadLocalRandom.current().nextInt();
			System.out.println(cnt);
			
	}
	
	public static void timeStamp() {
		Date date=new Date();
		date.toString().replaceAll(":", "").replace(" ", "");
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-LLLyyyyhhmmss");
		String newDate=dateFormat.format(date);
		System.out.println(newDate);
	}
}
