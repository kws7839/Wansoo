
public class Hello20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int k;
		
		for(i=1; i<=9; i++) {
			for(k=2; k<=9;k++) {
				System.out.printf("%3d X %d = %2d", k, i, i*k);
			}
			System.out.printf("\n");
		}
		
	}

}
