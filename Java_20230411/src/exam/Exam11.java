package exam;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		
		int qty = 0;
		int sum = 0;
		String tmp = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 숫자를 입력할꺼니?>");
		
		qty = sc.nextInt();//3
		
		while(qty != 0) {
			for (int i=0; i<qty; i++ ) {
				System.out.print(i+1 + "번째 숫자를 입력하세요>");
				//tmp = sc.nextLine();
				
				while (!sc.hasNextInt()) {
					System.out.println("정수를 입력하세요.");
					sc.next(); //한 단어만 (공백미포함)
			
				}
				
			}
			
			
		}
		
		
	 }
}
