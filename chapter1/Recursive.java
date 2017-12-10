package chapter1;

public class Recursive {
	/*
	 *  递归：当一个函数用它自己来定义时就称为是递归（recursive）的
	 *  1.基准情形（base case）：必须总要有某些基准情形，不用递归就能求解。
	 *  2.不断推进（making progress）：对于那些要求递归求解的情形，递归调用必须总能够朝着一个基准情形推进。
	 *  3.设计法则（design rule）：假设所有的递归调用都能运行。
	 *  4.合成效益法则（compound interest rule）：在求解一个问题的同一实例时，切勿在不同的递归调用中做重复性的工作。
	 */
	

	public static int recursive1(int i) {
		if (i == 0) // 基准情况（base case）
			return 0;
		else
			return 2 * recursive1(i - 1) + i * i;
	}

	public static int badRecursive(int i) {
		if (i == 0)
			return 0;
		else
			return badRecursive(i / 3 + 1) + i - 1; // 1/3 = 0，没有基准，无限循环递推
	}
	
	public static void printOut(int n) {
		if(n >= 10)
			printOut(n / 10);
		printDigit(n % 10);  //mod运算：n % 10 = n - (n / 10) * 10        非常耗时
	}
	public static void printDigit(int n) {
		System.out.println(n);
	}
	public static void main(String[] args) {
		// Recursive.badRecursive(3);

		Recursive.printOut(76234);
	}

}
