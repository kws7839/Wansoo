import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		System.out.println("점수를 입력하세요 :");
		
		a = s.nextInt();
		
		if(a>=90)
			System.out.println("A학점");
		else if(a>=80)
			System.out.println("B학점");
		else if(a>=70)
			System.out.println("C학점");
		else if(a>=60)
			System.out.println("D힉점");
		else
			System.out.println("F학점");
		
		
	}

}
