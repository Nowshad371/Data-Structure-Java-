package dataStructure01;



public class circularLinkList {
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
	}
		public void input(){
			
			LinkNode second = new LinkNode(20);
			LinkNode third = new LinkNode(30);
			LinkNode fourth = new LinkNode(50);
			LinkNode fifth = new LinkNode(60);
			LinkNode sixth = new LinkNode(70);
			LinkNode seven = new LinkNode(80);
			
			head = second;
			second.next = third;
			third.next = fourth;
			fourth.next = fifth;
			fifth.next = sixth;
			sixth.next = seven;
			seven.next = fourth;
			
		}
		
		
		public boolean circle() {
			
			LinkNode f = head;
			LinkNode s = head;
			
			while(f !=null && f.next !=null) {

				f = f.next.next;
				s = s.next;
				
				if(f == s) {
					
					return true;
				}
				
				
			}
			
			return false;
	
		}
		public LinkNode starNode() {
			
			LinkNode f = head;
			LinkNode s = head;
			
			while(f !=null && f.next !=null) {

				f = f.next.next;
				s = s.next;
				
				if(f == s) {
					
					return getNode(s);
				}
				
				
			}
			
			return null;

		}
	private LinkNode getNode(LinkNode s) {
			LinkNode temp = head;
			while(temp != s) {
				
				temp = temp.next;
				s = s.next;

			}
			return temp; //star loop of the circular linklist
		}
	
	public void removeLink() {
		
		LinkNode f = head;
		LinkNode s = head;
		
		while(f !=null && f.next !=null) {

			f = f.next.next;
			s = s.next;
			
			if(f == s) {
				
			  removeloop(s);
			}
			
			
		}
		

	}
	private void removeloop(LinkNode s) {
	
		LinkNode temp = head;
		while(s.next != temp.next) {
			
			temp = temp.next;
			s = s.next;
		}
		s.next = null;
		
	}
	public static void main(String[] args) {
	
		circularLinkList sll = new circularLinkList();
		
		sll.input();

		System.out.print(sll.circle());
		
		System.out.print("\ndata link together is : " + sll.starNode().data + "\n");
		sll.removeLink();
		
		sll.display();

	}

}
