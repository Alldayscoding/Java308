package test;
import java.util.Arrays;
import java.util.Scanner;


// 세 정수 입력

public class Exam13 {

	public static void main(String[] args) {
		
		final int NUM_QUNTY = 3;
		
		int max, min;
		
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[NUM_QUNTY];
		
		System.out.print("세 정수를 입력하세요>>>");
		
		for (int i=0; i<NUM_QUNTY; i++) {
			scores[i] = sc.nextInt();		
		}
		
		Arrays.sort(scores);
		
		System.out.printf("최대값 : %d\n" , max = scores[2]);
		System.out.printf("최소값 : %d" , min = scores[0]);
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("세 정수를 입력하세요");
		
		int firstNum = sc.nextInt(); 
		int secNum = sc.nextInt();  
		int thrNum = sc.nextInt();  
		
		if (firstNum < secNum && firstNum < thrNum) {
			min = firstNum; if (secNum < thrNum) max = thrNum;
		}
		
		if (firstNum > secNum && secNum < thrNum) {
			min = secNum; if (firstNum < thrNum) max = thrNum;
		}
		
		if (firstNum > thrNum && secNum > thrNum) {
			min = thrNum; if (firstNum < secNum) max = secNum;
		}
		*/
	}
}
