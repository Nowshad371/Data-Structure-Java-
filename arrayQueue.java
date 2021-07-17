package dataStructure01;

public class arrayQueue {
	
	public static int queue[];
	public static int rear,front,capacity;
	
	arrayQueue(int capacity){
		
		front = rear = 0;
		this.capacity = capacity;
		queue = new int[capacity];
		
	}
	
	public static void insert(int data) {
		
		if(capacity == rear) {
			 System.out.printf("\nQueue is full\n");
	         return;
		}
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}
	
	public static void delete(){
		
		if(front == rear) {
			System.out.printf("\nQueue is empty\n");
            return;
		}
		else {
			for(int  i = 0;i<rear-1;i++) {
				queue[i] = queue[i + 1];
			}
			
			if(rear < capacity) {
				queue[rear] = 0;
				
				rear--;
			}
		}
		return;
		
	}
	
	static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
  
        // traverse front to rear and print elements
        System.out.printf("\n");
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }
	
	static void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
  

	public static void main(String[] args) {
	int array []= {10,20,30,40,50,60};
	int l = array.length-1;
	int f = 0;
	
	System.out.println("Last: " + array[f]);
	
	System.out.println("First: " + array[l]);
	
	
	
	arrayQueue a = new arrayQueue(4);
	
	a.queueDisplay();
	
	a.insert(10);
	a.insert(20);
	
	a.insert(40);
	
	a.queueDisplay();
	
	a.delete();
	
	a.queueDisplay();
	a.insert(50);
	
	
	a.queueDisplay();
	}
}
