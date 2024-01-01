package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Ex1 {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>(2);
		
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		
		System.out.println("size is :"+vec.size());
		System.out.println("default capacity increment is :"+vec.capacity());
		
		vec.addElement("Fruit1");
		vec.addElement("Fruit2");
		vec.addElement("Fruit3");
		
		
		System.out.println("size after addition:"+vec.size());
		System.out.println("capacity after increment is:"+vec.capacity());
		
		@SuppressWarnings("rawtypes")
		Enumeration en=vec.elements();
		System.out.println(("\nElement are:"));
		while(en.hasMoreElements())
			System.out.println(en.nextElement()+" ");

	}

}
