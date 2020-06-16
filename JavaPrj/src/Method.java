
public class Method {

	public static void main(String[] args) {
		//void 는 return이 안들어간다 void 가 아니면 return이 다 있다
		System.out.println("main함수 호출 시작!!");
		
		int res = sum(1,2);// 같은 타입가능 정수는 정수끼리
		
		System.out.println("sum함수 실행 결과 : "+ res);
		
		System.out.println("main함수 호출 끝");
	}
	
	public static  int sum(int il, int i2) {
		System.out.println("sum함수 호출 시작!!");
		
		int sum = 0;
		
		for (int i=il; i<=i2; i++)
			sum+=1;
		System.out.println("sum함수 호출 끝!!");
		
		return sum;
	}

}
