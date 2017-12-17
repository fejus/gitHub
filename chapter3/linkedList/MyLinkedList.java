package chapter3.linkedList;

import org.junit.Test;

public class MyLinkedList {
	
	int size;
	
	public void remove() {
		System.out.println("mylist.remove");
	}
	
	private class MyIterable {
		
		private int i;
		
		public void remove() {
			
			MyLinkedList.this.remove();
			System.out.println("myiterable.remove");
		}
	}
	
	@Test
	public void test() {
		MyIterable myIterable = new MyIterable();
		myIterable.remove();
	}
		
		
}
