package exam01;

import java.util.Scanner;

public class Exam03_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("두 개의 정수를 입력해주세요:");
		
		int num1 = sc.nextInt(); //3        //  5
		int num2 = sc.nextInt();  // 5       // 3
		int sum = 0;

		if (num1<num2) {
			for (int i = num1; i <= num2; i++) {
			sum = i+sum;
			}
		}
		
		else
			for (int i = num2; i <= num1; i++) {
			sum = i+sum;
			}
		System.out.print("두 개의 정수의 합은 :" + sum + "입니다.");
	}

}
