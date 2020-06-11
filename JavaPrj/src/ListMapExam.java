import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListMapExam {

	public static void main(String[] args) {

		// HashMap �����ϱ� ���� List �÷��� ��ü�� �޸𸮿� ����
		List<Map<String, String>> rList = new ArrayList<>();

		// �ռ� ����� rList ������ ������ HashMap ��ü �޸𸮿� ����
		Map<String, String> pMap = new HashMap<>();

		pMap.put("name", "������");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "����");
		pMap.put("dept", "����");

		// ������ ������ ����� HashMap ��ü�� List��ü�� ����
		rList.add(pMap);

		// ������ ������������ ���� ����� ���� HashMap ���� �޸𸮿��� ����
		pMap = null;// �� ��ߵȴ� �ƴϸ� ����������

		// Ȧ�浿 ������ �����ϱ� ���� ���� HashMap ������ ���Ӱ� �޸𸮿� �ø�
		pMap = new HashMap<>();

		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "����");
		pMap.put("dept", "�ð�");

		// ������ ������ ����� HashMap ��ü�� List
		rList.add(pMap);

		
		pMap = null;
		Iterator<Map<String, String>> it = rList.iterator();
		while (it.hasNext()) {
			Map<String, String> rMap = it.next();

			System.out.println("######## �ݺ�����!!! ###########");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));

			rMap = null;
			System.out.println("######## �ݺ���!!! ###########");

		}

	}

}
