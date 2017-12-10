package chapter1;

public class MemoryCell {
	//Object类实现泛型
	
	private Object storedValue;  //泛型数据
	
	public void write(Object object) {  //写入泛型数据
		this.storedValue = object;
	}
	
	public Object read() {  //读取泛型数据
		return this.storedValue; 
	}
	
	public static void main(String[] args) {
		MemoryCell mc = new MemoryCell();
		mc.write(30);
		Integer i = (Integer) mc.read();
		System.out.println(i);
	}
}
