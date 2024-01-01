package DSA;

import java.util.Scanner;

public class Fine_the_arasu_number {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int f=i*i+1;
			System.out.print(f+" ");
			s.close();
		}
		

	}

}
