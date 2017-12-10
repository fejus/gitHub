package chapter1;

public class WrapperDemo {
	
	private int i;
	
	public WrapperDemo() {}
	
	public WrapperDemo(int i){
		this.i = i;
	}
	
	public int getI() {
		return this.i;
	}
	
	public static void main(String[] args) {
		MemoryCell mc = new MemoryCell();
		mc.write(new WrapperDemo(10));
		WrapperDemo wd = (WrapperDemo) mc.read();
		
		System.out.println(wd.getI());
	}
}
