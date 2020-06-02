
public class For문시험복습 {

	public static void main(String[] args) {

		int i, j;

		for (i = 3; i <= 8; i++) {
			if (i == 3 || i == 5) {
				System.out.println("<" + i + "단>");
			}
			for (j = 1; j <= 9; j++) {
				
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		System.out.println("");
	}

}
