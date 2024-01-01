package Collection;

import java.util.*;

public class Linked_list_Ex2 {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		LinkedList<String>llistobj=new LinkedList<String>();
		LinkedList<String>arraylist=new LinkedList<String>();
		
		arraylist.add("String1");
		arraylist.add("String2");
		llistobj.addAll(arraylist);
		System.out.println(llistobj);
		
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Tech Mahindra");
		list.add(2,"Zoho");
		list.set(1,"Imarticus");
		list.add("imarticus");
		
		list.forEach(System.out::println);
		
		list.remove(2);
		
		list.addFirst("IBM");
		
		list.addLast("PWC India");
		
		System.out.println(list.indexOf("Imarticus"));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.contains("Hello"));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.lastIndexOf("Imarticus"));
		
		list.poll();   // removing the first element - IBM
		
		list.pollFirst(); //removing the first element - HCL
		
		list.pollLast();
		
		list.remove("TCS");
		
		list.remove(1);
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()+" ");
		}		

	}

}
