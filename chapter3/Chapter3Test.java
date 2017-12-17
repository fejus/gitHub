package chapter3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Chapter3Test {

	@Test
	public void listTest() {

		List<String> list = new ArrayList<>();
		list.add("c");
		list.add("d");
		list.add("c");
		System.out.println(list.toString());

		for (int i = 0; i < list.size(); i++) {
			if (i == 2)
				// list.remove(i);
				list.add(i, "e");
		}

		System.out.println(list.toString());

		try {
			for (String string : list) {
				if ("d".equals(string)) {
					int i = list.indexOf(string);
					list.add(i, "e");
				}
			}
		} catch (Exception e) {
			System.out.println("迭代器失效");
			e.printStackTrace();
		}

	}
}
