package dataStructure01;

import java.util.EmptyStackException;

public class stack {
	
	private Listnode top;
	private int length;
	

	private class Listnode{
		
		private int data;
		private Listnode next;
		
		public Listnode(int data) {
			
			this.data = data;
		}
		
		
	}
	
	public stack() {
		top = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	public boolean isempty() {
		return length ==0;
	}
	public void push(int data){
		
		Listnode current = new Listnode(data);
		current.next = top;
		top = current;
		length++;
		
	}
	public int pop() {
		
		if(isempty()) {
			throw new EmptyStackException();
		}
		
		int result = top.data;
		
		top = top.next;
		length--;
		return result;
		
	}
	public int peek() {
		if(isempty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	

	public static void main(String[] args) {
		
			stack s = new stack();
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			
			System.out.print(s.peek());
			s.pop();
			System.out.print("\n"+s.peek());
	}

}
