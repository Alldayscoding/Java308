package test;
import java.util.Scanner;
import java.nio.ByteBuffer;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();		
		String str2 = sc.nextLine();

		System.out.print("Str1 address value : ");
		System.out.println(System.identityHashCode(str1));
		System.out.print("Str2 address value : ");
		System.out.println(System.identityHashCode(str2));
		
		int a = sc.nextInt();
		System.out.print("a address value : ");
		System.out.println(System.identityHashCode(a));
		
		int b = sc.nextInt();
		System.out.print("b address value : ");		
		System.out.println(System.identityHashCode(b));
		
		
		System.out.println("--end--");
	}
}