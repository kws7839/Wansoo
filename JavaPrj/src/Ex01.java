import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);

		int a,b;
		
		while (true) {
			System.out.println("���� ù��° �� �Է�:");
			a = s.nextInt();
			
			System.out.println("���� �ι�° �� �Է�:");
			b = s.nextInt();
			
			System.out.println("a = "+ a + "b = "+ b +"a+b = "+ (a+b));
			
		}
	}

}
