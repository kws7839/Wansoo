import java.util.Scanner;

public class Beakjoon11022 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int line = s.nextInt();

		for (int i = 1; i <= line; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
		}
	}

}
