package test;
import java.util.Scanner;


// 세 정수 입력

public class Exam11 {

	public static void main(String[] args) {
		int max=0, min=0;
				
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
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
}
