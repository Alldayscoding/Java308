package exam;
public class Exam06 {

	public static void main(String[] args) {
		final int SIZE = 5;
		final int MAX = 50;	
		final int MIN = 10;
		
		
		int[] arr = new int[] {7,3,2};   // 2 3 7로 나와야함
		
		
			for (int i = 0; i<arr.length; i++)     //7,3,2가 있다고 하면, 우선 7에 대해서 나머지 배열의 값들과 일일이 비교 하기 위해
				
				
				for (int j=0; j<arr.length; j++) {
					if(arr[i]<arr[j]) {
						int tmp = arr[i];        //tmp라는 임시저장소에 그 값을 잠시 보관
						arr[i] = arr[j];         // 그리고 배열arr[i]에는 작은 값을 지정하고    
						arr[j] = tmp;
					}
				}
				
				/*
				for (int j=0; j<arr.length; j++) { 
					if(arr[i] > arr[j]) {        // 만약에 배열의 첫번째 값이 나머지 배열들이랑 비교했을떄 값이 큰 경우에 
					int tmp = arr[i];        //tmp라는 임시저장소에 그 값을 잠시 보관
					arr[i] = arr[j];         // 그리고 배열arr[i]에는 작은 값을 지정하고    
					arr[j] = tmp;
					}
					*/
					

			for (int i = 0; i<arr.length; i++)
				System.out.print(" " + arr[i]);
	}
	
}


