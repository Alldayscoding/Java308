package test;
import java.util.Scanner;


//성별, 나이 ===> 성별 : 남, 나이 20세 이상이면 군대 간다...... 아니면 안간다.

public class Exam9 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 선택해주세요");
		System.out.println("1-남자");
		System.out.println("2-여자");
		
		int sex = sc.nextInt();
				
		System.out.println(sex);

		System.out.println("나이를 입력해주세요");
		
		int age = sc.nextInt();
		
		if (age > 19 && sex == 1) {
			System.out.println("20살 성인남자시네요. 군대가세요");			
		}
		
		else if(sex == 1 && age <19) {	
			System.out.println("미성년자 남자시네요. 군대 아직입니다");			
		}
		else
			System.out.println("여성이시네요");			
					
		System.out.println("--Program end--");
	}
}
