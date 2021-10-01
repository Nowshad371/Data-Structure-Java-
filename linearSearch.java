package dataStructure01;

import java.util.Scanner;

public class linearSearch {
	
	public int search(int[]arr,int n,int x) {
		
		for(int i =0;i<n;i++) {
			if(arr[i] == x) {
				return i + 1;//so that it will return exact number starting from 1
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {10,12,23,3,24,24};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int x = scan.nextInt();
		
		linearSearch Ls = new linearSearch();
		System.out.println(Ls.search(arr, arr.length,x));

	}

}
