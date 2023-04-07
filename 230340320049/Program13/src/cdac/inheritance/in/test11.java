package cdac.inheritance.in;
class Person{
	String name;
	int age;
	
	public void showRecord() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
		class Employee extends Person{
			int empId;
			float salary;
			
			public void displayRecord() {
				System.out.println("empId:"+empId);
				System.out.println("salary:"+salary);
			
		}
	}

public class test11 {
	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.name="Kundan";
		emp.age=28;
		emp.empId=540;
		emp.salary=45000.5f;
		emp.showRecord();
		emp.displayRecord();
		
	}

}
