public class while1 {

	public static void main(String[] args) {

		int i = 1;
		int j = 3;
		while (j <= 8) {
			if (i == 3 || i == 5)
				System.out.println("<" + i + "´Ü>");
		}
		while (i <= 9) {
			System.out.println(i + "*" + j + "=" + (i * j));
			i = 1;
			j++;
		}

	}

}
