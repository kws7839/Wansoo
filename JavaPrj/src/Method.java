
public class Method {

	public static void main(String[] args) {
		//void �� return�� �ȵ��� void �� �ƴϸ� return�� �� �ִ�
		System.out.println("main�Լ� ȣ�� ����!!");
		
		int res = sum(1,2);// ���� Ÿ�԰��� ������ ��������
		
		System.out.println("sum�Լ� ���� ��� : "+ res);
		
		System.out.println("main�Լ� ȣ�� ��");
	}
	
	public static  int sum(int il, int i2) {
		System.out.println("sum�Լ� ȣ�� ����!!");
		
		int sum = 0;
		
		for (int i=il; i<=i2; i++)
			sum+=1;
		System.out.println("sum�Լ� ȣ�� ��!!");
		
		return sum;
	}

}
