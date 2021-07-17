package dataStructure01;

public class Linklist01 {
	
	private LinkNode head;
	
	private static class LinkNode{
		
		private int data;
		private LinkNode next;
		public LinkNode(int data) {
			
			this.data = data;
			this.next = null;
		}
			
	}
	
	public void display() {
		int i = 0;
		LinkNode current = head;
		System.out.print("LinkList  ");
		while(current != null) {
			
			System.out.print(current.data + "-->");
			current = current.next;
			i++;
			
		}
		
		
		
		System.out.print("null" + "\nlength = " + i + "\n");
		
		
	}
	public void insertB(int value) {
		
		LinkNode newNode = new LinkNode(value);
		
		newNode.next = head;
		head = newNode;
			
	}
	
	public void insertEnd(int value) {
		
		LinkNode newNode = new LinkNode(value);
		
		if(head == null) {
			
			head = newNode;
			return;
			
		}
		else {
			
			LinkNode current = head;
			
			while(current.next != null) {
				
				current = current.next;
				
				
			}
			
			current.next = newNode;
			
			
		}
		
		
		
	}
	
	public void Atposition(int value,int position) {
		
		LinkNode newNode = new LinkNode(value);
		
		if(head == null) {
			
			newNode.next = head;
					
			head = newNode;
		
			
		}
		else {
			
			LinkNode pre = head;
		    int count = 1;
		    
		    while(count < position -1) {
		    	
		    	pre = pre.next;
	
		    	count++;
		    	
		    	
		    }
		    
		    LinkNode current = pre.next;
		    newNode.next = current;    
		    pre.next = newNode;
			
			
			
		}
		
		
		
		
	}
	
	public LinkNode delete() {
		
		if(head == null ) {
			
			return null;
			
		}
		else {
			
			LinkNode current = head;
			head = head.next;
			current.next = null;
			return current;
			
			
			
			
		}
		
		
		
		
	}
	
	public LinkNode deleteEnd() {
		
		
		if(head == null ) {
			
			return null;
			
		}
		
		else {
			
			LinkNode current = head;
			LinkNode previous = head;
			
			while(current.next != null) {
				previous = current;
				current = current.next;
				
	
			}
			
			previous.next = null;
			
			return current;
			
		}
		
		
		
		
	}
	
	public void deleteAny(int position) {
		
		if(head == null) {
			
			head = null;
			
			
		}
		else {
			
			LinkNode pre = head;
			
			int count = 1;
			
			while(count < position -1) {
				
				pre = pre.next;
				count++;
				
			}
			
			LinkNode current = pre.next;
			
			pre.next = current.next;
			
			
			
		}
		
	}
	
	public boolean search(int value) {
		
		LinkNode Node = new LinkNode(value);
		
		if(head == null) {
			
			return false;
			
		}
		else {
			
			LinkNode current = head;
			while(current != null) {
				
				
				if(current.data == value) {
					
					return true;
					
				}
	
				current = current.next;	
			}

		}
		return false;
		
	}
	
	
	public LinkNode middle() {
		
		if(head == null) {
			
			return head;
			
		}
		else {
			
			LinkNode current = head;
			LinkNode nextCurrent = head;
			
			while(nextCurrent.next != null) {
				
				current = current.next;
				
				nextCurrent = nextCurrent.next.next;
	
				
			}
			
			return current;
			
			
			
			
		}
	
	}
	
	public LinkNode endnth(int position) {
		
		if(head ==null) {
			return head;
		}
		else {
			
			LinkNode current = head;
			LinkNode current_next = head;
			int count = 0;
			while(count < position) {
				
				current = current.next;
				count++;
				
			}
			
			while(current !=null) {
				
				current_next = current_next.next;
				current = current.next;
				
			}
			
			return current_next;
			
		}

	}
	
	public void duplicate() {
		
		LinkNode current = head;
		
		while(current !=null && current.next != null) {
			if(current.data == current.next.data) {
				
				current.next = current.next.next;
				
			}
			else {
				
				current = current.next;
				
			}
		}
		
	}
	
	public void sort(int value) {
		LinkNode newNode = new LinkNode(value);
		
		if(head == null) {
			
			head = newNode;
		}
		else {
			LinkNode temp = head;
			LinkNode current = head;
			while(current.data < newNode.data) {
				
				temp = current;
				current = current.next;
				
			}
			
			newNode.next = current;
			temp.next = newNode;

		}
		
		
	}
	public void deleteKey(int value){
		
		LinkNode newNode = new LinkNode(value);
		LinkNode temp = head;
		LinkNode current = head;
		if(head == null) {
			
			head = null;
			
		}
		while(current.data != value && current != null) {
				
				temp = current;
				current = current.next;

			}
			
			if(current.data == value) {
				temp.next = current.next;
				current = null;
			}
			
		}

	public static void main(String[] args) {
		
		
		Linklist01 sll = new Linklist01();
		
		sll.head = new LinkNode(10);
		
		LinkNode second = new LinkNode(20);
		LinkNode third = new LinkNode(30);
		LinkNode fourth = new LinkNode(50);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		
		sll.insertB(5);
		sll.insertB(2);
		
		
		sll.display();
		
		sll.insertEnd(50);
		sll.insertEnd(60);
		
		sll.display();
		
		sll.Atposition(15,4);
		sll.Atposition(25,6);
	
		
		sll.display();
		
		sll.delete();
		
		sll.display();
		sll.deleteEnd();
		sll.display();
		
		sll.deleteAny(3);
		
		sll.display();
		
		
		if(sll.search(5)) {
			
			System.out.print("FOUND!!\n");
	
		}
		else {
			
			System.out.print("Not FOUND!!\n");
			
		}
		

		
		sll.display();
		
		System.out.print("middle node " + sll.middle().data + "\n");
		
		System.out.print("nth node from last  " + sll.endnth(3).data + "\n");
		
		
		
		
		sll.display();
		
		
		sll.duplicate();
		sll.display();
		
		sll.sort(26);
		
		sll.display();
		
		sll.deleteKey(30);
		
		
		sll.display();
		
		sll.deleteKey(20);
		sll.display();
		


	}
	
}
