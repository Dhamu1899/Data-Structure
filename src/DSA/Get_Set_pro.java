package DSA;

import java.util.Scanner;

class Encapsulation_2{
		private String Name;
		private int Age;
		private String Contry;


		public String getName() {
			return Name;
		}
		public int getAge() {
			return Age;
		}
		public String getcontry() {
			return Contry;
		}
		public void setName(String newValue) {
			Name=newValue;
		}
		public void setAge(int newValue) {
			Age=newValue;
		}
		public void setcontry(String newValue) {
			Contry=newValue;
		}
		}

	
		public class Get_Set_pro {

		public static void main(String[] args) {
			int age;
			String name,contry;
			Scanner s=new Scanner (System.in);
			Encapsulation_2 obj=new Encapsulation_2();
			System.out.print("Employee name:");
			name=s.next();
			System.out.print("Employee age:");
			age=s.nextInt();
			System.out.print("Employee contry:");
			contry=s.next();
			obj.setName(name);
			obj.setAge(age);
			obj.setcontry(contry);
			System.out.println("Employee name:"+obj.getName());
			System.out.println("Employee age:"+obj.getAge());
			System.out.println("Employee contry:"+obj.getcontry());
			
			
		
		}

		}

		




