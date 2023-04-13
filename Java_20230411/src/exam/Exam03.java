package exam;

/*
 * +   1
 * ++  12
 * +++ 123
 * ++++ 1234
 * +++++ 12345
 */
public class Exam03 {
	public static void main(String[] args) {

		for (int i = 2 ; i < 10; i++) {
			System.out.println(i + "단 시작");
			System.out.println("----------");
			for (int j = 1 ; j < 10; j++)
				System.out.println(i + " X " + j + " = " + i*j);
		}
	}
}
