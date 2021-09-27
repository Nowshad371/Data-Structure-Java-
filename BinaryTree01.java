package dataStructure01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class BinaryTree01 {
	
	private treeNode root;
	
	
	public class treeNode{
		
		treeNode left;
		treeNode right;
		
		int data;
		
		public treeNode(int data) {
			
			this.data = data;
		}

		public treeNode findMax() {
			
			if(right != null) {
				return right.findMax();
			}
			return this;
		}
	}
	
	public void createBinaryTree() {
		
		treeNode first = new treeNode(7);
		treeNode first1 = new treeNode(6);
		treeNode first2 = new treeNode(10);
		treeNode first3 = new treeNode(4);
		treeNode first4 = new treeNode(5);
		
		
		root = first;
		first.left = first1;
		first.right = first2;
		first1.left = first3;
		first1.right = first4;
		
		
	}
	
	public void displaypre() {
		
		if(root ==null) {
		
			return;
		}
		
		
	Stack<treeNode>stack = new Stack();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			treeNode temp = stack.pop();
			System.out.print(temp.data + "->");
			
			
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left !=null) {
				stack.push(temp.left);
			} 
		}
	
	}
	
	public void preOrder(treeNode root) {
		if(root ==null) {
			return;
		}
		System.out.print(root.data + "->");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void Inorder(treeNode root) {
		if(root == null) {
			return;
		}

		Inorder(root.left);
		System.out.print(root.data + "->");
		Inorder(root.right);
		
		
		
	}
  public void displayIn() {
		
		if(root ==null) {
		
			return;
		}
		
		
	Stack<treeNode>stack = new Stack();
		
	treeNode temp = root;
		
		while(!stack.isEmpty() || temp !=null) {
			
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			else {
				temp = stack.pop();
				System.out.print(temp.data + "->");
				temp = temp.right;
			} 
		}
	
	}
  public void postorder(treeNode root) {
		if(root == null) {
			return;
		}

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + "->");
		
		
	}
  
  
  public void displaypost() {
		
		if(root ==null) {
		
			return;
		}
		
	treeNode current = root;
	Stack<treeNode>stack = new Stack();
		
		while(!stack.isEmpty() || current  !=null) {
			
			if(current != null) {
				stack.push(current);
				current = current.left;
			}
			else {
				
				treeNode temp = stack.peek().right;
				
				if(temp == null) {
				temp = stack.pop();
				
				System.out.print(temp.data + "->");
				
				while(!stack.isEmpty() && temp  == stack.peek().right ) {
					temp = stack.pop();
					System.out.print(temp.data + "->");
				}
				
				}
				else {
					current = temp;
				}
				
			} 
		}
	
	}
    public treeNode insert(treeNode root,int value) {
    	
    	if(root == null) {
    		root = new treeNode(value);
    		return root;
    	}
    	if(root.data > value) {
    		if(root.left == null) {
    			root.left = new treeNode(value);
    			return root;
    		}
    		insert(root.left,value);
    	}
    	if(root.data < value) {
    		if(root.right == null) {
    			root.right = new treeNode(value);
    			return root;
    		}
    		insert(root.right,value);
    	}
    	if(root.data == value) {
    		System.out.println("Value already exit");
    		return root;
    	}
    	
		return root;
		
    	
    }
    
    public void levelOrder() {
    	
    	if(root == null) {
    		return;
    	}
    	
    	Queue<treeNode>queue = new LinkedList();
    	queue.offer(root);
    	
    	while(!queue.isEmpty()) {
    		
    		treeNode temp = queue.poll();
    		System.out.print(temp.data + "-->");
    		
    		
    		if(temp.left != null) {
    			queue.offer(temp.left);
    		}
    		if(temp.right != null) {
    			queue.offer(temp.right);
    		}
    		
    	}
    }
    
    public int Maxvalue(treeNode root) {
    	
    	if(root == null) {
    		return Integer.MIN_VALUE;
    	}
    	
    	int result = root.data;
    	
    	int left = Maxvalue(root.left);
    	int right = Maxvalue(root.right);
    	
    	if(left>result) {
    		result = left;
    	}
    	
    	if(right > result) {
    		result = right;
    	}
    	return result;
    	
    	
    }
    
    public int MaxValueS(treeNode root) {
    	
    	if(root == null) {
    		return Integer.MIN_VALUE;
    	}
    	
    	int result = root.data;
    	int right = MaxValueS(root.right);
    	
    	if(right > result) {
    		result = right;
    	}
    	
    	return result;
    	
    }
    
   public int MinValue(treeNode root) {
    	
    	if(root == null) {
    		return Integer.MAX_VALUE;
    	}
    	
    	int result = root.data;
    	int left = MinValueSort(root.left);
    	int right = MinValueSort(root.right);
    	
    	if(left<result) {
    		result = left;
    	}
    	
    	if(right < result) {
    		result = right;
    	}
    	return result;
    	
    }
   
   public int MinValueSort(treeNode root) {
   	
   	if(root == null) {
   		return Integer.MAX_VALUE;
   	}
   	
   	int result = root.data;
   	int left = MinValueSort(root.left);
   	
   	
   	if(left<result) {
   		result = left;
   	}
 
   	return result;
   	
   }
   
   public treeNode search(treeNode root,int value) {
	   
	   if(root == null || root.data == value) {
		   return root;
	   }
	   
	   if(value < root.data) {
		   return search(root.left,value);
	   }
	   if(value > root.data) {
		   
		   return search(root.right,value);
	   }
	   
	   return root;
   }
	   
	public int height(treeNode root) {
		
		if(root == null) {
			return 0;
		}
		int h;
		int left = height(root.left);
		int right = height(root.right);
		
		if(left >right) {
			h = 1 + left;
		}
		else {
		   h = 1 + right;
		}
		return h;
	}
	
	public void swapData(treeNode nodeA,treeNode nodeB) {
		int temp = nodeA.data;
		nodeA.data = nodeB.data;
		nodeB.data = temp;
	}
	
	public treeNode delete(int data) {
		return this.root = deleteHelper(data,this.root);
	}
	
   
	private treeNode deleteHelper(int data, treeNode root) {
	    if(root == null) {
	    	return null;
	    }
	    else if(data <root.data) {
	    	root.left = deleteHelper(data,root.left);
	    }
	    else if(data > root.data) {
	    	root.right = deleteHelper(data,root.right);
	    }
	    else {
	    	if(root.left == null && root.right == null) {
	    		root = null;
	    	}
	    	else if(root.left == null || root.right == null) {
	    		root = root.left == null ? root.right : root.left;
	    	}
	    	else {
	    		treeNode pre = root.left.findMax();
	    		swapData(pre,root);
	    		root.left = deleteHelper(pre.data,root.left);
	    	}
	    }
		return root;
	}
	
	public treeNode update(treeNode root,int value,int change) {
		   
		   if(root == null) {
			   root = null;
		   }
		   
		   if(value < root.data) {
			   return update(root.left,value,change);
		   }
		   if(value > root.data) {
			   
			   return update(root.right,value,change);
		   }
		   if(root.data == value) {
			   
			   root.data = change;
			   
		   }
		   if(root.data != value) {
			   
			   root.data = root.data;
			   
		   }
		   return root;
	   }

	public static void main(String[] args) {
		
		
		
		 BinaryTree01 b = new  BinaryTree01();
		 
		
		 
		 b.createBinaryTree();
		 
		 b.insert(b.root, 12);
		 b.insert(b.root, 15);
		 b.insert(b.root, 16);
		 b.insert(b.root, 11);
		 b.insert(b.root, 13);
		 b.insert(b.root, 6);
		
	
		 
		 b.displaypre();
		 System.out.print("\n");
	
		 b.preOrder(b.root);
		 System.out.print("\n");
		 
		 b.Inorder(b.root);
		 System.out.print("\n");
		 b.displayIn();
		 System.out.print("\n"); 
		 
		 b.postorder(b.root);
		 System.out.print("\n");
		 b.displaypost();
		 
		 System.out.print("\n");
		 
		 System.out.print("Max value is = " + b.Maxvalue(b.root));
		 
		 System.out.print("\n");
		 
		 System.out.print("Max value is = " + b.MaxValueS(b.root));
		 
		 System.out.print("\n");
		 
		 System.out.print("Max value is = " + b.MinValueSort(b.root));
		 
		 System.out.print("\n");
		 
		 System.out.print("Max value is = " + b.MinValue(b.root));
		 
		 if(b.search(b.root,16) != null) {
			 System.out.println("\nFound!");
		 }
		 else {
			 System.out.println("\nNot Found!");
		 }
		 
		 System.out.print("\n");
		 System.out.print("\n");
		 
		 
		 System.out.print("Height of the tree is   " + b.height(b.root));
		 System.out.print("\n");
		 b.levelOrder();
		 
		 System.out.print("\n");
		 b.delete(16);
		 
		 System.out.print("\n");
		 b.levelOrder();
		 
		 if(b.update(b.root,12,13) != null) {
			 System.out.println("\nupdated!");
		 }
		 else {
			 System.out.println("\nNot updated!");
		 }
		 System.out.print("\n");
		 b.levelOrder();
		 
		 

	}

	

}
