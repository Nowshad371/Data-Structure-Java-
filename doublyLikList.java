package dataStructure01;

import java.util.NoSuchElementException;



public class doublyLikList {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		public ListNode(int data) {
			
			this.data = data;
			next = null;
			previous = null;
		}
		
		
	}
	

	public doublyLikList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		
		return length == 0;
	}
	public int length() {
		return length;
	}

	public void insertLast(int value) {
		
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()) {
			head = newNode;
		}else {
			
			tail.next = newNode;
			
		}
		newNode.previous = tail;
		tail = newNode;
		length++;

	}
	public void displayForward() {
		if(head == null) {
			return;
		}
		ListNode current = head;
		System.out.println("\n");
		while(current != null) {
			
			System.out.print(current.data + "-->");
			current = current.next;

		}
		
		System.out.print("null");
		
	}
	public ListNode deletelast() {
		
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode current = tail;
		if(head ==null){
			head = null;
		}else {
			
			tail.previous.next = null;
		}

		tail = tail.previous;
		current.previous = null;
		return current;
		}
	
	
	public ListNode deleteFirst() {
		
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode current = head;
		
		if(head == tail) {
			tail = null;
		}
		else {
			head.next.previous = null;
		}
		head = head.next;
		current.next = null;
		return current;
		
	}
	public void displayBackward() {
		if(tail == null) {
			return;
		}
		ListNode current = tail;
		System.out.println("\n");
		while(current != null) {
			
			System.out.print(current.data + "-->");
			current = current.previous;

		}
		
		System.out.print("null");
		
	}
	
	public 	ListNode deleteLast1() {
		
		if(head ==null) {
			return null;
		}
		else {
			
			ListNode current = tail;
			tail = tail.previous;
			tail.next = null;
			current.previous = null;
			return current;
			
		}
		
	}
	
	public void insertBegin(int value) {
		
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()) {
			
			tail = newNode;
		}
		else {
			head.previous = newNode;
		}
		
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	public void deleteAny(int position){
		
		if(head == null) {
			
			head = null;
		}
		else {
			
			ListNode current = tail;
			
			int count = 1;
			
			while(count < position - 1) {
				
				current = current.previous;
				count++;
			}
			
			ListNode p = current.previous;
			
			
			current.previous = p.previous;
			p.previous.next = current;
			p = null;
			
		}

	}
	
	public void deletegiven(int value) {
		
		ListNode val = new ListNode(value);
		ListNode current = tail;
		ListNode pre = null;
		
		if(tail == null) {
			tail = null;
		}
		if(current.data == value) {
			
			current = current.previous;
			current.next = null;
			current.previous = current.previous.previous;
			
			
			
		}
		else {

			while(current.data != value && current != null) {
				
				pre = current;
				current = current.previous;

			}
			
			if(current.data == value) {
			current.previous.next = pre;
			pre.previous = current.previous;
			current = null;
			}
			
		}	
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		doublyLikList dll = new doublyLikList();
		
		dll.insertLast(50);
		dll.insertLast(60);
		dll.insertLast(70);
		dll.insertLast(80);
		
		dll.insertLast(90);
		dll.insertLast(100);
		dll.insertLast(110);
		dll.insertLast(120);
		
		dll.displayForward();
		dll.displayBackward();
		
		dll.insertBegin(40);
		dll.insertBegin(30);
		dll.insertBegin(20);
		dll.insertBegin(10);
		
	
		dll.displayForward();
		dll.displayBackward();
		
		dll.deleteFirst();
		dll.deleteFirst();
		
		dll.displayForward();
		dll.displayBackward();
		
		dll.deletelast();
		
		dll.displayForward();
		
		dll.deleteLast1();
		dll.displayForward();
		
		dll.deleteAny(2);
		
		dll.displayForward();
		
		dll.displayBackward();
		dll.insertLast(70);
		dll.insertLast(80);
		dll.insertLast(90);
		dll.insertLast(100);
		dll.displayForward();
		dll.insertLast(70);
		dll.insertLast(110);
		dll.insertLast(70);
		dll.displayForward();
		dll.displayBackward();
		
		dll.deletegiven(70);
		dll.displayForward();
	
	
	}

}
