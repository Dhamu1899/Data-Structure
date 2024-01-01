package DSA;

import java.util.Scanner;

public class Split_Word {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String[] word=str1.split(" ");
		System.out.println(word[1]+" "+word[0]);
		s.close();

	}

}
