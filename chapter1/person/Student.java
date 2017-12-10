package chapter1.person;

public class Student extends Person {

	private String classNO;

	@Override
	public String toString() {
		return "Student [classNO=" + classNO + "]";
	}

	public Student() {
		super();
	}

	public Student(String classNO) {
		super();
		this.classNO = classNO;
	}

	public String getClassNO() {
		return classNO;
	}

	public void setClassNO(String classNO) {
		this.classNO = classNO;
	}

}
