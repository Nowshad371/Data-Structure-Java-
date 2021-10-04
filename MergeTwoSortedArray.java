package dataStructure01;

public class MergeTwoSortedArray {
	
	int[]merge(int arr1[],int arr2[],int n,int m){
		
		int[]result = new int [n + m];
		
		int i = 0,j = 0, k = 0;
		
		while(i < n && i < m) {
			
			if(arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
			}
			else {
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<n){
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			result[k] = arr2[j];
			j++;
			k++;
		}
	
		return result;
	}
	
	public void print(int result[]) {
		System.out.print("{ ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] + " ");
		}
		System.out.print("}");
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] arr1 = {2,4,6,8,9};
		int[] arr2 = {1,2,5,7,10,12};
		
		int n = arr1.length;
		int m = arr2.length;
		
		MergeTwoSortedArray MA = new MergeTwoSortedArray();
		
		int[] result = MA.merge(arr1, arr2, n, m);
		MA.print(arr1);
		MA.print(arr2);
		MA.print(result);

	}

}
