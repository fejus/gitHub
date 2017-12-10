package chapter1;

import java.util.ArrayList;
import java.util.Collection;

import chapter1.shape.Circle;
import chapter1.shape.Shape;
import chapter1.shape.Square;

public class AreaTest {

	public static double totalArea(Shape[] arr) {
		double total = 0;

		for (Shape shape : arr)
			if (shape != null)
				total += shape.area();

		return total;
	}

	public static double totalArea(Collection<Shape> arr) {
		double total = 0;

		for (Shape shape : arr)
			if (shape != null)
				total += shape.area();

		return total;
	}
	
	//泛型通配符 ? 定义协变性泛型集合 ? extends T
	public static double totalAreaConvariant(Collection<? extends Shape> arr) {
		double total = 0;

		for (Shape shape : arr)
			if (shape != null)
				total += shape.area();

		return total;
	}

	public static void main(String[] args) {

		Shape[] s1 = { new Circle(3), new Square(2, 2) };
		Collection<Shape> s2 = new ArrayList<>();
		Collection<Square> s3 = new ArrayList<>();
		s2.add(new Circle(3));
		s2.add(new Square(2, 2));

		double a1 = AreaTest.totalArea(s1);
		double a2 = AreaTest.totalArea(s2);

		/*
		 * Collection<Square>与Collection<Shape>不匹配
		 * 协变性数组编译不出错，运行时出错
		 * 泛型使协变性数组能在编译时发现异常，泛型不是协变的
		 * 
		 * 通配符解决泛型集合协变问题
		 */
		
		double a3 = AreaTest.totalAreaConvariant(s3); //Collection<Square>
		double a4 = AreaTest.totalAreaConvariant(s2); //Collection<Shape>


		System.out.println(a1 + "--------" + a2);

	}
}
