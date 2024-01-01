package DSA;

import java.util.Scanner;

public class Trace_of_the_number {

	public static void main(String[] args) {
		int row,col,trace = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the row: ");
		row = s.nextInt();
		System.out.println("enter the col: ");
		col = s.nextInt();
		
		int a[][]= new int[row][col];
		int b[][]= new int[row][col];
		int result[][]= new int[row][col];
		
		System.out.println("Enter the A matrix values: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				a[i][j]=s.nextInt();
			}
		}
		
		
		System.out.println("Enter the B matrix values: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				b[i][j]=s.nextInt();
			}
		}
		
System.out.println("Matrix Addition: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				result[i][j] =Math.abs(a[i][j]-b[i][j]);
				System.out.print(result[i][j]+" ");
				if(i==j) {
					trace=trace+result[i][j];
				}
			}
			System.out.println();
		}
		
		
		
		s.close();		

	}
	

}