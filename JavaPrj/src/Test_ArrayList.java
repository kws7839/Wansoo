import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_ArrayList {

	public static void main(String[] args) {

		Set<String> li = new HashSet<>();

		li.add("��ü�������α׷���");
		li.add("�ϵ�");
		li.add("MongoDB");


		Iterator<String> it = li.iterator();

		while (it.hasNext()) {
			String st = it.next();
			
			if (st.equals("�ϵ�")) {
				System.out.println("<" +st + ">");
				break;
				
			} else {
				System.out.println(st);
			}

		}

	}
}
