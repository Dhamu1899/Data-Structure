package DSA;
import java.util.Scanner;

public class BubbleSort {

		public class bubble_sorting {
			static void bubble(int n,int ar[]) {
				int t;
				for(int step=0;step<n-1;step++) {
					for(int i=0;i<n-1;i++) {
					if(ar[i]>ar[i+1]) {
						t=ar[i];
						ar[i]=ar[i+1];
						ar[i+1]=t;
					}
				}
				}
				}
				static void printArray(int n,int ar[]) {
					System.out.println("After sorting:");
					for(int i=0;i<n;i++) {
						System.out.print(ar[i]+" ");
					}
				}
				public static void main(String[] args) {
					// TODO Auto-generated method stub
					Scanner s=new Scanner(System.in);
			System.out.print("Enter th no of elements:");
			int n=s.nextInt();
			int ar[]=new int [n];
			System.out.print("Enter the array elements:");
				for(int i=0;i<n;i++) {
			 ar[i]=s.nextInt();
				}
				bubble(n,ar);
				printArray(n,ar);
				s.close();
			}
			}
}