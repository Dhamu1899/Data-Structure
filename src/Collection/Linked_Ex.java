package Collection;

import java.util.*;


public class Linked_Ex {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		
		list.add("steve");
		list.add("carl");
		list.add("raj");
		
		
		list.addFirst("Negan");
		
		list.addLast("Rick");
		
		list.add(2,"Glenn");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
			
			list.removeFirst();
			
			list.removeLast();
			
			System.out.println(list);
			
			
		}
	}


