public class While_test1 {

	public static void main(String[] args) {

		int i = 3;
		int j = 1;

		while (i <= 8) {
			if (i == 3 || i == 5)
				System.out.println("<" + i + "��>");
		}
		while (j <= 9) {
			System.out.println(i + "*" + j + "=" + (i * j));
			j = 1;
			i++;
		}
	} 
	

}
