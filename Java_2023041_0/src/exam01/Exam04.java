package exam01;

/*
 *3이상 4462 이하에서 짝수인 정수의 합 
 */

public class Exam04 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i=3; i<=4462; i++){
			if (i%2 == 0) sum+=i; 
		}
		System.out.println("결과값" + sum);	
		System.out.println("=============");	
		
		System.out.println("=============");	
		
	
		for (int i=-3; i<=0; i++){ // for(; i<=10;) 이렇게 써도 됨.경우에 따라서
			System.out.println(i);
		}


			
	}

}
