import java.util.Scanner;

public class ����09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, c500, c100, c50, c10;
		
		
		System.out.println("## ��ȯ�� ���� ?");
		a = s.nextInt();
		
		c500 = a / 500;
		a = a % 500;
		
		c100 = a / 100;
		a = a % 100;
		
		c50 = a / 50;
		a = a % 50;
		
		c10 = a / 10;
		a = a % 10;
		
		System.out.printf("\n �����¥�� ==> %d �� \n", c500);
		System.out.printf(" ���¥�� ==> %d �� \n", c100);
		System.out.printf(" ���ʿ�¥�� ==> %d �� \n", c50);
		System.out.printf(" �ʿ�¥�� ==> %d �� \n", c10);
		System.out.printf(" �ٲ��� ���� �ܵ�  ==> %d �� \n", a);
		

	}

}
