package ex01;
import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) {
		
		int hr,min,sec,tmp = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter second: ");
		tmp = sc.nextInt();
		
		sec = tmp % 60;
		hr = tmp / 3600;
		min = (tmp % 3600) / 60;
		
		System.out.println(hr + " " + min + " " + sec);
		
		
		
	}

}
