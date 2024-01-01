package Vector;

import java.util.Scanner;

public class Array_Ex {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of element you want :");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the all Element:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the element you want to find :");
		int pos=s.nextInt();
		for(int i=0;i<n;i++) {
		if(arr[i]==pos) {
			System.out.println(i+1);
		}
		
		
		
		

	}

	}
}
