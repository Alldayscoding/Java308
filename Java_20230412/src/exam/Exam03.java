package exam;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		int sum = 0;
		int[] num = new int[3];
		
		num[0] = 10;
		num[1] = 20;		
		num[2] = 30;

		int[] arrNum = {10, 20, 30};
		
		System.out.println(Array.getInt(arrNum,1));
	}

}
