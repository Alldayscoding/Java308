package test;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 문제 #1
		int num = sc.nextInt();
		
		if (num > 50) System.out.println("50이상");
		else System.out.println("50미만");
		*/
		
		/* 문제 #2
		int num = sc.nextInt();
		if (num % 3 == 0) System.out.println("3의 배수입니다");
		else System.out.println("3의 배수가 아니야");
		*/
		
		/* 문제 #3
		System.out.print("학년을 선택하세요>>");
		int grade = sc.nextInt();
		
		System.out.print("점수를 입력하세요>>");
		int score = sc.nextInt();
		
		if (grade == 4) {
			if (score >= 70) {
				System.out.println("합격");
			} else System.out.println("불합격");
		}
		
		else {
			if(score >= 60 ) {
				System.out.println("합격");
			} else System.out.println("불합격");
		}
		*/
		
		/*문제 #4
		System.out.print("3개 정수값을 입력하세요 선택하세요>>");
		
		int a = sc.nextInt(); //2
		int b = sc.nextInt(); //7
		int c = sc.nextInt(); //4
		
		int min= 0, max= 0, avg, sum;
		
		if (a < b && b> c) {
			max = b;
			if(a > c) min = c;
			else min = a;
		}
		
		if (a > b && a > c) {
			max = a;
			if(c > b) min = b;
			else min = c;
		}
						
		if (b > c && b > a) {
			max = b;
			if(a > c) min = c;
			else min = a;
		}
		
		if (a < b && a < c) {
			max = c;
			if(b > a) min = a;
			else min = b;
		}
		
		System.out.printf("최대값 : %d 최소값 : %d", max, min);	
		System.out.println();	
		System.out.printf("더한값 : " + (a+b+c));	
		System.out.println();	
		System.out.printf("평균값 : " + (a+b+c)/3);	
		*/
		
		/*문제 #6
		System.out.println("문자열 입력>>");
		
		String str = sc.nextLine();
		
		char ch = str.charAt(0); // 'k'
		
		if (Character.isUpperCase(ch)) System.out.println("대문자입니다");
		else System.out.println("소문자입니다");
		*/
		
		//문제7
		
		final int NUMBER = 3;
		int sum=0;
		System.out.printf("학점 %d개을(를) 입력해주세요\n", NUMBER);
		
		for (int i=0; i<NUMBER; i++) {
			sum = sum + sc.nextInt();
		}
		
		int avg = (int)sum/NUMBER;
		System.out.println("총점 : " + sum);		
		System.out.println("평균 : " + sum/NUMBER);
			
		switch (avg / 10) {
		case 10, 9 :
			System.out.println("너의 학점 : A");
			break;
			
			case 8:
			System.out.println("너의 학점 : B");
			break;
			
			case 7:
			System.out.println("너의 학점 : C");
			break;

			case 6:
			System.out.println("너의 학점 : d");
			break;
			
			default:
			System.out.println("너의 학점 : F");				
		
		}
	}
}
