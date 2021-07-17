package dataStructure01;

import java.util.PriorityQueue;
import java.util.Stack;

public class sortingArrayMakingTogerther {
	
	public void merge(int A[],int B[],int N,int M) {
		
		Stack<Integer> stack = new Stack<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		int[] res = new int[N+M];
		
		for(int i =0;i<N;i++) {
			pq.add(A[i]);
			stack.push(A[i]);
		}
		for(int i =0;i<M;i++) {
			stack.push(B[i]);
			
			pq.add(B[i]);
			
		}
		
		for(int i=0;i<N+M;i++) {
			
			//res[i] = stack.pop();
			res[i] = pq.poll();
		}
		
		System.out.print("sorting array:  ");
		for(int i=0;i<N+M;i++) {
			System.out.print(res[i] +"->");
		}
		
		
	}
	public static void main(String[] args) {
		
		int A[] = { 5, 6, 8,10 };
	    int B[] = { 4, 7, 11,9};
	 
	    int N = A.length;
	    int M = B.length;
	 
	    
	    sortingArrayMakingTogerther s = new sortingArrayMakingTogerther ();
	    // Function call
	    s.merge(A, B, N, M);
	 
	    //return 0;
		
		
	}
	

}
