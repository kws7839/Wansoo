import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {

		Map<String, String> pMap = new HashMap<>();

		pMap.put("name", "������");
		pMap.put("email", "hglee67@kopo.ac.kr");
		pMap.put("dept", "�����ͺм���");

		System.out.println("-------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("��Ÿ"));
		System.out.println("-------------------");

	}

}
