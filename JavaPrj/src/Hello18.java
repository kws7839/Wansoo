import java.util.Scanner;

public class Hello18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int hap = 0;
		int i;
		int num;
		
		System.out.printf("�� �Է�");
		
		num = s.nextInt();
		for (i=1; i<=num; i++) {
			hap=hap+i;
			
			
		}
		System.out.printf("1���� %d������ �� : %d", num, hap);
		
	}

}
