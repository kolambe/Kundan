package cdac.inheritance.in;
class Person{
	int empId;
	String name;
	public void showRecord() {
		System.out.println("empId:"+empId);
		System.out.println("name:"+name);
	}
	
}
class Employee extends Person{
	float salary;
	int age;
	public void displayRecord(){
		System.out.println("salary:"+salary);
		System.out.println("age:"+age);
		
		
	}
}

public class test10 {
	public static void main(String[] args) {
		Person p=new Person();
		//p.displayRecord(45000.5f,28);
		p.empId=540;
		p.name="Kundan";
		p.showRecord();
		Employee emp=new Employee();
		emp.salary=45000.5f;
		emp.age=28;
		emp.displayRecord();
	}

}

