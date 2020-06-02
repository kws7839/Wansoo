import java.util.Scanner;

public class Baekjoon10950 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int line = s.nextInt();

		for (int i = 1; i <= line; i++) {
			int a = s.nextInt();
			int b = s.nextInt();

			System.out.println(a + b);
		}
	}

}
