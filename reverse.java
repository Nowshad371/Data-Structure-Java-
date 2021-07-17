package dataStructure01;


public class reverse {
private LinkNode head;
	
	private static class LinkNode{
		
		private int data;
		private LinkNode next;
		public LinkNode(int data) {
			
			this.data = data;
			this.next = null;
		}
			
	}
	
	public void display(LinkNode head) {
		int i = 0;
		LinkNode current = head;
		System.out.print("LinkList  ");
		while(current != null) {
			
			System.out.print(current.data + "-->");
			current = current.next;
			i++;
			
		}
		System.out.print("null\n");
	}
	
	public LinkNode reverse(LinkNode head) {
		
		if(head ==null) {
			
			return head;
			
		}
		
		LinkNode current = head;
		
		LinkNode pre = null;
		
		LinkNode next = null;
		
		while(current != null) {
			
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
			
			
		}
		
		return pre;

		
	}
	
	public LinkNode middle(LinkNode head) {
		
		if(head == null) {
			
			return head;
			
		}
		else {
			
			LinkNode current = head;
			LinkNode nextCurrent = head;
			
			while(nextCurrent != null && nextCurrent.next != null) {
				
				current = current.next;
				
				nextCurrent = nextCurrent.next.next;
	
				
			}
			
			return current;
			
			
		}
		

	}
	
	
	public static void main(String[] args) {
		
		reverse sll = new reverse();
		
		LinkNode head = new LinkNode(10);
		
		LinkNode second = new LinkNode(20);
		LinkNode third = new LinkNode(30);
		LinkNode fourth = new LinkNode(40);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		
		sll.display(head);
		System.out.print(sll.middle(head).data + "\n");
		
		sll.display(sll.reverse(head));

		
		
		
		
		

	}

}
