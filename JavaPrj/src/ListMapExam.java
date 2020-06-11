import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListMapExam {

	public static void main(String[] args) {

		// HashMap 저장하기 위한 List 컬렉션 객체를 메모리에 생성
		List<Map<String, String>> rList = new ArrayList<>();

		// 앞서 선언된 rList 변수에 저장함 HashMap 객체 메모리에 저장
		Map<String, String> pMap = new HashMap<>();

		pMap.put("name", "이협건");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "서울");
		pMap.put("dept", "데분");

		// 이협건 정보가 저장된 HashMap 객체를 List객체에 저장
		rList.add(pMap);

		// 이협건 정보저장으로 인해 사용이 끝난 HashMap 변수 메모리에서 삭제
		pMap = null;// 꼭 써야된다 아니면 오류낳수도

		// 홀길동 정보를 저장하기 위해 기존 HashMap 변수에 새롭게 메모리에 올림
		pMap = new HashMap<>();

		pMap.put("name", "홍길동");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "정기");
		pMap.put("dept", "시각");

		// 이협건 정보가 저장된 HashMap 객체를 List
		rList.add(pMap);

		
		pMap = null;
		Iterator<Map<String, String>> it = rList.iterator();
		while (it.hasNext()) {
			Map<String, String> rMap = it.next();

			System.out.println("######## 반복시작!!! ###########");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));

			rMap = null;
			System.out.println("######## 반복끝!!! ###########");

		}

	}

}
