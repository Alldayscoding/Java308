package test;

import java.util.Scanner;

/*
 * 숫자 하나 입력 받아서 짝수/홀수
 * 
 */
public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력하세요");
		
		int num = sc.nextInt();
		
		if (num%2 ==0) System.out.println("짝수");
		else System.out.println("홀수");
	}

}
