import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;

		while (true) {
			System.out.println("����� ù ��° ���� �Է� :");
			a = s.nextInt();
			System.out.println("����� �� ��° ���� �Է� :");
			b = s.nextInt();
			System.out.println("����� �����ڸ�  �Է��ϼ��� :");
			ch = (char) System.in.read();

			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d �Դϴ�. \n", a, b, a + b);
				break;
			case '-':
				System.out.printf("%d - %d = %d �Դϴ�. \n", a, b, a - b);
				break;
			case '*':
				System.out.printf("%d * %d = %d �Դϴ�. \n", a, b, a * b);
				break;
			case '/':
				System.out.printf("%d / %d = %d �Դϴ�. \n", a, b, a / b);
				break;
			case '%':
				System.out.printf("%d %% %d = %d �Դϴ�. \n", a, b, a % b);
				break;
			default:
				System.out.println("�����ڸ� �߸� �Է��߽��ϴ�. \n");

			}

		}

	}

}
