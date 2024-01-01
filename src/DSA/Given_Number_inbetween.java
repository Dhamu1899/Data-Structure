package DSA;

import java.util.Scanner;

public class Given_Number_inbetween {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int N = s.nextInt();
		int L = s.nextInt();
		int R = s.nextInt();
		if(N>=L && N<=R) {
			System.out.println("YES");
		}
		else 
		{
		System.out.println("no");
		s.close();

	}

}
}