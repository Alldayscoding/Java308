package exam;

import java.util.Scanner;

//2의 배수를 제외시켜보자
public class Exam10 {
	/*
	 * 랜덤함수 1~100사이 숫자를 같고 있고 유저가 컴퓨터 숫자 맞추는 게임
	 */
	public static void main(String[] args) {
	
		String str = "";
		char charTest = '0';
		
		Scanner sc = new Scanner(System.in);
		
	//	str = sc.nextLine();
		charTest = 65;
	
		System.out.println(charTest);
		
		

		
		
//		System.out.println(sc.nextInt());
		
		
		
//		int com = (int)(Math.random()*100)+1; 
//		int count = 0;
//		int mynum = 0;
//		
//		for (int i=0; ; i++) {
//			System.out.print("숫자가 뭘까요?>");
//			mynum = sc.nextInt();
//			
//			if(com != mynum) {
//				if(com > mynum) System.out.println("up");
//				else System.out.println("down");	
//			count++;
//			continue;
//			}
//			else System.out.println("Bingo");
//			break;
//		}
//		
//		System.out.printf("%d회 맞춤\ncom : %d, user : %d", count, com, mynum);
//		
		/*
		System.out.println(com);
		
		int mynum = 0;
		int count = 0;
		
		while (com != mynum) {
			System.out.println("너의 숫자는..?>");
			mynum = sc.nextInt();
			
			if (mynum != com) {
				count++;
			}
			else
				System.out.println("정답이에요." + " 총 " + count + "번 시도했습니다.");
		}		
	
		*/
		
	}

}
