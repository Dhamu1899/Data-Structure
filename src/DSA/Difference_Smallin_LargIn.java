package DSA;

import java.util.Scanner;

public class Difference_Smallin_LargIn {

	public static void main(String[] args) {
		int n;
		int min_idx=0,max_idx=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size:");
		n=s.nextInt();
		System.out.println("Read array Elements from user:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			//System.out.print("Enter array element of index "+i+":");
			arr[i]=s.nextInt();
	
		 if(arr[i]<arr[min_idx])
			min_idx=i;
		else if(arr[i]>arr[max_idx])
		max_idx=i;
			
			}
		System.out.print((min_idx+1)+" "+(max_idx+1));

	}
}


		

