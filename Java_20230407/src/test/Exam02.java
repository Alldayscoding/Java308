package test;

import java.util.Scanner;

// 성적을 입력받아서 학점 구하는 프로그램 작성
// 90이상 A, 80이상 B, 70 이상 C, 60이상 D, 나머지 F
// Using switch


public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력");
		
		int num = sc.nextInt();
		char swtc = 0;
		
		if (num >= 90) swtc = 'A';
		if (80 <= num && num < 90) swtc = 'B';
		if (70 <= num && num < 80) swtc = 'C';
		if (60 <= num && num < 70) swtc = 'D';
		if (60 > num ) swtc = 'F';
		
		switch (swtc) {
		
		case 'A':
			System.out.println("A grade");
			break;
			
		case 'B':
			System.out.println("B grade");
			break;
	
		case 'C':
			System.out.println("C grade");
			break;
			
		case 'D':
			System.out.println("D grade");
			break;
			
		case 'F':
			System.out.println("F grade");
			break;
		}
	}

}
