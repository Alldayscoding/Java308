package test;

import java.util.Scanner;

/*
 * 숫자 하나 입력 받아서 2의 배수이면서 3의 배수이면 
 * 2와3의 배수입니다.. 출력
 * 아니면 아니다 라고 출력
 * 배수 = 구구단
 */
public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력하세요");
		
		int num = sc.nextInt();
		
		if (num%2 ==0 && num%3 ==0) System.out.println("2와3의 배수입니다"); 
		else System.out.println("둘다 아닙니다"); 
			
	}

}
