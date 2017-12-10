package chapter1;

public class GenericMemoryCell<T> {
	//泛型包装类
	
	private T storedValue;
	
	public void write(T t) {
		this.storedValue = t;
	}
	
	public T read() {
		return storedValue;
	}
	public static void main(String[] args) {
		GenericMemoryCell<Integer> m1 = new GenericMemoryCell<>(); //<> Java 7 菱形运算符，无需写入已声明的泛型类
		
		m1.write(75);
		//int val = m.read(); //Java 5自动拆、装箱
		
		//System.out.println(val);
		Object m = m1;
		
		@SuppressWarnings("unchecked")
		GenericMemoryCell<String> m2 = (GenericMemoryCell<String>) m; //转换针对原始类GenericMemoryCell，运行时通过
		
		System.out.println("运行成功！m2 instanceof GenericMemoryCell == " + (m2 instanceof GenericMemoryCell));
		
		String s = m2.read();  //企图返回String类型产生运行时错误，同时类型转换处产生警告
		
	}
}

class BoxingDemo{
	
}


