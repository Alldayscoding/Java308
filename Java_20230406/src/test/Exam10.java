package test;
import java.util.Scanner;


// 세 정수 입력

public class Exam10 {

	public static void main(String[] args) {
		int max=0, min=0, a, b, c;
				
		Scanner sc = new Scanner(System.in);
		System.out.print("세 정수를 입력하세요");
		
		int firstNum = sc.nextInt(); // 5
		int secNum = sc.nextInt();   // 7
		int thrNum = sc.nextInt();  // 14
		
		
		if ( secNum > firstNum && firstNum < thrNum ) 
			min = firstNum;
		
		if ( firstNum > secNum && secNum < thrNum )
			min = secNum;
		
		if ( firstNum > thrNum && thrNum < secNum )
			min = thrNum;
		

		if ( !(secNum > firstNum && firstNum < thrNum)) 
			max = firstNum;
		
		if ( !(firstNum > secNum && secNum < thrNum))
			max = secNum;
		
		if ( !(firstNum > thrNum && thrNum < secNum))
			max = thrNum;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
}
