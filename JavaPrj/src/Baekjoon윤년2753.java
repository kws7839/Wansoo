import java.util.Scanner;

public class Baekjoon����2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("�⵵�� �Է��ϼ���");
		int year = s.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("���");
		else
			System.out.println("���ƴ�");
	}

}
