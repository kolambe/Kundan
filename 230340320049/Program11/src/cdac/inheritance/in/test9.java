package cdac.inheritance.in;
 class person{
	String name;
	int empId;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	public void showRecord() {
		System.out.println("name:" +this.name);
		System.out.println("empId:"+ this.empId);
	}
	
}

public class test9 {
	public static void main(String[] args) {
		person p=new person("Kundan",540);
		p.showRecord();
	}

}
