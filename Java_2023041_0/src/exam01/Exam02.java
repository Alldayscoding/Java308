package exam01;
//1~100까지 홀수의 개수
public class Exam02 {

	public static void main(String[] args) {
		
	final int RANGE = 100; 	
		
		int count = 0;
		
		for (int i=1; i<RANGE+1; i++) {
			if (i%2 != 0){
				count++;
			}
		}
		System.out.println("1~" + RANGE + "까지 홀수의 개수는 : " + count);
		
		count = 0;
		
		for (int i=1; i<RANGE+1; i+=2) {
			if (i%2 != 0){
				count++;
			}
		}
		System.out.println("1~" + RANGE + "까지 홀수의 개수는 : " + count);
	}
}

