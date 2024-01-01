package DSA;

import java.util.Scanner;

public class Element {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int N, K, count=0;
		N = s.nextInt();
		K = s.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]= s.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(arr[i]==K) {
				count++;
				System.out.println("Yes");
				break;
				
			}
			
		}
		if(count==0)
		System.out.println("no");
		s.close();

	}

}