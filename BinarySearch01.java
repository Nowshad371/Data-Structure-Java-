package dataStructure01;

import java.util.Scanner;

public class BinarySearch01 {

    public int search(int[]arr,int x) {
		
    	int low = 0;
    	int high = arr.length -1;
		
    	while(low <= high) {
    		int mid = (high+low)/2;
    		if(arr[mid] == x) {
    			return mid;
    		}
    		if(x < arr[mid]) {
    			high = mid -1;
    		}
    		else {
    			low = mid + 1;
    		}
    	}
    	return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {10,12,23,3,24,25};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int x = scan.nextInt();
		
		BinarySearch01 bs = new BinarySearch01();
		System.out.println(bs.search(arr,x));

	}

}