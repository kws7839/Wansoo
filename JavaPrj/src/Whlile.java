
public class Whlile {

	public static void main(String[] args) {
		int i = 3;

		while (i <= 8) {
			if (i == 3 || i == 5) {
				System.out.println("<" + i + "��>");
			}
			int j = 1;
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;
			}
			i++;
			System.out.println("");
		}
	}

}
