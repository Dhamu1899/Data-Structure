package Arrays;

import java.util.Scanner;

public class Non_duplicate_num {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		int n,count,flag = 0;
		System.out.println("Enter Array Size :");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("the elements are");
		
		for(int i=0;i<n;i++) {
			count =0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j] && i!=j) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(arr[i]+" ");
				flag = 1;
			}
			
		}
		if(flag==0) {
			System.out.println("All the elements are repeated");
		}
		
		s.close();
	
		
		
    

		s.close();

	}

}