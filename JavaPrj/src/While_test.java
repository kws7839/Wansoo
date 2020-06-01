
public class While_test {

	public static void main(String[] args) {
		
		int i = 3;
		int j = 1;
		
		while (i<=8) {
			while(j<=9) {
				if (i==3) {
					System.out.println("<3´Ü>");
					System.out.println(i + "*" + j + "=" + (i*j));
					j++;
				} else if (i==5) {
					System.out.println("<5´Ü>");
					System.out.println(i + "*" + j + "=" + (i*j));
					j++;
				}else {
					System.out.println(i + "*" + j + "=" + (j*i));
					j++;
				}
			}
			j=1;
			i++;
		}

	}

}
