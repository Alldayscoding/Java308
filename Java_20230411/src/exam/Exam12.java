package exam;
import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {

		
		int count = 0; //prompt to receive a number of input numbers.
		int sum = 0; // only even numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇회 입력");

		do {
			while (!sc.hasNextInt()) {
				System.out.println("정수가 아닙니다. 다시 입력해주세요.");
				sc.next();
			}
			count = sc.nextInt();
		} while (count <= 0);	
		
		for (int i = 1; i <= count; i++) {
			System.out.printf("%d번째 숫자", i);
			while (!sc.hasNextInt()) {
				System.out.println("정수가 아닙니다. 다시 입력해주세요");
				sc.next();
			}
			int num = sc.nextInt();
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.printf("짝수의 합 %d", sum);
	}
}