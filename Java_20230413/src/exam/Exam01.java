package exam;
/*
 * 1. 배열 10개 생성 후 랜덤으로 1~100 사이 값을 넣는다.
 * 2. 배열 10개 총점과 평균을 구한다.
 * 3. 배열10개 최대값, 최소값을 구한다.
 * 4. 배열10개 오름차순 정렬을 한다.
 */
public class Exam01 {

	public static void main(String[] args) {
		
		final int ARRSIZE = 10;
		int sum, min, max;
		sum=min=max=0;
		int[] arr = new int[ARRSIZE];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(100)+1);
			sum += arr[i];
		}
		//print array
		System.out.print("정렬 전 : ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + ", ");
		
		// sum and avg
		System.out.println("\n총점 : " + sum);
		System.out.println("평균 : " + sum/ARRSIZE);
	
		// min, max
		
		min = arr[0];
		max = arr[ARRSIZE-1];
		
		for(int i =0; i<arr.length; i++) {
			
			if(min > arr[i])min = arr[i];	
			if (arr[i] > max) max = arr[i];
		}
		
		for(int i = 0; i<arr.length; i++)
			for(int j=0; j<arr.length; j++) 
				if(arr[i] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			
		System.out.println("최소값 : "+ min);
		System.out.println("최대값 : "+ max);
		
		System.out.print("정렬 후 : ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + ", ");
	}
}
