
public class MYCreator {

	MYCreator(){
		System.out.println("�� �⺻������ �޸� �ö󰥋� ����Ǵ� ������ �Լ�!");
	}
	
	MYCreator(String pName){
		System.out.println(pName +" �� ���� ������, ������ ���� �޸� �ø��� ������ �Լ�!");
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