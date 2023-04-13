package exam;

import java.util.Random;

/*
 * 조원 3명 자바점수를 입력받아서 조원의 총점과 평균 점수를 출력하는 프로그램 작성
 * 자바점수는 배점은 랜덤함수 이용해서. 50~100사이 값이 저장.
 * 조원들 이름 :
 */
public class Exam01 {

	public static void main(String[] args) {

		final int TEAMMEMB = 3; 
		final int MINSCORE = 50;	
		final int MAXSCORE = 100;
		Random rand = new Random();
		String[] student = {"ke", "hj", "yj"};

		int tmpScor,sum;
		tmpScor = sum = 0;
		double avg = 0;
		

		
		while(true) {
			/*int tt = (int)(Math.random()*50+1)+50;
	
			System.out.println("tt값: " + tt);
			if(tt == 50) {
				System.out.println("50나옴");
				break;
			}*/
			tmpScor = rand.nextInt(MAXSCORE - MINSCORE+1) +  MINSCORE;
			System.out.println(tmpScor);
			if(tmpScor == 50) {
				System.out.println("50나옴");
				break;
			}
			
		}
	
/*

		
		for(int i=0; i<student.length; i++) {
			tmpScor = rand.nextInt(MAXSCORE - MINSCORE) +  MINSCORE;
			System.out.printf("%s의 JAVA 점수는 : %d\n", student[i], tmpScor);
			sum = sum + tmpScor;
			avg = sum/student.length;
		}
		System.out.printf("우리조의 총 점수는 : %d\n", sum);
		System.out.printf("우리조의 평균은 : %.1f", avg);
	*/}

}
