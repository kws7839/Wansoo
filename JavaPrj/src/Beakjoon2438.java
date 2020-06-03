import java.util.Scanner;

public class Beakjoon2438 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}

}
