import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList111 {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();

		li.add("��ü�������α׷���");
		li.add("�ϵ�");
		li.add("MongoDB");

		int a = 1;// ù��° ��

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
