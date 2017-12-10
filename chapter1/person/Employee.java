package chapter1.person;

public class Employee extends Person {

	private String department;

	@Override
	public String toString() {
		return "Employee [department=" + department + "]";
	}

	public Employee() {
		super();
	}

	public Employee(String department) {
		super();
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
