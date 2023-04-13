package test;

import java.util.Scanner;

public class nextInt {

	public static void main(String[] args) {
		
		int math;
		
		Scanner sc = new Scanner(System.in);	
		String st = sc.nextLine();
				
//		math = Integer.parseInt(st+20); output : 2020n
		math = Integer.parseInt(st) + 20;
		
		System.out.println(math);
	}

}
