package test;

import java.util.Scanner;
/*성적 입력 받아서 90 이상이면 A 
               80 이상이면 B
               70 이상이면 C
               60 이상이면 D
               60 미만이면 F

*
*/
public class Exam09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int scor = sc.nextInt();
		
		scor = (int)scor;
		
		System.out.println(scor);
		
		if ( scor <= 100 ) {
		
		switch (scor/10) {
		
		case 10, 9 :
		System.out.println("A학점");
		break;
		
		case 8:
		System.out.println("B학점");
		break;
		
		case 7:
		System.out.println("C학점");
		break;
	
		case 6:
		System.out.println("D학점");
		break;
		
		default :
		System.out.println("F학점");
		}
		}
		else
			System.out.println("100이하만 입력해주세요");
	}
}
