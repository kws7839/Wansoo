import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int a, b, c, d;
		int hap;
		
		System.out.println("1번째 숫자를 입력하세요 :");
		a = s.nextInt();
		System.out.println("2번째 숫자를 입력하세요 :");
		b = s.nextInt();
		System.out.println("3번재 숫자를 입력하세요 :");
		c = s.nextInt();
		System.out.println("4번째 숫자를 입력하세요 :");
		d = s.nextInt();
		
		hap = a + b + c + d;
		
		System.out.printf("합계 ==> %d \n", hap);
	}

}
