package exam01;

//1~부터 100까지
public class Exam05 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i<101)
		{
			sum += i;
			i++;
		}
		System.out.println("합계는 : " + sum);
	}

}
