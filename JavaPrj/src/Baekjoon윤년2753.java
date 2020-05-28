import java.util.Scanner;

public class Baekjoon윤년2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("년도를 입력하세요");
		int year = s.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("운년");
		else
			System.out.println("운년아님");
	}

}
