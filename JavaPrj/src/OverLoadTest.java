
public class OverLoadTest {

	public static void main(String[] args) {

		/*OverLoading ol = new OverLoading();
		ol.sum(1,2);
		ol.sum(1,2,3);
		ol = null;*/
		int res1 = OverLoading.sum(1,2);
		int res2 = OverLoading.sum(1,2,3);
		int res3 = OverLoading.sum(1,2,3,4);
		
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
