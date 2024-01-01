package DSA;

import java.util.Scanner;

public class Find_the_Small_and_big_number {

	public static void main(String[] args) {
		int n;
		int min_idx=0,max_idx=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size:");
		n=s.nextInt();
		System.out.println("Read array Elements from user:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i]=s.nextInt();
				}
		for(int i=1;i<n;i++)
		{ if(arr[i]<arr[min_idx])
			min_idx=i;
		else if(arr[i]>arr[max_idx])
		max_idx=i;
			
			}
		System.out.print("minindex:"+(min_idx+1)+" "+"maxIndex"+(max_idx+1));

	}
}
		

