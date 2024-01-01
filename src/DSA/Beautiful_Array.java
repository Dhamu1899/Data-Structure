package DSA;

import java.util.Scanner;

public class Beautiful_Array {

	public static void main(String[] args) {
		int n,sum = 0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			sum=sum+arr[i];
			
			if(sum%2==0 && sum%3==0 && sum%5==0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
		
		

	}

}
