package exam;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean boo = true;
		
		while(true) {
			
			System.out.println("(1) square \n(2) square root \n(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			
			int choice = sc.nextInt();
			
			int num = 0;
			switch (choice) {
				case 99:					
					boo = false;
					break;
				
				case 0:
					break;
				case 1:
					System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>");
					System.out.print("result=" + sc.nextInt()*2);
				case 2:
				case 3:
				case 4:
				case 5:
			}
		}
			

	}

}
