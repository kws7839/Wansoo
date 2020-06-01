import java.util.Scanner;

public class ½ÇÇè {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int hap = 0;
		for (int i = 1; i <= n; i++) {
			hap = hap+i;
		}
		System.out.println(hap);
	}
}
