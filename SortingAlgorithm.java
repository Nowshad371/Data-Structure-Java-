package dataStructure01;

public class SortingAlgorithm {
	
	public void Sort(int arr[]) {
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int temp = arr[i];
			int j = i -1;
			
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j = j -1;
				arr[j+1] = temp;
			}
			
		}
	}
	public void print(int arr[]) {
		System.out.print("{ ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		int[] arr = {14,5,6,4,10,25,15,20};
		
		SortingAlgorithm SA = new SortingAlgorithm();
		SA.Sort(arr);
		SA.print(arr);

	}

}
