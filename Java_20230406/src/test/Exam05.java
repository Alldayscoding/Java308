package test;
import java.util.Scanner;
//20살 이상이면 성년 아래면 미성년자

public class Exam05 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 :");
		
		int age = sc.nextInt();
		
		//조건문
		
		if(age > 19) {			
			System.out.println("성인이시네요");
		}
		else {			
			System.out.println("학생이시네요");
		}
		

	}

}
