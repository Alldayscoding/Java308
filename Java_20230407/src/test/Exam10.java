package test;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double random = Math.random();
		System.out.println(random);
		//내가 만약에 1~5 까지의 랜덤한 숫자만 얻고싶어
		double random2 = random*10;
		System.out.println(random2);  //1.8245692897588162
		int num = (int)random2; //
		System.out.println(num);
	}
}
