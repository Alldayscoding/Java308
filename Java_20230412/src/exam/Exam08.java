package exam;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		int[] stu = new int[5];
		int tmp =0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<stu.length; j++) stu[j] = j+1;
		
		System.out.println("1~5중 3개의 숫자를 입력하세요:");
		int num = sc.nextInt();
			
			for (int a=0; a<stu.length; a++) {
				if(num != stu[i]) tmp = num;
				System.out.println("tmp 결석");
			}
		
		}
		
		
		
		for (int i=0; i<stu.length; i++) {
		System.out.print(stu[i]);
		}
	}

}
