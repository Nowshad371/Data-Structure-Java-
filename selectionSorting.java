package dataStructure01;

public class selectionSorting {
	
	public void sort(int arr[]) {
		
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			
			int min = i;
			
			for(int j = i+1;j<n;j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
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
		
		selectionSorting SS = new selectionSorting();
		SS.sort(arr);
		SS.print(arr);


	}

}
