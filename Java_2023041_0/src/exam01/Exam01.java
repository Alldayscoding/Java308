package exam01;

import java.util.Scanner;

//1~10까지 합을 누적

public class Exam01 {

	public static void main(String[] args) {
		/*
		final int NUM = 100;
		for (int i=1; i<NUM+1; i++)
			if (i % 2 ==0 && i % 3 ==0) System.out.println("해당 값은 2 와 3의 배수 입니다 : " + i);
		 */
		Scanner sc = new Scanner(System.in);	

		int i = 0;
		boolean boo = true;

		while (boo)
		{
			System.out.println("성별을 선택하세요:");
			System.out.println("1.남자");
			System.out.println("2.여자");
			System.out.println("3.군인");
			System.out.println("4.외계인");
			i = sc.nextInt();
			if (i == 1) boo=false;

		}
	}
}
