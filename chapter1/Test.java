package da;

public class Test {

	public static void main(String[] args) {
		/*
		 * MyCollection<String> list = new MyCollection<>();
		 * 
		 * list.insert("abc");
		 * 
		 * 
		 * for (Object string : list.getArr()) { System.out.println(string); }
		 */

		Function function = new Function();

		int count = function.getCountFor1(6751671);
		
		System.out.println(count);
	}
}
