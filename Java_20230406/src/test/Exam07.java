package test;
import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
				
		boolean boo = true;

		Scanner sc = new Scanner(System.in);
		
		int 면접 = sc.nextInt();
		int 실기 = sc.nextInt();
		
		boo = ((면접 < 70) && (실기 < 70)) ? true : false;

		// System.out.println(boo);	

		if(boo == true) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
