package DSA;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		System.out.println();
		if(n==m) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		s.close();

	}

}
