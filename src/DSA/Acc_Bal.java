package DSA;

import java.util.Scanner;

class Encapsulation_3{
	private String Account_Number;
	private float Balance;
	

	public String getAccount_Number() {
		return Account_Number;
	}
	public float getBalance() {
		return Balance;
	}
	
	public void setAccount_number(String newValue) {
		Account_Number=newValue;
	}
	public void setBalance(float newValue) {
		Balance=newValue;
	}
	
	}


	public class Acc_Bal {

	public static void main(String[] args) {
		Float Balance;
		String Account_Number;
		Scanner s=new Scanner (System.in);
		Encapsulation_3 obj=new Encapsulation_3();
		System.out.print("Account Number:");
		Account_Number=s.next();
		System.out.print("Balance:");
		Balance=(float) s.nextInt();
		
		obj.setAccount_number(Account_Number);
		obj.setBalance(Balance);
		
		System.out.println("Employee Account_Number:"+obj.getAccount_Number());
		System.out.println("Employee Balance:"+obj.getBalance());
		
		
		
	
	}

	}


