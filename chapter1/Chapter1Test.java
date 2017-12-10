package chapter1;

import chapter1.person.Employee;
import chapter1.person.Person;
import chapter1.person.Student;

public class Chapter1Test {
	public static void main(String[] args) {
		
		Person[] pres = new Employee[10];
		pres[0] = new Student("3.6");      
		/* 
		 * 编译通过，运行抛出异常---Java数组协变性
		 * Exception in thread "main" java.lang.ArrayStoreException: chapter1.Student
		 * at chapter1.Chapter1Test.main(Chapter1Test.java:7)
		 */
		
		
	}
}
