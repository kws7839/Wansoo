import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList111 {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();

		li.add("객체지향프로그래밍");
		li.add("하둡");
		li.add("MongoDB");

		int a = 1;// 첫번째 값

		Iterator<String> it = li.iterator();

		while (it.hasNext()) {
			String st = it.next();
			if (a == 1) {
				System.out.println("<" + st + ">");
			} else {
				System.out.println(st);
			}
			a++;
		}
	}

}
