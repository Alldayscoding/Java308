package exam;

public class Exam08 {

	public static void main(String[] args) {
		
		
		
		
		  int num = 12345;
		  int sum = 0;

		  System.out.println(num%10);
		  
		  System.out.println(num/10);
		  
		  while(num>0) {
		
		  sum = sum + (num % 10);
		  num = num + (num / 10);
		  }
		  System.out.println(sum); 
	}

}
