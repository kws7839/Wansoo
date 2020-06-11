import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_ArrayList {

	public static void main(String[] args) {

		Set<String> li = new HashSet<>();

		li.add("°´Ã¼ÁöÇâÇÁ·Î±×·¡¹Ö");
		li.add("ÇÏµì");
		li.add("MongoDB");


		Iterator<String> it = li.iterator();

		while (it.hasNext()) {
			String st = it.next();
			
			if (st.equals("ÇÏµì")) {
				System.out.println("<" +st + ">");
				break;
				
			} else {
				System.out.println(st);
			}

		}

	}
}
