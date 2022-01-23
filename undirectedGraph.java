package dataStructure01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class undirectedGraph {
	private LinkedList<Integer>[]adj;
	private int v;//number of vertices
	private int E; //number of Edge
	
	public undirectedGraph(int nodes) {
		
		this.v = nodes;
		this.E = 0;
		
		this.adj = new LinkedList[nodes];
		
		for(int v=0;v<nodes;v++) {
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v) {
		
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public void bfs(int s) {
		boolean[] visited = new boolean[v];
		Queue<Integer>q = new LinkedList<>();
		
		visited[s] = true;
		
		q.offer(s);
		
		System.out.print("Visited point: ");
		while(!q.isEmpty()) {
			int u = q.poll();
			
			System.out.print(u + " ");
			
			for(int w:adj[u]) {
				
				if(!visited[w]) {
					
					visited[w] = true;
					q.offer(w);
				}
			}
		}
		
	}
	public void IDFS(int s) {
		boolean[] visited = new boolean[v];
		Stack<Integer>stack = new Stack<>();
		
		stack.push(s);
		System.out.print("Visited point: ");
		while(!stack.isEmpty()) {
			
			int u = stack.pop();
			
			if(!visited[u]) {
				visited[u] = true;
				System.out.print(u + " ");
				
				for(int w:adj[u]) {
					
					if(!visited[w]) {
						stack.push(w);
					}
				}
				
			}
		}
		
	}
	
	public void dfs() {
		
		boolean[] visited = new boolean[v];
		System.out.print("Visited point: ");
		for(int i =0;i<v;i++) {
			
			if(!visited[i]) {
				dfs(i,visited);
			}
		}
	}
	public void dfs(int i,boolean visited[]) {
		
		visited[i] = true;
		
		System.out.print(i + " ");
		
		for(int w:adj[i]) {
			
			if(!visited[w]) {
				dfs(w,visited);
			}
		}
		
	}
	
	public void dfsConnect() {
		
		boolean[] visited = new boolean[v];
		int[] compId = new int[v];
		int count = 0;
		System.out.print("Visited point: ");
		for(int i =0;i<v;i++) {
			
			if(!visited[i]) {
				dfs(i,count,visited,compId);
				count++;
			}
			
		}	
		
	}
	
	public void dfs(int i,int count,boolean[]visited,int[]compId) {
		
		visited[i] = true;
		compId[i] = count;
		System.out.print(i + " ");
		for(int w:adj[i]) {
			if(!visited[w]) {
				dfs(w,count,visited,compId);
			}
		}
		
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(v + " Vertices, " + E + " Edges " + "\n");
		
		for(int i = 0;i<v;i++) {
			sb.append(i + ": ");
			
			for(int w : adj[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		
		undirectedGraph g = new undirectedGraph(5);
		
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
	

		
		System.out.println(g);

		g.bfs(0);
		System.out.println("\n");
		g.IDFS(0);
		System.out.println("\n");
		
		g.dfs();
		System.out.println("\n");
		g.dfsConnect();
		System.out.println("\n");
		System.out.println(g);
		

	}

}
