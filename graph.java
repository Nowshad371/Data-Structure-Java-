package dataStructure01;

public class graph {
	private int v; // number of vertices in Graph
	private int E; // number of edges in Graph
	
	private int [][] adjMatrix;
	
	public graph(int nodes) {
		this.v = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u,int v) {
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1; // because of undirected graph
		E++;
	}
	
	public void removeEdge(int u,int v) {
		adjMatrix[u][v] = 0;
		adjMatrix[v][u] = 0;
	}
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(v + " Vertices, " + E + " Edges " + "\n");
		
		for(int i = 0;i<v;i++) {
			sb.append(i + ": ");
			
			for(int w : adjMatrix[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		graph g = new graph(4);
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		
		g.removeEdge(0, 1);
		
		System.out.println(g);

	}

}
