
public class Ex08_11 {

	public static void main(String[] args) {

		char [] stack = new char[5];
		int top = 0;
		
		stack[top] = 'A';
		System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
		top++;
		
		stack[top] = 'B';
		System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
		top++;
		
		stack[top] = 'C';
		System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
		top++;
		
		System.out.println("\n");
		top--;
		System.out.printf("%c �ڵ����� �ͳο� ��������\n", stack[top]);
		stack[top] = ' ';
		
		top--;
		System.out.printf("%c �ڵ����� �ͳο� ��������\n", stack[top]);
		stack[top] = ' ';
		
		top--;
		System.out.printf("%c �ڵ����� �ͳο� ��������\n", stack[top]);
		stack[top] = ' ';
	}

}