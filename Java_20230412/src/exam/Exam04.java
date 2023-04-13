package exam;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam04 {

	public static void main(String[] args) {
	
	final int SIZE = 3;
	final int MAX = 10;	
	final int MIN = 1;
	
	int max, min; max = min = 0;
	
	int[] numArray = new int[SIZE];
	
	
	for (int i=0; i<SIZE; i++) {
		numArray[i] = (int)(Math.random()*(MAX-MIN+1))+MIN; 
		System.out.println(numArray[i]);
		}
		min = max = numArray[0];
		for (int j=1; j<numArray.length; j++) {
			if (max < numArray[j]) max = numArray[j];
			else min = numArray[j];
		}
	System.out.println("max : " + max);
	System.out.println("min : " + min);
	}

}
