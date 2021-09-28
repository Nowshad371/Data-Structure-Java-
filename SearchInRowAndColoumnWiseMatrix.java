package dataStructure01;

public class SearchInRowAndColoumnWiseMatrix {

	
	public void Search(int[][]Matrix,int x,int n) {
		
		int i = 0;
		int j = n -1;
		
		
		while(i<n && j >=0) {
			
			if(Matrix[i][j] == x) {
				
				System.out.println("Number x " + x + "  Found at row " +
									i +" and at coloumn " + j );
				return;
			}
			
			if(Matrix[i][j] > x) {
				j--;
			}
			else {
				i++;
			}
			
		}
		System.out.println("x not Found");
	}
	public static void main(String[] args) {
		
		int[][] Matrix = {
				                {10,20,30,40},
					
			                   	{15,20,25,40},
			                   	
			                   	{25,30,35,40},
			                   	
			                   	{12,39,40,45}
				         };

		SearchInRowAndColoumnWiseMatrix sort = new SearchInRowAndColoumnWiseMatrix();
		sort.Search(Matrix, 39, Matrix.length);
	}

}
