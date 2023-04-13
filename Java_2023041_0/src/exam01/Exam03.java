package exam01;

import java.util.Scanner;

/*사용자로부터 두개의 정수(시작, 끝)를 입력받아 시작(포함)해서 끝(포함)까지의 합을 출력
 * 
 */
public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("두 개의 정수를 입력해주세요:");
		
		int beginNum = sc.nextInt(); //3
		int endNum = sc.nextInt();  // 5
		int sum = 0;

		for (int i = beginNum; i <= endNum; i++) {
			sum = i+sum;
		}
		System.out.print("두 개의 정수의 합은 :" + sum + "입니다.");
	}

}
