import java.util.Scanner;

public class 예제09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, c500, c100, c50, c10;
		
		
		System.out.println("## 교환할 돈은 ?");
		a = s.nextInt();
		
		c500 = a / 500;
		a = a % 500;
		
		c100 = a / 100;
		a = a % 100;
		
		c50 = a / 50;
		a = a % 50;
		
		c10 = a / 10;
		a = a % 10;
		
		System.out.printf("\n 오백원짜리 ==> %d 개 \n", c500);
		System.out.printf(" 백원짜리 ==> %d 개 \n", c100);
		System.out.printf(" 오십원짜리 ==> %d 개 \n", c50);
		System.out.printf(" 십원짜리 ==> %d 개 \n", c10);
		System.out.printf(" 바꾸지 못한 잔돈  ==> %d 개 \n", a);
		

	}

}
