import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {

		List<String> qwer = new ArrayList<String>();

		qwer.add("������");
		qwer.add("ȫ�浿");
		qwer.add("�Ӳ���");
		qwer.add("��浿");
		// �迭ũ��
		System.out.println("�迭�� ũ��" + qwer.size());

		for (int i = 0; i < qwer.size(); i++) {
			System.out.println("[" + i + "]��°�� �迭 ������ : " + qwer.get(i));
		}

		Iterator<String> asdf = qwer.iterator();
		while (asdf.hasNext()) {
			String name = (String) asdf.next();

			System.out.println("�̸� : " + name);
		}
	}

}
