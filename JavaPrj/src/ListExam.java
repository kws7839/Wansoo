import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {

		List<String> qwer = new ArrayList<String>();

		qwer.add("이협건");
		qwer.add("홍길동");
		qwer.add("임꺽정");
		qwer.add("고길동");
		// 배열크기
		System.out.println("배열의 크기" + qwer.size());

		for (int i = 0; i < qwer.size(); i++) {
			System.out.println("[" + i + "]번째의 배열 기억공간 : " + qwer.get(i));
		}

		Iterator<String> asdf = qwer.iterator();
		while (asdf.hasNext()) {
			String name = (String) asdf.next();

			System.out.println("이름 : " + name);
		}
	}

}
