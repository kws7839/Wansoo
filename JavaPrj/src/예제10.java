import java.util.Scanner;

public class ����10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int year;
		
		System.out.println("�⵵�� �Է��ϼ��� : ");
		year = s.nextInt();
		
		if (((year % 4 ==0) && (year % 100 !=0)) || (year % 400 == 0))
			
			System.out.printf("%d ���� ���� �Դϴ�\n", year);
		else
			System.out.printf("%d ���� ������ �ƴմϴ�\n", year);
		

	}

}
