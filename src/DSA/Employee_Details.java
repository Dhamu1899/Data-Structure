package DSA;

import java.util.Scanner;


	class Encapsulation_4{
		private int id;
		private String name;
		private double salary;
		

		public int getid() {
			return id;
		}
		public String getname() {
			return name;
		}
		public double getsalary() {
			return salary;
		}
		
		public void setid(int newValue) {
			id=newValue;
		}
		public void setname(String newValue) {
			name=newValue;
		}
		public void setsalary(double newValue) {
			salary=newValue;
		}
		
		}


		public class Employee_Details {

		public static void main(String[] args) {
			double salary;
			String name;
			int id;
			Scanner s=new Scanner (System.in);
			Encapsulation_4 obj=new Encapsulation_4();
			System.out.println("Employee Details");
			System.out.print("id :");
			id=s.nextInt();
			System.out.print("name :");
			name=s.next();
			System.out.print("salary :");
			salary=s.nextInt();
			
			obj.setid(id);
			obj.setname(name);
			obj.setsalary(salary);
			
			System.out.println("Employee id:"+obj.getid());
			System.out.println("Employee name:"+obj.getname());
			System.out.printf("Employee salary : $%.2f",obj.getsalary());
			
			
			
		
		}

		}

