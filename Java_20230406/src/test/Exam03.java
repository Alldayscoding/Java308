package test;
import java.util.Scanner;
/*
 * 나의 이름, 주소, 나이를 입력 받아서 출력하는 프로그램 작성..(단 나이는 만나이에 +1해서 출력)
 * 
 * 
*/

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		
		System.out.println(name + (age-1));
		

	}

}
