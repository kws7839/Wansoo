import java.util.Scanner;

public class Baekjoon2439 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.printf(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}
}
