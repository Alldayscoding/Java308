package test;

import java.util.Scanner;

/*
 * 숫자 하나 입력 받아서 양수, 음수, zero 출력
 * 
 */
public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력하세요");
		
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("Zero");
		}
		else if (num >= 1) { 
			System.out.println("양수");
		}
		else {
			System.out.println("음수");
		}
	}

}
