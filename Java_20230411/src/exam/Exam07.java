package exam;

/*
 * String str = "12345"
 * 
 * charAt(0) -> int
 */

public class Exam07 {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;
		
		char a = str.charAt(1);
		System.out.println(str.charAt(0) + str.charAt(1)); // 1 = 49 , 2 = 50  , 0 = 48
		
		char tt = '1';
		char bb = '2';
		
		System.out.println((tt + bb)-'0');
		
		
		System.out.println("================================");
		for(int i=0; i< str.length(); i++) {			
			String tmp = String.valueOf(str.charAt(i));
			sum += Integer.parseInt(tmp);
		}
		System.out.println("sum=" + sum);
	}

}
