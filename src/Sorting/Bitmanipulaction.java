package Sorting;

public class Bitmanipulaction {
	static public boolean isPowerofTwo(int x) 
	{
		return(x!=0)&&((x&(x-1))==0);
	}

	public static void main(String[] args) {
		int n=0b101;
		System.out.println(n);//b to d convertion
		System.out.println(isPowerofTwo(6)); //2^3 true or false 
		

	}

}
