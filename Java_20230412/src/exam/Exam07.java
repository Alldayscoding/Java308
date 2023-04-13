package exam;
//lotto 번호 중복 제거

// 1~45개 로또 번호를 가지고 있는 배열 만들기
// 
public class Exam07 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		//1~45 number 
		
		
		
		for(int i=0; i<lotto.length; i++) 
			lotto[i] = i+1;
		
		for (int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*5);  // random num with duplicate.
			
			int tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = tmp;
		}
		
		System.out.print("이번주 로또 번호는");
		for (int i=0; i<5; i++) System.out.print(lotto[i] + ", ");
		
		
		System.out.print("이번주 로또2 번호는2___");
		for (int i=0; i<lotto.length; i++) System.out.print(lotto[i] + ", ");
	}

}
