package test;

import java.util.Scanner;


public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("국어 점수 : ");
		int korScore = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int engScore = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mathScore = sc.nextInt();
		
		int sum = korScore+engScore+mathScore;
		float avg = (float)sum/3;
		
		System.out.printf("총점 : %d \t평균 : %.2f " , sum, avg);
		
	}

}



