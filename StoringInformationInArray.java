package dataStructure01;

import java.util.Scanner;

public class StoringInformationInArray {

static class studentInformation{
		
		public String name;
		public String level;
		public int Id;
		
		
	
	public studentInformation(String name, String level, int id) {
			this.name = name;
			this.level = level;
			Id = id;
		}



	public static void main(String[] args) {
		studentInformation[] arr;
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of Information you want: ");
		int no = scan.nextInt();

		arr = new studentInformation[no];
		
		for(int i =0;i<arr.length;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.print("\nEnter name: ");
			String name = scan1.nextLine();
			
			System.out.print("Enter level: ");
			String level = scan1.nextLine();
			
			System.out.print("Enter Id: ");
			int id = scan1.nextInt();
			
			
			
			arr[i] = new studentInformation(name,level,id);
			
		}
		
		
		
		for(int i =0;i<arr.length;i++) {
			System.out.println("Student number " + (i+1) + " information are : " +
                    arr[i].name+" "+ arr[i].level +" "+ arr[i].Id);
		}

	}

 }
}
