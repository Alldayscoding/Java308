package test;

import java.util.Scanner;

public class Test01_01 {

	public static void main(String[] args) {
		
		int sum = 0;
		float avg = 0;
		
		Scanner sc = new Scanner(System.in);			
		System.out.println("수학, 영어, 과학점수를 순서대로 입력해주세요");
		
		for (int i=0; i<3; i++) {
		
			sum = sum +	sc.nextInt();				
		}
		System.out.printf("총점 : %d  평균: %.2f", sum, (float)sum/3);		
	}

}
