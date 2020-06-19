
public class MYCreator {

	MYCreator(){
		System.out.println("난 기본적으로 메모리 올라갈떄 실행되는 생성자 함수!");
	}
	
	MYCreator(String pName){
		System.out.println(pName +" 난 원래 없지만, 강제로 만든 메모리 올리는 생성자 함수!");
		//this.name = pName;
	}
	
	private String name;
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
