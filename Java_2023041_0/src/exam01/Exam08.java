package exam01;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int deposit = 0;
		int withDraw = 0;
		int curnt = 0;
		boolean boo = true;
		

		
		for(;boo;) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");		
			System.out.print("선택>");
			int choice = sc.nextInt();

			switch (choice) {

			case 1 :
				System.out.print("예금액>");
				deposit = sc.nextInt();
				curnt = curnt + deposit;
				break;

			case 2 :
				System.out.print("출금액>");
				withDraw = sc.nextInt();
		
				if(withDraw > curnt) {
					System.out.println("통장잔고가 부족합니다");					
					System.out.println("출금가능 금액 : " + curnt);
					break;
				}
				curnt = curnt - withDraw;
				break;
				
			case 3 :
				System.out.println("잔고>" + curnt);
				break;
			case 4 :
				System.out.println("\n프로그램 종료");
				boo = false;
				break;
				
				
				
			default :
				System.out.println("1~4번 메뉴를 선택해주세요");
			}
		}
	}
}