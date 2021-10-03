package dataStructure01;

public class bubbleSort {
	
	

	public void BubbleSort(int arr[]) {
		
		boolean isSwapped;
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			isSwapped = false;
			for(int j =0;j<n-1-i;j++) {
				
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			
			if(isSwapped == false)break;
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
		int[] arr = {14,5,6,4,10,25};
		
		bubbleSort BS = new bubbleSort();
		BS.BubbleSort(arr);
		BS.print(arr);

	}

}
