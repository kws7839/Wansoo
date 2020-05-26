import java.util.Scanner;

public class 예제08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float a;
		float b;
		float result;
		
		System.out.println("첫번째 계산할 값을 입력하세요==>");
		a = s.nextFloat();
		System.out.println("두번째 계산할 값을 입력하세요==>");
		b = s.nextFloat();
		
		result = a+b;
		System.out.printf("%5.2f + %5.2f = %5.2f\n", a, b, result);
		result = a-b;
		System.out.printf("%5.2f - %5.2f = %5.2f\n", a, b, result);
		result = a*b;
		System.out.printf("%5.2f * %5.2f = %5.2f\n", a, b, result);
		result = a/b;
		System.out.printf("%5.2f / %5.2f = %5.2f\n", a, b, result);
		result = (int)a % (int)b;
		System.out.printf("%d && %d = %d\n", (int)a, (int)b, (int)result);
		
		
		
		

	}

}
