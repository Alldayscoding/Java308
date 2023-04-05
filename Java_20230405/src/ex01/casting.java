package ex01;

public class casting {
	public static void main(String[] args) {
		
		double d = 10.5;
		int t = 10;
		
		int c = (int)d+t;
		System.out.println(c);
		
		t = (int)d;
		System.out.println(t);
		
		int sum = 10;
		long longsum = 3000000000L; // integer type  8 byte
		
		sum = (int)longsum;
		
		short sh = 32767;
		int num = 40000;
		
		sh = (short)num;
		System.out.println(sh);
		System.out.println(5>1 && 1<2); //&& = and
		
		
		
		System.out.println(5 & 2 );
		
		int i = 10;
		float f = 20.f;
		
		float result = f + (float)i;
		System.out.println(result);
		
	}
}
