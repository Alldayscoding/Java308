package exam;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam05 {

	public static void main(String[] args) {
	
	final int SIZE = 5;
	final int MAX = 50;	
	final int MIN = 10;
	
	int max, min; max = min = 0;
	int[] numArray = new int[SIZE];
	
	for (int i=0; i<SIZE; i++) {
		numArray[i] = (int)(Math.random()*(MAX-MIN+1))+MIN;
		System.out.println(numArray[i]);
	}
	max = min = numArray[0];
	
	for (int i = 0; i<numArray.length; i++ ) {
		if (numArray[i] > max) max = numArray[i];
		if (numArray[i] < min) min = numArray[i];
	} 
	
	System.out.println("MAX = " + max);
	System.out.println("MIN = " + min);
	}

}
