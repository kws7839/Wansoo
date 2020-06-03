import java.util.Scanner;

public class Beakjoon2884_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if (b - 45 < 0) {
			if (a == 0)
				a = 24;
			System.out.printf("%d %d", a - 1, (60 + (b - 45)));

		} else {
			System.out.printf("%d %d", a, b - 45);

		}
	}
}
