import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestArryListHashMap {

	public static void main(String[] args) {

		List<Map<String, String>> rList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<String, String>();
		
		pMap.put("name", "������");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "����");
		
		rList.add(pMap);
		
		pMap = null;//������
		
		pMap = new HashMap<String, String>();
		
		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong");
		pMap.put("addr", "���");
		
		rList.add(pMap);
		
		pMap =null;
		Iterator<Map<String, String>> it = rList.iterator();
		//HashMap
		while(it.hasNext()) {
			Map<String, String> rMap = it.next();
			//HashMap
			System.out.println("name : " +rMap.get("name") );
			System.out.println("email : " +rMap.get("email"));
			System.out.println("adde : " +rMap.get("addr"));
			rMap = null;
			System.out.println("");
		}
	}

}
