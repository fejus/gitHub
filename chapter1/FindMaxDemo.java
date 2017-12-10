package chapter1;

import java.util.Comparator;

public class FindMaxDemo<T> {
	//接口类型表示泛型
	//泛型findMax 找到一类对象中的最大值 Comparable接口实现

	//静态方法无法引用类中的泛型变量，泛型变量会在编译时被擦除
	public static Comparable findMaxPre5(Comparable[] arr) {
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++)
			if (arr[i].compareTo(arr[maxIndex]) > 0)
				maxIndex = i;
		
		return arr[maxIndex];
	}
	
	//不完美，compareTo需要参数类型
	public Comparable<T> findMax(Comparable<T>[] arr) {
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++)
			if (arr[i].compareTo((T) arr[maxIndex]) > 0)
				maxIndex = i;
		
		return arr[maxIndex];
	}
	
	/*
	 * 类型界限（type bound）：在尖括号內指定，指定参数类型必须具有的性质。
	 * <T extends Comparable<? super T>> 
	 * 指定参数必须继承Comparable<? super T>，即T的超类所实现的Comparable<>泛型接口
	 */
	public <T extends Comparable<? super T>> T findMaxGeneric(T[] arr) {
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++)
			if (arr[i].compareTo(arr[maxIndex]) > 0)
				maxIndex = i;
		
		return arr[maxIndex];
	}
	
	/*
	 * 通过泛型接口Comparator的实现类，及自定义compare方法实现万能findMax
	 */
	public <T> T findMax(T[] arr, Comparator<? super T> cmp) {
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++)
			if (cmp.compare(arr[i], arr[maxIndex]) > 0)
				maxIndex = i;
		
		return arr[maxIndex];
	}

	public static void main(String[] args) {
		String[] strs = {"abc", "sunwuk", "henan", "Gwent", "HearthStone"};
		
		String str = (String) FindMaxDemo.findMaxPre5(strs);
		
		System.out.println(str);
	}
}
