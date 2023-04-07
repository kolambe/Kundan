package cdac.inheritance.in;
class Person{
	String name;
	int empId;
	public Person() {
		this(null,0);
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int empId) {
	
		this.name = name;
		this.empId = empId;
	}
public void showRecord() {
	System.out.println("name:"+name);
	System.out.println("empId:"+empId);
	}
	
}
class Employee extends Person{
	int age;
	float salary;
	public void displayRecord() {
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
		
	}
}

public class test12 {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Kundan";
		e.empId=540;
        e.salary=45000.5f;
        e.age=28;
		e.showRecord();
		e.displayRecord();
		
	}

}








