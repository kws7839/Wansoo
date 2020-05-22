
public class Ex07_07 {

	public static void main(String[] args) {
		int i;

		for (i = 1; i <= 100; i++) {
			System.out.printf("for 문을 %d회 실행했습니다\n", i);
			if (i == 57)
				break;
		}
		System.out.println("for 문을 종료해했습니다\n");
	}

}
